# ManagementPlaneApiDashboardApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createView**](ManagementPlaneApiDashboardApi.md#createView) | **POST** /ui-views | Creates a new View.
[**createWidgetConfiguration**](ManagementPlaneApiDashboardApi.md#createWidgetConfiguration) | **POST** /ui-views/{view-id}/widgetconfigurations | Creates a new Widget Configuration.
[**deletView**](ManagementPlaneApiDashboardApi.md#deletView) | **DELETE** /ui-views/{view-id} | Delete View
[**deleteWidgetConfiguration**](ManagementPlaneApiDashboardApi.md#deleteWidgetConfiguration) | **DELETE** /ui-views/{view-id}/widgetconfigurations/{widgetconfiguration-id} | Delete Widget Configuration
[**getView**](ManagementPlaneApiDashboardApi.md#getView) | **GET** /ui-views/{view-id} | Returns View Information
[**getWidgetConfiguration**](ManagementPlaneApiDashboardApi.md#getWidgetConfiguration) | **GET** /ui-views/{view-id}/widgetconfigurations/{widgetconfiguration-id} | Returns Widget Configuration Information
[**listViews**](ManagementPlaneApiDashboardApi.md#listViews) | **GET** /ui-views | Returns the Views based on query criteria defined in ViewQueryParameters.
[**listWidgetConfigurations**](ManagementPlaneApiDashboardApi.md#listWidgetConfigurations) | **GET** /ui-views/{view-id}/widgetconfigurations | Returns the Widget Configurations based on query criteria defined in WidgetQueryParameters.
[**updateView**](ManagementPlaneApiDashboardApi.md#updateView) | **PUT** /ui-views/{view-id} | Update View
[**updateWidgetConfiguration**](ManagementPlaneApiDashboardApi.md#updateWidgetConfiguration) | **PUT** /ui-views/{view-id}/widgetconfigurations/{widgetconfiguration-id} | Update Widget Configuration

<a name="createView"></a>
# **createView**
> View createView(body)

Creates a new View.

Creates a new View.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
View body = new View(); // View | 
try {
    View result = apiInstance.createView(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#createView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**View**](View.md)|  |

### Return type

[**View**](View.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWidgetConfiguration"></a>
# **createWidgetConfiguration**
> WidgetConfiguration createWidgetConfiguration(body, viewId)

Creates a new Widget Configuration.

Creates a new Widget Configuration and adds it to the specified view. Supported resource_types are LabelValueConfiguration, DonutConfiguration, GridConfiguration, StatsConfiguration, MultiWidgetConfiguration, GraphConfiguration and ContainerConfiguration.  Note: Expressions should be given in a single line. If an expression spans   multiple lines, then form the expression in a single line. For label-value pairs, expressions are evaluated as follows:   a. First, render configurations are evaluated in their order of      appearance in the widget config. The &#x27;field&#x27; is evaluated at the end.   b. Second, when render configuration is provided then the order of      evaluation is      1. If expressions provided in &#x27;condition&#x27; and &#x27;display value&#x27; are         well-formed and free of runtime-errors such as &#x27;null pointers&#x27; and         evaluates to &#x27;true&#x27;; Then remaining render configurations are not         evaluated, and the current render configuration&#x27;s &#x27;display value&#x27;         is taken as the final value.      2. If expression provided in &#x27;condition&#x27; of render configuration is         false, then next render configuration is evaluated.      3. Finally, &#x27;field&#x27; is evaluated only when every render configuration         evaluates to false and no error occurs during steps 1 and 2 above.  If an error occurs during evaluation of render configuration, then an   error message is shown. The display value corresponding to that label is   not shown and evaluation of the remaining render configurations continues   to collect and show all the error messages (marked with the &#x27;Label&#x27; for   identification) as &#x27;Error_Messages: {}&#x27;.  If during evaluation of expressions for any label-value pair an error   occurs, then it is marked with error. The errors are shown in the report,   along with the label value pairs that are error-free.  Important: For elements that take expressions, strings should be provided   by escaping them with a back-slash. These elements are - condition, field,   tooltip text and render_configuration&#x27;s display_value. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
WidgetConfiguration body = new WidgetConfiguration(); // WidgetConfiguration | 
String viewId = "viewId_example"; // String | 
try {
    WidgetConfiguration result = apiInstance.createWidgetConfiguration(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#createWidgetConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WidgetConfiguration**](WidgetConfiguration.md)|  |
 **viewId** | **String**|  |

### Return type

[**WidgetConfiguration**](WidgetConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletView"></a>
# **deletView**
> deletView(viewId)

Delete View

Delete View

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String viewId = "viewId_example"; // String | 
try {
    apiInstance.deletView(viewId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#deletView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWidgetConfiguration"></a>
# **deleteWidgetConfiguration**
> deleteWidgetConfiguration(viewId, widgetconfigurationId)

Delete Widget Configuration

Detaches widget from a given view. If the widget is no longer part of any view, then it will be purged. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String viewId = "viewId_example"; // String | 
String widgetconfigurationId = "widgetconfigurationId_example"; // String | 
try {
    apiInstance.deleteWidgetConfiguration(viewId, widgetconfigurationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#deleteWidgetConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**|  |
 **widgetconfigurationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getView"></a>
# **getView**
> View getView(viewId)

Returns View Information

Returns Information about a specific View. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String viewId = "viewId_example"; // String | 
try {
    View result = apiInstance.getView(viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#getView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**|  |

### Return type

[**View**](View.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWidgetConfiguration"></a>
# **getWidgetConfiguration**
> WidgetConfiguration getWidgetConfiguration(viewId, widgetconfigurationId)

Returns Widget Configuration Information

Returns Information about a specific Widget Configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String viewId = "viewId_example"; // String | 
String widgetconfigurationId = "widgetconfigurationId_example"; // String | 
try {
    WidgetConfiguration result = apiInstance.getWidgetConfiguration(viewId, widgetconfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#getWidgetConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**|  |
 **widgetconfigurationId** | **String**|  |

### Return type

[**WidgetConfiguration**](WidgetConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listViews"></a>
# **listViews**
> ViewList listViews(tag, viewIds, widgetId)

Returns the Views based on query criteria defined in ViewQueryParameters.

If no query params are specified then all the views entitled for the user are returned. The views to which a user is entitled to include the views created by the user and the shared views. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String tag = "tag_example"; // String | The tag for which associated views to be queried.
String viewIds = "viewIds_example"; // String | Ids of the Views
String widgetId = "widgetId_example"; // String | Id of widget configuration
try {
    ViewList result = apiInstance.listViews(tag, viewIds, widgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#listViews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| The tag for which associated views to be queried. | [optional]
 **viewIds** | **String**| Ids of the Views | [optional]
 **widgetId** | **String**| Id of widget configuration | [optional]

### Return type

[**ViewList**](ViewList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWidgetConfigurations"></a>
# **listWidgetConfigurations**
> WidgetConfigurationList listWidgetConfigurations(viewId, container, widgetIds)

Returns the Widget Configurations based on query criteria defined in WidgetQueryParameters.

If no query params are specified then all the Widget Configurations of the specified view are returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
String viewId = "viewId_example"; // String | 
String container = "container_example"; // String | Id of the container
String widgetIds = "widgetIds_example"; // String | Ids of the WidgetConfigurations
try {
    WidgetConfigurationList result = apiInstance.listWidgetConfigurations(viewId, container, widgetIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#listWidgetConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewId** | **String**|  |
 **container** | **String**| Id of the container | [optional]
 **widgetIds** | **String**| Ids of the WidgetConfigurations | [optional]

### Return type

[**WidgetConfigurationList**](WidgetConfigurationList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateView"></a>
# **updateView**
> View updateView(body, viewId)

Update View

Update View

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
View body = new View(); // View | 
String viewId = "viewId_example"; // String | 
try {
    View result = apiInstance.updateView(body, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#updateView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**View**](View.md)|  |
 **viewId** | **String**|  |

### Return type

[**View**](View.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWidgetConfiguration"></a>
# **updateWidgetConfiguration**
> WidgetConfiguration updateWidgetConfiguration(body, viewId, widgetconfigurationId)

Update Widget Configuration

Updates the widget at the given view. If the widget is referenced by other views, then the widget will be updated in all the views that it is part of. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiDashboardApi apiInstance = new ManagementPlaneApiDashboardApi();
WidgetConfiguration body = new WidgetConfiguration(); // WidgetConfiguration | 
String viewId = "viewId_example"; // String | 
String widgetconfigurationId = "widgetconfigurationId_example"; // String | 
try {
    WidgetConfiguration result = apiInstance.updateWidgetConfiguration(body, viewId, widgetconfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiDashboardApi#updateWidgetConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WidgetConfiguration**](WidgetConfiguration.md)|  |
 **viewId** | **String**|  |
 **widgetconfigurationId** | **String**|  |

### Return type

[**WidgetConfiguration**](WidgetConfiguration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

