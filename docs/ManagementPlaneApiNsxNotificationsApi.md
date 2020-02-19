# ManagementPlaneApiNsxNotificationsApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNotificationWatcher**](ManagementPlaneApiNsxNotificationsApi.md#addNotificationWatcher) | **POST** /notification-watchers | Add a new notification watcher.
[**addUriFiltersAddUriFilters**](ManagementPlaneApiNsxNotificationsApi.md#addUriFiltersAddUriFilters) | **POST** /notification-watchers/{watcher-id}/notifications?action&#x3D;add_uri_filters | Add uri filters for the specified watcher ID.
[**deleteNotificationWatcher**](ManagementPlaneApiNsxNotificationsApi.md#deleteNotificationWatcher) | **DELETE** /notification-watchers/{watcher-id} | Delete an existing Notification-Watcher.
[**deleteUriFiltersDeleteUriFilters**](ManagementPlaneApiNsxNotificationsApi.md#deleteUriFiltersDeleteUriFilters) | **POST** /notification-watchers/{watcher-id}/notifications?action&#x3D;delete_uri_filters | Delete uri filters for the specified watcher ID.
[**getNotificationWatcher**](ManagementPlaneApiNsxNotificationsApi.md#getNotificationWatcher) | **GET** /notification-watchers/{watcher-id} | Returns notification watcher by watcher id.
[**getNotifications**](ManagementPlaneApiNsxNotificationsApi.md#getNotifications) | **GET** /notification-watchers/{watcher-id}/notifications | Get notifications for the specified watcher ID.
[**listNotificationWatchers**](ManagementPlaneApiNsxNotificationsApi.md#listNotificationWatchers) | **GET** /notification-watchers | Returns a list of registered notification watchers.
[**updateNotificationWatcher**](ManagementPlaneApiNsxNotificationsApi.md#updateNotificationWatcher) | **PUT** /notification-watchers/{watcher-id} | Update notification watcher.
[**updateNotifications**](ManagementPlaneApiNsxNotificationsApi.md#updateNotifications) | **PUT** /notification-watchers/{watcher-id}/notifications | Update notifications for the specified watcher ID.

<a name="addNotificationWatcher"></a>
# **addNotificationWatcher**
> NotificationWatcher addNotificationWatcher(body)

Add a new notification watcher.

Add a new notification watcher.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
NotificationWatcher body = new NotificationWatcher(); // NotificationWatcher | 
try {
    NotificationWatcher result = apiInstance.addNotificationWatcher(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#addNotificationWatcher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationWatcher**](NotificationWatcher.md)|  |

### Return type

[**NotificationWatcher**](NotificationWatcher.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addUriFiltersAddUriFilters"></a>
# **addUriFiltersAddUriFilters**
> NotificationsList addUriFiltersAddUriFilters(body, watcherId)

Add uri filters for the specified watcher ID.

Add uri filters for the specified watcher ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
Notification body = new Notification(); // Notification | 
String watcherId = "watcherId_example"; // String | 
try {
    NotificationsList result = apiInstance.addUriFiltersAddUriFilters(body, watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#addUriFiltersAddUriFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Notification**](Notification.md)|  |
 **watcherId** | **String**|  |

### Return type

[**NotificationsList**](NotificationsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNotificationWatcher"></a>
# **deleteNotificationWatcher**
> deleteNotificationWatcher(watcherId)

Delete an existing Notification-Watcher.

Delete notification watcher. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
String watcherId = "watcherId_example"; // String | 
try {
    apiInstance.deleteNotificationWatcher(watcherId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#deleteNotificationWatcher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watcherId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUriFiltersDeleteUriFilters"></a>
# **deleteUriFiltersDeleteUriFilters**
> NotificationsList deleteUriFiltersDeleteUriFilters(body, watcherId)

Delete uri filters for the specified watcher ID.

Delete uri filters for the specified watcher ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
Notification body = new Notification(); // Notification | 
String watcherId = "watcherId_example"; // String | 
try {
    NotificationsList result = apiInstance.deleteUriFiltersDeleteUriFilters(body, watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#deleteUriFiltersDeleteUriFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Notification**](Notification.md)|  |
 **watcherId** | **String**|  |

### Return type

[**NotificationsList**](NotificationsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNotificationWatcher"></a>
# **getNotificationWatcher**
> NotificationWatcher getNotificationWatcher(watcherId)

Returns notification watcher by watcher id.

Returns notification watcher by watcher id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
String watcherId = "watcherId_example"; // String | 
try {
    NotificationWatcher result = apiInstance.getNotificationWatcher(watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#getNotificationWatcher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watcherId** | **String**|  |

### Return type

[**NotificationWatcher**](NotificationWatcher.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> NotificationsList getNotifications(watcherId)

Get notifications for the specified watcher ID.

Get notifications for the specified watcher ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
String watcherId = "watcherId_example"; // String | 
try {
    NotificationsList result = apiInstance.getNotifications(watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watcherId** | **String**|  |

### Return type

[**NotificationsList**](NotificationsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNotificationWatchers"></a>
# **listNotificationWatchers**
> NotificationWatcherListResult listNotificationWatchers()

Returns a list of registered notification watchers.

Returns a list of registered notification watchers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
try {
    NotificationWatcherListResult result = apiInstance.listNotificationWatchers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#listNotificationWatchers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NotificationWatcherListResult**](NotificationWatcherListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationWatcher"></a>
# **updateNotificationWatcher**
> NotificationWatcher updateNotificationWatcher(body, watcherId)

Update notification watcher.

Update notification watcher.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
NotificationWatcher body = new NotificationWatcher(); // NotificationWatcher | 
String watcherId = "watcherId_example"; // String | 
try {
    NotificationWatcher result = apiInstance.updateNotificationWatcher(body, watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#updateNotificationWatcher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationWatcher**](NotificationWatcher.md)|  |
 **watcherId** | **String**|  |

### Return type

[**NotificationWatcher**](NotificationWatcher.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNotifications"></a>
# **updateNotifications**
> NotificationsList updateNotifications(body, watcherId)

Update notifications for the specified watcher ID.

Update notifications for the specified watcher ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxNotificationsApi apiInstance = new ManagementPlaneApiNsxNotificationsApi();
NotificationsList body = new NotificationsList(); // NotificationsList | 
String watcherId = "watcherId_example"; // String | 
try {
    NotificationsList result = apiInstance.updateNotifications(body, watcherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxNotificationsApi#updateNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationsList**](NotificationsList.md)|  |
 **watcherId** | **String**|  |

### Return type

[**NotificationsList**](NotificationsList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

