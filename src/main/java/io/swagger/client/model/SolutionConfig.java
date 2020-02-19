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
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Solution Config would contain Vendor specific information required for configuring the NXGI partner Service after deployment.
 */
@Schema(description = "Solution Config would contain Vendor specific information required for configuring the NXGI partner Service after deployment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SolutionConfig extends ManagedResource {
  @SerializedName("service_id")
  private String serviceId = null;

  @SerializedName("solution_id")
  private String solutionId = null;

  @SerializedName("listen_port")
  private Integer listenPort = null;

  @SerializedName("control_ip")
  private String controlIp = null;

   /**
   * The service to which the service profile belongs.
   * @return serviceId
  **/
  @Schema(description = "The service to which the service profile belongs.")
  public String getServiceId() {
    return serviceId;
  }

  public SolutionConfig solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * Partner needs to specify Solution Id assigned by VMware.
   * @return solutionId
  **/
  @Schema(required = true, description = "Partner needs to specify Solution Id assigned by VMware.")
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public SolutionConfig listenPort(Integer listenPort) {
    this.listenPort = listenPort;
    return this;
  }

   /**
   * Partner needs to specify their port on which their solution application which consumes NXGI EPSec library listens.
   * minimum: 48651
   * maximum: 48655
   * @return listenPort
  **/
  @Schema(required = true, description = "Partner needs to specify their port on which their solution application which consumes NXGI EPSec library listens.")
  public Integer getListenPort() {
    return listenPort;
  }

  public void setListenPort(Integer listenPort) {
    this.listenPort = listenPort;
  }

  public SolutionConfig controlIp(String controlIp) {
    this.controlIp = controlIp;
    return this;
  }

   /**
   * Partner needs to specify their assigned control IP with which they have configured their OVFs.
   * @return controlIp
  **/
  @Schema(required = true, description = "Partner needs to specify their assigned control IP with which they have configured their OVFs.")
  public String getControlIp() {
    return controlIp;
  }

  public void setControlIp(String controlIp) {
    this.controlIp = controlIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionConfig solutionConfig = (SolutionConfig) o;
    return Objects.equals(this.serviceId, solutionConfig.serviceId) &&
        Objects.equals(this.solutionId, solutionConfig.solutionId) &&
        Objects.equals(this.listenPort, solutionConfig.listenPort) &&
        Objects.equals(this.controlIp, solutionConfig.controlIp) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, solutionId, listenPort, controlIp, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
    sb.append("    controlIp: ").append(toIndentedString(controlIp)).append("\n");
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
