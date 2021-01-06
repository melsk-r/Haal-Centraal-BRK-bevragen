"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.api_client import ApiClient, Endpoint
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from openapi_client.model.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.model.foutbericht import Foutbericht
from openapi_client.model.hypotheek_hal import HypotheekHal
from openapi_client.model.hypotheek_hal_collectie import HypotheekHalCollectie


class HypothekenApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __get_hypotheek(
            self,
            kadastraalonroerendezaakidentificatie,
            hypotheekidentificatie,
            **kwargs
        ):
            """get_hypotheek  # noqa: E501

            Het raadplegen van een hypotheek die rust op een kadastraal onroerende zaak met bijbehorende hypotheekhouder(s). Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_hypotheek(kadastraalonroerendezaakidentificatie, hypotheekidentificatie, async_req=True)
            >>> result = thread.get()

            Args:
                kadastraalonroerendezaakidentificatie (str): De unieke identificatie van een kadastraal onroerende zaak. 
                hypotheekidentificatie (str): De unieke identificatie van de hypotheek. 

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                accept_crs (str): Gewenste CRS van de coördinaten in de response.. [optional] if omitted the server will use the default value of "epsg:28992"
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                HypotheekHal
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['kadastraalonroerendezaakidentificatie'] = \
                kadastraalonroerendezaakidentificatie
            kwargs['hypotheekidentificatie'] = \
                hypotheekidentificatie
            return self.call_with_http_info(**kwargs)

        self.get_hypotheek = Endpoint(
            settings={
                'response_type': (HypotheekHal,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/hypotheken/{hypotheekidentificatie}',
                'operation_id': 'get_hypotheek',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'kadastraalonroerendezaakidentificatie',
                    'hypotheekidentificatie',
                    'fields',
                    'accept_crs',
                ],
                'required': [
                    'kadastraalonroerendezaakidentificatie',
                    'hypotheekidentificatie',
                ],
                'nullable': [
                ],
                'enum': [
                    'accept_crs',
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                    ('accept_crs',): {

                        "EPSG:28992": "epsg:28992"
                    },
                },
                'openapi_types': {
                    'kadastraalonroerendezaakidentificatie':
                        (str,),
                    'hypotheekidentificatie':
                        (str,),
                    'fields':
                        (str,),
                    'accept_crs':
                        (str,),
                },
                'attribute_map': {
                    'kadastraalonroerendezaakidentificatie': 'kadastraalonroerendezaakidentificatie',
                    'hypotheekidentificatie': 'hypotheekidentificatie',
                    'fields': 'fields',
                    'accept_crs': 'Accept-Crs',
                },
                'location_map': {
                    'kadastraalonroerendezaakidentificatie': 'path',
                    'hypotheekidentificatie': 'path',
                    'fields': 'query',
                    'accept_crs': 'header',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_hypotheek
        )

        def __get_hypotheken_kadastraal_onroerende_zaak(
            self,
            kadastraalonroerendezaakidentificatie,
            **kwargs
        ):
            """get_hypotheken_kadastraal_onroerende_zaak  # noqa: E501

            Het raadplegen van hypotheken die rusten op een kadastraal onroerende zaak met bijbehorende hypotheekhouder(s). Een hypotheekhouder vestigt als geldverstrekker een recht van hypotheek als zekerheid voor de lening.   # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_hypotheken_kadastraal_onroerende_zaak(kadastraalonroerendezaakidentificatie, async_req=True)
            >>> result = thread.get()

            Args:
                kadastraalonroerendezaakidentificatie (str): De unieke identificatie van een kadastraal onroerende zaak. 

            Keyword Args:
                fields (str): Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature). [optional]
                accept_crs (str): Gewenste CRS van de coördinaten in de response.. [optional] if omitted the server will use the default value of "epsg:28992"
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                HypotheekHalCollectie
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['kadastraalonroerendezaakidentificatie'] = \
                kadastraalonroerendezaakidentificatie
            return self.call_with_http_info(**kwargs)

        self.get_hypotheken_kadastraal_onroerende_zaak = Endpoint(
            settings={
                'response_type': (HypotheekHalCollectie,),
                'auth': [
                    'apiKeyAuth'
                ],
                'endpoint_path': '/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/hypotheken',
                'operation_id': 'get_hypotheken_kadastraal_onroerende_zaak',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'kadastraalonroerendezaakidentificatie',
                    'fields',
                    'accept_crs',
                ],
                'required': [
                    'kadastraalonroerendezaakidentificatie',
                ],
                'nullable': [
                ],
                'enum': [
                    'accept_crs',
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                    ('accept_crs',): {

                        "EPSG:28992": "epsg:28992"
                    },
                },
                'openapi_types': {
                    'kadastraalonroerendezaakidentificatie':
                        (str,),
                    'fields':
                        (str,),
                    'accept_crs':
                        (str,),
                },
                'attribute_map': {
                    'kadastraalonroerendezaakidentificatie': 'kadastraalonroerendezaakidentificatie',
                    'fields': 'fields',
                    'accept_crs': 'Accept-Crs',
                },
                'location_map': {
                    'kadastraalonroerendezaakidentificatie': 'path',
                    'fields': 'query',
                    'accept_crs': 'header',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/hal+json',
                    'application/problem+json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_hypotheken_kadastraal_onroerende_zaak
        )
