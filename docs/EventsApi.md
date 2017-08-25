# EventsApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEvent**](EventsApi.md#createEvent) | **POST** v2/events | Creates a single event (a transaction with no duration)


<a name="createEvent"></a>
# **createEvent**
> Void createEvent(customerId, request)

Creates a single event (a transaction with no duration)

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String customerId = "customerId_example"; // String | customerId
NewEventRequest request = new NewEventRequest(); // NewEventRequest | Similar to transactions, the details of that event
try {
    Void result = apiInstance.createEvent(customerId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#createEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**NewEventRequest**](NewEventRequest.md)| Similar to transactions, the details of that event | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

