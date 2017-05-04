/*
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.onvideo.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GrantMeetingScopeMeeting
 */

public class GrantMeetingScopeMeeting {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("leaderId")
  private Integer leaderId = null;

  @SerializedName("meetingNumericId")
  private String meetingNumericId = null;

  @SerializedName("meetingUri")
  private String meetingUri = null;

  @SerializedName("isModerator")
  private Boolean isModerator = null;

  @SerializedName("endpointUriSet")
  private List<Object> endpointUriSet = new ArrayList<Object>();

  @SerializedName("meetingId")
  private String meetingId = null;

  public GrantMeetingScopeMeeting id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GrantMeetingScopeMeeting leaderId(Integer leaderId) {
    this.leaderId = leaderId;
    return this;
  }

   /**
   * Get leaderId
   * @return leaderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLeaderId() {
    return leaderId;
  }

  public void setLeaderId(Integer leaderId) {
    this.leaderId = leaderId;
  }

  public GrantMeetingScopeMeeting meetingNumericId(String meetingNumericId) {
    this.meetingNumericId = meetingNumericId;
    return this;
  }

   /**
   * Get meetingNumericId
   * @return meetingNumericId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingNumericId() {
    return meetingNumericId;
  }

  public void setMeetingNumericId(String meetingNumericId) {
    this.meetingNumericId = meetingNumericId;
  }

  public GrantMeetingScopeMeeting meetingUri(String meetingUri) {
    this.meetingUri = meetingUri;
    return this;
  }

   /**
   * Get meetingUri
   * @return meetingUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingUri() {
    return meetingUri;
  }

  public void setMeetingUri(String meetingUri) {
    this.meetingUri = meetingUri;
  }

  public GrantMeetingScopeMeeting isModerator(Boolean isModerator) {
    this.isModerator = isModerator;
    return this;
  }

   /**
   * Get isModerator
   * @return isModerator
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsModerator() {
    return isModerator;
  }

  public void setIsModerator(Boolean isModerator) {
    this.isModerator = isModerator;
  }

  public GrantMeetingScopeMeeting endpointUriSet(List<Object> endpointUriSet) {
    this.endpointUriSet = endpointUriSet;
    return this;
  }

  public GrantMeetingScopeMeeting addEndpointUriSetItem(Object endpointUriSetItem) {
    this.endpointUriSet.add(endpointUriSetItem);
    return this;
  }

   /**
   * Get endpointUriSet
   * @return endpointUriSet
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Object> getEndpointUriSet() {
    return endpointUriSet;
  }

  public void setEndpointUriSet(List<Object> endpointUriSet) {
    this.endpointUriSet = endpointUriSet;
  }

  public GrantMeetingScopeMeeting meetingId(String meetingId) {
    this.meetingId = meetingId;
    return this;
  }

   /**
   * Get meetingId
   * @return meetingId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(String meetingId) {
    this.meetingId = meetingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantMeetingScopeMeeting grantMeetingScopeMeeting = (GrantMeetingScopeMeeting) o;
    return Objects.equals(this.id, grantMeetingScopeMeeting.id) &&
        Objects.equals(this.leaderId, grantMeetingScopeMeeting.leaderId) &&
        Objects.equals(this.meetingNumericId, grantMeetingScopeMeeting.meetingNumericId) &&
        Objects.equals(this.meetingUri, grantMeetingScopeMeeting.meetingUri) &&
        Objects.equals(this.isModerator, grantMeetingScopeMeeting.isModerator) &&
        Objects.equals(this.endpointUriSet, grantMeetingScopeMeeting.endpointUriSet) &&
        Objects.equals(this.meetingId, grantMeetingScopeMeeting.meetingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, leaderId, meetingNumericId, meetingUri, isModerator, endpointUriSet, meetingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantMeetingScopeMeeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaderId: ").append(toIndentedString(leaderId)).append("\n");
    sb.append("    meetingNumericId: ").append(toIndentedString(meetingNumericId)).append("\n");
    sb.append("    meetingUri: ").append(toIndentedString(meetingUri)).append("\n");
    sb.append("    isModerator: ").append(toIndentedString(isModerator)).append("\n");
    sb.append("    endpointUriSet: ").append(toIndentedString(endpointUriSet)).append("\n");
    sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

