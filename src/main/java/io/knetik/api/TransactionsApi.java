package io.knetik.api;

import io.knetik.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.knetik.model.DataCollectorBeginTransactionRequest;
import io.knetik.model.DataCollectorEndTransactionRequest;
import io.knetik.model.DataCollectorUpdateCollectionRequest;
import io.knetik.model.DataCollectorUpdateTransactionRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TransactionsApi {
  /**
   * Begins a new transaction
   * Use the event properties to describe the initial state of the transaction
   * @param customerId customerId (required)
   * @param request Transaction initiation information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/transactions")
  Call<Void> beginTransaction(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorBeginTransactionRequest request
  );

  /**
   * Ends the transaction
   * Submits final transaction state to Knetik.io
   * @param id Unique ID of the transaction being finalized (required)
   * @param customerId customerId (required)
   * @param request Transaction finalization information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("v2/transactions/{id}/end")
  Call<Void> endTransaction(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorEndTransactionRequest request
  );

  /**
   * Creates and finalizes a collection of transaction information
   * This operation basically encapsulates beginTransaction and endTransaction semantics into a single step and is used to update user balance information in Knetik.io
   * @param customerId customerId (required)
   * @param request Collection state information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v2/collections")
  Call<Void> updateCollection(
    @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorUpdateCollectionRequest request
  );

  /**
   * Updates the progress for the given transaction
   * Use the event properties to update the state of the transaction
   * @param id Unique ID of the transaction being updated (required)
   * @param customerId customerId (required)
   * @param request Transaction progress information (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("v2/transactions/{id}")
  Call<Void> updateTransaction(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("customerId") String customerId, @retrofit2.http.Body DataCollectorUpdateTransactionRequest request
  );

}
