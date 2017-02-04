# coding: utf-8

"""
    BlueJeans onVideo REST API

    _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 

    OpenAPI spec version: 1.0.0
    Contact: brandon@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from pprint import pformat
from six import iteritems
import re


class User(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, username=None, first_name=None, middle_name=None, last_name=None, email_id=None, company=None, title=None, phone=None, profile_picture=None, timezone=None, time_format=None, language=None):
        """
        User - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'int',
            'username': 'str',
            'first_name': 'str',
            'middle_name': 'str',
            'last_name': 'str',
            'email_id': 'str',
            'company': 'str',
            'title': 'str',
            'phone': 'str',
            'profile_picture': 'str',
            'timezone': 'str',
            'time_format': 'int',
            'language': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'username': 'username',
            'first_name': 'firstName',
            'middle_name': 'middleName',
            'last_name': 'lastName',
            'email_id': 'emailId',
            'company': 'company',
            'title': 'title',
            'phone': 'phone',
            'profile_picture': 'profilePicture',
            'timezone': 'timezone',
            'time_format': 'timeFormat',
            'language': 'language'
        }

        self._id = None
        self._username = username
        self._first_name = first_name
        self._middle_name = middle_name
        self._last_name = last_name
        self._email_id = email_id
        self._company = company
        self._title = title
        self._phone = phone
        self._profile_picture = profile_picture
        self._timezone = timezone
        self._time_format = time_format
        self._language = language

    @property
    def id(self):
        """
        Gets the id of this User.
        Unique identifier for the user.

        :return: The id of this User.
        :rtype: int
        """
        return self._id

    @property
    def username(self):
        """
        Gets the username of this User.


        :return: The username of this User.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """
        Sets the username of this User.


        :param username: The username of this User.
        :type: str
        """

        self._username = username

    @property
    def first_name(self):
        """
        Gets the first_name of this User.
        User's first name

        :return: The first_name of this User.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """
        Sets the first_name of this User.
        User's first name

        :param first_name: The first_name of this User.
        :type: str
        """

        self._first_name = first_name

    @property
    def middle_name(self):
        """
        Gets the middle_name of this User.
        User's middle name

        :return: The middle_name of this User.
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """
        Sets the middle_name of this User.
        User's middle name

        :param middle_name: The middle_name of this User.
        :type: str
        """

        self._middle_name = middle_name

    @property
    def last_name(self):
        """
        Gets the last_name of this User.
        User's last name

        :return: The last_name of this User.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """
        Sets the last_name of this User.
        User's last name

        :param last_name: The last_name of this User.
        :type: str
        """

        self._last_name = last_name

    @property
    def email_id(self):
        """
        Gets the email_id of this User.
        User's email address

        :return: The email_id of this User.
        :rtype: str
        """
        return self._email_id

    @email_id.setter
    def email_id(self, email_id):
        """
        Sets the email_id of this User.
        User's email address

        :param email_id: The email_id of this User.
        :type: str
        """

        self._email_id = email_id

    @property
    def company(self):
        """
        Gets the company of this User.
        User's company name

        :return: The company of this User.
        :rtype: str
        """
        return self._company

    @company.setter
    def company(self, company):
        """
        Sets the company of this User.
        User's company name

        :param company: The company of this User.
        :type: str
        """

        self._company = company

    @property
    def title(self):
        """
        Gets the title of this User.
        User's title

        :return: The title of this User.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """
        Sets the title of this User.
        User's title

        :param title: The title of this User.
        :type: str
        """

        self._title = title

    @property
    def phone(self):
        """
        Gets the phone of this User.
        User's phone

        :return: The phone of this User.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """
        Sets the phone of this User.
        User's phone

        :param phone: The phone of this User.
        :type: str
        """

        self._phone = phone

    @property
    def profile_picture(self):
        """
        Gets the profile_picture of this User.
        Path to user's profile picture

        :return: The profile_picture of this User.
        :rtype: str
        """
        return self._profile_picture

    @profile_picture.setter
    def profile_picture(self, profile_picture):
        """
        Sets the profile_picture of this User.
        Path to user's profile picture

        :param profile_picture: The profile_picture of this User.
        :type: str
        """

        self._profile_picture = profile_picture

    @property
    def timezone(self):
        """
        Gets the timezone of this User.
        User's timezone

        :return: The timezone of this User.
        :rtype: str
        """
        return self._timezone

    @timezone.setter
    def timezone(self, timezone):
        """
        Sets the timezone of this User.
        User's timezone

        :param timezone: The timezone of this User.
        :type: str
        """

        self._timezone = timezone

    @property
    def time_format(self):
        """
        Gets the time_format of this User.
        User's preference of 12 or 24 hour time display

        :return: The time_format of this User.
        :rtype: int
        """
        return self._time_format

    @time_format.setter
    def time_format(self, time_format):
        """
        Sets the time_format of this User.
        User's preference of 12 or 24 hour time display

        :param time_format: The time_format of this User.
        :type: int
        """

        self._time_format = time_format

    @property
    def language(self):
        """
        Gets the language of this User.
        User's language code

        :return: The language of this User.
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language):
        """
        Sets the language of this User.
        User's language code

        :param language: The language of this User.
        :type: str
        """

        self._language = language

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other