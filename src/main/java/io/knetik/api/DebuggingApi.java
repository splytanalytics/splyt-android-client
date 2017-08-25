package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DebuggingApi {
  /**
   * Disable debugging via Redis
   * Forces debugging to be disabled for the customer
   * @param customerId ID of the customer (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("v2/_debug/{customerId}")
  Call<Void> disableDebugger(
    @retrofit2.http.Path("customerId") String customerId
  );

  /**
   * Enable debugging via Redis
   * Debugging is only enabled for a limited period of time (default is one hour)
   * @param customerId ID of the customer (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/_debug/{customerId}")
  Call<Void> enableDebugger(
    @retrofit2.http.Path("customerId") String customerId
  );

}
