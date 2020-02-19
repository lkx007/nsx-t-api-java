# ALGTypeNSService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | [**AlgEnum**](#AlgEnum) | The Application Layer Gateway (ALG) protocol. Please note, protocol NBNS_BROADCAST and NBDG_BROADCAST are  deprecated. Please use UDP protocol and create L4 Port Set type of service instead.  | 
**destinationPorts** | **List&lt;String&gt;** | The destination_port cannot be empty and must be a single value. | 
**sourcePorts** | **List&lt;String&gt;** | Source ports |  [optional]

<a name="AlgEnum"></a>
## Enum: AlgEnum
Name | Value
---- | -----
ORACLE_TNS | &quot;ORACLE_TNS&quot;
FTP | &quot;FTP&quot;
SUN_RPC_TCP | &quot;SUN_RPC_TCP&quot;
SUN_RPC_UDP | &quot;SUN_RPC_UDP&quot;
MS_RPC_TCP | &quot;MS_RPC_TCP&quot;
MS_RPC_UDP | &quot;MS_RPC_UDP&quot;
NBNS_BROADCAST | &quot;NBNS_BROADCAST&quot;
NBDG_BROADCAST | &quot;NBDG_BROADCAST&quot;
TFTP | &quot;TFTP&quot;
