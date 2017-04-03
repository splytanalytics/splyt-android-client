# MobileApplicationTrackingApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleTuneRequestUsingPOST**](MobileApplicationTrackingApi.md#handleTuneRequestUsingPOST) | **POST** /v2/tune | Submit mobile application tracking data for Tune applications


<a name="handleTuneRequestUsingPOST"></a>
# **handleTuneRequestUsingPOST**
> handleTuneRequestUsingPOST(customerId, request)

Submit mobile application tracking data for Tune applications

### Example
```java
// Import classes:
//import io.swagger.client.api.MobileApplicationTrackingApi;

MobileApplicationTrackingApi apiInstance = new MobileApplicationTrackingApi();
String customerId = "customerId_example"; // String | customerId
DataCollectorTuneRequest request = new DataCollectorTuneRequest(); // DataCollectorTuneRequest | Tune campaign tracking information
try {
    apiInstance.handleTuneRequestUsingPOST(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileApplicationTrackingApi#handleTuneRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorTuneRequest**](DataCollectorTuneRequest.md)| Tune campaign tracking information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

