/* 
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using com.bluejeans.api.rest.onvideo.Client;
using com.bluejeans.api.rest.onvideo.Api;
using com.bluejeans.api.rest.onvideo.Model;

namespace com.bluejeans.api.rest.onvideo.Test
{
    /// <summary>
    ///  Class for testing AuthenticationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AuthenticationApiTests
    {
        private AuthenticationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AuthenticationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AuthenticationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AuthenticationApi
            //Assert.IsInstanceOfType(typeof(AuthenticationApi), instance, "instance is a AuthenticationApi");
        }

        
        /// <summary>
        /// Test GetTokenByClient
        /// </summary>
        [Test]
        public void GetTokenByClientTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestClient grantRequestClient = null;
            //var response = instance.GetTokenByClient(grantRequestClient);
            //Assert.IsInstanceOf<GrantClient> (response, "response is GrantClient");
        }
        
        /// <summary>
        /// Test GetTokenByMeeting
        /// </summary>
        [Test]
        public void GetTokenByMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestMeeting grantRequestMeeting = null;
            //var response = instance.GetTokenByMeeting(grantRequestMeeting);
            //Assert.IsInstanceOf<GrantMeeting> (response, "response is GrantMeeting");
        }
        
        /// <summary>
        /// Test GetTokenByPassword
        /// </summary>
        [Test]
        public void GetTokenByPasswordTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GrantRequestPassword grantRequestPassword = null;
            //var response = instance.GetTokenByPassword(grantRequestPassword);
            //Assert.IsInstanceOf<GrantPassword> (response, "response is GrantPassword");
        }
        
        /// <summary>
        /// Test GetTokenInfo
        /// </summary>
        [Test]
        public void GetTokenInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetTokenInfo();
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
        
    }

}
