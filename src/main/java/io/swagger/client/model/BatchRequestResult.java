/**
 * Knetik.io Data Collector REST API
 * <p>Use this API to send application data to Knetik.io including user/device information and transactional events.</p> <p>   Please consult the <a href=\"/doc\">official user documentation</a> to find out how to send data, and how this data is used. <p></p> <h2>Notes</h2> <br> New more ReSTful implementation of the telemetry data collection service. Legacy clients can still use the old API format, but we strongly recommend switching over to this new format. Navigate to the legacy documentation using the dropdown at the top of this page. <p></p> <h2>User IDs and Device IDs</h2> <br> Knetik.io can uniquely associate state, events and transactions to users and/or devices for your application. In order to accomplish this, each API call takes userId and deviceId as parameters in the request object. At least one of these must be provided in the request object, except as explicitly noted. <br> <p></p> <h2>Timestamps</h2> <br> All timestamp parameters must be epoch timestamps in milliseconds. <br> <p></p> <h2>Required Request Headers</h2> <br> The following HTTP header values must be provided for each API call: <ul>   <li>     <b>Content-Type: application/json</b>   </li> </ul> <p></p> <h2>Required Query Parameters</h2> <br> All API calls also require the following query parameters to be present on the URL: <ul>   <li>     <b>customer_id:</b> your unique customer ID   </li> </ul> <p></p> <h2>API Responses</h2> <br> If successful, API calls will simply return an HTTP response code of ACCEPTED (202) with no other data. If errors occur, a JSON payload will be returned containing detailed error information and an appropriate HTTP error status code will be provided (as documented in each of the API methods). <br> <p></p>
 *
 * OpenAPI spec version: 2.0
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.DataCollectorBaseRequest;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BatchRequestResult {
  
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("errors")
  private List<String> errors = null;
  @SerializedName("request")
  private DataCollectorBaseRequest request = null;

  /**
   * HTTP response code for the processed request
   **/
  @ApiModelProperty(value = "HTTP response code for the processed request")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Error messages if the request could not be processed
   **/
  @ApiModelProperty(value = "Error messages if the request could not be processed")
  public List<String> getErrors() {
    return errors;
  }
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  /**
   * The request. Will be null if request was successfully processed
   **/
  @ApiModelProperty(value = "The request. Will be null if request was successfully processed")
  public DataCollectorBaseRequest getRequest() {
    return request;
  }
  public void setRequest(DataCollectorBaseRequest request) {
    this.request = request;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestResult batchRequestResult = (BatchRequestResult) o;
    return (this.code == null ? batchRequestResult.code == null : this.code.equals(batchRequestResult.code)) &&
        (this.errors == null ? batchRequestResult.errors == null : this.errors.equals(batchRequestResult.errors)) &&
        (this.request == null ? batchRequestResult.request == null : this.request.equals(batchRequestResult.request));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.errors == null ? 0: this.errors.hashCode());
    result = 31 * result + (this.request == null ? 0: this.request.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestResult {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("  request: ").append(request).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
