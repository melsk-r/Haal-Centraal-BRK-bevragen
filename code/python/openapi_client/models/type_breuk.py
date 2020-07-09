# coding: utf-8

"""
    Kadastraal onroerende zaken

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class TypeBreuk(object):
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
        'noemer': 'int',
        'teller': 'int'
    }

    attribute_map = {
        'noemer': 'noemer',
        'teller': 'teller'
    }

    def __init__(self, noemer=None, teller=None, local_vars_configuration=None):  # noqa: E501
        """TypeBreuk - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._noemer = None
        self._teller = None
        self.discriminator = None

        if noemer is not None:
            self.noemer = noemer
        if teller is not None:
            self.teller = teller

    @property
    def noemer(self):
        """Gets the noemer of this TypeBreuk.  # noqa: E501

        De noemer van het deel.  # noqa: E501

        :return: The noemer of this TypeBreuk.  # noqa: E501
        :rtype: int
        """
        return self._noemer

    @noemer.setter
    def noemer(self, noemer):
        """Sets the noemer of this TypeBreuk.

        De noemer van het deel.  # noqa: E501

        :param noemer: The noemer of this TypeBreuk.  # noqa: E501
        :type: int
        """
        if (self.local_vars_configuration.client_side_validation and
                noemer is not None and noemer > 99999999):  # noqa: E501
            raise ValueError("Invalid value for `noemer`, must be a value less than or equal to `99999999`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                noemer is not None and noemer < 1):  # noqa: E501
            raise ValueError("Invalid value for `noemer`, must be a value greater than or equal to `1`")  # noqa: E501

        self._noemer = noemer

    @property
    def teller(self):
        """Gets the teller of this TypeBreuk.  # noqa: E501

        Het aantal delen. De teller is altijd lager dan de noemer.  # noqa: E501

        :return: The teller of this TypeBreuk.  # noqa: E501
        :rtype: int
        """
        return self._teller

    @teller.setter
    def teller(self, teller):
        """Sets the teller of this TypeBreuk.

        Het aantal delen. De teller is altijd lager dan de noemer.  # noqa: E501

        :param teller: The teller of this TypeBreuk.  # noqa: E501
        :type: int
        """
        if (self.local_vars_configuration.client_side_validation and
                teller is not None and teller > 99999999):  # noqa: E501
            raise ValueError("Invalid value for `teller`, must be a value less than or equal to `99999999`")  # noqa: E501

        self._teller = teller

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
        if not isinstance(other, TypeBreuk):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TypeBreuk):
            return True

        return self.to_dict() != other.to_dict()