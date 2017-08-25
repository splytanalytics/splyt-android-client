
# DataCollectorBeginTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | **Integer** | Timeout (in seconds) for the transaction |  [optional]
**timeoutMode** | [**TimeoutModeEnum**](#TimeoutModeEnum) | Timeout mode for the transaction. With TXN, the timeout is reset when an update is posted to the same transaction. With ANY, the timeout is reset when an update is posted for any transaction w/ the same user/device |  [optional]
**transactionId** | **String** | Unique transaction ID |  [optional]
**category** | **String** | The name/type of the transaction | 


<a name="TimeoutModeEnum"></a>
## Enum: TimeoutModeEnum
Name | Value
---- | -----
TXN | &quot;TXN&quot;
ANY | &quot;ANY&quot;



