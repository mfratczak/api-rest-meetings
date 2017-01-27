<?php
/**
 * Recording
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Recording Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Recording implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Recording';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'recording_entity_id' => 'int',
        'recording_entity_guid' => 'string',
        'recording_name' => 'string',
        'meeting_guid' => 'string',
        'chapter_count' => 'int',
        'total_size' => 'int',
        'total_duration' => 'int',
        'last_recording_date' => 'int',
        'aggregated_status' => 'string',
        'recording_thumbnail' => 'string',
        'created' => 'int',
        'aggregated_view_count' => 'int',
        'is_premium_recording' => 'bool',
        'show_premium_recording_tag' => 'bool',
        'recording_chapters' => '\Swagger\Client\Model\RecordingRecordingChapters[]'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'recording_entity_id' => 'recordingEntityId',
        'recording_entity_guid' => 'recordingEntityGuid',
        'recording_name' => 'recordingName',
        'meeting_guid' => 'meetingGuid',
        'chapter_count' => 'chapterCount',
        'total_size' => 'totalSize',
        'total_duration' => 'totalDuration',
        'last_recording_date' => 'lastRecordingDate',
        'aggregated_status' => 'aggregatedStatus',
        'recording_thumbnail' => 'recordingThumbnail',
        'created' => 'created',
        'aggregated_view_count' => 'aggregatedViewCount',
        'is_premium_recording' => 'isPremiumRecording',
        'show_premium_recording_tag' => 'showPremiumRecordingTag',
        'recording_chapters' => 'recordingChapters'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'recording_entity_id' => 'setRecordingEntityId',
        'recording_entity_guid' => 'setRecordingEntityGuid',
        'recording_name' => 'setRecordingName',
        'meeting_guid' => 'setMeetingGuid',
        'chapter_count' => 'setChapterCount',
        'total_size' => 'setTotalSize',
        'total_duration' => 'setTotalDuration',
        'last_recording_date' => 'setLastRecordingDate',
        'aggregated_status' => 'setAggregatedStatus',
        'recording_thumbnail' => 'setRecordingThumbnail',
        'created' => 'setCreated',
        'aggregated_view_count' => 'setAggregatedViewCount',
        'is_premium_recording' => 'setIsPremiumRecording',
        'show_premium_recording_tag' => 'setShowPremiumRecordingTag',
        'recording_chapters' => 'setRecordingChapters'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'recording_entity_id' => 'getRecordingEntityId',
        'recording_entity_guid' => 'getRecordingEntityGuid',
        'recording_name' => 'getRecordingName',
        'meeting_guid' => 'getMeetingGuid',
        'chapter_count' => 'getChapterCount',
        'total_size' => 'getTotalSize',
        'total_duration' => 'getTotalDuration',
        'last_recording_date' => 'getLastRecordingDate',
        'aggregated_status' => 'getAggregatedStatus',
        'recording_thumbnail' => 'getRecordingThumbnail',
        'created' => 'getCreated',
        'aggregated_view_count' => 'getAggregatedViewCount',
        'is_premium_recording' => 'getIsPremiumRecording',
        'show_premium_recording_tag' => 'getShowPremiumRecordingTag',
        'recording_chapters' => 'getRecordingChapters'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['recording_entity_id'] = isset($data['recording_entity_id']) ? $data['recording_entity_id'] : null;
        $this->container['recording_entity_guid'] = isset($data['recording_entity_guid']) ? $data['recording_entity_guid'] : null;
        $this->container['recording_name'] = isset($data['recording_name']) ? $data['recording_name'] : null;
        $this->container['meeting_guid'] = isset($data['meeting_guid']) ? $data['meeting_guid'] : null;
        $this->container['chapter_count'] = isset($data['chapter_count']) ? $data['chapter_count'] : null;
        $this->container['total_size'] = isset($data['total_size']) ? $data['total_size'] : null;
        $this->container['total_duration'] = isset($data['total_duration']) ? $data['total_duration'] : null;
        $this->container['last_recording_date'] = isset($data['last_recording_date']) ? $data['last_recording_date'] : null;
        $this->container['aggregated_status'] = isset($data['aggregated_status']) ? $data['aggregated_status'] : null;
        $this->container['recording_thumbnail'] = isset($data['recording_thumbnail']) ? $data['recording_thumbnail'] : null;
        $this->container['created'] = isset($data['created']) ? $data['created'] : null;
        $this->container['aggregated_view_count'] = isset($data['aggregated_view_count']) ? $data['aggregated_view_count'] : null;
        $this->container['is_premium_recording'] = isset($data['is_premium_recording']) ? $data['is_premium_recording'] : null;
        $this->container['show_premium_recording_tag'] = isset($data['show_premium_recording_tag']) ? $data['show_premium_recording_tag'] : null;
        $this->container['recording_chapters'] = isset($data['recording_chapters']) ? $data['recording_chapters'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        return true;
    }


    /**
     * Gets recording_entity_id
     * @return int
     */
    public function getRecordingEntityId()
    {
        return $this->container['recording_entity_id'];
    }

    /**
     * Sets recording_entity_id
     * @param int $recording_entity_id
     * @return $this
     */
    public function setRecordingEntityId($recording_entity_id)
    {
        $this->container['recording_entity_id'] = $recording_entity_id;

        return $this;
    }

    /**
     * Gets recording_entity_guid
     * @return string
     */
    public function getRecordingEntityGuid()
    {
        return $this->container['recording_entity_guid'];
    }

    /**
     * Sets recording_entity_guid
     * @param string $recording_entity_guid
     * @return $this
     */
    public function setRecordingEntityGuid($recording_entity_guid)
    {
        $this->container['recording_entity_guid'] = $recording_entity_guid;

        return $this;
    }

    /**
     * Gets recording_name
     * @return string
     */
    public function getRecordingName()
    {
        return $this->container['recording_name'];
    }

    /**
     * Sets recording_name
     * @param string $recording_name
     * @return $this
     */
    public function setRecordingName($recording_name)
    {
        $this->container['recording_name'] = $recording_name;

        return $this;
    }

    /**
     * Gets meeting_guid
     * @return string
     */
    public function getMeetingGuid()
    {
        return $this->container['meeting_guid'];
    }

    /**
     * Sets meeting_guid
     * @param string $meeting_guid
     * @return $this
     */
    public function setMeetingGuid($meeting_guid)
    {
        $this->container['meeting_guid'] = $meeting_guid;

        return $this;
    }

    /**
     * Gets chapter_count
     * @return int
     */
    public function getChapterCount()
    {
        return $this->container['chapter_count'];
    }

    /**
     * Sets chapter_count
     * @param int $chapter_count
     * @return $this
     */
    public function setChapterCount($chapter_count)
    {
        $this->container['chapter_count'] = $chapter_count;

        return $this;
    }

    /**
     * Gets total_size
     * @return int
     */
    public function getTotalSize()
    {
        return $this->container['total_size'];
    }

    /**
     * Sets total_size
     * @param int $total_size
     * @return $this
     */
    public function setTotalSize($total_size)
    {
        $this->container['total_size'] = $total_size;

        return $this;
    }

    /**
     * Gets total_duration
     * @return int
     */
    public function getTotalDuration()
    {
        return $this->container['total_duration'];
    }

    /**
     * Sets total_duration
     * @param int $total_duration
     * @return $this
     */
    public function setTotalDuration($total_duration)
    {
        $this->container['total_duration'] = $total_duration;

        return $this;
    }

    /**
     * Gets last_recording_date
     * @return int
     */
    public function getLastRecordingDate()
    {
        return $this->container['last_recording_date'];
    }

    /**
     * Sets last_recording_date
     * @param int $last_recording_date
     * @return $this
     */
    public function setLastRecordingDate($last_recording_date)
    {
        $this->container['last_recording_date'] = $last_recording_date;

        return $this;
    }

    /**
     * Gets aggregated_status
     * @return string
     */
    public function getAggregatedStatus()
    {
        return $this->container['aggregated_status'];
    }

    /**
     * Sets aggregated_status
     * @param string $aggregated_status
     * @return $this
     */
    public function setAggregatedStatus($aggregated_status)
    {
        $this->container['aggregated_status'] = $aggregated_status;

        return $this;
    }

    /**
     * Gets recording_thumbnail
     * @return string
     */
    public function getRecordingThumbnail()
    {
        return $this->container['recording_thumbnail'];
    }

    /**
     * Sets recording_thumbnail
     * @param string $recording_thumbnail
     * @return $this
     */
    public function setRecordingThumbnail($recording_thumbnail)
    {
        $this->container['recording_thumbnail'] = $recording_thumbnail;

        return $this;
    }

    /**
     * Gets created
     * @return int
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     * @param int $created
     * @return $this
     */
    public function setCreated($created)
    {
        $this->container['created'] = $created;

        return $this;
    }

    /**
     * Gets aggregated_view_count
     * @return int
     */
    public function getAggregatedViewCount()
    {
        return $this->container['aggregated_view_count'];
    }

    /**
     * Sets aggregated_view_count
     * @param int $aggregated_view_count
     * @return $this
     */
    public function setAggregatedViewCount($aggregated_view_count)
    {
        $this->container['aggregated_view_count'] = $aggregated_view_count;

        return $this;
    }

    /**
     * Gets is_premium_recording
     * @return bool
     */
    public function getIsPremiumRecording()
    {
        return $this->container['is_premium_recording'];
    }

    /**
     * Sets is_premium_recording
     * @param bool $is_premium_recording
     * @return $this
     */
    public function setIsPremiumRecording($is_premium_recording)
    {
        $this->container['is_premium_recording'] = $is_premium_recording;

        return $this;
    }

    /**
     * Gets show_premium_recording_tag
     * @return bool
     */
    public function getShowPremiumRecordingTag()
    {
        return $this->container['show_premium_recording_tag'];
    }

    /**
     * Sets show_premium_recording_tag
     * @param bool $show_premium_recording_tag
     * @return $this
     */
    public function setShowPremiumRecordingTag($show_premium_recording_tag)
    {
        $this->container['show_premium_recording_tag'] = $show_premium_recording_tag;

        return $this;
    }

    /**
     * Gets recording_chapters
     * @return \Swagger\Client\Model\RecordingRecordingChapters[]
     */
    public function getRecordingChapters()
    {
        return $this->container['recording_chapters'];
    }

    /**
     * Sets recording_chapters
     * @param \Swagger\Client\Model\RecordingRecordingChapters[] $recording_chapters
     * @return $this
     */
    public function setRecordingChapters($recording_chapters)
    {
        $this->container['recording_chapters'] = $recording_chapters;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


