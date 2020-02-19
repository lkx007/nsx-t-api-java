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
import java.math.BigDecimal;
/**
 * CapacityThreshold
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CapacityThreshold {
  @SerializedName("max_threshold_percentage")
  private BigDecimal maxThresholdPercentage = null;

  /**
   * Indicate the object type for which threshold is to be set. 
   */
  @JsonAdapter(ThresholdTypeEnum.Adapter.class)
  public enum ThresholdTypeEnum {
    NUMBER_OF_LOGICAL_SWITCHES("NUMBER_OF_LOGICAL_SWITCHES"),
    NUMBER_OF_PREPARED_HOSTS("NUMBER_OF_PREPARED_HOSTS"),
    NUMBER_OF_SYSTEM_WIDE_VIFS("NUMBER_OF_SYSTEM_WIDE_VIFS"),
    NUMBER_OF_NSGROUP("NUMBER_OF_NSGROUP"),
    NUMBER_OF_VCENTER_CLUSTERS("NUMBER_OF_VCENTER_CLUSTERS"),
    NUMBER_OF_GI_PROTECTED_HOSTS("NUMBER_OF_GI_PROTECTED_HOSTS"),
    NUMBER_OF_GI_PROTECTED_VMS("NUMBER_OF_GI_PROTECTED_VMS"),
    NUMBER_OF_DFW_RULES("NUMBER_OF_DFW_RULES"),
    NUMBER_OF_DFW_SECTIONS("NUMBER_OF_DFW_SECTIONS"),
    NUMBER_OF_IPSETS("NUMBER_OF_IPSETS"),
    NUMBER_OF_GROUPS_BASED_ON_IP_SETS("NUMBER_OF_GROUPS_BASED_ON_IP_SETS"),
    NUMBER_OF_LOGICAL_PORTS("NUMBER_OF_LOGICAL_PORTS"),
    NUMBER_OF_EDGE_CLUSTERS("NUMBER_OF_EDGE_CLUSTERS"),
    NUMBER_OF_EDGE_NODES("NUMBER_OF_EDGE_NODES"),
    NUMBER_OF_TIER0_ROUTERS("NUMBER_OF_TIER0_ROUTERS"),
    NUMBER_OF_TIER1_ROUTERS("NUMBER_OF_TIER1_ROUTERS"),
    NUMBER_OF_PREFIX_LIST("NUMBER_OF_PREFIX_LIST"),
    NUMBER_OF_NAT_RULES("NUMBER_OF_NAT_RULES"),
    NUMBER_OF_TIER1_WITH_NAT_RULE("NUMBER_OF_TIER1_WITH_NAT_RULE"),
    NUMBER_OF_DHCP_SERVERS("NUMBER_OF_DHCP_SERVERS"),
    NUMBER_OF_DHCP_IP_POOLS("NUMBER_OF_DHCP_IP_POOLS"),
    NUMBER_OF_ACTIVE_DIRECTORY_GROUPS("NUMBER_OF_ACTIVE_DIRECTORY_GROUPS"),
    NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS("NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS"),
    NUMBER_OF_FIREWALL_SECTIONS("NUMBER_OF_FIREWALL_SECTIONS"),
    NUMBER_OF_FIREWALL_RULES("NUMBER_OF_FIREWALL_RULES"),
    GLOBAL_DEFAULT("GLOBAL_DEFAULT");

    private String value;

    ThresholdTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ThresholdTypeEnum fromValue(String text) {
      for (ThresholdTypeEnum b : ThresholdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ThresholdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThresholdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThresholdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ThresholdTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("threshold_type")
  private ThresholdTypeEnum thresholdType = null;

  @SerializedName("min_threshold_percentage")
  private BigDecimal minThresholdPercentage = null;

  public CapacityThreshold maxThresholdPercentage(BigDecimal maxThresholdPercentage) {
    this.maxThresholdPercentage = maxThresholdPercentage;
    return this;
  }

   /**
   * Set the maximum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as critical. 
   * minimum: 0
   * maximum: 100
   * @return maxThresholdPercentage
  **/
  @Schema(required = true, description = "Set the maximum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as critical. ")
  public BigDecimal getMaxThresholdPercentage() {
    return maxThresholdPercentage;
  }

  public void setMaxThresholdPercentage(BigDecimal maxThresholdPercentage) {
    this.maxThresholdPercentage = maxThresholdPercentage;
  }

  public CapacityThreshold thresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
    return this;
  }

   /**
   * Indicate the object type for which threshold is to be set. 
   * @return thresholdType
  **/
  @Schema(required = true, description = "Indicate the object type for which threshold is to be set. ")
  public ThresholdTypeEnum getThresholdType() {
    return thresholdType;
  }

  public void setThresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
  }

  public CapacityThreshold minThresholdPercentage(BigDecimal minThresholdPercentage) {
    this.minThresholdPercentage = minThresholdPercentage;
    return this;
  }

   /**
   * Set the minimum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as warning. 
   * minimum: 0
   * maximum: 100
   * @return minThresholdPercentage
  **/
  @Schema(required = true, description = "Set the minimum threshold percentage. Specify a value between 0 and 100. Usage percentage above this value is tagged as warning. ")
  public BigDecimal getMinThresholdPercentage() {
    return minThresholdPercentage;
  }

  public void setMinThresholdPercentage(BigDecimal minThresholdPercentage) {
    this.minThresholdPercentage = minThresholdPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityThreshold capacityThreshold = (CapacityThreshold) o;
    return Objects.equals(this.maxThresholdPercentage, capacityThreshold.maxThresholdPercentage) &&
        Objects.equals(this.thresholdType, capacityThreshold.thresholdType) &&
        Objects.equals(this.minThresholdPercentage, capacityThreshold.minThresholdPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxThresholdPercentage, thresholdType, minThresholdPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityThreshold {\n");
    
    sb.append("    maxThresholdPercentage: ").append(toIndentedString(maxThresholdPercentage)).append("\n");
    sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
    sb.append("    minThresholdPercentage: ").append(toIndentedString(minThresholdPercentage)).append("\n");
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
