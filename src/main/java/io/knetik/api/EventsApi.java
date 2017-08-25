package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.NewEventRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface EventsApi {
  /**
   * Creates a single event (a transaction with no duration)
   * 
   * @param customerId customerId (required)
   * @param request Similar to transactions, the details of that event (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/events")
  Call<Void> createEvent(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body NewEventRequest request
  );

}
