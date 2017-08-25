package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.DataCollectorNewDeviceRequest;
import io.knetik.model.DataCollectorUpdateDeviceStateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesApi {
  /**
   * Submit a new device event
   * Declares to the Knetik.io platform that a device is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the device in the Knetik.io platform is examined to determine if the device was previously declared as new and, if so, the device information is not updated in the Knetik.io platform.
   * @param customerId customerId (required)
   * @param request New device information (optional)
   * @param checked Flag indicating whether the device state should be checked before updating the state in the Knetik.io platform (optional, default to false)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/devices")
  Call<Void> newDevice(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorNewDeviceRequest request, @retrofit2.http.Query("checked") Boolean checked
  );

  /**
   * Updates the state parameters for the given device
   * 
   * @param id ID of the device for which state information is being updated (required)
   * @param customerId customerId (required)
   * @param request Updated device state information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("v2/devices/{id}")
  Call<Void> updateDeviceState(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorUpdateDeviceStateRequest request
  );

}
