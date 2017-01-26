package com.example;

public class JokeTeller {

    private String[] jokes = {
        "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.",
        "Just read that 4,153,237 people got married last year, not to cause any trouble but shouldn't that be an even number?",
        "My favorite mythical creature? The honest politician."
    };

    public String getJokes() {
        int min = 0;
        int max = jokes.length;
        int index = min + (int)(Math.random()*((max-min)));
        return jokes[index];
    }
}
