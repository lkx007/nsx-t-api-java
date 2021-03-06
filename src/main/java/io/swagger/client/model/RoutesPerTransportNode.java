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
import io.swagger.client.model.RouteDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BGP routes per transport node.
 */
@Schema(description = "BGP routes per transport node.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RoutesPerTransportNode {
  @SerializedName("routes")
  private List<RouteDetails> routes = null;

  @SerializedName("source_address")
  private String sourceAddress = null;

  @SerializedName("transport_node_id")
  private String transportNodeId = null;

   /**
   * Array of BGP neighbor route details for this transport node. 
   * @return routes
  **/
  @Schema(description = "Array of BGP neighbor route details for this transport node. ")
  public List<RouteDetails> getRoutes() {
    return routes;
  }

   /**
   * BGP neighbor source address.
   * @return sourceAddress
  **/
  @Schema(description = "BGP neighbor source address.")
  public String getSourceAddress() {
    return sourceAddress;
  }

   /**
   * Transport node id
   * @return transportNodeId
  **/
  @Schema(description = "Transport node id")
  public String getTransportNodeId() {
    return transportNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutesPerTransportNode routesPerTransportNode = (RoutesPerTransportNode) o;
    return Objects.equals(this.routes, routesPerTransportNode.routes) &&
        Objects.equals(this.sourceAddress, routesPerTransportNode.sourceAddress) &&
        Objects.equals(this.transportNodeId, routesPerTransportNode.transportNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes, sourceAddress, transportNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesPerTransportNode {\n");
    
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    transportNodeId: ").append(toIndentedString(transportNodeId)).append("\n");
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
