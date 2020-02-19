# NodeUserSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cliUsername** | **String** | To configure username, you must provide this property together with &lt;b&gt;cli_password&lt;/b&gt;. Username must contain ASCII characters only.  |  [optional]
**auditUsername** | **String** | The default username is \&quot;audit\&quot;. To configure username, you must provide this property together with &lt;b&gt;audit_password&lt;/b&gt;. Username must contain ASCII characters only.  |  [optional]
**rootPassword** | **String** | Password for the node root user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and  one special character (except quotes). Passwords based on dictionary words and palindromes are invalid.  |  [optional]
**cliPassword** | **String** | Password for the node cli user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid.  |  [optional]
**auditPassword** | **String** | Password for the node audit user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid.  |  [optional]
