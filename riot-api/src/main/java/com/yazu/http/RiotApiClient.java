package com.yazu.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yazu.builder.RiotRequest;
import com.yazu.constants.Region;
import com.yazu.endpoint.accountv1.Account;
import com.yazu.model.AccountDto;

public class RiotApiClient {
    private HttpClient c;
    private String apiKey;
    private ObjectMapper mapper;

    public RiotApiClient() {
        this.mapper = new ObjectMapper();
        this.c = HttpClient.newHttpClient();
    }

    public RiotApiClient ApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    // TODO: Think how to make the requests async
    public HttpResponse<String> Execute(RiotRequest r) throws URISyntaxException, IOException, InterruptedException {
        String query = r.Build();
        URI u = new URI(query);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(u)
                .header("X-Riot-Token", apiKey)
                .build();
        return c.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public <T> Optional<T> ParseResponse(HttpResponse<String> response, Class<T> parseTo) {
        if (response.statusCode() != 200) {
            return Optional.empty();
        }

        try {
            String responseJson = response.body().toString();
            T parsed = mapper.readValue(responseJson, parseTo);
            return Optional.of(parsed);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block / FIX THIS LATER
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public Optional<AccountDto> GetAccountByTagLineAndGameName(String gameName, String tagLine)
            throws URISyntaxException, IOException, InterruptedException {
        RiotRequest QueryMyAccountInformation = new RiotRequest(Region.EUROPE())
                .Get(Account.ByGameNameAndTagLine(gameName, tagLine))
                .Secure();

        HttpResponse<String> response = this.Execute(QueryMyAccountInformation);

        Optional<AccountDto> accountDto = this.ParseResponse(response, AccountDto.class);

        return accountDto;
    }
}
