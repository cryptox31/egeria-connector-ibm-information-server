/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeName;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.Reference;

/**
 * POJO for the {@code user} asset type in IGC, displayed as '{@literal User}' in the IGC UI.
 * <br><br>
 * (this code has been created based on out-of-the-box IGC metadata types.
 *  If modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXISTING_PROPERTY, property="_type", visible=true, defaultImpl=User.class)
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonSubTypes({
        @JsonSubTypes.Type(value = NonStewardUser.class, name = "non_steward_user"),
        @JsonSubTypes.Type(value = StewardUser.class, name = "steward_user"),
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("user")
public class User extends Reference {

    @JsonProperty("business_address")
    protected String businessAddress;

    @JsonProperty("courtesy_title")
    protected String courtesyTitle;

    @JsonProperty("email_address")
    protected String emailAddress;

    @JsonProperty("fax_number")
    protected String faxNumber;

    @JsonProperty("full_name")
    protected String fullName;

    @JsonProperty("given_name")
    protected String givenName;

    @JsonProperty("home_phone_number")
    protected String homePhoneNumber;

    @JsonProperty("instant_message_id")
    protected String instantMessageId;

    @JsonProperty("job_title")
    protected String jobTitle;

    @JsonProperty("location")
    protected String location;

    @JsonProperty("mobile_phone_number")
    protected String mobilePhoneNumber;

    @JsonProperty("office_phone_number")
    protected String officePhoneNumber;

    @JsonProperty("organization")
    protected String organization;

    @JsonProperty("pager_number")
    protected String pagerNumber;

    @JsonProperty("principal_id")
    protected String principalId;

    @JsonProperty("surname")
    protected String surname;

    /**
     * Retrieve the {@code business_address} property (displayed as '{@literal Business Address}') of the object.
     * @return {@code String}
     */
    @JsonProperty("business_address")
    public String getBusinessAddress() { return this.businessAddress; }

    /**
     * Set the {@code business_address} property (displayed as {@code Business Address}) of the object.
     * @param businessAddress the value to set
     */
    @JsonProperty("business_address")
    public void setBusinessAddress(String businessAddress) { this.businessAddress = businessAddress; }

    /**
     * Retrieve the {@code courtesy_title} property (displayed as '{@literal Courtesy Title}') of the object.
     * @return {@code String}
     */
    @JsonProperty("courtesy_title")
    public String getCourtesyTitle() { return this.courtesyTitle; }

    /**
     * Set the {@code courtesy_title} property (displayed as {@code Courtesy Title}) of the object.
     * @param courtesyTitle the value to set
     */
    @JsonProperty("courtesy_title")
    public void setCourtesyTitle(String courtesyTitle) { this.courtesyTitle = courtesyTitle; }

    /**
     * Retrieve the {@code email_address} property (displayed as '{@literal Email Address}') of the object.
     * @return {@code String}
     */
    @JsonProperty("email_address")
    public String getEmailAddress() { return this.emailAddress; }

    /**
     * Set the {@code email_address} property (displayed as {@code Email Address}) of the object.
     * @param emailAddress the value to set
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    /**
     * Retrieve the {@code fax_number} property (displayed as '{@literal Fax Number}') of the object.
     * @return {@code String}
     */
    @JsonProperty("fax_number")
    public String getFaxNumber() { return this.faxNumber; }

    /**
     * Set the {@code fax_number} property (displayed as {@code Fax Number}) of the object.
     * @param faxNumber the value to set
     */
    @JsonProperty("fax_number")
    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }

    /**
     * Retrieve the {@code full_name} property (displayed as '{@literal Full Name}') of the object.
     * @return {@code String}
     */
    @JsonProperty("full_name")
    public String getFullName() { return this.fullName; }

    /**
     * Set the {@code full_name} property (displayed as {@code Full Name}) of the object.
     * @param fullName the value to set
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) { this.fullName = fullName; }

    /**
     * Retrieve the {@code given_name} property (displayed as '{@literal Given Name}') of the object.
     * @return {@code String}
     */
    @JsonProperty("given_name")
    public String getGivenName() { return this.givenName; }

    /**
     * Set the {@code given_name} property (displayed as {@code Given Name}) of the object.
     * @param givenName the value to set
     */
    @JsonProperty("given_name")
    public void setGivenName(String givenName) { this.givenName = givenName; }

    /**
     * Retrieve the {@code home_phone_number} property (displayed as '{@literal Home Phone Number}') of the object.
     * @return {@code String}
     */
    @JsonProperty("home_phone_number")
    public String getHomePhoneNumber() { return this.homePhoneNumber; }

    /**
     * Set the {@code home_phone_number} property (displayed as {@code Home Phone Number}) of the object.
     * @param homePhoneNumber the value to set
     */
    @JsonProperty("home_phone_number")
    public void setHomePhoneNumber(String homePhoneNumber) { this.homePhoneNumber = homePhoneNumber; }

    /**
     * Retrieve the {@code instant_message_id} property (displayed as '{@literal Instant Message ID}') of the object.
     * @return {@code String}
     */
    @JsonProperty("instant_message_id")
    public String getInstantMessageId() { return this.instantMessageId; }

    /**
     * Set the {@code instant_message_id} property (displayed as {@code Instant Message ID}) of the object.
     * @param instantMessageId the value to set
     */
    @JsonProperty("instant_message_id")
    public void setInstantMessageId(String instantMessageId) { this.instantMessageId = instantMessageId; }

    /**
     * Retrieve the {@code job_title} property (displayed as '{@literal Job Title}') of the object.
     * @return {@code String}
     */
    @JsonProperty("job_title")
    public String getJobTitle() { return this.jobTitle; }

    /**
     * Set the {@code job_title} property (displayed as {@code Job Title}) of the object.
     * @param jobTitle the value to set
     */
    @JsonProperty("job_title")
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    /**
     * Retrieve the {@code location} property (displayed as '{@literal Location}') of the object.
     * @return {@code String}
     */
    @JsonProperty("location")
    public String getLocation() { return this.location; }

    /**
     * Set the {@code location} property (displayed as {@code Location}) of the object.
     * @param location the value to set
     */
    @JsonProperty("location")
    public void setLocation(String location) { this.location = location; }

    /**
     * Retrieve the {@code mobile_phone_number} property (displayed as '{@literal Mobile Phone Number}') of the object.
     * @return {@code String}
     */
    @JsonProperty("mobile_phone_number")
    public String getMobilePhoneNumber() { return this.mobilePhoneNumber; }

    /**
     * Set the {@code mobile_phone_number} property (displayed as {@code Mobile Phone Number}) of the object.
     * @param mobilePhoneNumber the value to set
     */
    @JsonProperty("mobile_phone_number")
    public void setMobilePhoneNumber(String mobilePhoneNumber) { this.mobilePhoneNumber = mobilePhoneNumber; }

    /**
     * Retrieve the {@code office_phone_number} property (displayed as '{@literal Office Phone Number}') of the object.
     * @return {@code String}
     */
    @JsonProperty("office_phone_number")
    public String getOfficePhoneNumber() { return this.officePhoneNumber; }

    /**
     * Set the {@code office_phone_number} property (displayed as {@code Office Phone Number}) of the object.
     * @param officePhoneNumber the value to set
     */
    @JsonProperty("office_phone_number")
    public void setOfficePhoneNumber(String officePhoneNumber) { this.officePhoneNumber = officePhoneNumber; }

    /**
     * Retrieve the {@code organization} property (displayed as '{@literal Organization}') of the object.
     * @return {@code String}
     */
    @JsonProperty("organization")
    public String getOrganization() { return this.organization; }

    /**
     * Set the {@code organization} property (displayed as {@code Organization}) of the object.
     * @param organization the value to set
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) { this.organization = organization; }

    /**
     * Retrieve the {@code pager_number} property (displayed as '{@literal Pager Number}') of the object.
     * @return {@code String}
     */
    @JsonProperty("pager_number")
    public String getPagerNumber() { return this.pagerNumber; }

    /**
     * Set the {@code pager_number} property (displayed as {@code Pager Number}) of the object.
     * @param pagerNumber the value to set
     */
    @JsonProperty("pager_number")
    public void setPagerNumber(String pagerNumber) { this.pagerNumber = pagerNumber; }

    /**
     * Retrieve the {@code principal_id} property (displayed as '{@literal User Name}') of the object.
     * @return {@code String}
     */
    @JsonProperty("principal_id")
    public String getPrincipalId() { return this.principalId; }

    /**
     * Set the {@code principal_id} property (displayed as {@code User Name}) of the object.
     * @param principalId the value to set
     */
    @JsonProperty("principal_id")
    public void setPrincipalId(String principalId) { this.principalId = principalId; }

    /**
     * Retrieve the {@code surname} property (displayed as '{@literal Surname}') of the object.
     * @return {@code String}
     */
    @JsonProperty("surname")
    public String getSurname() { return this.surname; }

    /**
     * Set the {@code surname} property (displayed as {@code Surname}) of the object.
     * @param surname the value to set
     */
    @JsonProperty("surname")
    public void setSurname(String surname) { this.surname = surname; }

}
