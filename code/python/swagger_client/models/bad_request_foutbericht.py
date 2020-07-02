# coding: utf-8

"""
    Kadastraal onroerende zaken

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six


class BadRequestFoutbericht(object):
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
        'type': 'str',
        'title': 'str',
        'status': 'int',
        'detail': 'str',
        'instance': 'str',
        'code': 'str',
        'invalid_params': 'list[InvalidParams]'
    }
    if hasattr(Foutbericht, "swagger_types"):
        swagger_types.update(Foutbericht.swagger_types)

    attribute_map = {
        'type': 'type',
        'title': 'title',
        'status': 'status',
        'detail': 'detail',
        'instance': 'instance',
        'code': 'code',
        'invalid_params': 'invalidParams'
    }
    if hasattr(Foutbericht, "attribute_map"):
        attribute_map.update(Foutbericht.attribute_map)

    def __init__(self, type=None, title=None, status=None, detail=None, instance=None, code=None, invalid_params=None, *args, **kwargs):  # noqa: E501
        """BadRequestFoutbericht - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._title = None
        self._status = None
        self._detail = None
        self._instance = None
        self._code = None
        self._invalid_params = None
        self.discriminator = None
        if type is not None:
            self.type = type
        if title is not None:
            self.title = title
        if status is not None:
            self.status = status
        if detail is not None:
            self.detail = detail
        if instance is not None:
            self.instance = instance
        if code is not None:
            self.code = code
        if invalid_params is not None:
            self.invalid_params = invalid_params
        Foutbericht.__init__(self, *args, **kwargs)

    @property
    def type(self):
        """Gets the type of this BadRequestFoutbericht.  # noqa: E501

        Link naar meer informatie over deze fout  # noqa: E501

        :return: The type of this BadRequestFoutbericht.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this BadRequestFoutbericht.

        Link naar meer informatie over deze fout  # noqa: E501

        :param type: The type of this BadRequestFoutbericht.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def title(self):
        """Gets the title of this BadRequestFoutbericht.  # noqa: E501

        Beschrijving van de fout  # noqa: E501

        :return: The title of this BadRequestFoutbericht.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this BadRequestFoutbericht.

        Beschrijving van de fout  # noqa: E501

        :param title: The title of this BadRequestFoutbericht.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def status(self):
        """Gets the status of this BadRequestFoutbericht.  # noqa: E501

        Http status code  # noqa: E501

        :return: The status of this BadRequestFoutbericht.  # noqa: E501
        :rtype: int
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this BadRequestFoutbericht.

        Http status code  # noqa: E501

        :param status: The status of this BadRequestFoutbericht.  # noqa: E501
        :type: int
        """

        self._status = status

    @property
    def detail(self):
        """Gets the detail of this BadRequestFoutbericht.  # noqa: E501

        Details over de fout  # noqa: E501

        :return: The detail of this BadRequestFoutbericht.  # noqa: E501
        :rtype: str
        """
        return self._detail

    @detail.setter
    def detail(self, detail):
        """Sets the detail of this BadRequestFoutbericht.

        Details over de fout  # noqa: E501

        :param detail: The detail of this BadRequestFoutbericht.  # noqa: E501
        :type: str
        """

        self._detail = detail

    @property
    def instance(self):
        """Gets the instance of this BadRequestFoutbericht.  # noqa: E501

        Uri van de aanroep die de fout heeft veroorzaakt  # noqa: E501

        :return: The instance of this BadRequestFoutbericht.  # noqa: E501
        :rtype: str
        """
        return self._instance

    @instance.setter
    def instance(self, instance):
        """Sets the instance of this BadRequestFoutbericht.

        Uri van de aanroep die de fout heeft veroorzaakt  # noqa: E501

        :param instance: The instance of this BadRequestFoutbericht.  # noqa: E501
        :type: str
        """

        self._instance = instance

    @property
    def code(self):
        """Gets the code of this BadRequestFoutbericht.  # noqa: E501

        Systeemcode die het type fout aangeeft  # noqa: E501

        :return: The code of this BadRequestFoutbericht.  # noqa: E501
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this BadRequestFoutbericht.

        Systeemcode die het type fout aangeeft  # noqa: E501

        :param code: The code of this BadRequestFoutbericht.  # noqa: E501
        :type: str
        """

        self._code = code

    @property
    def invalid_params(self):
        """Gets the invalid_params of this BadRequestFoutbericht.  # noqa: E501

        Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.  # noqa: E501

        :return: The invalid_params of this BadRequestFoutbericht.  # noqa: E501
        :rtype: list[InvalidParams]
        """
        return self._invalid_params

    @invalid_params.setter
    def invalid_params(self, invalid_params):
        """Sets the invalid_params of this BadRequestFoutbericht.

        Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.  # noqa: E501

        :param invalid_params: The invalid_params of this BadRequestFoutbericht.  # noqa: E501
        :type: list[InvalidParams]
        """

        self._invalid_params = invalid_params

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
        if issubclass(BadRequestFoutbericht, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, BadRequestFoutbericht):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
