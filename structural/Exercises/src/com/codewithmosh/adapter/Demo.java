package com.codewithmosh.adapter;

import com.codewithmosh.adapter.Gmail.GmailClient;

public class Demo {
    public static void show() {
        var gmail = new GmailClient();
        var adapter = new GmailAdapter(gmail);

        var client = new EmailClient();
        client.addProvider(adapter);

        client.downloadEmails();
    }
}
