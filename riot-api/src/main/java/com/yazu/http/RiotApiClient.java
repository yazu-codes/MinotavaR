package com.yazu.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.yazu.builder.RiotRequest;

public class RiotApiClient {
    private HttpClient c;
    private String apiKey;

    public RiotApiClient() {
        c = HttpClient.newHttpClient();
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
}
