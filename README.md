# splyt-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.knetik</groupId>
    <artifactId>splyt-android-client</artifactId>
    <version>3.0.4</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.knetik:splyt-android-client:3.0.4"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/splyt-android-client-3.0.4.jar
* target/lib/*.jar

## Getting Started 

 KnetikCloud (JSAPI) uses a strict Oauth 2.0 implementation with the following grant types: 

* **Password grant**: Used for user authentication, usually from an unsecured web or mobile client when a fully authenticated user account is required to perform actions. ex: 

```curl 
POST /oauth/token?grant_type=password&client_id=web&username=jdoe&password=68a4sd3sd
 ``` 

* **Client credentials grant**: 
 Used for server authentication or secured clients when the secret key cannot be discovered. This kind of grant is typically used for administrative tasks on the application itself or to access other user's account information. 

```curl 
POST /oauth/token grant_type=client_credentials&client_id=server-client-id&client_secret=1s31dfas65d4f3sa651c3s54f 
```  

The endpoint will return a response containing the authentication token as follows: 
```json: 
{"access_token":"25a0659c-6f4a-40bd-950e-0ba4af7acf0f","token_type":"bearer","expires_in":2145660769,"scope":"write read"}
``` 

Use the provided access_token in sub-sequent requests to authenticate (see code below). Make sure you refresh your token before it expires to avoid having to re-authenticate.

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.BatchApi;

public class BatchApiExample {

    public static void main(String[] args) {
        BatchApi apiInstance = new BatchApi();
        DataCollectorBatchRequest batchRequest = new DataCollectorBatchRequest(); // DataCollectorBatchRequest | batchRequest
        String customerId = "customerId_example"; // String | customerId
        try {
            apiInstance.submitBatch(batchRequest, customerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#submitBatch");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BatchApi* | [**submitBatch**](docs/BatchApi.md#submitBatch) | **POST** /v2/batch | Submit a batch of requests as an array of input models
*DebuggingApi* | [**disableDebugger**](docs/DebuggingApi.md#disableDebugger) | **DELETE** /v2/_debug/{customerId} | Disable debugging via Redis
*DebuggingApi* | [**enableDebugger**](docs/DebuggingApi.md#enableDebugger) | **POST** /v2/_debug/{customerId} | Enable debugging via Redis
*DevicesApi* | [**newDevice**](docs/DevicesApi.md#newDevice) | **POST** /v2/devices | Submit a new device event
*DevicesApi* | [**updateDeviceState**](docs/DevicesApi.md#updateDeviceState) | **PUT** /v2/devices/{id} | Updates the state parameters for the given device
*EventsApi* | [**createEvent**](docs/EventsApi.md#createEvent) | **POST** /v2/events | Creates a single event (a transaction with no duration)
*MobileApplicationTrackingApi* | [**submitTuneRequest**](docs/MobileApplicationTrackingApi.md#submitTuneRequest) | **POST** /v2/tune | Submit mobile application tracking data for Tune applications
*TransactionsApi* | [**beginTransaction**](docs/TransactionsApi.md#beginTransaction) | **POST** /v2/transactions | Begins a new transaction
*TransactionsApi* | [**endTransaction**](docs/TransactionsApi.md#endTransaction) | **PUT** /v2/transactions/{id}/end | Ends the transaction
*TransactionsApi* | [**updateCollection**](docs/TransactionsApi.md#updateCollection) | **POST** /v2/collections | Creates and finalizes a collection of transaction information
*TransactionsApi* | [**updateTransaction**](docs/TransactionsApi.md#updateTransaction) | **PUT** /v2/transactions/{id} | Updates the progress for the given transaction
*UsersApi* | [**newUser**](docs/UsersApi.md#newUser) | **POST** /v2/users | Submit a new user event
*UsersApi* | [**updateUserState**](docs/UsersApi.md#updateUserState) | **PUT** /v2/users/{id} | Updates the entity state for the given user


## Documentation for Models

 - [DataCollectorBaseRequest](docs/DataCollectorBaseRequest.md)
 - [DataCollectorBatchRequest](docs/DataCollectorBatchRequest.md)
 - [DataCollectorBeginTransactionRequest](docs/DataCollectorBeginTransactionRequest.md)
 - [DataCollectorEndTransactionRequest](docs/DataCollectorEndTransactionRequest.md)
 - [DataCollectorNewDeviceRequest](docs/DataCollectorNewDeviceRequest.md)
 - [DataCollectorNewUserRequest](docs/DataCollectorNewUserRequest.md)
 - [DataCollectorTuneRequest](docs/DataCollectorTuneRequest.md)
 - [DataCollectorUpdateCollectionRequest](docs/DataCollectorUpdateCollectionRequest.md)
 - [DataCollectorUpdateDeviceStateRequest](docs/DataCollectorUpdateDeviceStateRequest.md)
 - [DataCollectorUpdateTransactionRequest](docs/DataCollectorUpdateTransactionRequest.md)
 - [DataCollectorUpdateUserStateRequest](docs/DataCollectorUpdateUserStateRequest.md)
 - [NewEventRequest](docs/NewEventRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@knetik.com

