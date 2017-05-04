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
    define(['ApiClient', 'model/ContentContentProperties'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ContentContentProperties'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.Content = factory(root.BlueJeansOnVideoRestApi.ApiClient, root.BlueJeansOnVideoRestApi.ContentContentProperties);
  }
}(this, function(ApiClient, ContentContentProperties) {
  'use strict';




  /**
   * The Content model module.
   * @module model/Content
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Content</code>.
   * @alias module:model/Content
   * @class
   */
  var exports = function() {
    var _this = this;















  };

  /**
   * Constructs a <code>Content</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Content} obj Optional instance to populate.
   * @return {module:model/Content} The populated <code>Content</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('contentType')) {
        obj['contentType'] = ApiClient.convertToType(data['contentType'], 'String');
      }
      if (data.hasOwnProperty('contentDescription')) {
        obj['contentDescription'] = ApiClient.convertToType(data['contentDescription'], 'String');
      }
      if (data.hasOwnProperty('contentUrl')) {
        obj['contentUrl'] = ApiClient.convertToType(data['contentUrl'], 'String');
      }
      if (data.hasOwnProperty('userId')) {
        obj['userId'] = ApiClient.convertToType(data['userId'], 'Number');
      }
      if (data.hasOwnProperty('contentLocation')) {
        obj['contentLocation'] = ApiClient.convertToType(data['contentLocation'], 'String');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
      if (data.hasOwnProperty('modified')) {
        obj['modified'] = ApiClient.convertToType(data['modified'], 'Number');
      }
      if (data.hasOwnProperty('contentStatus')) {
        obj['contentStatus'] = ApiClient.convertToType(data['contentStatus'], 'String');
      }
      if (data.hasOwnProperty('contentName')) {
        obj['contentName'] = ApiClient.convertToType(data['contentName'], 'String');
      }
      if (data.hasOwnProperty('contentCategory')) {
        obj['contentCategory'] = ApiClient.convertToType(data['contentCategory'], 'String');
      }
      if (data.hasOwnProperty('contentSize')) {
        obj['contentSize'] = ApiClient.convertToType(data['contentSize'], 'Number');
      }
      if (data.hasOwnProperty('contentDuration')) {
        obj['contentDuration'] = ApiClient.convertToType(data['contentDuration'], 'Number');
      }
      if (data.hasOwnProperty('contentProperties')) {
        obj['contentProperties'] = ContentContentProperties.constructFromObject(data['contentProperties']);
      }
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} contentType
   */
  exports.prototype['contentType'] = undefined;
  /**
   * @member {String} contentDescription
   */
  exports.prototype['contentDescription'] = undefined;
  /**
   * @member {String} contentUrl
   */
  exports.prototype['contentUrl'] = undefined;
  /**
   * @member {Number} userId
   */
  exports.prototype['userId'] = undefined;
  /**
   * @member {String} contentLocation
   */
  exports.prototype['contentLocation'] = undefined;
  /**
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;
  /**
   * @member {Number} modified
   */
  exports.prototype['modified'] = undefined;
  /**
   * @member {String} contentStatus
   */
  exports.prototype['contentStatus'] = undefined;
  /**
   * @member {String} contentName
   */
  exports.prototype['contentName'] = undefined;
  /**
   * @member {String} contentCategory
   */
  exports.prototype['contentCategory'] = undefined;
  /**
   * @member {Number} contentSize
   */
  exports.prototype['contentSize'] = undefined;
  /**
   * @member {Number} contentDuration
   */
  exports.prototype['contentDuration'] = undefined;
  /**
   * @member {module:model/ContentContentProperties} contentProperties
   */
  exports.prototype['contentProperties'] = undefined;



  return exports;
}));


