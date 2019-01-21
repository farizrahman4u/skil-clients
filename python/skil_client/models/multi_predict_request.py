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

from skil_client.models.ind_array import INDArray  # noqa: F401,E501


class MultiPredictRequest(object):
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
        'id': 'str',
        'needs_pre_processing': 'bool',
        'inputs': 'list[INDArray]',
        'input_masks': 'list[INDArray]'
    }

    attribute_map = {
        'id': 'id',
        'needs_pre_processing': 'needsPreProcessing',
        'inputs': 'inputs',
        'input_masks': 'inputMasks'
    }

    def __init__(self, id=None, needs_pre_processing=None, inputs=None, input_masks=None):  # noqa: E501
        """MultiPredictRequest - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._needs_pre_processing = None
        self._inputs = None
        self._input_masks = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if needs_pre_processing is not None:
            self.needs_pre_processing = needs_pre_processing
        if inputs is not None:
            self.inputs = inputs
        if input_masks is not None:
            self.input_masks = input_masks

    @property
    def id(self):
        """Gets the id of this MultiPredictRequest.  # noqa: E501


        :return: The id of this MultiPredictRequest.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MultiPredictRequest.


        :param id: The id of this MultiPredictRequest.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def needs_pre_processing(self):
        """Gets the needs_pre_processing of this MultiPredictRequest.  # noqa: E501


        :return: The needs_pre_processing of this MultiPredictRequest.  # noqa: E501
        :rtype: bool
        """
        return self._needs_pre_processing

    @needs_pre_processing.setter
    def needs_pre_processing(self, needs_pre_processing):
        """Sets the needs_pre_processing of this MultiPredictRequest.


        :param needs_pre_processing: The needs_pre_processing of this MultiPredictRequest.  # noqa: E501
        :type: bool
        """

        self._needs_pre_processing = needs_pre_processing

    @property
    def inputs(self):
        """Gets the inputs of this MultiPredictRequest.  # noqa: E501


        :return: The inputs of this MultiPredictRequest.  # noqa: E501
        :rtype: list[INDArray]
        """
        return self._inputs

    @inputs.setter
    def inputs(self, inputs):
        """Sets the inputs of this MultiPredictRequest.


        :param inputs: The inputs of this MultiPredictRequest.  # noqa: E501
        :type: list[INDArray]
        """

        self._inputs = inputs

    @property
    def input_masks(self):
        """Gets the input_masks of this MultiPredictRequest.  # noqa: E501


        :return: The input_masks of this MultiPredictRequest.  # noqa: E501
        :rtype: list[INDArray]
        """
        return self._input_masks

    @input_masks.setter
    def input_masks(self, input_masks):
        """Sets the input_masks of this MultiPredictRequest.


        :param input_masks: The input_masks of this MultiPredictRequest.  # noqa: E501
        :type: list[INDArray]
        """

        self._input_masks = input_masks

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
        if not isinstance(other, MultiPredictRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
