# LbVariablePersistenceOnAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variableHashEnabled** | **Boolean** | The property is used to enable a hash operation for variable value when composing the persistence key.  |  [optional]
**variableName** | **String** | The property is the name of variable to be used. It specifies which variable&#x27;s value of a HTTP Request will be used in the key of persistence entry. The variable can be a system embedded variable such as \&quot;_cookie_JSESSIONID\&quot;, a customized variable defined in LbVariableAssignmentAction or a captured variable in regular expression such as \&quot;article\&quot;.  | 
**persistenceProfileId** | **String** | If the persistence profile UUID is not specified, a default persistence table is created per virtual server. Currently, only LbGenericPersistenceProfile is supported.  |  [optional]
