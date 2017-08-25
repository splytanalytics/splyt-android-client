package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.BatchRequestResult;
import io.knetik.model.DataCollectorBatchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BatchApi {
  /**
   * Submit a batch of requests as an array of input models
   * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest -&gt; someType (DataCollectorNewUserRequest -&gt; newUser, DataCollectorNewDeviceRequest -&gt; newDevice, etc). If any invalid requests are detected in the batch, a HTTP 207 (Multi-Status) will be returned and the body will contain the status of each of the requests, in the order in which they were submitted, with detailed error messages and the JSON of the request returned for any invalid requests.
   * @param customerId customerId (required)
   * @param batchRequest The batch of requests to submit (optional)
   * @return Call&lt;List&lt;BatchRequestResult&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/batch")
  Call<List<BatchRequestResult>> submitBatch(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorBatchRequest batchRequest
  );

}
