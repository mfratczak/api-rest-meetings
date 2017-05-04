# coding: utf-8

"""
    BlueJeans onVideo REST API

    _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 

    OpenAPI spec version: 1.0.0
    Contact: brandon@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.meeting_api import MeetingApi


class TestMeetingApi(unittest.TestCase):
    """ MeetingApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.meeting_api.MeetingApi()

    def tearDown(self):
        pass

    def test_cancel_meeting(self):
        """
        Test case for cancel_meeting

        Cancel Meeting
        """
        pass

    def test_create_meeting(self):
        """
        Test case for create_meeting

        Create Meeting
        """
        pass

    def test_generate_pairing_code_sip(self):
        """
        Test case for generate_pairing_code_sip

        Generate Pairing Code (SIP)
        """
        pass

    def test_generate_pairing_code_web_rtc(self):
        """
        Test case for generate_pairing_code_web_rtc

        Generate Pairing Code (WebRTC)
        """
        pass

    def test_get_endpoint_layout(self):
        """
        Test case for get_endpoint_layout

        Get Endpoint Layout
        """
        pass

    def test_get_meeting(self):
        """
        Test case for get_meeting

        Get Meeting
        """
        pass

    def test_get_meeting_emails(self):
        """
        Test case for get_meeting_emails

        Get Meeting Email
        """
        pass

    def test_get_meeting_endpoint(self):
        """
        Test case for get_meeting_endpoint

        Get Endpoint Information
        """
        pass

    def test_get_meeting_endpoints(self):
        """
        Test case for get_meeting_endpoints

        List Meeting Endpoints
        """
        pass

    def test_get_meeting_numbers(self):
        """
        Test case for get_meeting_numbers

        Get Meeting Join Info
        """
        pass

    def test_get_meeting_state(self):
        """
        Test case for get_meeting_state

        Get Meeting State
        """
        pass

    def test_list_meetings(self):
        """
        Test case for list_meetings

        List Meetings
        """
        pass

    def test_send_meeting_invite(self):
        """
        Test case for send_meeting_invite

        Send Email Invite
        """
        pass

    def test_update_endpoint_layout(self):
        """
        Test case for update_endpoint_layout

        Update Endpoint Layout
        """
        pass

    def test_update_meeting(self):
        """
        Test case for update_meeting

        Update Meeting
        """
        pass

    def test_update_meeting_endpoint(self):
        """
        Test case for update_meeting_endpoint

        Update Endpoint Video/Audio State
        """
        pass

    def test_update_meeting_endpoints(self):
        """
        Test case for update_meeting_endpoints

        Update Meeting Endpoints State
        """
        pass

    def test_update_meeting_state(self):
        """
        Test case for update_meeting_state

        Update Meeting State
        """
        pass


if __name__ == '__main__':
    unittest.main()
