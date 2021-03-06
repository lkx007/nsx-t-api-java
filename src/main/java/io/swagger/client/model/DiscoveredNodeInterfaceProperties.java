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
 * Network interface properties of discovered node
 */
@Schema(description = "Network interface properties of discovered node")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DiscoveredNodeInterfaceProperties {
  @SerializedName("physical_address")
  private String physicalAddress = null;

  @SerializedName("connected_switch")
  private String connectedSwitch = null;

  @SerializedName("interface_id")
  private String interfaceId = null;

  public DiscoveredNodeInterfaceProperties physicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
    return this;
  }

   /**
   * Mac address of the interface
   * @return physicalAddress
  **/
  @Schema(description = "Mac address of the interface")
  public String getPhysicalAddress() {
    return physicalAddress;
  }

  public void setPhysicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
  }

  public DiscoveredNodeInterfaceProperties connectedSwitch(String connectedSwitch) {
    this.connectedSwitch = connectedSwitch;
    return this;
  }

   /**
   * Switch name which is connected to nic, switch can be opaque, proxyHostSwitch or virtual
   * @return connectedSwitch
  **/
  @Schema(description = "Switch name which is connected to nic, switch can be opaque, proxyHostSwitch or virtual")
  public String getConnectedSwitch() {
    return connectedSwitch;
  }

  public void setConnectedSwitch(String connectedSwitch) {
    this.connectedSwitch = connectedSwitch;
  }

  public DiscoveredNodeInterfaceProperties interfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
    return this;
  }

   /**
   * Id of the network interface
   * @return interfaceId
  **/
  @Schema(description = "Id of the network interface")
  public String getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveredNodeInterfaceProperties discoveredNodeInterfaceProperties = (DiscoveredNodeInterfaceProperties) o;
    return Objects.equals(this.physicalAddress, discoveredNodeInterfaceProperties.physicalAddress) &&
        Objects.equals(this.connectedSwitch, discoveredNodeInterfaceProperties.connectedSwitch) &&
        Objects.equals(this.interfaceId, discoveredNodeInterfaceProperties.interfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalAddress, connectedSwitch, interfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveredNodeInterfaceProperties {\n");
    
    sb.append("    physicalAddress: ").append(toIndentedString(physicalAddress)).append("\n");
    sb.append("    connectedSwitch: ").append(toIndentedString(connectedSwitch)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
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
