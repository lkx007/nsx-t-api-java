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
import io.swagger.client.model.DiscoveredResource;
import io.swagger.client.model.KeyValuePair;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of Container Ingress Policy.
 */
@Schema(description = "Details of Container Ingress Policy.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ContainerIngressPolicy extends DiscoveredResource {
  @SerializedName("container_cluster_id")
  private String containerClusterId = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("container_project_id")
  private String containerProjectId = null;

  @SerializedName("spec")
  private String spec = null;

  public ContainerIngressPolicy containerClusterId(String containerClusterId) {
    this.containerClusterId = containerClusterId;
    return this;
  }

   /**
   * Identifier of the container cluster this ingress policy belongs to.
   * @return containerClusterId
  **/
  @Schema(description = "Identifier of the container cluster this ingress policy belongs to.")
  public String getContainerClusterId() {
    return containerClusterId;
  }

  public void setContainerClusterId(String containerClusterId) {
    this.containerClusterId = containerClusterId;
  }

  public ContainerIngressPolicy originProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
    return this;
  }

  public ContainerIngressPolicy addOriginPropertiesItem(KeyValuePair originPropertiesItem) {
    if (this.originProperties == null) {
      this.originProperties = new ArrayList<KeyValuePair>();
    }
    this.originProperties.add(originPropertiesItem);
    return this;
  }

   /**
   * Array of additional specific properties of container ingress in key-value format. 
   * @return originProperties
  **/
  @Schema(description = "Array of additional specific properties of container ingress in key-value format. ")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

  public void setOriginProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
  }

  public ContainerIngressPolicy externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Identifier of the container ingress policy.
   * @return externalId
  **/
  @Schema(required = true, description = "Identifier of the container ingress policy.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ContainerIngressPolicy containerProjectId(String containerProjectId) {
    this.containerProjectId = containerProjectId;
    return this;
  }

   /**
   * Identifier of the project which this container ingress belongs to.
   * @return containerProjectId
  **/
  @Schema(description = "Identifier of the project which this container ingress belongs to.")
  public String getContainerProjectId() {
    return containerProjectId;
  }

  public void setContainerProjectId(String containerProjectId) {
    this.containerProjectId = containerProjectId;
  }

  public ContainerIngressPolicy spec(String spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Container ingress policy specification.
   * @return spec
  **/
  @Schema(description = "Container ingress policy specification.")
  public String getSpec() {
    return spec;
  }

  public void setSpec(String spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerIngressPolicy containerIngressPolicy = (ContainerIngressPolicy) o;
    return Objects.equals(this.containerClusterId, containerIngressPolicy.containerClusterId) &&
        Objects.equals(this.originProperties, containerIngressPolicy.originProperties) &&
        Objects.equals(this.externalId, containerIngressPolicy.externalId) &&
        Objects.equals(this.containerProjectId, containerIngressPolicy.containerProjectId) &&
        Objects.equals(this.spec, containerIngressPolicy.spec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerClusterId, originProperties, externalId, containerProjectId, spec, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerIngressPolicy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    containerClusterId: ").append(toIndentedString(containerClusterId)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    containerProjectId: ").append(toIndentedString(containerProjectId)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
