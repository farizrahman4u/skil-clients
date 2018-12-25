# coding: utf-8

"""
    Endpoints

    Endpoints API for different services in SKIL  # noqa: E501

    OpenAPI spec version: 1.2.1-beta
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class UpdateBestModel(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'experiment_id': 'str',
        'best_model_id': 'str'
    }

    attribute_map = {
        'experiment_id': 'experimentId',
        'best_model_id': 'bestModelId'
    }

    def __init__(self, experiment_id=None, best_model_id=None):  # noqa: E501
        """UpdateBestModel - a model defined in OpenAPI"""  # noqa: E501

        self._experiment_id = None
        self._best_model_id = None
        self.discriminator = None

        if experiment_id is not None:
            self.experiment_id = experiment_id
        if best_model_id is not None:
            self.best_model_id = best_model_id

    @property
    def experiment_id(self):
        """Gets the experiment_id of this UpdateBestModel.  # noqa: E501

        GUID of the experiment to update.  # noqa: E501

        :return: The experiment_id of this UpdateBestModel.  # noqa: E501
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """Sets the experiment_id of this UpdateBestModel.

        GUID of the experiment to update.  # noqa: E501

        :param experiment_id: The experiment_id of this UpdateBestModel.  # noqa: E501
        :type: str
        """

        self._experiment_id = experiment_id

    @property
    def best_model_id(self):
        """Gets the best_model_id of this UpdateBestModel.  # noqa: E501

        GUID of the model to set as the best model.  # noqa: E501

        :return: The best_model_id of this UpdateBestModel.  # noqa: E501
        :rtype: str
        """
        return self._best_model_id

    @best_model_id.setter
    def best_model_id(self, best_model_id):
        """Sets the best_model_id of this UpdateBestModel.

        GUID of the model to set as the best model.  # noqa: E501

        :param best_model_id: The best_model_id of this UpdateBestModel.  # noqa: E501
        :type: str
        """

        self._best_model_id = best_model_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
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
        if not isinstance(other, UpdateBestModel):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
