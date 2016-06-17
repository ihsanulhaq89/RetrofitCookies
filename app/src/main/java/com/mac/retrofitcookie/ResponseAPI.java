
package com.mac.retrofitcookie;


import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResponseAPI {

    @SerializedName("payload")
    @Expose
    private Payload payload;

    /**
     * 
     * @return
     *     The payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
