package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.DataCollectorNewDeviceRequest;
import io.knetik.model.DataCollectorUpdateDeviceStateRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
public class DevicesApiTest {

    private DevicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesApi.class);
    }

    /**
     * Submit a new device event
     *
     * Declares to the Knetik.io platform that a device is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the device in the Knetik.io platform is examined to determine if the device was previously declared as new and, if so, the device information is not updated in the Knetik.io platform.
     */
    @Test
    public void newDeviceTest() {
        String customerId = null;
        DataCollectorNewDeviceRequest request = null;
        Boolean checked = null;
        // Void response = api.newDevice(customerId, request, checked);

        // TODO: test validations
    }
    /**
     * Updates the state parameters for the given device
     *
     * 
     */
    @Test
    public void updateDeviceStateTest() {
        String id = null;
        String customerId = null;
        DataCollectorUpdateDeviceStateRequest request = null;
        // Void response = api.updateDeviceState(id, customerId, request);

        // TODO: test validations
    }
}
