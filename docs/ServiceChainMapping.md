# ServiceChainMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceChainId** | **String** | A unique id generated for every ServiceChain. This is not a uuid. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Each ServiceChain has forward_path_service_profiles and reverse_path_service_profiles. This property will indicate which of them being used. FORWARD - forward_path_service_profiles REVERSE - reverse_path_service_profiles |  [optional]
**serviceIndex** | **Long** | Service Index represents a numerical position of a ServiceInsertionServiceProfile in a ServiceChain. It will be in reverse order. Service Index can point to either forward_path_service_profiles or reverse_path_service_profiles indicated by direction property. Example - For a ServiceChain A-B-C, A will have index of 3, B will have index of 2 and C will have index of 1. |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
FORWARD | &quot;FORWARD&quot;
REVERSE | &quot;REVERSE&quot;
