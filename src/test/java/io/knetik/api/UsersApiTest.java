package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.DataCollectorNewUserRequest;
import io.knetik.model.DataCollectorUpdateUserStateRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    /**
     * Submit a new user event
     *
     * Declares to the Knetik.io platform that the user is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the user in the Knetik.io platform is examined to determine if the user was previously declared as new and, if so, the user information is not updated in the Knetik.io platform.
     */
    @Test
    public void newUserTest() {
        String customerId = null;
        DataCollectorNewUserRequest request = null;
        Boolean checked = null;
        // Void response = api.newUser(customerId, request, checked);

        // TODO: test validations
    }
    /**
     * Updates the entity state for the given user
     *
     * 
     */
    @Test
    public void updateUserStateTest() {
        String id = null;
        String customerId = null;
        DataCollectorUpdateUserStateRequest request = null;
        // Void response = api.updateUserState(id, customerId, request);

        // TODO: test validations
    }
}
