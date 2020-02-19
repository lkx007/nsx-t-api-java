# VendorTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendorTemplateKey** | **String** | Different VMs in data center can have Different protection levels as specified by administrator in the policy. The identifier for the policy with which the partner appliance identifies this policy. This identifier will be passed to the partner appliance at runtime to specify which protection level is applicable for the VM being protected. |  [optional]
**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | List of attributes specific to a partner for which the vendor template is created. There attributes are passed on to the partner appliance and is opaque to the NSX Manager. Attributes are not supported by guest introspection service. |  [optional]
**redirectionAction** | [**RedirectionActionEnum**](#RedirectionActionEnum) | The redirection action represents if the packet is exclusively redirected to the service, or if a copy is forwarded to the service. Service profile inherits the redirection action specified at the vendor template and cannot override the action specified at the vendor template. Redirection action is not applicable to guest introspection service. |  [optional]
**functionality** | [**FunctionalityEnum**](#FunctionalityEnum) | The capabilities provided by the services. Needs to be one of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service) |  [optional]
**serviceId** | **String** | The service to which the vendor template belongs. |  [optional]

<a name="RedirectionActionEnum"></a>
## Enum: RedirectionActionEnum
Name | Value
---- | -----
PUNT | &quot;PUNT&quot;
COPY | &quot;COPY&quot;

<a name="FunctionalityEnum"></a>
## Enum: FunctionalityEnum
Name | Value
---- | -----
NG_FW | &quot;NG_FW&quot;
IDS_IPS | &quot;IDS_IPS&quot;
NET_MON | &quot;NET_MON&quot;
HCX | &quot;HCX&quot;
BYOD | &quot;BYOD&quot;
EPP | &quot;EPP&quot;
