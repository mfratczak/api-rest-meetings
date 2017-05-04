<?php
/**
 * RecordingSummary
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * RecordingSummary Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class RecordingSummary implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'RecordingSummary';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'recording_entity_id' => 'int',
        'recording_name' => 'string',
        'meeting_guid' => 'string',
        'chapter_count' => 'int',
        'total_size' => 'int',
        'total_duration' => 'int',
        'last_recording_date' => 'string',
        'aggregated_status' => 'string',
        'recording_thumbnail' => 'string',
        'created' => 'int',
        'is_premium_recording' => 'bool',
        'show_premium_recording_tag' => 'bool'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'recording_entity_id' => 'recordingEntityId',
        'recording_name' => 'recordingName',
        'meeting_guid' => 'meetingGuid',
        'chapter_count' => 'chapterCount',
        'total_size' => 'totalSize',
        'total_duration' => 'totalDuration',
        'last_recording_date' => 'lastRecordingDate',
        'aggregated_status' => 'aggregatedStatus',
        'recording_thumbnail' => 'recordingThumbnail',
        'created' => 'created',
        'is_premium_recording' => 'isPremiumRecording',
        'show_premium_recording_tag' => 'showPremiumRecordingTag'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'recording_entity_id' => 'setRecordingEntityId',
        'recording_name' => 'setRecordingName',
        'meeting_guid' => 'setMeetingGuid',
        'chapter_count' => 'setChapterCount',
        'total_size' => 'setTotalSize',
        'total_duration' => 'setTotalDuration',
        'last_recording_date' => 'setLastRecordingDate',
        'aggregated_status' => 'setAggregatedStatus',
        'recording_thumbnail' => 'setRecordingThumbnail',
        'created' => 'setCreated',
        'is_premium_recording' => 'setIsPremiumRecording',
        'show_premium_recording_tag' => 'setShowPremiumRecordingTag'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'recording_entity_id' => 'getRecordingEntityId',
        'recording_name' => 'getRecordingName',
        'meeting_guid' => 'getMeetingGuid',
        'chapter_count' => 'getChapterCount',
        'total_size' => 'getTotalSize',
        'total_duration' => 'getTotalDuration',
        'last_recording_date' => 'getLastRecordingDate',
        'aggregated_status' => 'getAggregatedStatus',
        'recording_thumbnail' => 'getRecordingThumbnail',
        'created' => 'getCreated',
        'is_premium_recording' => 'getIsPremiumRecording',
        'show_premium_recording_tag' => 'getShowPremiumRecordingTag'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['recording_entity_id'] = isset($data['recording_entity_id']) ? $data['recording_entity_id'] : null;
        $this->container['recording_name'] = isset($data['recording_name']) ? $data['recording_name'] : null;
        $this->container['meeting_guid'] = isset($data['meeting_guid']) ? $data['meeting_guid'] : null;
        $this->container['chapter_count'] = isset($data['chapter_count']) ? $data['chapter_count'] : null;
        $this->container['total_size'] = isset($data['total_size']) ? $data['total_size'] : null;
        $this->container['total_duration'] = isset($data['total_duration']) ? $data['total_duration'] : null;
        $this->container['last_recording_date'] = isset($data['last_recording_date']) ? $data['last_recording_date'] : null;
        $this->container['aggregated_status'] = isset($data['aggregated_status']) ? $data['aggregated_status'] : null;
        $this->container['recording_thumbnail'] = isset($data['recording_thumbnail']) ? $data['recording_thumbnail'] : null;
        $this->container['created'] = isset($data['created']) ? $data['created'] : null;
        $this->container['is_premium_recording'] = isset($data['is_premium_recording']) ? $data['is_premium_recording'] : null;
        $this->container['show_premium_recording_tag'] = isset($data['show_premium_recording_tag']) ? $data['show_premium_recording_tag'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
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
     * @return string
     */
    public function getLastRecordingDate()
    {
        return $this->container['last_recording_date'];
    }

    /**
     * Sets last_recording_date
     * @param string $last_recording_date
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


