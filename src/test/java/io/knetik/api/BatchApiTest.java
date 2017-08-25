package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.BatchRequestResult;
import io.knetik.model.DataCollectorBatchRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchApi
 */
public class BatchApiTest {

    private BatchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BatchApi.class);
    }

    /**
     * Submit a batch of requests as an array of input models
     *
     * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest -&gt; someType (DataCollectorNewUserRequest -&gt; newUser, DataCollectorNewDeviceRequest -&gt; newDevice, etc). If any invalid requests are detected in the batch, a HTTP 207 (Multi-Status) will be returned and the body will contain the status of each of the requests, in the order in which they were submitted, with detailed error messages and the JSON of the request returned for any invalid requests.
     */
    @Test
    public void submitBatchTest() {
        String customerId = null;
        DataCollectorBatchRequest batchRequest = null;
        // List<BatchRequestResult> response = api.submitBatch(customerId, batchRequest);

        // TODO: test validations
    }
}
