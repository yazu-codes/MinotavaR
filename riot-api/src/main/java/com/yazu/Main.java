package com.yazu;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yazu.builder.RiotRequest;
import com.yazu.constants.Region;
import com.yazu.endpoint.accountv1.Account;
import com.yazu.http.RiotApiClient;
import com.yazu.model.AccountDto;

public class Main {
    public static void main(String[] args) {
        RiotApiClient riotApiClient = new RiotApiClient()
                .ApiKey("");

        RiotRequest QueryMyAccountInformation = new RiotRequest(Region.EUROPE())
                .Get(Account.ByGameNameAndTagLine("", "")).Secure();

        try {
            HttpResponse<String> response = riotApiClient.Execute(QueryMyAccountInformation);

            ObjectMapper mapper = new ObjectMapper();

            AccountDto accountDto = mapper.readValue(response.body().toString(), AccountDto.class);

            System.out.println("Account Puuid: " + accountDto.getPuuid());
        } catch (URISyntaxException | IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}