
package com.mac.retrofitcookie;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class UserProfile {

    @SerializedName("profilePicture")
    @Expose
    private String profilePicture;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("privateSetting")
    @Expose
    private Boolean privateSetting;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * 
     * @return
     *     The profilePicture
     */
    public String getProfilePicture() {
        return profilePicture;
    }

    /**
     * 
     * @param profilePicture
     *     The profilePicture
     */
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    /**
     * 
     * @return
     *     The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The privateSetting
     */
    public Boolean getPrivateSetting() {
        return privateSetting;
    }

    /**
     * 
     * @param privateSetting
     *     The privateSetting
     */
    public void setPrivateSetting(Boolean privateSetting) {
        this.privateSetting = privateSetting;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
