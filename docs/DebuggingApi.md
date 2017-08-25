# DebuggingApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableDebugger**](DebuggingApi.md#disableDebugger) | **DELETE** v2/_debug/{customerId} | Disable debugging via Redis
[**enableDebugger**](DebuggingApi.md#enableDebugger) | **POST** v2/_debug/{customerId} | Enable debugging via Redis


<a name="disableDebugger"></a>
# **disableDebugger**
> Void disableDebugger(customerId)

Disable debugging via Redis

Forces debugging to be disabled for the customer

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.DebuggingApi;


DebuggingApi apiInstance = new DebuggingApi();
String customerId = "customerId_example"; // String | ID of the customer
try {
    Void result = apiInstance.disableDebugger(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebuggingApi#disableDebugger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| ID of the customer |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="enableDebugger"></a>
# **enableDebugger**
> Void enableDebugger(customerId)

Enable debugging via Redis

Debugging is only enabled for a limited period of time (default is one hour)

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.DebuggingApi;


DebuggingApi apiInstance = new DebuggingApi();
String customerId = "customerId_example"; // String | ID of the customer
try {
    Void result = apiInstance.enableDebugger(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebuggingApi#enableDebugger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| ID of the customer |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

