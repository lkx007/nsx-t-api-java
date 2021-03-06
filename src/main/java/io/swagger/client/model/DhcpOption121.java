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
import io.swagger.client.model.ClasslessStaticRoute;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DHCP option 121 to define classless static route.
 */
@Schema(description = "DHCP option 121 to define classless static route.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpOption121 {
  @SerializedName("static_routes")
  private List<ClasslessStaticRoute> staticRoutes = new ArrayList<ClasslessStaticRoute>();

  public DhcpOption121 staticRoutes(List<ClasslessStaticRoute> staticRoutes) {
    this.staticRoutes = staticRoutes;
    return this;
  }

  public DhcpOption121 addStaticRoutesItem(ClasslessStaticRoute staticRoutesItem) {
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }

   /**
   * Classless static route of DHCP option 121.
   * @return staticRoutes
  **/
  @Schema(required = true, description = "Classless static route of DHCP option 121.")
  public List<ClasslessStaticRoute> getStaticRoutes() {
    return staticRoutes;
  }

  public void setStaticRoutes(List<ClasslessStaticRoute> staticRoutes) {
    this.staticRoutes = staticRoutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpOption121 dhcpOption121 = (DhcpOption121) o;
    return Objects.equals(this.staticRoutes, dhcpOption121.staticRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staticRoutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpOption121 {\n");
    
    sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
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
