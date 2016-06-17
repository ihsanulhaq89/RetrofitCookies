package com.mac.retrofitcookie;


import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class CustomCookieManager extends CookieManager {

    private static final String SET_COOKIE_KEY = "Set-Cookie";
    // The cookie key we're interested in.    
    private final String SESSION_KEY = "session-key";
    private final RetrofitService.ActivityUpdate activityUpdater;

    /**
     * Creates a new instance of this cookie manager accepting all cookies.
     * @param activityUpdater
     */
    public CustomCookieManager(RetrofitService.ActivityUpdate activityUpdater) {
        this.activityUpdater = activityUpdater;
        super.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    }

    @Override
    public void put(URI uri, Map<String, List<String>> responseHeaders) throws IOException {

        super.put(uri, responseHeaders);

        if (responseHeaders == null || responseHeaders.get(SET_COOKIE_KEY) == null) {
            // No cookies in this response, simply return from this method.
            return;
        }

        // Yes, we've found cookies, inspect them for the key we're looking for.
        for (String possibleSessionCookieValues : responseHeaders.get(SET_COOKIE_KEY)) {
            activityUpdater.onUpdate(possibleSessionCookieValues);
            /*
            if (possibleSessionCookieValues != null) {

                for (String possibleSessionCookie : possibleSessionCookieValues.split(";")) {

                    if (possibleSessionCookie.startsWith(SESSION_KEY) && possibleSessionCookie.contains("=")) {

                        // We can safely get the index 1 of the array: we know it contains
                        // a '=' meaning it has at least 2 values after splitting.
                        String session = possibleSessionCookie.split("=")[1];

                        // store `session` somewhere

                        return;
                    }
                }
            }*/
        }
    }
}