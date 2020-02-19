# BaseServiceInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onFailurePolicy** | [**OnFailurePolicyEnum**](#OnFailurePolicyEnum) | Failure policy of the service instance - if it has to be different from the service. By default the service instance inherits the FailurePolicy of the service it belongs to. |  [optional]
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | Transport to be used by this service instance for deploying the Service-VM. This field is to be set Not Applicable(NA) if the service only caters to functionality EPP(Endpoint Protection). | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | ServiceInstance is used when NSX handles the lifecyle of   appliance. Deployment and appliance related all the information is necessary. ByodServiceInstance is a custom instance to be used when NSX is not handling   the lifecycles of appliance/s. User will manage their own appliance (BYOD)   to connect with NSX. VirtualServiceInstance is a a custom instance to be used when NSX is not   handling the lifecycle of an appliance and when the user is not bringing   their own appliance.  | 
**serviceId** | **String** | The Service to which the service instance is associated. |  [optional]

<a name="OnFailurePolicyEnum"></a>
## Enum: OnFailurePolicyEnum
Name | Value
---- | -----
ALLOW | &quot;ALLOW&quot;
BLOCK | &quot;BLOCK&quot;

<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
L2_BRIDGE | &quot;L2_BRIDGE&quot;
L3_ROUTED | &quot;L3_ROUTED&quot;
NSH | &quot;NSH&quot;
NA | &quot;NA&quot;

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
SERVICEINSTANCE | &quot;ServiceInstance&quot;
BYODSERVICEINSTANCE | &quot;ByodServiceInstance&quot;
VIRTUALSERVICEINSTANCE | &quot;VirtualServiceInstance&quot;
