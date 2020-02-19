# MigrationFeedbackRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resolved** | **Boolean** | Indicates if a valid response already exist for this feedback request. |  [optional]
**acceptedActions** | **List&lt;String&gt;** | List of acceptable actions for this feedback request. |  [optional]
**hash** | **String** | Identify a feedback request type across objects. This can be used to group together objects with similar feedback request and resolve them in one go. |  [optional]
**vertical** | **String** | Functional area that this query falls into. |  [optional]
**vObjectId** | **String** | Identifier for this object in the source NSX endpoint. |  [optional]
**suggestedValue** | **String** | The suggested value to resolve this feedback request. |  [optional]
**message** | **String** | Detailed feedback request with options. |  [optional]
**objectId** | **String** | Identifier of the object for which feedback is requested. |  [optional]
**acceptedValueType** | **String** | Data type of the items listed in acceptable values list. |  [optional]
**vObjectName** | **String** | Name of this object in the source NSX endpoint. |  [optional]
**multiValue** | **Boolean** | Indicates if multiple values can be selected as response from the list of acceptable value. |  [optional]
**acceptedValues** | **List&lt;String&gt;** | List of acceptable values for this feedback request. |  [optional]
**id** | **String** | Identifier of the feedback request. |  [optional]
**suggestedAction** | **String** | The suggested action to resolve this feedback request. |  [optional]
**subVertical** | **String** | Functional sub-area that this query falls into. |  [optional]
**resolution** | **String** | If the feedback request was resolved earlier, provides details about the previous resolution. |  [optional]
**rejected** | **Boolean** | Indicates if previous response was invalid. Please provide a valid response. |  [optional]
