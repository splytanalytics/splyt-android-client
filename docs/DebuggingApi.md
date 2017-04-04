# DebuggingApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableDebuggerUsingDELETE**](DebuggingApi.md#disableDebuggerUsingDELETE) | **DELETE** /v2/_debug/{customerId} | Disable debugging via Redis
[**enableDebuggerUsingPOST**](DebuggingApi.md#enableDebuggerUsingPOST) | **POST** /v2/_debug/{customerId} | Enable debugging via Redis


<a name="disableDebuggerUsingDELETE"></a>
# **disableDebuggerUsingDELETE**
> disableDebuggerUsingDELETE(customerId)

Disable debugging via Redis

Forces debugging to be disabled for the customer

### Example
```java
// Import classes:
//import io.swagger.client.api.DebuggingApi;

DebuggingApi apiInstance = new DebuggingApi();
String customerId = "customerId_example"; // String | customerId
try {
    apiInstance.disableDebuggerUsingDELETE(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DebuggingApi#disableDebuggerUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="enableDebuggerUsingPOST"></a>
# **enableDebuggerUsingPOST**
> enableDebuggerUsingPOST(customerId)

Enable debugging via Redis

Debugging is only enabled for a limited period of time (default is one hour)

### Example
```java
// Import classes:
//import io.swagger.client.api.DebuggingApi;

DebuggingApi apiInstance = new DebuggingApi();
String customerId = "customerId_example"; // String | customerId
try {
    apiInstance.enableDebuggerUsingPOST(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DebuggingApi#enableDebuggerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

