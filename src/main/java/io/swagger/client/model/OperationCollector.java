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
 * The operation collector is defined to receive stats from hosts. (eg. vRNI-collector collects all the system metrics)
 */
@Schema(description = "The operation collector is defined to receive stats from hosts. (eg. vRNI-collector collects all the system metrics)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class OperationCollector {
  @SerializedName("collector_port")
  private Integer collectorPort = null;

  @SerializedName("collector_ip")
  private String collectorIp = null;

  public OperationCollector collectorPort(Integer collectorPort) {
    this.collectorPort = collectorPort;
    return this;
  }

   /**
   * Port for the operation collector.
   * minimum: 0
   * maximum: 65535
   * @return collectorPort
  **/
  @Schema(required = true, description = "Port for the operation collector.")
  public Integer getCollectorPort() {
    return collectorPort;
  }

  public void setCollectorPort(Integer collectorPort) {
    this.collectorPort = collectorPort;
  }

  public OperationCollector collectorIp(String collectorIp) {
    this.collectorIp = collectorIp;
    return this;
  }

   /**
   * IP address for the operation collector.
   * @return collectorIp
  **/
  @Schema(required = true, description = "IP address for the operation collector.")
  public String getCollectorIp() {
    return collectorIp;
  }

  public void setCollectorIp(String collectorIp) {
    this.collectorIp = collectorIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationCollector operationCollector = (OperationCollector) o;
    return Objects.equals(this.collectorPort, operationCollector.collectorPort) &&
        Objects.equals(this.collectorIp, operationCollector.collectorIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorPort, collectorIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationCollector {\n");
    
    sb.append("    collectorPort: ").append(toIndentedString(collectorPort)).append("\n");
    sb.append("    collectorIp: ").append(toIndentedString(collectorIp)).append("\n");
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