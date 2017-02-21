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
import io.swagger.client.model.MeetingHistoryLeaderInfo;
import io.swagger.client.model.MeetingHistoryParticipantList;
import java.util.ArrayList;
import java.util.List;


/**
 * MeetingHistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:58:20.737-07:00")
public class MeetingHistory   {
  @SerializedName("meetingGuid")
  private String meetingGuid = null;

  @SerializedName("meetingNumericId")
  private String meetingNumericId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("leaderInfo")
  private MeetingHistoryLeaderInfo leaderInfo = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("meetingDuration")
  private Integer meetingDuration = null;

  @SerializedName("maxParticipantCount")
  private Integer maxParticipantCount = null;

  @SerializedName("totalParticipantMinutes")
  private Integer totalParticipantMinutes = null;

  @SerializedName("maxParticipantMinutes")
  private Integer maxParticipantMinutes = null;

  @SerializedName("extraParticipantMinutes")
  private Integer extraParticipantMinutes = null;

  @SerializedName("isdnEndpoints")
  private Integer isdnEndpoints = null;

  @SerializedName("totalDialoutMinutes")
  private Integer totalDialoutMinutes = null;

  @SerializedName("totalTollFreeMinutes")
  private Integer totalTollFreeMinutes = null;

  @SerializedName("callDIDMinutes")
  private Integer callDIDMinutes = null;

  @SerializedName("startTime")
  private Integer startTime = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  /**
   * Gets or Sets meetingStatus
   */
  public enum MeetingStatusEnum {
    @SerializedName("Complete")
    COMPLETE("Complete");

    private String value;

    MeetingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("meetingStatus")
  private MeetingStatusEnum meetingStatus = null;

  @SerializedName("meetingThumbnail")
  private String meetingThumbnail = null;

  @SerializedName("startTimeZone")
  private String startTimeZone = null;

  /**
   * Gets or Sets processingStatus
   */
  public enum ProcessingStatusEnum {
    @SerializedName("PROCESSED")
    PROCESSED("PROCESSED");

    private String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("processingStatus")
  private ProcessingStatusEnum processingStatus = null;

  @SerializedName("concurrentCalls")
  private String concurrentCalls = null;

  @SerializedName("uploadStatus")
  private String uploadStatus = null;

  @SerializedName("pstnonly")
  private Boolean pstnonly = null;

  @SerializedName("participantList")
  private List<MeetingHistoryParticipantList> participantList = new ArrayList<MeetingHistoryParticipantList>();

  public MeetingHistory meetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
    return this;
  }

   /**
   * Get meetingGuid
   * @return meetingGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingGuid() {
    return meetingGuid;
  }

  public void setMeetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
  }

  public MeetingHistory meetingNumericId(String meetingNumericId) {
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

  public MeetingHistory title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MeetingHistory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MeetingHistory leaderInfo(MeetingHistoryLeaderInfo leaderInfo) {
    this.leaderInfo = leaderInfo;
    return this;
  }

   /**
   * Get leaderInfo
   * @return leaderInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeetingHistoryLeaderInfo getLeaderInfo() {
    return leaderInfo;
  }

  public void setLeaderInfo(MeetingHistoryLeaderInfo leaderInfo) {
    this.leaderInfo = leaderInfo;
  }

  public MeetingHistory userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public MeetingHistory meetingDuration(Integer meetingDuration) {
    this.meetingDuration = meetingDuration;
    return this;
  }

   /**
   * Get meetingDuration
   * @return meetingDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMeetingDuration() {
    return meetingDuration;
  }

  public void setMeetingDuration(Integer meetingDuration) {
    this.meetingDuration = meetingDuration;
  }

  public MeetingHistory maxParticipantCount(Integer maxParticipantCount) {
    this.maxParticipantCount = maxParticipantCount;
    return this;
  }

   /**
   * Get maxParticipantCount
   * @return maxParticipantCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxParticipantCount() {
    return maxParticipantCount;
  }

  public void setMaxParticipantCount(Integer maxParticipantCount) {
    this.maxParticipantCount = maxParticipantCount;
  }

  public MeetingHistory totalParticipantMinutes(Integer totalParticipantMinutes) {
    this.totalParticipantMinutes = totalParticipantMinutes;
    return this;
  }

   /**
   * Get totalParticipantMinutes
   * @return totalParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalParticipantMinutes() {
    return totalParticipantMinutes;
  }

  public void setTotalParticipantMinutes(Integer totalParticipantMinutes) {
    this.totalParticipantMinutes = totalParticipantMinutes;
  }

  public MeetingHistory maxParticipantMinutes(Integer maxParticipantMinutes) {
    this.maxParticipantMinutes = maxParticipantMinutes;
    return this;
  }

   /**
   * Get maxParticipantMinutes
   * @return maxParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxParticipantMinutes() {
    return maxParticipantMinutes;
  }

  public void setMaxParticipantMinutes(Integer maxParticipantMinutes) {
    this.maxParticipantMinutes = maxParticipantMinutes;
  }

  public MeetingHistory extraParticipantMinutes(Integer extraParticipantMinutes) {
    this.extraParticipantMinutes = extraParticipantMinutes;
    return this;
  }

   /**
   * Get extraParticipantMinutes
   * @return extraParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getExtraParticipantMinutes() {
    return extraParticipantMinutes;
  }

  public void setExtraParticipantMinutes(Integer extraParticipantMinutes) {
    this.extraParticipantMinutes = extraParticipantMinutes;
  }

  public MeetingHistory isdnEndpoints(Integer isdnEndpoints) {
    this.isdnEndpoints = isdnEndpoints;
    return this;
  }

   /**
   * Get isdnEndpoints
   * @return isdnEndpoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIsdnEndpoints() {
    return isdnEndpoints;
  }

  public void setIsdnEndpoints(Integer isdnEndpoints) {
    this.isdnEndpoints = isdnEndpoints;
  }

  public MeetingHistory totalDialoutMinutes(Integer totalDialoutMinutes) {
    this.totalDialoutMinutes = totalDialoutMinutes;
    return this;
  }

   /**
   * Get totalDialoutMinutes
   * @return totalDialoutMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalDialoutMinutes() {
    return totalDialoutMinutes;
  }

  public void setTotalDialoutMinutes(Integer totalDialoutMinutes) {
    this.totalDialoutMinutes = totalDialoutMinutes;
  }

  public MeetingHistory totalTollFreeMinutes(Integer totalTollFreeMinutes) {
    this.totalTollFreeMinutes = totalTollFreeMinutes;
    return this;
  }

   /**
   * Get totalTollFreeMinutes
   * @return totalTollFreeMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalTollFreeMinutes() {
    return totalTollFreeMinutes;
  }

  public void setTotalTollFreeMinutes(Integer totalTollFreeMinutes) {
    this.totalTollFreeMinutes = totalTollFreeMinutes;
  }

  public MeetingHistory callDIDMinutes(Integer callDIDMinutes) {
    this.callDIDMinutes = callDIDMinutes;
    return this;
  }

   /**
   * Get callDIDMinutes
   * @return callDIDMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCallDIDMinutes() {
    return callDIDMinutes;
  }

  public void setCallDIDMinutes(Integer callDIDMinutes) {
    this.callDIDMinutes = callDIDMinutes;
  }

  public MeetingHistory startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public MeetingHistory endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public MeetingHistory meetingStatus(MeetingStatusEnum meetingStatus) {
    this.meetingStatus = meetingStatus;
    return this;
  }

   /**
   * Get meetingStatus
   * @return meetingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeetingStatusEnum getMeetingStatus() {
    return meetingStatus;
  }

  public void setMeetingStatus(MeetingStatusEnum meetingStatus) {
    this.meetingStatus = meetingStatus;
  }

  public MeetingHistory meetingThumbnail(String meetingThumbnail) {
    this.meetingThumbnail = meetingThumbnail;
    return this;
  }

   /**
   * Get meetingThumbnail
   * @return meetingThumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingThumbnail() {
    return meetingThumbnail;
  }

  public void setMeetingThumbnail(String meetingThumbnail) {
    this.meetingThumbnail = meetingThumbnail;
  }

  public MeetingHistory startTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
    return this;
  }

   /**
   * Get startTimeZone
   * @return startTimeZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartTimeZone() {
    return startTimeZone;
  }

  public void setStartTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
  }

  public MeetingHistory processingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * Get processingStatus
   * @return processingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }

  public MeetingHistory concurrentCalls(String concurrentCalls) {
    this.concurrentCalls = concurrentCalls;
    return this;
  }

   /**
   * Get concurrentCalls
   * @return concurrentCalls
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConcurrentCalls() {
    return concurrentCalls;
  }

  public void setConcurrentCalls(String concurrentCalls) {
    this.concurrentCalls = concurrentCalls;
  }

  public MeetingHistory uploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }

   /**
   * Get uploadStatus
   * @return uploadStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUploadStatus() {
    return uploadStatus;
  }

  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  public MeetingHistory pstnonly(Boolean pstnonly) {
    this.pstnonly = pstnonly;
    return this;
  }

   /**
   * Get pstnonly
   * @return pstnonly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPstnonly() {
    return pstnonly;
  }

  public void setPstnonly(Boolean pstnonly) {
    this.pstnonly = pstnonly;
  }

  public MeetingHistory participantList(List<MeetingHistoryParticipantList> participantList) {
    this.participantList = participantList;
    return this;
  }

  public MeetingHistory addParticipantListItem(MeetingHistoryParticipantList participantListItem) {
    this.participantList.add(participantListItem);
    return this;
  }

   /**
   * Get participantList
   * @return participantList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MeetingHistoryParticipantList> getParticipantList() {
    return participantList;
  }

  public void setParticipantList(List<MeetingHistoryParticipantList> participantList) {
    this.participantList = participantList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingHistory meetingHistory = (MeetingHistory) o;
    return Objects.equals(this.meetingGuid, meetingHistory.meetingGuid) &&
        Objects.equals(this.meetingNumericId, meetingHistory.meetingNumericId) &&
        Objects.equals(this.title, meetingHistory.title) &&
        Objects.equals(this.description, meetingHistory.description) &&
        Objects.equals(this.leaderInfo, meetingHistory.leaderInfo) &&
        Objects.equals(this.userId, meetingHistory.userId) &&
        Objects.equals(this.meetingDuration, meetingHistory.meetingDuration) &&
        Objects.equals(this.maxParticipantCount, meetingHistory.maxParticipantCount) &&
        Objects.equals(this.totalParticipantMinutes, meetingHistory.totalParticipantMinutes) &&
        Objects.equals(this.maxParticipantMinutes, meetingHistory.maxParticipantMinutes) &&
        Objects.equals(this.extraParticipantMinutes, meetingHistory.extraParticipantMinutes) &&
        Objects.equals(this.isdnEndpoints, meetingHistory.isdnEndpoints) &&
        Objects.equals(this.totalDialoutMinutes, meetingHistory.totalDialoutMinutes) &&
        Objects.equals(this.totalTollFreeMinutes, meetingHistory.totalTollFreeMinutes) &&
        Objects.equals(this.callDIDMinutes, meetingHistory.callDIDMinutes) &&
        Objects.equals(this.startTime, meetingHistory.startTime) &&
        Objects.equals(this.endTime, meetingHistory.endTime) &&
        Objects.equals(this.meetingStatus, meetingHistory.meetingStatus) &&
        Objects.equals(this.meetingThumbnail, meetingHistory.meetingThumbnail) &&
        Objects.equals(this.startTimeZone, meetingHistory.startTimeZone) &&
        Objects.equals(this.processingStatus, meetingHistory.processingStatus) &&
        Objects.equals(this.concurrentCalls, meetingHistory.concurrentCalls) &&
        Objects.equals(this.uploadStatus, meetingHistory.uploadStatus) &&
        Objects.equals(this.pstnonly, meetingHistory.pstnonly) &&
        Objects.equals(this.participantList, meetingHistory.participantList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meetingGuid, meetingNumericId, title, description, leaderInfo, userId, meetingDuration, maxParticipantCount, totalParticipantMinutes, maxParticipantMinutes, extraParticipantMinutes, isdnEndpoints, totalDialoutMinutes, totalTollFreeMinutes, callDIDMinutes, startTime, endTime, meetingStatus, meetingThumbnail, startTimeZone, processingStatus, concurrentCalls, uploadStatus, pstnonly, participantList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingHistory {\n");
    
    sb.append("    meetingGuid: ").append(toIndentedString(meetingGuid)).append("\n");
    sb.append("    meetingNumericId: ").append(toIndentedString(meetingNumericId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    leaderInfo: ").append(toIndentedString(leaderInfo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    meetingDuration: ").append(toIndentedString(meetingDuration)).append("\n");
    sb.append("    maxParticipantCount: ").append(toIndentedString(maxParticipantCount)).append("\n");
    sb.append("    totalParticipantMinutes: ").append(toIndentedString(totalParticipantMinutes)).append("\n");
    sb.append("    maxParticipantMinutes: ").append(toIndentedString(maxParticipantMinutes)).append("\n");
    sb.append("    extraParticipantMinutes: ").append(toIndentedString(extraParticipantMinutes)).append("\n");
    sb.append("    isdnEndpoints: ").append(toIndentedString(isdnEndpoints)).append("\n");
    sb.append("    totalDialoutMinutes: ").append(toIndentedString(totalDialoutMinutes)).append("\n");
    sb.append("    totalTollFreeMinutes: ").append(toIndentedString(totalTollFreeMinutes)).append("\n");
    sb.append("    callDIDMinutes: ").append(toIndentedString(callDIDMinutes)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    meetingStatus: ").append(toIndentedString(meetingStatus)).append("\n");
    sb.append("    meetingThumbnail: ").append(toIndentedString(meetingThumbnail)).append("\n");
    sb.append("    startTimeZone: ").append(toIndentedString(startTimeZone)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    concurrentCalls: ").append(toIndentedString(concurrentCalls)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    pstnonly: ").append(toIndentedString(pstnonly)).append("\n");
    sb.append("    participantList: ").append(toIndentedString(participantList)).append("\n");
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

