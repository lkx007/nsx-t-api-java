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
 * Describes the capacity and current usage of virtual servers, pools and pool members for the given load balancer service. 
 */
@Schema(description = "Describes the capacity and current usage of virtual servers, pools and pool members for the given load balancer service. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbServiceUsage {
  @SerializedName("pool_capacity")
  private Long poolCapacity = null;

  /**
   * The size of load balancer service
   */
  @JsonAdapter(ServiceSizeEnum.Adapter.class)
  public enum ServiceSizeEnum {
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    DLB("DLB");

    private String value;

    ServiceSizeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiceSizeEnum fromValue(String text) {
      for (ServiceSizeEnum b : ServiceSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiceSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("service_size")
  private ServiceSizeEnum serviceSize = null;

  /**
   * The severity calculation is based on the largest usage percentage from virtual servers, pools and pool members for one load balancer service. 
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    GREEN("GREEN"),
    ORANGE("ORANGE"),
    RED("RED");

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

  @SerializedName("pool_member_capacity")
  private Long poolMemberCapacity = null;

  @SerializedName("current_virtual_server_count")
  private Long currentVirtualServerCount = null;

  @SerializedName("usage_percentage")
  private BigDecimal usagePercentage = null;

  @SerializedName("service_id")
  private String serviceId = null;

  @SerializedName("current_pool_count")
  private Long currentPoolCount = null;

  @SerializedName("virtual_server_capacity")
  private Long virtualServerCapacity = null;

  @SerializedName("current_pool_member_count")
  private Long currentPoolMemberCount = null;

   /**
   * Pool capacity means maximum number of pools which could be configured in the given load balancer service. 
   * @return poolCapacity
  **/
  @Schema(description = "Pool capacity means maximum number of pools which could be configured in the given load balancer service. ")
  public Long getPoolCapacity() {
    return poolCapacity;
  }

   /**
   * The size of load balancer service
   * @return serviceSize
  **/
  @Schema(description = "The size of load balancer service")
  public ServiceSizeEnum getServiceSize() {
    return serviceSize;
  }

   /**
   * The severity calculation is based on the largest usage percentage from virtual servers, pools and pool members for one load balancer service. 
   * @return severity
  **/
  @Schema(description = "The severity calculation is based on the largest usage percentage from virtual servers, pools and pool members for one load balancer service. ")
  public SeverityEnum getSeverity() {
    return severity;
  }

   /**
   * Pool member capacity means maximum number of pool members which could be configured in the given load balancer service. 
   * @return poolMemberCapacity
  **/
  @Schema(description = "Pool member capacity means maximum number of pool members which could be configured in the given load balancer service. ")
  public Long getPoolMemberCapacity() {
    return poolMemberCapacity;
  }

   /**
   * The current number of virtual servers which has been configured in the given load balancer service. 
   * @return currentVirtualServerCount
  **/
  @Schema(description = "The current number of virtual servers which has been configured in the given load balancer service. ")
  public Long getCurrentVirtualServerCount() {
    return currentVirtualServerCount;
  }

   /**
   * The usage percentage is the largest usage percentage from virtual servers, pools and pool members for the load balancer service. 
   * @return usagePercentage
  **/
  @Schema(description = "The usage percentage is the largest usage percentage from virtual servers, pools and pool members for the load balancer service. ")
  public BigDecimal getUsagePercentage() {
    return usagePercentage;
  }

   /**
   * UUID of load balancer service
   * @return serviceId
  **/
  @Schema(description = "UUID of load balancer service")
  public String getServiceId() {
    return serviceId;
  }

   /**
   * The current number of pools which has been configured in the given load balancer service. 
   * @return currentPoolCount
  **/
  @Schema(description = "The current number of pools which has been configured in the given load balancer service. ")
  public Long getCurrentPoolCount() {
    return currentPoolCount;
  }

   /**
   * Virtual server capacity means maximum number of virtual servers which could be configured in the given load balancer service. 
   * @return virtualServerCapacity
  **/
  @Schema(description = "Virtual server capacity means maximum number of virtual servers which could be configured in the given load balancer service. ")
  public Long getVirtualServerCapacity() {
    return virtualServerCapacity;
  }

   /**
   * The current number of pool members which has been configured in the given load balancer service. 
   * @return currentPoolMemberCount
  **/
  @Schema(description = "The current number of pool members which has been configured in the given load balancer service. ")
  public Long getCurrentPoolMemberCount() {
    return currentPoolMemberCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbServiceUsage lbServiceUsage = (LbServiceUsage) o;
    return Objects.equals(this.poolCapacity, lbServiceUsage.poolCapacity) &&
        Objects.equals(this.serviceSize, lbServiceUsage.serviceSize) &&
        Objects.equals(this.severity, lbServiceUsage.severity) &&
        Objects.equals(this.poolMemberCapacity, lbServiceUsage.poolMemberCapacity) &&
        Objects.equals(this.currentVirtualServerCount, lbServiceUsage.currentVirtualServerCount) &&
        Objects.equals(this.usagePercentage, lbServiceUsage.usagePercentage) &&
        Objects.equals(this.serviceId, lbServiceUsage.serviceId) &&
        Objects.equals(this.currentPoolCount, lbServiceUsage.currentPoolCount) &&
        Objects.equals(this.virtualServerCapacity, lbServiceUsage.virtualServerCapacity) &&
        Objects.equals(this.currentPoolMemberCount, lbServiceUsage.currentPoolMemberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolCapacity, serviceSize, severity, poolMemberCapacity, currentVirtualServerCount, usagePercentage, serviceId, currentPoolCount, virtualServerCapacity, currentPoolMemberCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbServiceUsage {\n");
    
    sb.append("    poolCapacity: ").append(toIndentedString(poolCapacity)).append("\n");
    sb.append("    serviceSize: ").append(toIndentedString(serviceSize)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    poolMemberCapacity: ").append(toIndentedString(poolMemberCapacity)).append("\n");
    sb.append("    currentVirtualServerCount: ").append(toIndentedString(currentVirtualServerCount)).append("\n");
    sb.append("    usagePercentage: ").append(toIndentedString(usagePercentage)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    currentPoolCount: ").append(toIndentedString(currentPoolCount)).append("\n");
    sb.append("    virtualServerCapacity: ").append(toIndentedString(virtualServerCapacity)).append("\n");
    sb.append("    currentPoolMemberCount: ").append(toIndentedString(currentPoolMemberCount)).append("\n");
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