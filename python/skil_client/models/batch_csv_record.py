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

from skil_client.models.single_csv_record import SingleCSVRecord  # noqa: F401,E501


class BatchCSVRecord(object):
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
        'records': 'list[SingleCSVRecord]'
    }

    attribute_map = {
        'records': 'records'
    }

    def __init__(self, records=None):  # noqa: E501
        """BatchCSVRecord - a model defined in Swagger"""  # noqa: E501

        self._records = None
        self.discriminator = None

        self.records = records

    @property
    def records(self):
        """Gets the records of this BatchCSVRecord.  # noqa: E501


        :return: The records of this BatchCSVRecord.  # noqa: E501
        :rtype: list[SingleCSVRecord]
        """
        return self._records

    @records.setter
    def records(self, records):
        """Sets the records of this BatchCSVRecord.


        :param records: The records of this BatchCSVRecord.  # noqa: E501
        :type: list[SingleCSVRecord]
        """
        if records is None:
            raise ValueError("Invalid value for `records`, must not be `None`")  # noqa: E501

        self._records = records

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
        if not isinstance(other, BatchCSVRecord):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
