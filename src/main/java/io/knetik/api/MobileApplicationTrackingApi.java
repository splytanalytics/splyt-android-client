package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.DataCollectorTuneRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MobileApplicationTrackingApi {
  /**
   * Submit mobile application tracking data for Tune applications
   * 
   * @param customerId customerId (required)
   * @param request Tune campaign tracking information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/tune")
  Call<Void> submitTuneRequest(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorTuneRequest request
  );

}
