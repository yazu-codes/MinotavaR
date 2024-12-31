package com.yazu;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.yazu.http.RiotApiClient;
import com.yazu.model.AccountDto;
import com.yazu.model.ChampionMasteryDto;

public class SampleScenario {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Properties properties = new Properties();

        // Load the properties file (replace with your file path)
        InputStream inputStream = SampleScenario.class.getClassLoader()
                .getResourceAsStream("application.properties");

        properties.load(inputStream);

        String riotApiKey = properties.getProperty("riot.api.key");
        String summonerName = properties.getProperty("summoner.name");
        String tagLine = properties.getProperty("tag.line");

        RiotApiClient riotApiClient = new RiotApiClient()
                .ApiKey(riotApiKey);

        Optional<AccountDto> accountDto = riotApiClient.GetAccountByTagLineAndGameName(summonerName, tagLine);

        if (accountDto.isPresent()) {
            System.out.println("Account Puuid: " + accountDto.get().getPuuid());

            Optional<List<ChampionMasteryDto>> aaa = riotApiClient
                    .GetChampionMasteryGetAll(accountDto.get().getPuuid());

            List<ChampionMasteryDto> bbb = aaa.get();
            if (aaa.isPresent()) {
                System.out.println(aaa.get());
            }
        } else {
            System.out.println("Parsing failed, status code not 200 probably.");
        }

    }
}