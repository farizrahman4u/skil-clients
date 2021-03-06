# coding: utf-8

"""
    Endpoints

    Endpoints API for different services in SKIL  # noqa: E501

    OpenAPI spec version: 1.2.0-rc1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class ResourceCredentials(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'credential_id': 'int',
        'type': 'str',
        'name': 'str',
        'uri': 'str'
    }

    attribute_map = {
        'credential_id': 'credentialId',
        'type': 'type',
        'name': 'name',
        'uri': 'uri'
    }

    def __init__(self, credential_id=None, type=None, name=None, uri=None):  # noqa: E501
        """ResourceCredentials - a model defined in Swagger"""  # noqa: E501

        self._credential_id = None
        self._type = None
        self._name = None
        self._uri = None
        self.discriminator = None

        if credential_id is not None:
            self.credential_id = credential_id
        if type is not None:
            self.type = type
        if name is not None:
            self.name = name
        if uri is not None:
            self.uri = uri

    @property
    def credential_id(self):
        """Gets the credential_id of this ResourceCredentials.  # noqa: E501

        ID of the credentials  # noqa: E501

        :return: The credential_id of this ResourceCredentials.  # noqa: E501
        :rtype: int
        """
        return self._credential_id

    @credential_id.setter
    def credential_id(self, credential_id):
        """Sets the credential_id of this ResourceCredentials.

        ID of the credentials  # noqa: E501

        :param credential_id: The credential_id of this ResourceCredentials.  # noqa: E501
        :type: int
        """

        self._credential_id = credential_id

    @property
    def type(self):
        """Gets the type of this ResourceCredentials.  # noqa: E501

        Type of the credentials  # noqa: E501

        :return: The type of this ResourceCredentials.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ResourceCredentials.

        Type of the credentials  # noqa: E501

        :param type: The type of this ResourceCredentials.  # noqa: E501
        :type: str
        """
        allowed_values = ["AWS", "Azure", "GoogleCloud", "Hadoop"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def name(self):
        """Gets the name of this ResourceCredentials.  # noqa: E501

        Name of the credentials  # noqa: E501

        :return: The name of this ResourceCredentials.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ResourceCredentials.

        Name of the credentials  # noqa: E501

        :param name: The name of this ResourceCredentials.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def uri(self):
        """Gets the uri of this ResourceCredentials.  # noqa: E501

        URI of the credentials  # noqa: E501

        :return: The uri of this ResourceCredentials.  # noqa: E501
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """Sets the uri of this ResourceCredentials.

        URI of the credentials  # noqa: E501

        :param uri: The uri of this ResourceCredentials.  # noqa: E501
        :type: str
        """

        self._uri = uri

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
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
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ResourceCredentials):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
