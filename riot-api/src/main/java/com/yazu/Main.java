package com.yazu;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.Properties;

import com.yazu.builder.RiotRequest;
import com.yazu.constants.Region;
import com.yazu.endpoint.accountv1.Account;
import com.yazu.http.RiotApiClient;
import com.yazu.model.AccountDto;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Properties properties = new Properties();

        // Load the properties file (replace with your file path)
        InputStream inputStream = Main.class.getClassLoader()
                .getResourceAsStream("application.properties");

        properties.load(inputStream);

        // Retrieve individual properties using their keys
        String riotApiKey = properties.getProperty("riot.api.key");

        // Retrieve individual properties using their keys
        String summonerName = properties.getProperty("summoner.name");

        // Retrieve individual properties using their keys
        String tagLine = properties.getProperty("tag.line");

        RiotApiClient riotApiClient = new RiotApiClient()
                .ApiKey(riotApiKey);

        RiotRequest QueryMyAccountInformation = new RiotRequest(Region.EUROPE())
                .Get(Account.ByGameNameAndTagLine(summonerName, tagLine))
                .Secure();

        HttpResponse<String> response = riotApiClient.Execute(QueryMyAccountInformation);

        Optional<AccountDto> accountDto = riotApiClient.ParseResponse(response, AccountDto.class);

        if (accountDto.isPresent()) {
            System.out.println("Account Puuid: " + accountDto.get().getPuuid());
        } else {
            System.out.println("Parsing failed, status code not 200 probably.");
        }

    }
}