package com.yazu;

import com.yazu.builder.RiotRequest;
import com.yazu.constants.Region;
import com.yazu.endpoint.accountv1.Account;

public class Main {
    public static void main(String[] args) {
        String aaa = new RiotRequest(Region.AMERICAS())
                .Get(Account.Me())
                .Build();
        System.out.println(aaa);
    }
}