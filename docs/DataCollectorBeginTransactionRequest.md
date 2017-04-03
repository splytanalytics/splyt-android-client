
# DataCollectorBeginTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | The name/type of the transaction | 
**deviceId** | **String** | Unique ID of the device triggering the event |  [optional]
**eventProperties** | **Object** | A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted) |  [optional]
**eventTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event itself occurred | 
**requestType** | **String** | Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest -&gt; newUser, NewEventRequest -&gt; newEvent,e tc | 
**sendTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event was sent to the API | 
**timeout** | **Integer** | Timeout (in seconds) for the transaction |  [optional]
**timeoutMode** | [**TimeoutModeEnum**](#TimeoutModeEnum) | Timeout mode for the transaction. With TXN, the timeout is reset when an update is posted to the same transaction. With ANY, the timeout is reset when an update is posted for any transaction w/ the same user/device |  [optional]
**transactionId** | **String** | Unique transaction ID |  [optional]
**userId** | **String** | Unique ID of the user triggering the event |  [optional]


<a name="TimeoutModeEnum"></a>
## Enum: TimeoutModeEnum
Name | Value
---- | -----



