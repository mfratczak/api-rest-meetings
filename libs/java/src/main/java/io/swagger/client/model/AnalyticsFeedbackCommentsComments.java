/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * AnalyticsFeedbackCommentsComments
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:58:20.737-07:00")
public class AnalyticsFeedbackCommentsComments   {
  @SerializedName("qualaroo_feedback")
  private String qualarooFeedback = null;

  @SerializedName("meeting_uuid")
  private String meetingUuid = null;

  @SerializedName("callguid")
  private String callguid = null;

  @SerializedName("qualaroo_comments")
  private String qualarooComments = null;

  public AnalyticsFeedbackCommentsComments qualarooFeedback(String qualarooFeedback) {
    this.qualarooFeedback = qualarooFeedback;
    return this;
  }

   /**
   * The comment rating left by the user.
   * @return qualarooFeedback
  **/
  @ApiModelProperty(example = "null", value = "The comment rating left by the user.")
  public String getQualarooFeedback() {
    return qualarooFeedback;
  }

  public void setQualarooFeedback(String qualarooFeedback) {
    this.qualarooFeedback = qualarooFeedback;
  }

  public AnalyticsFeedbackCommentsComments meetingUuid(String meetingUuid) {
    this.meetingUuid = meetingUuid;
    return this;
  }

   /**
   * The UUID of the meeting.
   * @return meetingUuid
  **/
  @ApiModelProperty(example = "null", value = "The UUID of the meeting.")
  public String getMeetingUuid() {
    return meetingUuid;
  }

  public void setMeetingUuid(String meetingUuid) {
    this.meetingUuid = meetingUuid;
  }

  public AnalyticsFeedbackCommentsComments callguid(String callguid) {
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

  public AnalyticsFeedbackCommentsComments qualarooComments(String qualarooComments) {
    this.qualarooComments = qualarooComments;
    return this;
  }

   /**
   * The comment left by the user.
   * @return qualarooComments
  **/
  @ApiModelProperty(example = "null", value = "The comment left by the user.")
  public String getQualarooComments() {
    return qualarooComments;
  }

  public void setQualarooComments(String qualarooComments) {
    this.qualarooComments = qualarooComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsFeedbackCommentsComments analyticsFeedbackCommentsComments = (AnalyticsFeedbackCommentsComments) o;
    return Objects.equals(this.qualarooFeedback, analyticsFeedbackCommentsComments.qualarooFeedback) &&
        Objects.equals(this.meetingUuid, analyticsFeedbackCommentsComments.meetingUuid) &&
        Objects.equals(this.callguid, analyticsFeedbackCommentsComments.callguid) &&
        Objects.equals(this.qualarooComments, analyticsFeedbackCommentsComments.qualarooComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualarooFeedback, meetingUuid, callguid, qualarooComments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsFeedbackCommentsComments {\n");
    
    sb.append("    qualarooFeedback: ").append(toIndentedString(qualarooFeedback)).append("\n");
    sb.append("    meetingUuid: ").append(toIndentedString(meetingUuid)).append("\n");
    sb.append("    callguid: ").append(toIndentedString(callguid)).append("\n");
    sb.append("    qualarooComments: ").append(toIndentedString(qualarooComments)).append("\n");
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

