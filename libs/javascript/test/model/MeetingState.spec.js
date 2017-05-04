/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BlueJeansOnVideoRestApi);
  }
}(this, function(expect, BlueJeansOnVideoRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlueJeansOnVideoRestApi.MeetingState();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('MeetingState', function() {
    it('should create an instance of MeetingState', function() {
      // uncomment below and update the code to test MeetingState
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be.a(BlueJeansOnVideoRestApi.MeetingState);
    });

    it('should have the property meetingId (base name: "meetingId")', function() {
      // uncomment below and update the code to test the property meetingId
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property meetingGuid (base name: "meetingGuid")', function() {
      // uncomment below and update the code to test the property meetingGuid
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property meetingState (base name: "meetingState")', function() {
      // uncomment below and update the code to test the property meetingState
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property isContentSharingActive (base name: "isContentSharingActive")', function() {
      // uncomment below and update the code to test the property isContentSharingActive
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property bridged (base name: "bridged")', function() {
      // uncomment below and update the code to test the property bridged
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property locked (base name: "locked")', function() {
      // uncomment below and update the code to test the property locked
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property audioMuteOnEntry (base name: "audioMuteOnEntry")', function() {
      // uncomment below and update the code to test the property audioMuteOnEntry
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property videoMuteOnEntry (base name: "videoMuteOnEntry")', function() {
      // uncomment below and update the code to test the property videoMuteOnEntry
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property moderatorLess (base name: "moderatorLess")', function() {
      // uncomment below and update the code to test the property moderatorLess
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property chatEnabled (base name: "chatEnabled")', function() {
      // uncomment below and update the code to test the property chatEnabled
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property pinnedEndpointGuid (base name: "pinnedEndpointGuid")', function() {
      // uncomment below and update the code to test the property pinnedEndpointGuid
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property audioEndpointCount (base name: "audioEndpointCount")', function() {
      // uncomment below and update the code to test the property audioEndpointCount
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property videoEndpointCount (base name: "videoEndpointCount")', function() {
      // uncomment below and update the code to test the property videoEndpointCount
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property recordingEnabled (base name: "recordingEnabled")', function() {
      // uncomment below and update the code to test the property recordingEnabled
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property participantWebJoinURL (base name: "participantWebJoinURL")', function() {
      // uncomment below and update the code to test the property participantWebJoinURL
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property isLargeMeeting (base name: "isLargeMeeting")', function() {
      // uncomment below and update the code to test the property isLargeMeeting
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property features (base name: "features")', function() {
      // uncomment below and update the code to test the property features
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property delayedMeetingEndTime (base name: "delayedMeetingEndTime")', function() {
      // uncomment below and update the code to test the property delayedMeetingEndTime
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property smStreams (base name: "smStreams")', function() {
      // uncomment below and update the code to test the property smStreams
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property inactiveMeetingStatus (base name: "inactiveMeetingStatus")', function() {
      // uncomment below and update the code to test the property inactiveMeetingStatus
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property meetingMarkedForDelayedTermination (base name: "meetingMarkedForDelayedTermination")', function() {
      // uncomment below and update the code to test the property meetingMarkedForDelayedTermination
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

    it('should have the property recordinginfo (base name: "recordinginfo")', function() {
      // uncomment below and update the code to test the property recordinginfo
      //var instane = new BlueJeansOnVideoRestApi.MeetingState();
      //expect(instance).to.be();
    });

  });

}));
