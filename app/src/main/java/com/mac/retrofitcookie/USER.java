
package com.mac.retrofitcookie;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class USER {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("userProfile")
    @Expose
    private UserProfile userProfile;
    @SerializedName("confirmRegistrationStatus")
    @Expose
    private Boolean confirmRegistrationStatus;
    @SerializedName("entityName")
    @Expose
    private String entityName;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The userProfile
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * 
     * @param userProfile
     *     The userProfile
     */
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    /**
     * 
     * @return
     *     The confirmRegistrationStatus
     */
    public Boolean getConfirmRegistrationStatus() {
        return confirmRegistrationStatus;
    }

    /**
     * 
     * @param confirmRegistrationStatus
     *     The confirmRegistrationStatus
     */
    public void setConfirmRegistrationStatus(Boolean confirmRegistrationStatus) {
        this.confirmRegistrationStatus = confirmRegistrationStatus;
    }

    /**
     * 
     * @return
     *     The entityName
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * 
     * @param entityName
     *     The entityName
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
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
