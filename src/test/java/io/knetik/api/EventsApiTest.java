package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.NewEventRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private EventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EventsApi.class);
    }

    /**
     * Creates a single event (a transaction with no duration)
     *
     * 
     */
    @Test
    public void createEventTest() {
        String customerId = null;
        NewEventRequest request = null;
        // Void response = api.createEvent(customerId, request);

        // TODO: test validations
    }
}
