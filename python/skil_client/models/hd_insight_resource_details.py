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


class HDInsightResourceDetails(object):
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
        '_class': 'str',
        'resource_id': 'int',
        'type': 'str',
        'sub_type': 'str',
        'subscription_id': 'str',
        'resource_group_name': 'str',
        'cluster_name': 'str'
    }

    attribute_map = {
        '_class': '@class',
        'resource_id': 'resourceId',
        'type': 'type',
        'sub_type': 'subType',
        'subscription_id': 'subscriptionId',
        'resource_group_name': 'resourceGroupName',
        'cluster_name': 'clusterName'
    }

    def __init__(self, _class='io.skymind.resource.model.subtypes.compute.HDInsightResourceDetails', resource_id=None, type=None, sub_type=None, subscription_id=None, resource_group_name=None, cluster_name=None):  # noqa: E501
        """HDInsightResourceDetails - a model defined in OpenAPI"""  # noqa: E501

        self.__class = None
        self._resource_id = None
        self._type = None
        self._sub_type = None
        self._subscription_id = None
        self._resource_group_name = None
        self._cluster_name = None
        self.discriminator = None

        if _class is not None:
            self._class = _class
        if resource_id is not None:
            self.resource_id = resource_id
        if type is not None:
            self.type = type
        if sub_type is not None:
            self.sub_type = sub_type
        if subscription_id is not None:
            self.subscription_id = subscription_id
        if resource_group_name is not None:
            self.resource_group_name = resource_group_name
        if cluster_name is not None:
            self.cluster_name = cluster_name

    @property
    def _class(self):
        """Gets the _class of this HDInsightResourceDetails.  # noqa: E501


        :return: The _class of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this HDInsightResourceDetails.


        :param _class: The _class of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """

        self.__class = _class

    @property
    def resource_id(self):
        """Gets the resource_id of this HDInsightResourceDetails.  # noqa: E501

        ID of the resource  # noqa: E501

        :return: The resource_id of this HDInsightResourceDetails.  # noqa: E501
        :rtype: int
        """
        return self._resource_id

    @resource_id.setter
    def resource_id(self, resource_id):
        """Sets the resource_id of this HDInsightResourceDetails.

        ID of the resource  # noqa: E501

        :param resource_id: The resource_id of this HDInsightResourceDetails.  # noqa: E501
        :type: int
        """

        self._resource_id = resource_id

    @property
    def type(self):
        """Gets the type of this HDInsightResourceDetails.  # noqa: E501

        Resource type  # noqa: E501

        :return: The type of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this HDInsightResourceDetails.

        Resource type  # noqa: E501

        :param type: The type of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """
        allowed_values = ["COMPUTE"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def sub_type(self):
        """Gets the sub_type of this HDInsightResourceDetails.  # noqa: E501

        Resource subtype  # noqa: E501

        :return: The sub_type of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self._sub_type

    @sub_type.setter
    def sub_type(self, sub_type):
        """Sets the sub_type of this HDInsightResourceDetails.

        Resource subtype  # noqa: E501

        :param sub_type: The sub_type of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """
        allowed_values = ["HDInsight"]  # noqa: E501
        if sub_type not in allowed_values:
            raise ValueError(
                "Invalid value for `sub_type` ({0}), must be one of {1}"  # noqa: E501
                .format(sub_type, allowed_values)
            )

        self._sub_type = sub_type

    @property
    def subscription_id(self):
        """Gets the subscription_id of this HDInsightResourceDetails.  # noqa: E501

        Azure subscription ID  # noqa: E501

        :return: The subscription_id of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self._subscription_id

    @subscription_id.setter
    def subscription_id(self, subscription_id):
        """Sets the subscription_id of this HDInsightResourceDetails.

        Azure subscription ID  # noqa: E501

        :param subscription_id: The subscription_id of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """

        self._subscription_id = subscription_id

    @property
    def resource_group_name(self):
        """Gets the resource_group_name of this HDInsightResourceDetails.  # noqa: E501

        name of the resource group  # noqa: E501

        :return: The resource_group_name of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self._resource_group_name

    @resource_group_name.setter
    def resource_group_name(self, resource_group_name):
        """Sets the resource_group_name of this HDInsightResourceDetails.

        name of the resource group  # noqa: E501

        :param resource_group_name: The resource_group_name of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """

        self._resource_group_name = resource_group_name

    @property
    def cluster_name(self):
        """Gets the cluster_name of this HDInsightResourceDetails.  # noqa: E501

        Cluster name  # noqa: E501

        :return: The cluster_name of this HDInsightResourceDetails.  # noqa: E501
        :rtype: str
        """
        return self._cluster_name

    @cluster_name.setter
    def cluster_name(self, cluster_name):
        """Sets the cluster_name of this HDInsightResourceDetails.

        Cluster name  # noqa: E501

        :param cluster_name: The cluster_name of this HDInsightResourceDetails.  # noqa: E501
        :type: str
        """

        self._cluster_name = cluster_name

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
        if not isinstance(other, HDInsightResourceDetails):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
