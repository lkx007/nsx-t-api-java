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
 * SIDataCounter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SIDataCounter {
  @SerializedName("total")
  private Long total = null;

  @SerializedName("multicast_broadcast")
  private Long multicastBroadcast = null;

  @SerializedName("dropped")
  private Long dropped = null;

  public SIDataCounter total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * The total packets or bytes
   * @return total
  **/
  @Schema(required = true, description = "The total packets or bytes")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public SIDataCounter multicastBroadcast(Long multicastBroadcast) {
    this.multicastBroadcast = multicastBroadcast;
    return this;
  }

   /**
   * The multicast and broadcast packets or bytes
   * @return multicastBroadcast
  **/
  @Schema(description = "The multicast and broadcast packets or bytes")
  public Long getMulticastBroadcast() {
    return multicastBroadcast;
  }

  public void setMulticastBroadcast(Long multicastBroadcast) {
    this.multicastBroadcast = multicastBroadcast;
  }

  public SIDataCounter dropped(Long dropped) {
    this.dropped = dropped;
    return this;
  }

   /**
   * The dropped packets or bytes
   * @return dropped
  **/
  @Schema(description = "The dropped packets or bytes")
  public Long getDropped() {
    return dropped;
  }

  public void setDropped(Long dropped) {
    this.dropped = dropped;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIDataCounter siDataCounter = (SIDataCounter) o;
    return Objects.equals(this.total, siDataCounter.total) &&
        Objects.equals(this.multicastBroadcast, siDataCounter.multicastBroadcast) &&
        Objects.equals(this.dropped, siDataCounter.dropped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, multicastBroadcast, dropped);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIDataCounter {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    multicastBroadcast: ").append(toIndentedString(multicastBroadcast)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
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
