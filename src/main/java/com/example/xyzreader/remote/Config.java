package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/Protino/dump/master/Lego/data.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
