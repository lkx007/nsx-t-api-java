# LogicalRouterRouteCsvRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lrComponentId** | **String** | Logical router component(Service Router/Distributed Router) id |  [optional]
**nextHop** | **String** | The IP of the next hop |  [optional]
**lrComponentType** | **String** | Logical router component(Service Router/Distributed Router) type |  [optional]
**network** | **String** | CIDR network address | 
**routeType** | **String** | Route type (USER, CONNECTED, NSX_INTERNAL,..) | 
**logicalRouterPortId** | **String** | The id of the logical router port which is used as the next hop |  [optional]
**adminDistance** | **Long** | The admin distance of the next hop |  [optional]
