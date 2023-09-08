package com.codewithmosh.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterService {

    public List<Tweet> getRecentTweets() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();

        return twitterClient.getRecentTweets(accessToken);
    }
}
