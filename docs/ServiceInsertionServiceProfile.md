# ServiceInsertionServiceProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | List of attributes specific to a partner for which the service is created. These attributes are passed on to the partner appliance and are opaque to the NSX Manager. If a vendor template exposes configurables, then the values are specified here. |  [optional]
**serviceId** | **String** | The service to which the service profile belongs. |  [optional]
**redirectionAction** | [**RedirectionActionEnum**](#RedirectionActionEnum) | The redirection action represents if the packet is exclusively redirected to the service, or if a copy is forwarded to the service. The service insertion profile inherits the redirection action if already specified at the vendor template. However the service profile cannot overide the action specified at the vendor template. |  [optional]
**vendorTemplateId** | **String** | Id of the vendor template to be used by the servive profile. | 

<a name="RedirectionActionEnum"></a>
## Enum: RedirectionActionEnum
Name | Value
---- | -----
PUNT | &quot;PUNT&quot;
COPY | &quot;COPY&quot;
