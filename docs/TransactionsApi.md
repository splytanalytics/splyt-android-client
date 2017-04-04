# TransactionsApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beginTransactionUsingPOST**](TransactionsApi.md#beginTransactionUsingPOST) | **POST** /v2/transactions | Begins a new transaction
[**endTransactionUsingPUT**](TransactionsApi.md#endTransactionUsingPUT) | **PUT** /v2/transactions/{id}/end | Ends the transaction
[**updateCollectionUsingPOST**](TransactionsApi.md#updateCollectionUsingPOST) | **POST** /v2/collections | Creates and finalizes a collection of transaction information
[**updateTransactionUsingPUT**](TransactionsApi.md#updateTransactionUsingPUT) | **PUT** /v2/transactions/{id} | Updates the progress for the given transaction


<a name="beginTransactionUsingPOST"></a>
# **beginTransactionUsingPOST**
> beginTransactionUsingPOST(customerId, request)

Begins a new transaction

Use the event properties to describe the initial state of the transaction

### Example
```java
// Import classes:
//import io.swagger.client.api.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String customerId = "customerId_example"; // String | customerId
DataCollectorBeginTransactionRequest request = new DataCollectorBeginTransactionRequest(); // DataCollectorBeginTransactionRequest | Transaction initiation information
try {
    apiInstance.beginTransactionUsingPOST(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#beginTransactionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorBeginTransactionRequest**](DataCollectorBeginTransactionRequest.md)| Transaction initiation information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="endTransactionUsingPUT"></a>
# **endTransactionUsingPUT**
> endTransactionUsingPUT(id, customerId, request)

Ends the transaction

Submits final transaction state to Knetik.io

### Example
```java
// Import classes:
//import io.swagger.client.api.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String id = "id_example"; // String | Unique ID of the transaction being finalized
String customerId = "customerId_example"; // String | customerId
DataCollectorEndTransactionRequest request = new DataCollectorEndTransactionRequest(); // DataCollectorEndTransactionRequest | Transaction finalization information
try {
    apiInstance.endTransactionUsingPUT(id, customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#endTransactionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of the transaction being finalized |
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorEndTransactionRequest**](DataCollectorEndTransactionRequest.md)| Transaction finalization information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCollectionUsingPOST"></a>
# **updateCollectionUsingPOST**
> updateCollectionUsingPOST(customerId, request)

Creates and finalizes a collection of transaction information

This operation basically encapsulates beginTransaction and endTransaction semantics into a single step and is used to update user balance information in Knetik.io

### Example
```java
// Import classes:
//import io.swagger.client.api.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String customerId = "customerId_example"; // String | customerId
DataCollectorUpdateCollectionRequest request = new DataCollectorUpdateCollectionRequest(); // DataCollectorUpdateCollectionRequest | Collection state information
try {
    apiInstance.updateCollectionUsingPOST(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#updateCollectionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorUpdateCollectionRequest**](DataCollectorUpdateCollectionRequest.md)| Collection state information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTransactionUsingPUT"></a>
# **updateTransactionUsingPUT**
> updateTransactionUsingPUT(id, customerId, request)

Updates the progress for the given transaction

Use the event properties to update the state of the transaction

### Example
```java
// Import classes:
//import io.swagger.client.api.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String id = "id_example"; // String | Unique ID of the transaction being updated
String customerId = "customerId_example"; // String | customerId
DataCollectorUpdateTransactionRequest request = new DataCollectorUpdateTransactionRequest(); // DataCollectorUpdateTransactionRequest | Transaction progress information
try {
    apiInstance.updateTransactionUsingPUT(id, customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#updateTransactionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID of the transaction being updated |
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorUpdateTransactionRequest**](DataCollectorUpdateTransactionRequest.md)| Transaction progress information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

