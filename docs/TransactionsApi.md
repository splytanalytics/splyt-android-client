# TransactionsApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beginTransaction**](TransactionsApi.md#beginTransaction) | **POST** /v2/transactions | Begins a new transaction
[**endTransaction**](TransactionsApi.md#endTransaction) | **PUT** /v2/transactions/{id}/end | Ends the transaction
[**updateCollection**](TransactionsApi.md#updateCollection) | **POST** /v2/collections | Creates and finalizes a collection of transaction information
[**updateTransaction**](TransactionsApi.md#updateTransaction) | **PUT** /v2/transactions/{id} | Updates the progress for the given transaction


<a name="beginTransaction"></a>
# **beginTransaction**
> beginTransaction(customerId, request)

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
    apiInstance.beginTransaction(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#beginTransaction");
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

<a name="endTransaction"></a>
# **endTransaction**
> endTransaction(id, customerId, request)

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
    apiInstance.endTransaction(id, customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#endTransaction");
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

<a name="updateCollection"></a>
# **updateCollection**
> updateCollection(customerId, request)

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
    apiInstance.updateCollection(customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#updateCollection");
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

<a name="updateTransaction"></a>
# **updateTransaction**
> updateTransaction(id, customerId, request)

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
    apiInstance.updateTransaction(id, customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#updateTransaction");
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

