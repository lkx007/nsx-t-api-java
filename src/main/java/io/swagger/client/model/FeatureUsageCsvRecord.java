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
import io.swagger.client.model.CsvRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FeatureUsageCsvRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FeatureUsageCsvRecord extends CsvRecord {
  @SerializedName("ccu_usage_count")
  private Long ccuUsageCount = null;

  @SerializedName("vm_usage_count")
  private Long vmUsageCount = null;

  @SerializedName("vcpu_usage_count")
  private Long vcpuUsageCount = null;

  @SerializedName("cpu_usage_count")
  private Long cpuUsageCount = null;

  @SerializedName("feature")
  private String feature = null;

  @SerializedName("core_usage_count")
  private Long coreUsageCount = null;

   /**
   * count of number of concurrent users
   * @return ccuUsageCount
  **/
  @Schema(description = "count of number of concurrent users")
  public Long getCcuUsageCount() {
    return ccuUsageCount;
  }

   /**
   * count of number of vms used by this feature
   * @return vmUsageCount
  **/
  @Schema(description = "count of number of vms used by this feature")
  public Long getVmUsageCount() {
    return vmUsageCount;
  }

   /**
   * count of number of vcpus of public cloud VMs
   * @return vcpuUsageCount
  **/
  @Schema(description = "count of number of vcpus of public cloud VMs")
  public Long getVcpuUsageCount() {
    return vcpuUsageCount;
  }

   /**
   * count of number of cpu sockets used by this feature
   * @return cpuUsageCount
  **/
  @Schema(description = "count of number of cpu sockets used by this feature")
  public Long getCpuUsageCount() {
    return cpuUsageCount;
  }

   /**
   * name of the feature
   * @return feature
  **/
  @Schema(description = "name of the feature")
  public String getFeature() {
    return feature;
  }

   /**
   * Number of CPU cores used by this feature
   * @return coreUsageCount
  **/
  @Schema(description = "Number of CPU cores used by this feature")
  public Long getCoreUsageCount() {
    return coreUsageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureUsageCsvRecord featureUsageCsvRecord = (FeatureUsageCsvRecord) o;
    return Objects.equals(this.ccuUsageCount, featureUsageCsvRecord.ccuUsageCount) &&
        Objects.equals(this.vmUsageCount, featureUsageCsvRecord.vmUsageCount) &&
        Objects.equals(this.vcpuUsageCount, featureUsageCsvRecord.vcpuUsageCount) &&
        Objects.equals(this.cpuUsageCount, featureUsageCsvRecord.cpuUsageCount) &&
        Objects.equals(this.feature, featureUsageCsvRecord.feature) &&
        Objects.equals(this.coreUsageCount, featureUsageCsvRecord.coreUsageCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccuUsageCount, vmUsageCount, vcpuUsageCount, cpuUsageCount, feature, coreUsageCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureUsageCsvRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ccuUsageCount: ").append(toIndentedString(ccuUsageCount)).append("\n");
    sb.append("    vmUsageCount: ").append(toIndentedString(vmUsageCount)).append("\n");
    sb.append("    vcpuUsageCount: ").append(toIndentedString(vcpuUsageCount)).append("\n");
    sb.append("    cpuUsageCount: ").append(toIndentedString(cpuUsageCount)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    coreUsageCount: ").append(toIndentedString(coreUsageCount)).append("\n");
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