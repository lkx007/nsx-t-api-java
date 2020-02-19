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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ServiceBinding;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LogicalRouterPort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class LogicalRouterPort extends ManagedResource {
  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  @SerializedName("service_bindings")
  private List<ServiceBinding> serviceBindings = null;

  /**
   * LogicalRouterUpLinkPort is allowed only on TIER0 logical router.   It is the north facing port of the logical router. LogicalRouterLinkPortOnTIER0 is allowed only on TIER0 logical router.   This is the port where the LogicalRouterLinkPortOnTIER1 of TIER1 logical router connects to. LogicalRouterLinkPortOnTIER1 is allowed only on TIER1 logical router.   This is the port using which the user connected to TIER1 logical router for upwards connectivity via TIER0 logical router.   Connect this port to the LogicalRouterLinkPortOnTIER0 of the TIER0 logical router. LogicalRouterDownLinkPort is for the connected subnets on the logical router. LogicalRouterLoopbackPort is a loopback port for logical router component   which is placed on chosen edge cluster member. LogicalRouterIPTunnelPort is a IPSec VPN tunnel port created on   logical router when route based VPN session configured. LogicalRouterCentralizedServicePort is allowed only on Active/Standby TIER0 and TIER1   logical router. Port can be connected to VLAN or overlay logical switch.   Unlike downlink port it does not participate in distributed routing and hosted   on all edge cluster members associated with logical router.   Stateful services can be applied on this port. 
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    LOGICALROUTERUPLINKPORT("LogicalRouterUpLinkPort"),
    LOGICALROUTERDOWNLINKPORT("LogicalRouterDownLinkPort"),
    LOGICALROUTERLINKPORTONTIER0("LogicalRouterLinkPortOnTIER0"),
    LOGICALROUTERLINKPORTONTIER1("LogicalRouterLinkPortOnTIER1"),
    LOGICALROUTERLOOPBACKPORT("LogicalRouterLoopbackPort"),
    LOGICALROUTERIPTUNNELPORT("LogicalRouterIPTunnelPort"),
    LOGICALROUTERCENTRALIZEDSERVICEPORT("LogicalRouterCentralizedServicePort");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("resource_type")
  private ResourceTypeEnum resourceType = null;

  public LogicalRouterPort() {
    this.resource_type = this.getClass().getSimpleName();
  }
  public LogicalRouterPort logicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
    return this;
  }

   /**
   * Identifier for logical router on which this port is created
   * @return logicalRouterId
  **/
  @Schema(required = true, description = "Identifier for logical router on which this port is created")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }

  public void setLogicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
  }

  public LogicalRouterPort serviceBindings(List<ServiceBinding> serviceBindings) {
    this.serviceBindings = serviceBindings;
    return this;
  }

  public LogicalRouterPort addServiceBindingsItem(ServiceBinding serviceBindingsItem) {
    if (this.serviceBindings == null) {
      this.serviceBindings = new ArrayList<ServiceBinding>();
    }
    this.serviceBindings.add(serviceBindingsItem);
    return this;
  }

   /**
   * Service Bindings
   * @return serviceBindings
  **/
  @Schema(description = "Service Bindings")
  public List<ServiceBinding> getServiceBindings() {
    return serviceBindings;
  }

  public void setServiceBindings(List<ServiceBinding> serviceBindings) {
    this.serviceBindings = serviceBindings;
  }

  public LogicalRouterPort resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * LogicalRouterUpLinkPort is allowed only on TIER0 logical router.   It is the north facing port of the logical router. LogicalRouterLinkPortOnTIER0 is allowed only on TIER0 logical router.   This is the port where the LogicalRouterLinkPortOnTIER1 of TIER1 logical router connects to. LogicalRouterLinkPortOnTIER1 is allowed only on TIER1 logical router.   This is the port using which the user connected to TIER1 logical router for upwards connectivity via TIER0 logical router.   Connect this port to the LogicalRouterLinkPortOnTIER0 of the TIER0 logical router. LogicalRouterDownLinkPort is for the connected subnets on the logical router. LogicalRouterLoopbackPort is a loopback port for logical router component   which is placed on chosen edge cluster member. LogicalRouterIPTunnelPort is a IPSec VPN tunnel port created on   logical router when route based VPN session configured. LogicalRouterCentralizedServicePort is allowed only on Active/Standby TIER0 and TIER1   logical router. Port can be connected to VLAN or overlay logical switch.   Unlike downlink port it does not participate in distributed routing and hosted   on all edge cluster members associated with logical router.   Stateful services can be applied on this port. 
   * @return resourceType
  **/
  @Schema(required = true, description = "LogicalRouterUpLinkPort is allowed only on TIER0 logical router.   It is the north facing port of the logical router. LogicalRouterLinkPortOnTIER0 is allowed only on TIER0 logical router.   This is the port where the LogicalRouterLinkPortOnTIER1 of TIER1 logical router connects to. LogicalRouterLinkPortOnTIER1 is allowed only on TIER1 logical router.   This is the port using which the user connected to TIER1 logical router for upwards connectivity via TIER0 logical router.   Connect this port to the LogicalRouterLinkPortOnTIER0 of the TIER0 logical router. LogicalRouterDownLinkPort is for the connected subnets on the logical router. LogicalRouterLoopbackPort is a loopback port for logical router component   which is placed on chosen edge cluster member. LogicalRouterIPTunnelPort is a IPSec VPN tunnel port created on   logical router when route based VPN session configured. LogicalRouterCentralizedServicePort is allowed only on Active/Standby TIER0 and TIER1   logical router. Port can be connected to VLAN or overlay logical switch.   Unlike downlink port it does not participate in distributed routing and hosted   on all edge cluster members associated with logical router.   Stateful services can be applied on this port. ")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalRouterPort logicalRouterPort = (LogicalRouterPort) o;
    return Objects.equals(this.logicalRouterId, logicalRouterPort.logicalRouterId) &&
        Objects.equals(this.serviceBindings, logicalRouterPort.serviceBindings) &&
        Objects.equals(this.resourceType, logicalRouterPort.resourceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalRouterId, serviceBindings, resourceType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalRouterPort {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
    sb.append("    serviceBindings: ").append(toIndentedString(serviceBindings)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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