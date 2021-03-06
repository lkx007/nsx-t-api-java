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
 * The traffic_name specifies the infrastructure traffic type and it must be one of the following system-defined types: FAULT_TOLERANCE is traffic for failover and recovery. HBR is traffic for Host based replication. ISCSI is traffic for Internet Small Computer System Interface. MANAGEMENT is traffic for host management. NFS is traffic related to file transfer in network file system. VDP is traffic for vSphere data protection. VIRTUAL_MACHINE is traffic generated by virtual machines. VMOTION is traffic for computing resource migration. VSAN is traffic generated by virtual storage area network. The dynamic_res_pool_name provides a name for the resource pool. It can be any arbitrary string. Either traffic_name or dynamic_res_pool_name must be set. If both are specified or omitted, an error will be returned. 
 */
@Schema(description = "The traffic_name specifies the infrastructure traffic type and it must be one of the following system-defined types: FAULT_TOLERANCE is traffic for failover and recovery. HBR is traffic for Host based replication. ISCSI is traffic for Internet Small Computer System Interface. MANAGEMENT is traffic for host management. NFS is traffic related to file transfer in network file system. VDP is traffic for vSphere data protection. VIRTUAL_MACHINE is traffic generated by virtual machines. VMOTION is traffic for computing resource migration. VSAN is traffic generated by virtual storage area network. The dynamic_res_pool_name provides a name for the resource pool. It can be any arbitrary string. Either traffic_name or dynamic_res_pool_name must be set. If both are specified or omitted, an error will be returned. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HostInfraTrafficType {
  @SerializedName("dynamic_res_pool_name")
  private String dynamicResPoolName = null;

  /**
   * Traffic types
   */
  @JsonAdapter(TrafficNameEnum.Adapter.class)
  public enum TrafficNameEnum {
    FAULT_TOLERANCE("FAULT_TOLERANCE"),
    HBR("HBR"),
    ISCSI("ISCSI"),
    MANAGEMENT("MANAGEMENT"),
    NFS("NFS"),
    VDP("VDP"),
    VIRTUAL_MACHINE("VIRTUAL_MACHINE"),
    VMOTION("VMOTION"),
    VSAN("VSAN");

    private String value;

    TrafficNameEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TrafficNameEnum fromValue(String text) {
      for (TrafficNameEnum b : TrafficNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TrafficNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrafficNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrafficNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TrafficNameEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("traffic_name")
  private TrafficNameEnum trafficName = null;

  public HostInfraTrafficType dynamicResPoolName(String dynamicResPoolName) {
    this.dynamicResPoolName = dynamicResPoolName;
    return this;
  }

   /**
   * Dynamic resource pool traffic name
   * @return dynamicResPoolName
  **/
  @Schema(description = "Dynamic resource pool traffic name")
  public String getDynamicResPoolName() {
    return dynamicResPoolName;
  }

  public void setDynamicResPoolName(String dynamicResPoolName) {
    this.dynamicResPoolName = dynamicResPoolName;
  }

  public HostInfraTrafficType trafficName(TrafficNameEnum trafficName) {
    this.trafficName = trafficName;
    return this;
  }

   /**
   * Traffic types
   * @return trafficName
  **/
  @Schema(description = "Traffic types")
  public TrafficNameEnum getTrafficName() {
    return trafficName;
  }

  public void setTrafficName(TrafficNameEnum trafficName) {
    this.trafficName = trafficName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostInfraTrafficType hostInfraTrafficType = (HostInfraTrafficType) o;
    return Objects.equals(this.dynamicResPoolName, hostInfraTrafficType.dynamicResPoolName) &&
        Objects.equals(this.trafficName, hostInfraTrafficType.trafficName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicResPoolName, trafficName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostInfraTrafficType {\n");
    
    sb.append("    dynamicResPoolName: ").append(toIndentedString(dynamicResPoolName)).append("\n");
    sb.append("    trafficName: ").append(toIndentedString(trafficName)).append("\n");
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
