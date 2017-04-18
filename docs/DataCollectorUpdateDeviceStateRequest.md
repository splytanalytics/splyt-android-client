
# DataCollectorUpdateDeviceStateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | Unique ID of the device for which state is being updated | 
**eventProperties** | **Object** | A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted) |  [optional]
**eventTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event itself occurred | 
**requestType** | **String** | Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest , newUser, NewEventRequest , newEvent,e tc | 
**sendTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event was sent to the API | 
**userId** | **String** | Unique ID of the user triggering the event |  [optional]


