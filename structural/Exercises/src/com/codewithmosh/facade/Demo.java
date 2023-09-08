package com.codewithmosh.facade;

public class Demo {
  public static void show() {
    var twitter = new TwitterService();
    var tweets = twitter.getRecentTweets();
  }
}
