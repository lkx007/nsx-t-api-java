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
 * CapacityDashboardUsage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CapacityDashboardUsage {
  @SerializedName("current_usage_count")
  private Long currentUsageCount = null;

  @SerializedName("max_threshold_percentage")
  private BigDecimal maxThresholdPercentage = null;

  @SerializedName("display_name")
  private String displayName = null;

  /**
   * Severity calculated from percentage usage 
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    INFO("INFO"),
    WARNING("WARNING"),
    CRITICAL("CRITICAL"),
    ERROR("ERROR");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("severity")
  private SeverityEnum severity = null;

  @SerializedName("max_supported_count")
  private Long maxSupportedCount = null;

  /**
   * Indicate the object type for which usage is calculated. 
   */
  @JsonAdapter(UsageTypeEnum.Adapter.class)
  public enum UsageTypeEnum {
    LOGICAL_SWITCHES("NUMBER_OF_LOGICAL_SWITCHES"),
    PREPARED_HOSTS("NUMBER_OF_PREPARED_HOSTS"),
    SYSTEM_WIDE_VIFS("NUMBER_OF_SYSTEM_WIDE_VIFS"),
    NSGROUP("NUMBER_OF_NSGROUP"),
    VCENTER_CLUSTERS("NUMBER_OF_VCENTER_CLUSTERS"),
    GI_PROTECTED_HOSTS("NUMBER_OF_GI_PROTECTED_HOSTS"),
    GI_PROTECTED_VMS("NUMBER_OF_GI_PROTECTED_VMS"),
    DFW_RULES("NUMBER_OF_DFW_RULES"),
    DFW_SECTIONS("NUMBER_OF_DFW_SECTIONS"),
    L2_DFW_SECTIONS("NUMBER_OF_L2_DFW_SECTIONS"),
    L3_DFW_SECTIONS("NUMBER_OF_L3_DFW_SECTIONS"),
    L2_DFW_RULES("NUMBER_OF_L2_DFW_RULES"),
    L3_DFW_RULES("NUMBER_OF_L3_DFW_RULES"),
    L3_EDGE_SECTIONS("NUMBER_OF_L3_EDGE_SECTIONS"),
    L3_EDGE_RULES("NUMBER_OF_L3_EDGE_RULES"),
    L3_BRIDGEPORT_SECTIONS("NUMBER_OF_L3_BRIDGEPORT_SECTIONS"),
    L3_BRIDGEPORT_RULES("NUMBER_OF_L3_BRIDGEPORT_RULES"),
    IPSETS("NUMBER_OF_IPSETS"),
    GROUPS_BASED_ON_IP_SETS("NUMBER_OF_GROUPS_BASED_ON_IP_SETS"),
    LOGICAL_PORTS("NUMBER_OF_LOGICAL_PORTS"),
    EDGE_CLUSTERS("NUMBER_OF_EDGE_CLUSTERS"),
    EDGE_NODES("NUMBER_OF_EDGE_NODES"),
    TIER0_ROUTERS("NUMBER_OF_TIER0_ROUTERS"),
    TIER1_ROUTERS("NUMBER_OF_TIER1_ROUTERS"),
    PREFIX_LIST("NUMBER_OF_PREFIX_LIST"),
    NAT_RULES("NUMBER_OF_NAT_RULES"),
    TIER1_WITH_NAT_RULE("NUMBER_OF_TIER1_WITH_NAT_RULE"),
    DHCP_SERVERS("NUMBER_OF_DHCP_SERVERS"),
    DHCP_IP_POOLS("NUMBER_OF_DHCP_IP_POOLS"),
    ACTIVE_DIRECTORY_GROUPS("NUMBER_OF_ACTIVE_DIRECTORY_GROUPS"),
    ACTIVE_DIRECTORY_DOMAINS("NUMBER_OF_ACTIVE_DIRECTORY_DOMAINS"),
    FIREWALL_SECTIONS("NUMBER_OF_FIREWALL_SECTIONS"),
    FIREWALL_RULES("NUMBER_OF_FIREWALL_RULES");

    private String value;

    UsageTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UsageTypeEnum fromValue(String text) {
      for (UsageTypeEnum b : UsageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UsageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UsageTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("usage_type")
  private UsageTypeEnum usageType = null;

  @SerializedName("min_threshold_percentage")
  private BigDecimal minThresholdPercentage = null;

  @SerializedName("current_usage_percentage")
  private BigDecimal currentUsagePercentage = null;

  public CapacityDashboardUsage currentUsageCount(Long currentUsageCount) {
    this.currentUsageCount = currentUsageCount;
    return this;
  }

   /**
   * Indicate the current usage count of object type. 
   * @return currentUsageCount
  **/
  @Schema(required = true, description = "Indicate the current usage count of object type. ")
  public Long getCurrentUsageCount() {
    return currentUsageCount;
  }

  public void setCurrentUsageCount(Long currentUsageCount) {
    this.currentUsageCount = currentUsageCount;
  }

  public CapacityDashboardUsage maxThresholdPercentage(BigDecimal maxThresholdPercentage) {
    this.maxThresholdPercentage = maxThresholdPercentage;
    return this;
  }

   /**
   * This indicates the maximum threshold percentage for object type. 
   * @return maxThresholdPercentage
  **/
  @Schema(required = true, description = "This indicates the maximum threshold percentage for object type. ")
  public BigDecimal getMaxThresholdPercentage() {
    return maxThresholdPercentage;
  }

  public void setMaxThresholdPercentage(BigDecimal maxThresholdPercentage) {
    this.maxThresholdPercentage = maxThresholdPercentage;
  }

  public CapacityDashboardUsage displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for NSX object type. 
   * @return displayName
  **/
  @Schema(required = true, description = "Display name for NSX object type. ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CapacityDashboardUsage severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Severity calculated from percentage usage 
   * @return severity
  **/
  @Schema(required = true, description = "Severity calculated from percentage usage ")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public CapacityDashboardUsage maxSupportedCount(Long maxSupportedCount) {
    this.maxSupportedCount = maxSupportedCount;
    return this;
  }

   /**
   * This is the maximum supported count for object type in consideration. 
   * @return maxSupportedCount
  **/
  @Schema(required = true, description = "This is the maximum supported count for object type in consideration. ")
  public Long getMaxSupportedCount() {
    return maxSupportedCount;
  }

  public void setMaxSupportedCount(Long maxSupportedCount) {
    this.maxSupportedCount = maxSupportedCount;
  }

  public CapacityDashboardUsage usageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
    return this;
  }

   /**
   * Indicate the object type for which usage is calculated. 
   * @return usageType
  **/
  @Schema(required = true, description = "Indicate the object type for which usage is calculated. ")
  public UsageTypeEnum getUsageType() {
    return usageType;
  }

  public void setUsageType(UsageTypeEnum usageType) {
    this.usageType = usageType;
  }

  public CapacityDashboardUsage minThresholdPercentage(BigDecimal minThresholdPercentage) {
    this.minThresholdPercentage = minThresholdPercentage;
    return this;
  }

   /**
   * This indicates the minimum threshold percentage for object type. 
   * @return minThresholdPercentage
  **/
  @Schema(required = true, description = "This indicates the minimum threshold percentage for object type. ")
  public BigDecimal getMinThresholdPercentage() {
    return minThresholdPercentage;
  }

  public void setMinThresholdPercentage(BigDecimal minThresholdPercentage) {
    this.minThresholdPercentage = minThresholdPercentage;
  }

  public CapacityDashboardUsage currentUsagePercentage(BigDecimal currentUsagePercentage) {
    this.currentUsagePercentage = currentUsagePercentage;
    return this;
  }

   /**
   * Current usage percentage for object type 
   * @return currentUsagePercentage
  **/
  @Schema(required = true, description = "Current usage percentage for object type ")
  public BigDecimal getCurrentUsagePercentage() {
    return currentUsagePercentage;
  }

  public void setCurrentUsagePercentage(BigDecimal currentUsagePercentage) {
    this.currentUsagePercentage = currentUsagePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityDashboardUsage capacityDashboardUsage = (CapacityDashboardUsage) o;
    return Objects.equals(this.currentUsageCount, capacityDashboardUsage.currentUsageCount) &&
        Objects.equals(this.maxThresholdPercentage, capacityDashboardUsage.maxThresholdPercentage) &&
        Objects.equals(this.displayName, capacityDashboardUsage.displayName) &&
        Objects.equals(this.severity, capacityDashboardUsage.severity) &&
        Objects.equals(this.maxSupportedCount, capacityDashboardUsage.maxSupportedCount) &&
        Objects.equals(this.usageType, capacityDashboardUsage.usageType) &&
        Objects.equals(this.minThresholdPercentage, capacityDashboardUsage.minThresholdPercentage) &&
        Objects.equals(this.currentUsagePercentage, capacityDashboardUsage.currentUsagePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUsageCount, maxThresholdPercentage, displayName, severity, maxSupportedCount, usageType, minThresholdPercentage, currentUsagePercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityDashboardUsage {\n");
    
    sb.append("    currentUsageCount: ").append(toIndentedString(currentUsageCount)).append("\n");
    sb.append("    maxThresholdPercentage: ").append(toIndentedString(maxThresholdPercentage)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    maxSupportedCount: ").append(toIndentedString(maxSupportedCount)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    minThresholdPercentage: ").append(toIndentedString(minThresholdPercentage)).append("\n");
    sb.append("    currentUsagePercentage: ").append(toIndentedString(currentUsagePercentage)).append("\n");
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