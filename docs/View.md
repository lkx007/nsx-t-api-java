# View

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeRoles** | **String** | Comma separated list of roles to which the shared view is visible. Allows user to specify the visibility of a shared view to the specified roles. User defined roles can also be specified in the list. The roles can be obtained via GET /api/v1/aaa/roles. Please visit API documentation for details about roles. |  [optional]
**displayName** | **String** | Title of the widget. | 
**excludeRoles** | **String** | Comma separated list of roles to which the shared view is not visible. Allows user to prevent the visibility of a shared view to the specified roles. User defined roles can also be specified in the list. The roles can be obtained via GET /api/v1/aaa/roles. Please visit API documentation for details about roles. If include_roles is specified then exclude_roles cannot be specified. |  [optional]
**weight** | **Integer** | Determines placement of view relative to other views. The lower the weight, the higher it is in the placement order. |  [optional]
**widgets** | [**List&lt;WidgetItem&gt;**](WidgetItem.md) | Array of widgets that are part of the view. | 
**shared** | **Boolean** | Defaults to false. Set to true to publish the view to other users. The widgets of a shared view are visible to other users. |  [optional]
