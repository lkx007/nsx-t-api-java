# ServiceManager

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**port** | **Long** | Integer port value to specify a standard/non-standard HTTPS port. | 
**serviceIds** | [**List&lt;ResourceReference&gt;**](ResourceReference.md) | The IDs of services, provided by partner. | 
**authenticationScheme** | [**CallbackAuthenticationScheme**](CallbackAuthenticationScheme.md) |  | 
**thumbprint** | **String** | Thumbprint (SHA-256 hash represented in lower case hex) for the certificate on the partner console. This will be required to establish secure communication with the console and to avoid man-in-the-middle attacks. |  [optional]
**vendorId** | **String** | Id which is unique to a vendor or partner for which the service is created. |  [optional]
**uri** | **String** | URI on which notification requests should be made on the specified server. | 
**server** | **String** | IP address or fully qualified domain name of the partner REST server. | 
