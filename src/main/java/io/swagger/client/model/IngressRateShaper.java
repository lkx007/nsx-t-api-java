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
import io.swagger.client.model.QosBaseRateShaper;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A shaper that specifies ingress rate properties in Mb/s
 */
@Schema(description = "A shaper that specifies ingress rate properties in Mb/s")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IngressRateShaper extends QosBaseRateShaper {
  @SerializedName("average_bandwidth_mbps")
  private Integer averageBandwidthMbps = 0;

  @SerializedName("peak_bandwidth_mbps")
  private Integer peakBandwidthMbps = 0;

  @SerializedName("burst_size_bytes")
  private Integer burstSizeBytes = 0;

  public IngressRateShaper averageBandwidthMbps(Integer averageBandwidthMbps) {
    this.averageBandwidthMbps = averageBandwidthMbps;
    return this;
  }

   /**
   * Average bandwidth in Mb/s
   * minimum: 0
   * @return averageBandwidthMbps
  **/
  @Schema(description = "Average bandwidth in Mb/s")
  public Integer getAverageBandwidthMbps() {
    return averageBandwidthMbps;
  }

  public void setAverageBandwidthMbps(Integer averageBandwidthMbps) {
    this.averageBandwidthMbps = averageBandwidthMbps;
  }

  public IngressRateShaper peakBandwidthMbps(Integer peakBandwidthMbps) {
    this.peakBandwidthMbps = peakBandwidthMbps;
    return this;
  }

   /**
   * Peak bandwidth in Mb/s
   * minimum: 0
   * @return peakBandwidthMbps
  **/
  @Schema(description = "Peak bandwidth in Mb/s")
  public Integer getPeakBandwidthMbps() {
    return peakBandwidthMbps;
  }

  public void setPeakBandwidthMbps(Integer peakBandwidthMbps) {
    this.peakBandwidthMbps = peakBandwidthMbps;
  }

  public IngressRateShaper burstSizeBytes(Integer burstSizeBytes) {
    this.burstSizeBytes = burstSizeBytes;
    return this;
  }

   /**
   * Burst size in bytes
   * minimum: 0
   * @return burstSizeBytes
  **/
  @Schema(description = "Burst size in bytes")
  public Integer getBurstSizeBytes() {
    return burstSizeBytes;
  }

  public void setBurstSizeBytes(Integer burstSizeBytes) {
    this.burstSizeBytes = burstSizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngressRateShaper ingressRateShaper = (IngressRateShaper) o;
    return Objects.equals(this.averageBandwidthMbps, ingressRateShaper.averageBandwidthMbps) &&
        Objects.equals(this.peakBandwidthMbps, ingressRateShaper.peakBandwidthMbps) &&
        Objects.equals(this.burstSizeBytes, ingressRateShaper.burstSizeBytes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageBandwidthMbps, peakBandwidthMbps, burstSizeBytes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngressRateShaper {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    averageBandwidthMbps: ").append(toIndentedString(averageBandwidthMbps)).append("\n");
    sb.append("    peakBandwidthMbps: ").append(toIndentedString(peakBandwidthMbps)).append("\n");
    sb.append("    burstSizeBytes: ").append(toIndentedString(burstSizeBytes)).append("\n");
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
