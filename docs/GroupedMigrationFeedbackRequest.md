# GroupedMigrationFeedbackRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resolved** | **Boolean** | Indicates if a valid response already exist for all feedback requests in this group. |  [optional]
**acceptedActions** | **List&lt;String&gt;** | List of acceptable actions for this feedback request. |  [optional]
**hash** | **String** | Identify a feedback request type across objects. This can be used to group together objects with similar feedback request and resolve them in one go. |  [optional]
**vertical** | **String** | Functional area that this query falls into. |  [optional]
**suggestedValue** | **String** | The suggested value to resolve this feedback request. |  [optional]
**multiValue** | **Boolean** | Indicates if multiple values can be selected as response from the list of acceptable value. |  [optional]
**subVertical** | **String** | Functional sub-area that this query falls into. |  [optional]
**objects** | [**List&lt;SummaryMigrationFeedbackRequest&gt;**](SummaryMigrationFeedbackRequest.md) | Collection of feedback requests of a given type | 
**acceptedValues** | **List&lt;String&gt;** | List of acceptable values for this feedback request. |  [optional]
**message** | **String** | Detailed feedback request with options. |  [optional]
**acceptedValueType** | **String** | Data type of the items listed in acceptable values list. |  [optional]
**suggestedAction** | **String** | The suggested action to resolve this feedback request. |  [optional]
