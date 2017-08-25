# DevicesApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newDevice**](DevicesApi.md#newDevice) | **POST** v2/devices | Submit a new device event
[**updateDeviceState**](DevicesApi.md#updateDeviceState) | **PUT** v2/devices/{id} | Updates the state parameters for the given device


<a name="newDevice"></a>
# **newDevice**
> Void newDevice(customerId, request, checked)

Submit a new device event

Declares to the Knetik.io platform that a device is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the device in the Knetik.io platform is examined to determine if the device was previously declared as new and, if so, the device information is not updated in the Knetik.io platform.

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
String customerId = "customerId_example"; // String | customerId
DataCollectorNewDeviceRequest request = new DataCollectorNewDeviceRequest(); // DataCollectorNewDeviceRequest | New device information
Boolean checked = false; // Boolean | Flag indicating whether the device state should be checked before updating the state in the Knetik.io platform
try {
    Void result = apiInstance.newDevice(customerId, request, checked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#newDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorNewDeviceRequest**](DataCollectorNewDeviceRequest.md)| New device information | [optional]
 **checked** | **Boolean**| Flag indicating whether the device state should be checked before updating the state in the Knetik.io platform | [optional] [default to false]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateDeviceState"></a>
# **updateDeviceState**
> Void updateDeviceState(id, customerId, request)

Updates the state parameters for the given device

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.DevicesApi;


DevicesApi apiInstance = new DevicesApi();
String id = "id_example"; // String | ID of the device for which state information is being updated
String customerId = "customerId_example"; // String | customerId
DataCollectorUpdateDeviceStateRequest request = new DataCollectorUpdateDeviceStateRequest(); // DataCollectorUpdateDeviceStateRequest | Updated device state information
try {
    Void result = apiInstance.updateDeviceState(id, customerId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDeviceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the device for which state information is being updated |
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorUpdateDeviceStateRequest**](DataCollectorUpdateDeviceStateRequest.md)| Updated device state information | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

