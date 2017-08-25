package io.knetik.api;

import io.knetik.client.ApiClient;
import io.knetik.model.DataCollectorBeginTransactionRequest;
import io.knetik.model.DataCollectorEndTransactionRequest;
import io.knetik.model.DataCollectorUpdateCollectionRequest;
import io.knetik.model.DataCollectorUpdateTransactionRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
public class TransactionsApiTest {

    private TransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TransactionsApi.class);
    }

    /**
     * Begins a new transaction
     *
     * Use the event properties to describe the initial state of the transaction
     */
    @Test
    public void beginTransactionTest() {
        String customerId = null;
        DataCollectorBeginTransactionRequest request = null;
        // Void response = api.beginTransaction(customerId, request);

        // TODO: test validations
    }
    /**
     * Ends the transaction
     *
     * Submits final transaction state to Knetik.io
     */
    @Test
    public void endTransactionTest() {
        String id = null;
        String customerId = null;
        DataCollectorEndTransactionRequest request = null;
        // Void response = api.endTransaction(id, customerId, request);

        // TODO: test validations
    }
    /**
     * Creates and finalizes a collection of transaction information
     *
     * This operation basically encapsulates beginTransaction and endTransaction semantics into a single step and is used to update user balance information in Knetik.io
     */
    @Test
    public void updateCollectionTest() {
        String customerId = null;
        DataCollectorUpdateCollectionRequest request = null;
        // Void response = api.updateCollection(customerId, request);

        // TODO: test validations
    }
    /**
     * Updates the progress for the given transaction
     *
     * Use the event properties to update the state of the transaction
     */
    @Test
    public void updateTransactionTest() {
        String id = null;
        String customerId = null;
        DataCollectorUpdateTransactionRequest request = null;
        // Void response = api.updateTransaction(id, customerId, request);

        // TODO: test validations
    }
}
