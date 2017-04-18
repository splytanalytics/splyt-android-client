
# NewEventRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | The name/type of the transaction | 
**deviceId** | **String** | Unique ID of the device triggering the event |  [optional]
**eventProperties** | **Object** | A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted) |  [optional]
**eventTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event itself occurred | 
**requestType** | **String** | Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest , newUser, NewEventRequest , newEvent,e tc | 
**result** | **String** | The outcome of the transaction. Can be anything from a code to a word to a boolean depending on your neeeds. Ex: success, 200, invalid, insufficient_funds, etc | 
**sendTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event was sent to the API | 
**transactionId** | **String** | Unique transaction ID |  [optional]
**userId** | **String** | Unique ID of the user triggering the event |  [optional]



