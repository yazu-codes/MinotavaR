package com.yazu;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yazu.builder.RiotRequest;
import com.yazu.constants.Region;
import com.yazu.endpoint.accountv1.Account;
import com.yazu.http.RiotApiClient;
import com.yazu.model.AccountDto;

public class Main {
    public static void main(String[] args) {
        RiotApiClient riotApiClient = new RiotApiClient()
                .ApiKey("PUT-YOUR-API-KEY-HERE");

        RiotRequest QueryMyAccountInformation = new RiotRequest(Region.EUROPE())
                .Get(Account.ByGameNameAndTagLine("YOURSUMMONERNAME", "YOURTAGLINE-EG-5252"))
                .Secure();

        try {
            HttpResponse<String> response = riotApiClient.Execute(QueryMyAccountInformation);

            Optional<AccountDto> accountDto = riotApiClient.ParseResponse(response, AccountDto.class);

            System.out.println("Account Puuid: " + accountDto.get().getPuuid());
        } catch (URISyntaxException | IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}