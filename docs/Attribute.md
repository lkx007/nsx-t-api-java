# Attribute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readOnly** | **Boolean** | Read only Attribute cannot be overdidden by service instance/deployment. |  [optional]
**attributeType** | [**AttributeTypeEnum**](#AttributeTypeEnum) | Attribute Type can be of any of the allowed enum type. |  [optional]
**displayName** | **String** | Attribute display name string value. |  [optional]
**value** | **String** | Attribute value string value. |  [optional]
**key** | **String** | Attribute key string value. | 

<a name="AttributeTypeEnum"></a>
## Enum: AttributeTypeEnum
Name | Value
---- | -----
IP_ADDRESS | &quot;IP_ADDRESS&quot;
PORT | &quot;PORT&quot;
PASSWORD | &quot;PASSWORD&quot;
STRING | &quot;STRING&quot;
LONG | &quot;LONG&quot;
BOOLEAN | &quot;BOOLEAN&quot;
