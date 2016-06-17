
package com.mac.retrofitcookie;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Payload {

    @SerializedName("USER")
    @Expose
    private USER uSER;
    @SerializedName("TOKEN")
    @Expose
    private String tOKEN;

    /**
     * 
     * @return
     *     The uSER
     */
    public USER getUSER() {
        return uSER;
    }

    /**
     * 
     * @param uSER
     *     The USER
     */
    public void setUSER(USER uSER) {
        this.uSER = uSER;
    }

    /**
     * 
     * @return
     *     The tOKEN
     */
    public String getTOKEN() {
        return tOKEN;
    }

    /**
     * 
     * @param tOKEN
     *     The TOKEN
     */
    public void setTOKEN(String tOKEN) {
        this.tOKEN = tOKEN;
    }

}
