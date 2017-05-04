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
    ///  Class for testing MeetingApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class MeetingApiTests
    {
        private MeetingApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new MeetingApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MeetingApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' MeetingApi
            //Assert.IsInstanceOfType(typeof(MeetingApi), instance, "instance is a MeetingApi");
        }

        
        /// <summary>
        /// Test CancelMeeting
        /// </summary>
        [Test]
        public void CancelMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //instance.CancelMeeting(userId, meetingId);
            
        }
        
        /// <summary>
        /// Test CreateMeeting
        /// </summary>
        [Test]
        public void CreateMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //Meeting meeting = null;
            //bool? email = null;
            //var response = instance.CreateMeeting(userId, meeting, email);
            //Assert.IsInstanceOf<Meeting> (response, "response is Meeting");
        }
        
        /// <summary>
        /// Test GeneratePairingCodeSip
        /// </summary>
        [Test]
        public void GeneratePairingCodeSipTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //PayloadPairingCodeSIP payloadPairingCodeSIP = null;
            //var response = instance.GeneratePairingCodeSip(userId, meetingId, payloadPairingCodeSIP);
            //Assert.IsInstanceOf<PairingCode> (response, "response is PairingCode");
        }
        
        /// <summary>
        /// Test GeneratePairingCodeWebRtc
        /// </summary>
        [Test]
        public void GeneratePairingCodeWebRtcTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //PayloadPairingCodeWebRTC payloadPairingCodeWebRTC = null;
            //string role = null;
            //var response = instance.GeneratePairingCodeWebRtc(userId, meetingId, payloadPairingCodeWebRTC, role);
            //Assert.IsInstanceOf<PairingCode> (response, "response is PairingCode");
        }
        
        /// <summary>
        /// Test GetEndpointLayout
        /// </summary>
        [Test]
        public void GetEndpointLayoutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //string endpointGuid = null;
            //var response = instance.GetEndpointLayout(userId, meetingId, endpointGuid);
            //Assert.IsInstanceOf<Layout> (response, "response is Layout");
        }
        
        /// <summary>
        /// Test GetMeeting
        /// </summary>
        [Test]
        public void GetMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //var response = instance.GetMeeting(userId, meetingId);
            //Assert.IsInstanceOf<Meeting> (response, "response is Meeting");
        }
        
        /// <summary>
        /// Test GetMeetingEmails
        /// </summary>
        [Test]
        public void GetMeetingEmailsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //string type = null;
            //string role = null;
            //string action = null;
            //var response = instance.GetMeetingEmails(userId, meetingId, type, role, action);
            //Assert.IsInstanceOf<Meeting> (response, "response is Meeting");
        }
        
        /// <summary>
        /// Test GetMeetingEndpoint
        /// </summary>
        [Test]
        public void GetMeetingEndpointTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //string endpointGuid = null;
            //var response = instance.GetMeetingEndpoint(userId, meetingId, endpointGuid);
            //Assert.IsInstanceOf<Endpoint> (response, "response is Endpoint");
        }
        
        /// <summary>
        /// Test GetMeetingEndpoints
        /// </summary>
        [Test]
        public void GetMeetingEndpointsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //var response = instance.GetMeetingEndpoints(userId, meetingId);
            //Assert.IsInstanceOf<Endpoints> (response, "response is Endpoints");
        }
        
        /// <summary>
        /// Test GetMeetingNumbers
        /// </summary>
        [Test]
        public void GetMeetingNumbersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //var response = instance.GetMeetingNumbers(userId, meetingId);
            //Assert.IsInstanceOf<Numbers> (response, "response is Numbers");
        }
        
        /// <summary>
        /// Test GetMeetingState
        /// </summary>
        [Test]
        public void GetMeetingStateTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //var response = instance.GetMeetingState(userId, meetingId);
            //Assert.IsInstanceOf<MeetingState> (response, "response is MeetingState");
        }
        
        /// <summary>
        /// Test ListMeetings
        /// </summary>
        [Test]
        public void ListMeetingsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //string numericMeetingId = null;
            //var response = instance.ListMeetings(userId, numericMeetingId);
            //Assert.IsInstanceOf<List<Meeting>> (response, "response is List<Meeting>");
        }
        
        /// <summary>
        /// Test SendMeetingInvite
        /// </summary>
        [Test]
        public void SendMeetingInviteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //PayloadInvite payloadInvite = null;
            //instance.SendMeetingInvite(userId, meetingId, payloadInvite);
            
        }
        
        /// <summary>
        /// Test UpdateEndpointLayout
        /// </summary>
        [Test]
        public void UpdateEndpointLayoutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //string endpointGuid = null;
            //bool? isLeader = null;
            //bool? push = null;
            //var response = instance.UpdateEndpointLayout(userId, meetingId, endpointGuid, isLeader, push);
            //Assert.IsInstanceOf<Layout> (response, "response is Layout");
        }
        
        /// <summary>
        /// Test UpdateMeeting
        /// </summary>
        [Test]
        public void UpdateMeetingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //Meeting meeting = null;
            //var response = instance.UpdateMeeting(userId, meetingId, meeting);
            //Assert.IsInstanceOf<Meeting> (response, "response is Meeting");
        }
        
        /// <summary>
        /// Test UpdateMeetingEndpoint
        /// </summary>
        [Test]
        public void UpdateMeetingEndpointTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //string endpointGuid = null;
            //bool? muteAudio = null;
            //bool? muteVideo = null;
            //bool? leaveMeeting = null;
            //var response = instance.UpdateMeetingEndpoint(userId, meetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting);
            //Assert.IsInstanceOf<Endpoint> (response, "response is Endpoint");
        }
        
        /// <summary>
        /// Test UpdateMeetingEndpoints
        /// </summary>
        [Test]
        public void UpdateMeetingEndpointsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //bool? mute = null;
            //string media = null;
            //instance.UpdateMeetingEndpoints(userId, meetingId, mute, media);
            
        }
        
        /// <summary>
        /// Test UpdateMeetingState
        /// </summary>
        [Test]
        public void UpdateMeetingStateTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? userId = null;
            //int? meetingId = null;
            //PayloadMeetingState payloadMeetingState = null;
            //int? delay = null;
            //var response = instance.UpdateMeetingState(userId, meetingId, payloadMeetingState, delay);
            //Assert.IsInstanceOf<Meeting> (response, "response is Meeting");
        }
        
    }

}
