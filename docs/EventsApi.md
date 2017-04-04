# EventsApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventUsingPOST**](EventsApi.md#createEventUsingPOST) | **POST** /v2/events | Creates a single event (a transaction with no duration)


<a name="createEventUsingPOST"></a>
# **createEventUsingPOST**
> createEventUsingPOST(customerId, request)

Creates a single event (a transaction with no duration)

### Example
```java
// Import classes:
//import io.swagger.client.api.EventsApi;

EventsApi apiInstance = new EventsApi();
String customerId = "customerId_example"; // String | customerId
NewEventRequest request = new NewEventRequest(); // NewEventRequest | Similar to transactions, the details of that event
try {
    apiInstance.createEventUsingPOST(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#createEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**NewEventRequest**](NewEventRequest.md)| Similar to transactions, the details of that event | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

