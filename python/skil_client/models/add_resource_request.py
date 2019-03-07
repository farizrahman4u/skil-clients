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


class AddResourceRequest(object):
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
        'resource_name': 'str',
        'resource_details': 'object',
        'credential_uri': 'str',
        'type': 'str',
        'sub_type': 'str',
        'credential_id': 'int'
    }

    attribute_map = {
        'resource_name': 'resourceName',
        'resource_details': 'resourceDetails',
        'credential_uri': 'credentialUri',
        'type': 'type',
        'sub_type': 'subType',
        'credential_id': 'credentialId'
    }

    def __init__(self, resource_name=None, resource_details=None, credential_uri=None, type=None, sub_type=None, credential_id=None):  # noqa: E501
        """AddResourceRequest - a model defined in Swagger"""  # noqa: E501

        self._resource_name = None
        self._resource_details = None
        self._credential_uri = None
        self._type = None
        self._sub_type = None
        self._credential_id = None
        self.discriminator = None

        if resource_name is not None:
            self.resource_name = resource_name
        if resource_details is not None:
            self.resource_details = resource_details
        if credential_uri is not None:
            self.credential_uri = credential_uri
        if type is not None:
            self.type = type
        if sub_type is not None:
            self.sub_type = sub_type
        if credential_id is not None:
            self.credential_id = credential_id

    @property
    def resource_name(self):
        """Gets the resource_name of this AddResourceRequest.  # noqa: E501

        Name of the new resource  # noqa: E501

        :return: The resource_name of this AddResourceRequest.  # noqa: E501
        :rtype: str
        """
        return self._resource_name

    @resource_name.setter
    def resource_name(self, resource_name):
        """Sets the resource_name of this AddResourceRequest.

        Name of the new resource  # noqa: E501

        :param resource_name: The resource_name of this AddResourceRequest.  # noqa: E501
        :type: str
        """

        self._resource_name = resource_name

    @property
    def resource_details(self):
        """Gets the resource_details of this AddResourceRequest.  # noqa: E501

        One of the resource details objects  # noqa: E501

        :return: The resource_details of this AddResourceRequest.  # noqa: E501
        :rtype: object
        """
        return self._resource_details

    @resource_details.setter
    def resource_details(self, resource_details):
        """Sets the resource_details of this AddResourceRequest.

        One of the resource details objects  # noqa: E501

        :param resource_details: The resource_details of this AddResourceRequest.  # noqa: E501
        :type: object
        """

        self._resource_details = resource_details

    @property
    def credential_uri(self):
        """Gets the credential_uri of this AddResourceRequest.  # noqa: E501

        URI of the credentials. If this is present, you can leave out the 'credentialId'  # noqa: E501

        :return: The credential_uri of this AddResourceRequest.  # noqa: E501
        :rtype: str
        """
        return self._credential_uri

    @credential_uri.setter
    def credential_uri(self, credential_uri):
        """Sets the credential_uri of this AddResourceRequest.

        URI of the credentials. If this is present, you can leave out the 'credentialId'  # noqa: E501

        :param credential_uri: The credential_uri of this AddResourceRequest.  # noqa: E501
        :type: str
        """

        self._credential_uri = credential_uri

    @property
    def type(self):
        """Gets the type of this AddResourceRequest.  # noqa: E501

        Resource type (whether COMPUTE or STORAGE)  # noqa: E501

        :return: The type of this AddResourceRequest.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this AddResourceRequest.

        Resource type (whether COMPUTE or STORAGE)  # noqa: E501

        :param type: The type of this AddResourceRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["COMPUTE", "STORAGE"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def sub_type(self):
        """Gets the sub_type of this AddResourceRequest.  # noqa: E501

        Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])  # noqa: E501

        :return: The sub_type of this AddResourceRequest.  # noqa: E501
        :rtype: str
        """
        return self._sub_type

    @sub_type.setter
    def sub_type(self, sub_type):
        """Sets the sub_type of this AddResourceRequest.

        Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])  # noqa: E501

        :param sub_type: The sub_type of this AddResourceRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["EMR", "S3", "GoogleStorage", "DataProc", "HDInsight", "AzureStorage", "HDFS", "YARN"]  # noqa: E501
        if sub_type not in allowed_values:
            raise ValueError(
                "Invalid value for `sub_type` ({0}), must be one of {1}"  # noqa: E501
                .format(sub_type, allowed_values)
            )

        self._sub_type = sub_type

    @property
    def credential_id(self):
        """Gets the credential_id of this AddResourceRequest.  # noqa: E501

        ID of the credentials. If this is given then you can leave out the 'credentialsUri'  # noqa: E501

        :return: The credential_id of this AddResourceRequest.  # noqa: E501
        :rtype: int
        """
        return self._credential_id

    @credential_id.setter
    def credential_id(self, credential_id):
        """Sets the credential_id of this AddResourceRequest.

        ID of the credentials. If this is given then you can leave out the 'credentialsUri'  # noqa: E501

        :param credential_id: The credential_id of this AddResourceRequest.  # noqa: E501
        :type: int
        """

        self._credential_id = credential_id

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
        if not isinstance(other, AddResourceRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
