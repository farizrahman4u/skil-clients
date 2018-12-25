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


class ModelEntity(object):
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
        'id': 'int',
        'created': 'int',
        'updated': 'int',
        'model_type': 'str',
        'deployment_id': 'int',
        'name': 'str',
        'scale': 'float',
        'file_location': 'str',
        'state': 'str',
        'jvm_args': 'str',
        'sub_type': 'str',
        'labels_file_location': 'str',
        'extra_args': 'str',
        'launch_policy': 'object',
        'model_state': 'str'
    }

    attribute_map = {
        'id': 'id',
        'created': 'created',
        'updated': 'updated',
        'model_type': 'modelType',
        'deployment_id': 'deploymentId',
        'name': 'name',
        'scale': 'scale',
        'file_location': 'fileLocation',
        'state': 'state',
        'jvm_args': 'jvmArgs',
        'sub_type': 'subType',
        'labels_file_location': 'labelsFileLocation',
        'extra_args': 'extraArgs',
        'launch_policy': 'launchPolicy',
        'model_state': 'modelState'
    }

    def __init__(self, id=None, created=None, updated=None, model_type=None, deployment_id=None, name=None, scale=None, file_location=None, state=None, jvm_args=None, sub_type=None, labels_file_location=None, extra_args=None, launch_policy=None, model_state=None):  # noqa: E501
        """ModelEntity - a model defined in OpenAPI"""  # noqa: E501

        self._id = None
        self._created = None
        self._updated = None
        self._model_type = None
        self._deployment_id = None
        self._name = None
        self._scale = None
        self._file_location = None
        self._state = None
        self._jvm_args = None
        self._sub_type = None
        self._labels_file_location = None
        self._extra_args = None
        self._launch_policy = None
        self._model_state = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if created is not None:
            self.created = created
        if updated is not None:
            self.updated = updated
        if model_type is not None:
            self.model_type = model_type
        if deployment_id is not None:
            self.deployment_id = deployment_id
        if name is not None:
            self.name = name
        if scale is not None:
            self.scale = scale
        if file_location is not None:
            self.file_location = file_location
        if state is not None:
            self.state = state
        if jvm_args is not None:
            self.jvm_args = jvm_args
        if sub_type is not None:
            self.sub_type = sub_type
        if labels_file_location is not None:
            self.labels_file_location = labels_file_location
        if extra_args is not None:
            self.extra_args = extra_args
        if launch_policy is not None:
            self.launch_policy = launch_policy
        if model_state is not None:
            self.model_state = model_state

    @property
    def id(self):
        """Gets the id of this ModelEntity.  # noqa: E501


        :return: The id of this ModelEntity.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelEntity.


        :param id: The id of this ModelEntity.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def created(self):
        """Gets the created of this ModelEntity.  # noqa: E501


        :return: The created of this ModelEntity.  # noqa: E501
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this ModelEntity.


        :param created: The created of this ModelEntity.  # noqa: E501
        :type: int
        """

        self._created = created

    @property
    def updated(self):
        """Gets the updated of this ModelEntity.  # noqa: E501


        :return: The updated of this ModelEntity.  # noqa: E501
        :rtype: int
        """
        return self._updated

    @updated.setter
    def updated(self, updated):
        """Sets the updated of this ModelEntity.


        :param updated: The updated of this ModelEntity.  # noqa: E501
        :type: int
        """

        self._updated = updated

    @property
    def model_type(self):
        """Gets the model_type of this ModelEntity.  # noqa: E501


        :return: The model_type of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_type

    @model_type.setter
    def model_type(self, model_type):
        """Sets the model_type of this ModelEntity.


        :param model_type: The model_type of this ModelEntity.  # noqa: E501
        :type: str
        """
        allowed_values = ["transform", "model", "knn"]  # noqa: E501
        if model_type not in allowed_values:
            raise ValueError(
                "Invalid value for `model_type` ({0}), must be one of {1}"  # noqa: E501
                .format(model_type, allowed_values)
            )

        self._model_type = model_type

    @property
    def deployment_id(self):
        """Gets the deployment_id of this ModelEntity.  # noqa: E501


        :return: The deployment_id of this ModelEntity.  # noqa: E501
        :rtype: int
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """Sets the deployment_id of this ModelEntity.


        :param deployment_id: The deployment_id of this ModelEntity.  # noqa: E501
        :type: int
        """

        self._deployment_id = deployment_id

    @property
    def name(self):
        """Gets the name of this ModelEntity.  # noqa: E501


        :return: The name of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ModelEntity.


        :param name: The name of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def scale(self):
        """Gets the scale of this ModelEntity.  # noqa: E501


        :return: The scale of this ModelEntity.  # noqa: E501
        :rtype: float
        """
        return self._scale

    @scale.setter
    def scale(self, scale):
        """Sets the scale of this ModelEntity.


        :param scale: The scale of this ModelEntity.  # noqa: E501
        :type: float
        """

        self._scale = scale

    @property
    def file_location(self):
        """Gets the file_location of this ModelEntity.  # noqa: E501


        :return: The file_location of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._file_location

    @file_location.setter
    def file_location(self, file_location):
        """Sets the file_location of this ModelEntity.


        :param file_location: The file_location of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._file_location = file_location

    @property
    def state(self):
        """Gets the state of this ModelEntity.  # noqa: E501


        :return: The state of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this ModelEntity.


        :param state: The state of this ModelEntity.  # noqa: E501
        :type: str
        """
        allowed_values = ["created", "starting", "started", "stopping", "stopped", "unhealthy", "failed"]  # noqa: E501
        if state not in allowed_values:
            raise ValueError(
                "Invalid value for `state` ({0}), must be one of {1}"  # noqa: E501
                .format(state, allowed_values)
            )

        self._state = state

    @property
    def jvm_args(self):
        """Gets the jvm_args of this ModelEntity.  # noqa: E501


        :return: The jvm_args of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._jvm_args

    @jvm_args.setter
    def jvm_args(self, jvm_args):
        """Sets the jvm_args of this ModelEntity.


        :param jvm_args: The jvm_args of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._jvm_args = jvm_args

    @property
    def sub_type(self):
        """Gets the sub_type of this ModelEntity.  # noqa: E501


        :return: The sub_type of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._sub_type

    @sub_type.setter
    def sub_type(self, sub_type):
        """Sets the sub_type of this ModelEntity.


        :param sub_type: The sub_type of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._sub_type = sub_type

    @property
    def labels_file_location(self):
        """Gets the labels_file_location of this ModelEntity.  # noqa: E501


        :return: The labels_file_location of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._labels_file_location

    @labels_file_location.setter
    def labels_file_location(self, labels_file_location):
        """Sets the labels_file_location of this ModelEntity.


        :param labels_file_location: The labels_file_location of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._labels_file_location = labels_file_location

    @property
    def extra_args(self):
        """Gets the extra_args of this ModelEntity.  # noqa: E501


        :return: The extra_args of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._extra_args

    @extra_args.setter
    def extra_args(self, extra_args):
        """Sets the extra_args of this ModelEntity.


        :param extra_args: The extra_args of this ModelEntity.  # noqa: E501
        :type: str
        """

        self._extra_args = extra_args

    @property
    def launch_policy(self):
        """Gets the launch_policy of this ModelEntity.  # noqa: E501


        :return: The launch_policy of this ModelEntity.  # noqa: E501
        :rtype: object
        """
        return self._launch_policy

    @launch_policy.setter
    def launch_policy(self, launch_policy):
        """Sets the launch_policy of this ModelEntity.


        :param launch_policy: The launch_policy of this ModelEntity.  # noqa: E501
        :type: object
        """

        self._launch_policy = launch_policy

    @property
    def model_state(self):
        """Gets the model_state of this ModelEntity.  # noqa: E501


        :return: The model_state of this ModelEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_state

    @model_state.setter
    def model_state(self, model_state):
        """Sets the model_state of this ModelEntity.


        :param model_state: The model_state of this ModelEntity.  # noqa: E501
        :type: str
        """
        allowed_values = ["CREATED", "STARTING", "STARTED", "STOPPING", "STOPPED", "UNHEALTHY", "FAILED"]  # noqa: E501
        if model_state not in allowed_values:
            raise ValueError(
                "Invalid value for `model_state` ({0}), must be one of {1}"  # noqa: E501
                .format(model_state, allowed_values)
            )

        self._model_state = model_state

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
        if not isinstance(other, ModelEntity):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
