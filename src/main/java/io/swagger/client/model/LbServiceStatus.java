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
import io.swagger.client.model.LbPoolStatus;
import io.swagger.client.model.LbVirtualServerStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LbServiceStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbServiceStatus {
  @SerializedName("pools")
  private List<LbPoolStatus> pools = null;

  @SerializedName("cpu_usage")
  private Long cpuUsage = null;

  @SerializedName("active_transport_nodes")
  private List<String> activeTransportNodes = null;

  @SerializedName("memory_usage")
  private Long memoryUsage = null;

  @SerializedName("service_id")
  private String serviceId = null;

  @SerializedName("last_update_timestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("standby_transport_nodes")
  private List<String> standbyTransportNodes = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("virtual_servers")
  private List<LbVirtualServerStatus> virtualServers = null;

  /**
   * UP means the load balancer service is working fine on both transport-nodes(if have); DOWN means the load balancer service is down on both transport-nodes (if have), hence the load balancer will not respond to any requests; ERROR means error happens on transport-node(s) or no status is reported from transport-node(s). The load balancer service may be working (or not working); NO_STANDBY means load balancer service is working in one of the transport node while not in the other transport-node (if have). Hence if the load balancer service in the working transport-node goes down, the load balancer service will go down; DETACHED means that the load balancer service has no attachment setting and is not instantiated in any transport nodes; DISABLED means that admin state of load balancer service is DISABLED; UNKNOWN means that no status reported from transport-nodes.The load balancer service may be working(or not working). 
   */
  @JsonAdapter(ServiceStatusEnum.Adapter.class)
  public enum ServiceStatusEnum {
    UP("UP"),
    DOWN("DOWN"),
    ERROR("ERROR"),
    NO_STANDBY("NO_STANDBY"),
    DETACHED("DETACHED"),
    DISABLED("DISABLED"),
    UNKNOWN("UNKNOWN");

    private String value;

    ServiceStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiceStatusEnum fromValue(String text) {
      for (ServiceStatusEnum b : ServiceStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("service_status")
  private ServiceStatusEnum serviceStatus = null;

  public LbServiceStatus pools(List<LbPoolStatus> pools) {
    this.pools = pools;
    return this;
  }

  public LbServiceStatus addPoolsItem(LbPoolStatus poolsItem) {
    if (this.pools == null) {
      this.pools = new ArrayList<LbPoolStatus>();
    }
    this.pools.add(poolsItem);
    return this;
  }

   /**
   * status of load balancer pools
   * @return pools
  **/
  @Schema(description = "status of load balancer pools")
  public List<LbPoolStatus> getPools() {
    return pools;
  }

  public void setPools(List<LbPoolStatus> pools) {
    this.pools = pools;
  }

  public LbServiceStatus cpuUsage(Long cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

   /**
   * Cpu usage in percentage
   * @return cpuUsage
  **/
  @Schema(description = "Cpu usage in percentage")
  public Long getCpuUsage() {
    return cpuUsage;
  }

  public void setCpuUsage(Long cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public LbServiceStatus activeTransportNodes(List<String> activeTransportNodes) {
    this.activeTransportNodes = activeTransportNodes;
    return this;
  }

  public LbServiceStatus addActiveTransportNodesItem(String activeTransportNodesItem) {
    if (this.activeTransportNodes == null) {
      this.activeTransportNodes = new ArrayList<String>();
    }
    this.activeTransportNodes.add(activeTransportNodesItem);
    return this;
  }

   /**
   * Ids of load balancer service related active transport nodes
   * @return activeTransportNodes
  **/
  @Schema(description = "Ids of load balancer service related active transport nodes")
  public List<String> getActiveTransportNodes() {
    return activeTransportNodes;
  }

  public void setActiveTransportNodes(List<String> activeTransportNodes) {
    this.activeTransportNodes = activeTransportNodes;
  }

  public LbServiceStatus memoryUsage(Long memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * Memory usage in percentage
   * @return memoryUsage
  **/
  @Schema(description = "Memory usage in percentage")
  public Long getMemoryUsage() {
    return memoryUsage;
  }

  public void setMemoryUsage(Long memoryUsage) {
    this.memoryUsage = memoryUsage;
  }

  public LbServiceStatus serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Load balancer service identifier
   * @return serviceId
  **/
  @Schema(required = true, description = "Load balancer service identifier")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public LbServiceStatus lastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
    return this;
  }

   /**
   * Timestamp when the data was last updated
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "Timestamp when the data was last updated")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public LbServiceStatus standbyTransportNodes(List<String> standbyTransportNodes) {
    this.standbyTransportNodes = standbyTransportNodes;
    return this;
  }

  public LbServiceStatus addStandbyTransportNodesItem(String standbyTransportNodesItem) {
    if (this.standbyTransportNodes == null) {
      this.standbyTransportNodes = new ArrayList<String>();
    }
    this.standbyTransportNodes.add(standbyTransportNodesItem);
    return this;
  }

   /**
   * Ids of load balancer service related standby transport nodes
   * @return standbyTransportNodes
  **/
  @Schema(description = "Ids of load balancer service related standby transport nodes")
  public List<String> getStandbyTransportNodes() {
    return standbyTransportNodes;
  }

  public void setStandbyTransportNodes(List<String> standbyTransportNodes) {
    this.standbyTransportNodes = standbyTransportNodes;
  }

  public LbServiceStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message, if available
   * @return errorMessage
  **/
  @Schema(description = "Error message, if available")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public LbServiceStatus virtualServers(List<LbVirtualServerStatus> virtualServers) {
    this.virtualServers = virtualServers;
    return this;
  }

  public LbServiceStatus addVirtualServersItem(LbVirtualServerStatus virtualServersItem) {
    if (this.virtualServers == null) {
      this.virtualServers = new ArrayList<LbVirtualServerStatus>();
    }
    this.virtualServers.add(virtualServersItem);
    return this;
  }

   /**
   * status of load balancer virtual servers
   * @return virtualServers
  **/
  @Schema(description = "status of load balancer virtual servers")
  public List<LbVirtualServerStatus> getVirtualServers() {
    return virtualServers;
  }

  public void setVirtualServers(List<LbVirtualServerStatus> virtualServers) {
    this.virtualServers = virtualServers;
  }

  public LbServiceStatus serviceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * UP means the load balancer service is working fine on both transport-nodes(if have); DOWN means the load balancer service is down on both transport-nodes (if have), hence the load balancer will not respond to any requests; ERROR means error happens on transport-node(s) or no status is reported from transport-node(s). The load balancer service may be working (or not working); NO_STANDBY means load balancer service is working in one of the transport node while not in the other transport-node (if have). Hence if the load balancer service in the working transport-node goes down, the load balancer service will go down; DETACHED means that the load balancer service has no attachment setting and is not instantiated in any transport nodes; DISABLED means that admin state of load balancer service is DISABLED; UNKNOWN means that no status reported from transport-nodes.The load balancer service may be working(or not working). 
   * @return serviceStatus
  **/
  @Schema(description = "UP means the load balancer service is working fine on both transport-nodes(if have); DOWN means the load balancer service is down on both transport-nodes (if have), hence the load balancer will not respond to any requests; ERROR means error happens on transport-node(s) or no status is reported from transport-node(s). The load balancer service may be working (or not working); NO_STANDBY means load balancer service is working in one of the transport node while not in the other transport-node (if have). Hence if the load balancer service in the working transport-node goes down, the load balancer service will go down; DETACHED means that the load balancer service has no attachment setting and is not instantiated in any transport nodes; DISABLED means that admin state of load balancer service is DISABLED; UNKNOWN means that no status reported from transport-nodes.The load balancer service may be working(or not working). ")
  public ServiceStatusEnum getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbServiceStatus lbServiceStatus = (LbServiceStatus) o;
    return Objects.equals(this.pools, lbServiceStatus.pools) &&
        Objects.equals(this.cpuUsage, lbServiceStatus.cpuUsage) &&
        Objects.equals(this.activeTransportNodes, lbServiceStatus.activeTransportNodes) &&
        Objects.equals(this.memoryUsage, lbServiceStatus.memoryUsage) &&
        Objects.equals(this.serviceId, lbServiceStatus.serviceId) &&
        Objects.equals(this.lastUpdateTimestamp, lbServiceStatus.lastUpdateTimestamp) &&
        Objects.equals(this.standbyTransportNodes, lbServiceStatus.standbyTransportNodes) &&
        Objects.equals(this.errorMessage, lbServiceStatus.errorMessage) &&
        Objects.equals(this.virtualServers, lbServiceStatus.virtualServers) &&
        Objects.equals(this.serviceStatus, lbServiceStatus.serviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pools, cpuUsage, activeTransportNodes, memoryUsage, serviceId, lastUpdateTimestamp, standbyTransportNodes, errorMessage, virtualServers, serviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbServiceStatus {\n");
    
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    activeTransportNodes: ").append(toIndentedString(activeTransportNodes)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    standbyTransportNodes: ").append(toIndentedString(standbyTransportNodes)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    virtualServers: ").append(toIndentedString(virtualServers)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
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