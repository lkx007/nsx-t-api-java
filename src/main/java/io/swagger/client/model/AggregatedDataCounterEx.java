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
import io.swagger.client.model.AggregatedDataCounter;
import io.swagger.client.model.DataCounter;
import io.swagger.client.model.MacLearningCounters;
import io.swagger.client.model.PacketsDroppedBySecurity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AggregatedDataCounterEx
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AggregatedDataCounterEx extends AggregatedDataCounter {
  @SerializedName("mac_learning")
  private MacLearningCounters macLearning = null;

  @SerializedName("dropped_by_security_packets")
  private PacketsDroppedBySecurity droppedBySecurityPackets = null;

  public AggregatedDataCounterEx macLearning(MacLearningCounters macLearning) {
    this.macLearning = macLearning;
    return this;
  }

   /**
   * Get macLearning
   * @return macLearning
  **/
  @Schema(description = "")
  public MacLearningCounters getMacLearning() {
    return macLearning;
  }

  public void setMacLearning(MacLearningCounters macLearning) {
    this.macLearning = macLearning;
  }

  public AggregatedDataCounterEx droppedBySecurityPackets(PacketsDroppedBySecurity droppedBySecurityPackets) {
    this.droppedBySecurityPackets = droppedBySecurityPackets;
    return this;
  }

   /**
   * Get droppedBySecurityPackets
   * @return droppedBySecurityPackets
  **/
  @Schema(description = "")
  public PacketsDroppedBySecurity getDroppedBySecurityPackets() {
    return droppedBySecurityPackets;
  }

  public void setDroppedBySecurityPackets(PacketsDroppedBySecurity droppedBySecurityPackets) {
    this.droppedBySecurityPackets = droppedBySecurityPackets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedDataCounterEx aggregatedDataCounterEx = (AggregatedDataCounterEx) o;
    return Objects.equals(this.macLearning, aggregatedDataCounterEx.macLearning) &&
        Objects.equals(this.droppedBySecurityPackets, aggregatedDataCounterEx.droppedBySecurityPackets) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macLearning, droppedBySecurityPackets, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedDataCounterEx {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    macLearning: ").append(toIndentedString(macLearning)).append("\n");
    sb.append("    droppedBySecurityPackets: ").append(toIndentedString(droppedBySecurityPackets)).append("\n");
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