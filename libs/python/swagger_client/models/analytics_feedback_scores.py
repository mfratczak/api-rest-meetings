# coding: utf-8

"""
    BlueJeans onVideo REST API

    _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 

    OpenAPI spec version: 1.0.0
    Contact: brandon@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class AnalyticsFeedbackScores(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, great=None, okay=None, bad=None, poor=None, good=None):
        """
        AnalyticsFeedbackScores - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'great': 'int',
            'okay': 'int',
            'bad': 'int',
            'poor': 'int',
            'good': 'int'
        }

        self.attribute_map = {
            'great': 'Great',
            'okay': 'Okay',
            'bad': 'Bad',
            'poor': 'Poor',
            'good': 'Good'
        }

        self._great = great
        self._okay = okay
        self._bad = bad
        self._poor = poor
        self._good = good

    @property
    def great(self):
        """
        Gets the great of this AnalyticsFeedbackScores.

        :return: The great of this AnalyticsFeedbackScores.
        :rtype: int
        """
        return self._great

    @great.setter
    def great(self, great):
        """
        Sets the great of this AnalyticsFeedbackScores.

        :param great: The great of this AnalyticsFeedbackScores.
        :type: int
        """

        self._great = great

    @property
    def okay(self):
        """
        Gets the okay of this AnalyticsFeedbackScores.

        :return: The okay of this AnalyticsFeedbackScores.
        :rtype: int
        """
        return self._okay

    @okay.setter
    def okay(self, okay):
        """
        Sets the okay of this AnalyticsFeedbackScores.

        :param okay: The okay of this AnalyticsFeedbackScores.
        :type: int
        """

        self._okay = okay

    @property
    def bad(self):
        """
        Gets the bad of this AnalyticsFeedbackScores.

        :return: The bad of this AnalyticsFeedbackScores.
        :rtype: int
        """
        return self._bad

    @bad.setter
    def bad(self, bad):
        """
        Sets the bad of this AnalyticsFeedbackScores.

        :param bad: The bad of this AnalyticsFeedbackScores.
        :type: int
        """

        self._bad = bad

    @property
    def poor(self):
        """
        Gets the poor of this AnalyticsFeedbackScores.

        :return: The poor of this AnalyticsFeedbackScores.
        :rtype: int
        """
        return self._poor

    @poor.setter
    def poor(self, poor):
        """
        Sets the poor of this AnalyticsFeedbackScores.

        :param poor: The poor of this AnalyticsFeedbackScores.
        :type: int
        """

        self._poor = poor

    @property
    def good(self):
        """
        Gets the good of this AnalyticsFeedbackScores.

        :return: The good of this AnalyticsFeedbackScores.
        :rtype: int
        """
        return self._good

    @good.setter
    def good(self, good):
        """
        Sets the good of this AnalyticsFeedbackScores.

        :param good: The good of this AnalyticsFeedbackScores.
        :type: int
        """

        self._good = good

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
        if not isinstance(other, AnalyticsFeedbackScores):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
