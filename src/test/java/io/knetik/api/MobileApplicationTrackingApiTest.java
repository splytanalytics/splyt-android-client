package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.DataCollectorTuneRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MobileApplicationTrackingApi
 */
public class MobileApplicationTrackingApiTest {

    private MobileApplicationTrackingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MobileApplicationTrackingApi.class);
    }

    /**
     * Submit mobile application tracking data for Tune applications
     *
     * 
     */
    @Test
    public void submitTuneRequestTest() {
        String customerId = null;
        DataCollectorTuneRequest request = null;
        // Void response = api.submitTuneRequest(customerId, request);

        // TODO: test validations
    }
}
