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
import io.swagger.client.model.NodeServiceProperties;
import io.swagger.client.model.SnmpServiceProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Node SNMP service properties
 */
@Schema(description = "Node SNMP service properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeSnmpServiceProperties extends NodeServiceProperties {
  @SerializedName("service_properties")
  private SnmpServiceProperties serviceProperties = null;

  public NodeSnmpServiceProperties serviceProperties(SnmpServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
    return this;
  }

   /**
   * Get serviceProperties
   * @return serviceProperties
  **/
  @Schema(required = true, description = "")
  public SnmpServiceProperties getServiceProperties() {
    return serviceProperties;
  }

  public void setServiceProperties(SnmpServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSnmpServiceProperties nodeSnmpServiceProperties = (NodeSnmpServiceProperties) o;
    return Objects.equals(this.serviceProperties, nodeSnmpServiceProperties.serviceProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceProperties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSnmpServiceProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceProperties: ").append(toIndentedString(serviceProperties)).append("\n");
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
