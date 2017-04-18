
# DataCollectorUpdateCollectionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **Double** | Final balance after the transaction | 
**balanceModification** | **Double** | The amount changed (delta) in the transaction | 
**currency** | **Boolean** | Whether the unit being updated is a currency unit or not | 
**deviceId** | **String** | Unique ID of the device triggering the event |  [optional]
**eventProperties** | **Object** | A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted) |  [optional]
**eventTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event itself occurred | 
**name** | **String** | Name of the unit/collection/currency being updated | 
**requestType** | **String** | Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest , newUser, NewEventRequest , newEvent,e tc | 
**sendTimestamp** | **Long** | Epoch timestamp &lt;i&gt;in milliseconds&lt;/i&gt; of when event was sent to the API | 
**userId** | **String** | Unique ID of the new device | 



