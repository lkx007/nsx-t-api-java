# Lag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uplinks** | [**List&lt;Uplink&gt;**](Uplink.md) | uplink names |  [optional]
**name** | **String** | Lag name | 
**numberOfUplinks** | **Integer** | number of uplinks | 
**timeoutType** | [**TimeoutTypeEnum**](#TimeoutTypeEnum) | LACP timeout type |  [optional]
**loadBalanceAlgorithm** | [**LoadBalanceAlgorithmEnum**](#LoadBalanceAlgorithmEnum) | LACP load balance Algorithm | 
**id** | **String** | unique id |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | LACP group mode | 

<a name="TimeoutTypeEnum"></a>
## Enum: TimeoutTypeEnum
Name | Value
---- | -----
SLOW | &quot;SLOW&quot;
FAST | &quot;FAST&quot;

<a name="LoadBalanceAlgorithmEnum"></a>
## Enum: LoadBalanceAlgorithmEnum
Name | Value
---- | -----
SRCMAC | &quot;SRCMAC&quot;
DESTMAC | &quot;DESTMAC&quot;
SRCDESTMAC | &quot;SRCDESTMAC&quot;
SRCDESTIPVLAN | &quot;SRCDESTIPVLAN&quot;
SRCDESTMACIPPORT | &quot;SRCDESTMACIPPORT&quot;

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
PASSIVE | &quot;PASSIVE&quot;
