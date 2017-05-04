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
import com.bluejeans.api.rest.onvideo.model.PairingCodeTurnservers;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PairingCode
 */

public class PairingCode {
  @SerializedName("callguid")
  private String callguid = null;

  @SerializedName("endpointGuid")
  private String endpointGuid = null;

  @SerializedName("forceTURN")
  private Boolean forceTURN = null;

  @SerializedName("pairingCode")
  private String pairingCode = null;

  @SerializedName("status")
  private Integer status = null;

  /**
   * Gets or Sets statusText
   */
  public enum StatusTextEnum {
    @SerializedName("OK")
    OK("OK");

    private String value;

    StatusTextEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statusText")
  private StatusTextEnum statusText = null;

  @SerializedName("turnservers")
  private List<PairingCodeTurnservers> turnservers = new ArrayList<PairingCodeTurnservers>();

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("seamEndpointGuid")
  private String seamEndpointGuid = null;

  @SerializedName("connectionGuid")
  private String connectionGuid = null;

  @SerializedName("endpointName")
  private String endpointName = null;

  public PairingCode callguid(String callguid) {
    this.callguid = callguid;
    return this;
  }

   /**
   * Get callguid
   * @return callguid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCallguid() {
    return callguid;
  }

  public void setCallguid(String callguid) {
    this.callguid = callguid;
  }

  public PairingCode endpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
    return this;
  }

   /**
   * Get endpointGuid
   * @return endpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpointGuid() {
    return endpointGuid;
  }

  public void setEndpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
  }

  public PairingCode forceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
    return this;
  }

   /**
   * Get forceTURN
   * @return forceTURN
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getForceTURN() {
    return forceTURN;
  }

  public void setForceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
  }

  public PairingCode pairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
    return this;
  }

   /**
   * Get pairingCode
   * @return pairingCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPairingCode() {
    return pairingCode;
  }

  public void setPairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
  }

  public PairingCode status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PairingCode statusText(StatusTextEnum statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusTextEnum getStatusText() {
    return statusText;
  }

  public void setStatusText(StatusTextEnum statusText) {
    this.statusText = statusText;
  }

  public PairingCode turnservers(List<PairingCodeTurnservers> turnservers) {
    this.turnservers = turnservers;
    return this;
  }

  public PairingCode addTurnserversItem(PairingCodeTurnservers turnserversItem) {
    this.turnservers.add(turnserversItem);
    return this;
  }

   /**
   * Get turnservers
   * @return turnservers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PairingCodeTurnservers> getTurnservers() {
    return turnservers;
  }

  public void setTurnservers(List<PairingCodeTurnservers> turnservers) {
    this.turnservers = turnservers;
  }

  public PairingCode uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public PairingCode seamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
    return this;
  }

   /**
   * Get seamEndpointGuid
   * @return seamEndpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeamEndpointGuid() {
    return seamEndpointGuid;
  }

  public void setSeamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
  }

  public PairingCode connectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
    return this;
  }

   /**
   * Get connectionGuid
   * @return connectionGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectionGuid() {
    return connectionGuid;
  }

  public void setConnectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
  }

  public PairingCode endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PairingCode pairingCode = (PairingCode) o;
    return Objects.equals(this.callguid, pairingCode.callguid) &&
        Objects.equals(this.endpointGuid, pairingCode.endpointGuid) &&
        Objects.equals(this.forceTURN, pairingCode.forceTURN) &&
        Objects.equals(this.pairingCode, pairingCode.pairingCode) &&
        Objects.equals(this.status, pairingCode.status) &&
        Objects.equals(this.statusText, pairingCode.statusText) &&
        Objects.equals(this.turnservers, pairingCode.turnservers) &&
        Objects.equals(this.uri, pairingCode.uri) &&
        Objects.equals(this.seamEndpointGuid, pairingCode.seamEndpointGuid) &&
        Objects.equals(this.connectionGuid, pairingCode.connectionGuid) &&
        Objects.equals(this.endpointName, pairingCode.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callguid, endpointGuid, forceTURN, pairingCode, status, statusText, turnservers, uri, seamEndpointGuid, connectionGuid, endpointName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingCode {\n");
    
    sb.append("    callguid: ").append(toIndentedString(callguid)).append("\n");
    sb.append("    endpointGuid: ").append(toIndentedString(endpointGuid)).append("\n");
    sb.append("    forceTURN: ").append(toIndentedString(forceTURN)).append("\n");
    sb.append("    pairingCode: ").append(toIndentedString(pairingCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    turnservers: ").append(toIndentedString(turnservers)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    seamEndpointGuid: ").append(toIndentedString(seamEndpointGuid)).append("\n");
    sb.append("    connectionGuid: ").append(toIndentedString(connectionGuid)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
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

