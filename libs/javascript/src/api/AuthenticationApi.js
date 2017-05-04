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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Error', 'model/GrantClient', 'model/GrantMeeting', 'model/GrantPassword', 'model/GrantRequestClient', 'model/GrantRequestMeeting', 'model/GrantRequestPassword', 'model/InlineResponse200'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/GrantClient'), require('../model/GrantMeeting'), require('../model/GrantPassword'), require('../model/GrantRequestClient'), require('../model/GrantRequestMeeting'), require('../model/GrantRequestPassword'), require('../model/InlineResponse200'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.AuthenticationApi = factory(root.BlueJeansOnVideoRestApi.ApiClient, root.BlueJeansOnVideoRestApi.Error, root.BlueJeansOnVideoRestApi.GrantClient, root.BlueJeansOnVideoRestApi.GrantMeeting, root.BlueJeansOnVideoRestApi.GrantPassword, root.BlueJeansOnVideoRestApi.GrantRequestClient, root.BlueJeansOnVideoRestApi.GrantRequestMeeting, root.BlueJeansOnVideoRestApi.GrantRequestPassword, root.BlueJeansOnVideoRestApi.InlineResponse200);
  }
}(this, function(ApiClient, Error, GrantClient, GrantMeeting, GrantPassword, GrantRequestClient, GrantRequestMeeting, GrantRequestPassword, InlineResponse200) {
  'use strict';

  /**
   * Authentication service.
   * @module api/AuthenticationApi
   * @version 1.0.0
   */

  /**
   * Constructs a new AuthenticationApi. 
   * @alias module:api/AuthenticationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getTokenByClient operation.
     * @callback module:api/AuthenticationApi~getTokenByClientCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantClient} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Client Grant Type
     * This API is typically called from an application.  Client ID and Secret are provisioned within the BlueJeans Enterprise Administration console and given to the customer.
     * @param {module:model/GrantRequestClient} grantRequestClient Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByClientCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantClient}
     */
    this.getTokenByClient = function(grantRequestClient, callback) {
      var postBody = grantRequestClient;

      // verify the required parameter 'grantRequestClient' is set
      if (grantRequestClient == undefined || grantRequestClient == null) {
        throw new Error("Missing the required parameter 'grantRequestClient' when calling getTokenByClient");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantClient;

      return this.apiClient.callApi(
        '/oauth2/token?Client', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByMeeting operation.
     * @callback module:api/AuthenticationApi~getTokenByMeetingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantMeeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Meeting Grant Type
     * This API uses an OAuth-like grant/request method similar to the Password grant type. The scope of access covers the meeting only. Call this API with the meetings&#39; numerid ID, and the meeting passcode (it one exists).  If a Moderator passcode is sent, moderator privileges are granted. If an Attendee access code is passed, the access token will grant attendee abilities.
     * @param {module:model/GrantRequestMeeting} grantRequestMeeting Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByMeetingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantMeeting}
     */
    this.getTokenByMeeting = function(grantRequestMeeting, callback) {
      var postBody = grantRequestMeeting;

      // verify the required parameter 'grantRequestMeeting' is set
      if (grantRequestMeeting == undefined || grantRequestMeeting == null) {
        throw new Error("Missing the required parameter 'grantRequestMeeting' when calling getTokenByMeeting");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantMeeting;

      return this.apiClient.callApi(
        '/oauth2/token?Meeting', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByPassword operation.
     * @callback module:api/AuthenticationApi~getTokenByPasswordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantPassword} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Password Grant Type
     * This API performs an authentication based upon a username and password.   Call this API and provide a valid username and password.  Set the grant_type to \&quot;password\&quot;.
     * @param {module:model/GrantRequestPassword} grantRequestPassword Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByPasswordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantPassword}
     */
    this.getTokenByPassword = function(grantRequestPassword, callback) {
      var postBody = grantRequestPassword;

      // verify the required parameter 'grantRequestPassword' is set
      if (grantRequestPassword == undefined || grantRequestPassword == null) {
        throw new Error("Missing the required parameter 'grantRequestPassword' when calling getTokenByPassword");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantPassword;

      return this.apiClient.callApi(
        '/oauth2/token?Password', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenInfo operation.
     * @callback module:api/AuthenticationApi~getTokenInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Validate a Token
     * This endpoint will validate if a token is valid or not.
     * @param {module:api/AuthenticationApi~getTokenInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse200}
     */
    this.getTokenInfo = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/oauth2/tokenInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
