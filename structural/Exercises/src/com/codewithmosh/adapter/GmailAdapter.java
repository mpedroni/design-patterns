package com.codewithmosh.adapter;

import com.codewithmosh.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient client;

    GmailAdapter(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
