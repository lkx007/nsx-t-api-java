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
 * Traffic statistics for IPSec VPN IKE session. Note - Not supported in this release.
 */
@Schema(description = "Traffic statistics for IPSec VPN IKE session. Note - Not supported in this release.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNIKETrafficStatistics {
  @SerializedName("packets_out")
  private Long packetsOut = null;

  @SerializedName("fail_count")
  private Long failCount = null;

  @SerializedName("packets_in")
  private Long packetsIn = null;

  @SerializedName("bytes_out")
  private Long bytesOut = null;

  @SerializedName("bytes_in")
  private Long bytesIn = null;

   /**
   * Number of packets out.
   * @return packetsOut
  **/
  @Schema(description = "Number of packets out.")
  public Long getPacketsOut() {
    return packetsOut;
  }

   /**
   * Fail count.
   * @return failCount
  **/
  @Schema(description = "Fail count.")
  public Long getFailCount() {
    return failCount;
  }

   /**
   * Number of packets in.
   * @return packetsIn
  **/
  @Schema(description = "Number of packets in.")
  public Long getPacketsIn() {
    return packetsIn;
  }

   /**
   * Number of bytes out.
   * @return bytesOut
  **/
  @Schema(description = "Number of bytes out.")
  public Long getBytesOut() {
    return bytesOut;
  }

   /**
   * Number of bytes in.
   * @return bytesIn
  **/
  @Schema(description = "Number of bytes in.")
  public Long getBytesIn() {
    return bytesIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNIKETrafficStatistics ipSecVPNIKETrafficStatistics = (IPSecVPNIKETrafficStatistics) o;
    return Objects.equals(this.packetsOut, ipSecVPNIKETrafficStatistics.packetsOut) &&
        Objects.equals(this.failCount, ipSecVPNIKETrafficStatistics.failCount) &&
        Objects.equals(this.packetsIn, ipSecVPNIKETrafficStatistics.packetsIn) &&
        Objects.equals(this.bytesOut, ipSecVPNIKETrafficStatistics.bytesOut) &&
        Objects.equals(this.bytesIn, ipSecVPNIKETrafficStatistics.bytesIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packetsOut, failCount, packetsIn, bytesOut, bytesIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNIKETrafficStatistics {\n");
    
    sb.append("    packetsOut: ").append(toIndentedString(packetsOut)).append("\n");
    sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
    sb.append("    packetsIn: ").append(toIndentedString(packetsIn)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
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
