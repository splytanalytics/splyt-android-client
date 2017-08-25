package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.DataCollectorNewUserRequest;
import io.knetik.model.DataCollectorUpdateUserStateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersApi {
  /**
   * Submit a new user event
   * Declares to the Knetik.io platform that the user is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the user in the Knetik.io platform is examined to determine if the user was previously declared as new and, if so, the user information is not updated in the Knetik.io platform.
   * @param customerId customerId (required)
   * @param request New user information (optional)
   * @param checked Flag indicating whether the user state should be checked before updating the state in the Knetik.io platform (optional, default to false)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/users")
  Call<Void> newUser(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorNewUserRequest request, @retrofit2.http.Query("checked") Boolean checked
  );

  /**
   * Updates the entity state for the given user
   * 
   * @param id ID of the user for whom state is being updated (required)
   * @param customerId customerId (required)
   * @param request Updated user state information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("v2/users/{id}")
  Call<Void> updateUserState(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorUpdateUserStateRequest request
  );

}
