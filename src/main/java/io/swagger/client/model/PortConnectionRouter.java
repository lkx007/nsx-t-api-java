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
import io.swagger.client.model.LogicalRouterPort;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.PortConnectionEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Port Connection Logical Router Entity
 */
@Schema(description = "Port Connection Logical Router Entity")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PortConnectionRouter extends PortConnectionEntity {
  @SerializedName("uplink_ports")
  private List<LogicalRouterPort> uplinkPorts = null;

  @SerializedName("downlink_ports")
  private List<LogicalRouterPort> downlinkPorts = null;

   /**
   * Uplink ports of the Logical Router.
   * @return uplinkPorts
  **/
  @Schema(description = "Uplink ports of the Logical Router.")
  public List<LogicalRouterPort> getUplinkPorts() {
    return uplinkPorts;
  }

   /**
   * Downlink ports of the Logical Router.
   * @return downlinkPorts
  **/
  @Schema(description = "Downlink ports of the Logical Router.")
  public List<LogicalRouterPort> getDownlinkPorts() {
    return downlinkPorts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortConnectionRouter portConnectionRouter = (PortConnectionRouter) o;
    return Objects.equals(this.uplinkPorts, portConnectionRouter.uplinkPorts) &&
        Objects.equals(this.downlinkPorts, portConnectionRouter.downlinkPorts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uplinkPorts, downlinkPorts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortConnectionRouter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uplinkPorts: ").append(toIndentedString(uplinkPorts)).append("\n");
    sb.append("    downlinkPorts: ").append(toIndentedString(downlinkPorts)).append("\n");
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
