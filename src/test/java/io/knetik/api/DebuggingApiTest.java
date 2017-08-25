package io.knetik.api;

import io.knetik.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DebuggingApi
 */
public class DebuggingApiTest {

    private DebuggingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DebuggingApi.class);
    }

    /**
     * Disable debugging via Redis
     *
     * Forces debugging to be disabled for the customer
     */
    @Test
    public void disableDebuggerTest() {
        String customerId = null;
        // Void response = api.disableDebugger(customerId);

        // TODO: test validations
    }
    /**
     * Enable debugging via Redis
     *
     * Debugging is only enabled for a limited period of time (default is one hour)
     */
    @Test
    public void enableDebuggerTest() {
        String customerId = null;
        // Void response = api.enableDebugger(customerId);

        // TODO: test validations
    }
}
