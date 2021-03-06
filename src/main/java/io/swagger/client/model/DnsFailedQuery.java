/*
 * NSX-T Manager API
 * VMware NSX-T Manager REST API
 *
 * OpenAPI spec version: 2.5.1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The summary of the failed DNS query. The query result represents a full query chain from client VM to dns forwarder, and upstream server if no forwarder cache was hit. 
 */
@Schema(description = "The summary of the failed DNS query. The query result represents a full query chain from client VM to dns forwarder, and upstream server if no forwarder cache was hit. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DnsFailedQuery {
  @SerializedName("time_spent")
  private Long timeSpent = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("client_ip")
  private String clientIp = null;

  @SerializedName("upstream_server_ip")
  private String upstreamServerIp = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("error_type")
  private String errorType = null;

  @SerializedName("source_ip")
  private String sourceIp = null;

  @SerializedName("forwarder_ip")
  private String forwarderIp = null;

  public DnsFailedQuery timeSpent(Long timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * The time the query took before it got a failed answer, in ms.
   * @return timeSpent
  **/
  @Schema(description = "The time the query took before it got a failed answer, in ms.")
  public Long getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Long timeSpent) {
    this.timeSpent = timeSpent;
  }

  public DnsFailedQuery recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * The record type be queried, e.g. A, CNAME, SOA, etc.
   * @return recordType
  **/
  @Schema(description = "The record type be queried, e.g. A, CNAME, SOA, etc.")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public DnsFailedQuery clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * The client host ip address from which the query was issued. 
   * @return clientIp
  **/
  @Schema(description = "The client host ip address from which the query was issued. ")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public DnsFailedQuery upstreamServerIp(String upstreamServerIp) {
    this.upstreamServerIp = upstreamServerIp;
    return this;
  }

   /**
   * The upstream server ip address to which the query was forwarded. If the query could not be serviced from the DNS forwarder cache, this property will contain the IP address of the DNS server that serviced the request. If the request was serviced from the cache, this property will be absent. 
   * @return upstreamServerIp
  **/
  @Schema(description = "The upstream server ip address to which the query was forwarded. If the query could not be serviced from the DNS forwarder cache, this property will contain the IP address of the DNS server that serviced the request. If the request was serviced from the cache, this property will be absent. ")
  public String getUpstreamServerIp() {
    return upstreamServerIp;
  }

  public void setUpstreamServerIp(String upstreamServerIp) {
    this.upstreamServerIp = upstreamServerIp;
  }

  public DnsFailedQuery errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The detailed error message of the failed query, if any.
   * @return errorMessage
  **/
  @Schema(description = "The detailed error message of the failed query, if any.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DnsFailedQuery address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address be queried, can be a FQDN or an ip address.
   * @return address
  **/
  @Schema(description = "The address be queried, can be a FQDN or an ip address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DnsFailedQuery timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the request, in YYYY-MM-DD HH:MM:SS.zzz format.
   * @return timestamp
  **/
  @Schema(required = true, description = "Timestamp of the request, in YYYY-MM-DD HH:MM:SS.zzz format.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public DnsFailedQuery errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * The type of the query failure, e.g. NXDOMAIN, etc.
   * @return errorType
  **/
  @Schema(description = "The type of the query failure, e.g. NXDOMAIN, etc.")
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public DnsFailedQuery sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * The source ip address that is used to forward a query to an upstream server. 
   * @return sourceIp
  **/
  @Schema(description = "The source ip address that is used to forward a query to an upstream server. ")
  public String getSourceIp() {
    return sourceIp;
  }

  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }

  public DnsFailedQuery forwarderIp(String forwarderIp) {
    this.forwarderIp = forwarderIp;
    return this;
  }

   /**
   * The DNS forwarder ip address to which the query was first received. 
   * @return forwarderIp
  **/
  @Schema(description = "The DNS forwarder ip address to which the query was first received. ")
  public String getForwarderIp() {
    return forwarderIp;
  }

  public void setForwarderIp(String forwarderIp) {
    this.forwarderIp = forwarderIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsFailedQuery dnsFailedQuery = (DnsFailedQuery) o;
    return Objects.equals(this.timeSpent, dnsFailedQuery.timeSpent) &&
        Objects.equals(this.recordType, dnsFailedQuery.recordType) &&
        Objects.equals(this.clientIp, dnsFailedQuery.clientIp) &&
        Objects.equals(this.upstreamServerIp, dnsFailedQuery.upstreamServerIp) &&
        Objects.equals(this.errorMessage, dnsFailedQuery.errorMessage) &&
        Objects.equals(this.address, dnsFailedQuery.address) &&
        Objects.equals(this.timestamp, dnsFailedQuery.timestamp) &&
        Objects.equals(this.errorType, dnsFailedQuery.errorType) &&
        Objects.equals(this.sourceIp, dnsFailedQuery.sourceIp) &&
        Objects.equals(this.forwarderIp, dnsFailedQuery.forwarderIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSpent, recordType, clientIp, upstreamServerIp, errorMessage, address, timestamp, errorType, sourceIp, forwarderIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsFailedQuery {\n");
    
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    upstreamServerIp: ").append(toIndentedString(upstreamServerIp)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    forwarderIp: ").append(toIndentedString(forwarderIp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
