<?php
/**
 * EndpointIndigoTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
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
 * Please update the test case below to test the model.
 */

namespace Swagger\Client;

/**
 * EndpointIndigoTest Class Doc Comment
 *
 * @category    Class */
// * @description EndpointIndigo
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class EndpointIndigoTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass()
    {

    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {

    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {

    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {

    }

    /**
     * Test "EndpointIndigo"
     */
    public function testEndpointIndigo()
    {

    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {

    }

    /**
     * Test attribute "callguid"
     */
    public function testPropertyCallguid()
    {

    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {

    }

    /**
     * Test attribute "endpoint"
     */
    public function testPropertyEndpoint()
    {

    }

    /**
     * Test attribute "vendor"
     */
    public function testPropertyVendor()
    {

    }

    /**
     * Test attribute "version"
     */
    public function testPropertyVersion()
    {

    }

    /**
     * Test attribute "uniq_id"
     */
    public function testPropertyUniqId()
    {

    }

    /**
     * Test attribute "remote_address"
     */
    public function testPropertyRemoteAddress()
    {

    }

    /**
     * Test attribute "leader"
     */
    public function testPropertyLeader()
    {

    }

    /**
     * Test attribute "secure_call"
     */
    public function testPropertySecureCall()
    {

    }

    /**
     * Test attribute "nat_detected"
     */
    public function testPropertyNatDetected()
    {

    }

    /**
     * Test attribute "proxy"
     */
    public function testPropertyProxy()
    {

    }

    /**
     * Test attribute "roi_distance"
     */
    public function testPropertyRoiDistance()
    {

    }

    /**
     * Test attribute "mpls"
     */
    public function testPropertyMpls()
    {

    }

    /**
     * Test attribute "video_share"
     */
    public function testPropertyVideoShare()
    {

    }

    /**
     * Test attribute "recording"
     */
    public function testPropertyRecording()
    {

    }

    /**
     * Test attribute "creation_time"
     */
    public function testPropertyCreationTime()
    {

    }

    /**
     * Test attribute "meeting_join_time"
     */
    public function testPropertyMeetingJoinTime()
    {

    }

    /**
     * Test attribute "meeting_leave_time"
     */
    public function testPropertyMeetingLeaveTime()
    {

    }

    /**
     * Test attribute "did_number"
     */
    public function testPropertyDidNumber()
    {

    }

    /**
     * Test attribute "location"
     */
    public function testPropertyLocation()
    {

    }

    /**
     * Test attribute "summary_stats"
     */
    public function testPropertySummaryStats()
    {

    }

    /**
     * Test attribute "endpoint_attributes1"
     */
    public function testPropertyEndpointAttributes1()
    {

    }

    /**
     * Test attribute "traceroute"
     */
    public function testPropertyTraceroute()
    {

    }

    /**
     * Test attribute "mhtask_stopped"
     */
    public function testPropertyMhtaskStopped()
    {

    }

}
