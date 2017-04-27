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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NewEventRequest {
  
  @SerializedName("category")
  private String category = null;
  @SerializedName("deviceId")
  private String deviceId = null;
  @SerializedName("eventProperties")
  private Object eventProperties = null;
  @SerializedName("eventTimestamp")
  private Long eventTimestamp = null;
  @SerializedName("requestType")
  private String requestType = null;
  @SerializedName("result")
  private String result = null;
  @SerializedName("sendTimestamp")
  private Long sendTimestamp = null;
  @SerializedName("transactionId")
  private String transactionId = null;
  @SerializedName("userId")
  private String userId = null;

  /**
   * The name/type of the transaction
   **/
  @ApiModelProperty(required = true, value = "The name/type of the transaction")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Unique ID of the device triggering the event
   **/
  @ApiModelProperty(value = "Unique ID of the device triggering the event")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted)
   **/
  @ApiModelProperty(value = "A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted)")
  public Object getEventProperties() {
    return eventProperties;
  }
  public void setEventProperties(Object eventProperties) {
    this.eventProperties = eventProperties;
  }

  /**
   * Epoch timestamp <i>in milliseconds</i> of when event itself occurred
   **/
  @ApiModelProperty(required = true, value = "Epoch timestamp <i>in milliseconds</i> of when event itself occurred")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest -> newUser, NewEventRequest -> newEvent,e tc
   **/
  @ApiModelProperty(required = true, value = "Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest -> newUser, NewEventRequest -> newEvent,e tc")
  public String getRequestType() {
    return requestType;
  }
  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  /**
   * The outcome of the transaction. Can be anything from a code to a word to a boolean depending on your neeeds. Ex: success, 200, invalid, insufficient_funds, etc
   **/
  @ApiModelProperty(required = true, value = "The outcome of the transaction. Can be anything from a code to a word to a boolean depending on your neeeds. Ex: success, 200, invalid, insufficient_funds, etc")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * Epoch timestamp <i>in milliseconds</i> of when event was sent to the API
   **/
  @ApiModelProperty(required = true, value = "Epoch timestamp <i>in milliseconds</i> of when event was sent to the API")
  public Long getSendTimestamp() {
    return sendTimestamp;
  }
  public void setSendTimestamp(Long sendTimestamp) {
    this.sendTimestamp = sendTimestamp;
  }

  /**
   * Unique transaction ID
   **/
  @ApiModelProperty(value = "Unique transaction ID")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * Unique ID of the user triggering the event
   **/
  @ApiModelProperty(value = "Unique ID of the user triggering the event")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewEventRequest newEventRequest = (NewEventRequest) o;
    return (this.category == null ? newEventRequest.category == null : this.category.equals(newEventRequest.category)) &&
        (this.deviceId == null ? newEventRequest.deviceId == null : this.deviceId.equals(newEventRequest.deviceId)) &&
        (this.eventProperties == null ? newEventRequest.eventProperties == null : this.eventProperties.equals(newEventRequest.eventProperties)) &&
        (this.eventTimestamp == null ? newEventRequest.eventTimestamp == null : this.eventTimestamp.equals(newEventRequest.eventTimestamp)) &&
        (this.requestType == null ? newEventRequest.requestType == null : this.requestType.equals(newEventRequest.requestType)) &&
        (this.result == null ? newEventRequest.result == null : this.result.equals(newEventRequest.result)) &&
        (this.sendTimestamp == null ? newEventRequest.sendTimestamp == null : this.sendTimestamp.equals(newEventRequest.sendTimestamp)) &&
        (this.transactionId == null ? newEventRequest.transactionId == null : this.transactionId.equals(newEventRequest.transactionId)) &&
        (this.userId == null ? newEventRequest.userId == null : this.userId.equals(newEventRequest.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.deviceId == null ? 0: this.deviceId.hashCode());
    result = 31 * result + (this.eventProperties == null ? 0: this.eventProperties.hashCode());
    result = 31 * result + (this.eventTimestamp == null ? 0: this.eventTimestamp.hashCode());
    result = 31 * result + (this.requestType == null ? 0: this.requestType.hashCode());
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    result = 31 * result + (this.sendTimestamp == null ? 0: this.sendTimestamp.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewEventRequest {\n");
    
    sb.append("  category: ").append(category).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  eventProperties: ").append(eventProperties).append("\n");
    sb.append("  eventTimestamp: ").append(eventTimestamp).append("\n");
    sb.append("  requestType: ").append(requestType).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  sendTimestamp: ").append(sendTimestamp).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
