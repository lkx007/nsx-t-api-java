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
 * Details of org/namespace within a container cluster.
 */
@Schema(description = "Details of org/namespace within a container cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ContainerProject extends DiscoveredResource {
  @SerializedName("container_cluster_id")
  private String containerClusterId = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("external_id")
  private String externalId = null;

  public ContainerProject containerClusterId(String containerClusterId) {
    this.containerClusterId = containerClusterId;
    return this;
  }

   /**
   * Identifier of the container cluster to which this project/namespace belongs.
   * @return containerClusterId
  **/
  @Schema(description = "Identifier of the container cluster to which this project/namespace belongs.")
  public String getContainerClusterId() {
    return containerClusterId;
  }

  public void setContainerClusterId(String containerClusterId) {
    this.containerClusterId = containerClusterId;
  }

  public ContainerProject originProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
    return this;
  }

  public ContainerProject addOriginPropertiesItem(KeyValuePair originPropertiesItem) {
    if (this.originProperties == null) {
      this.originProperties = new ArrayList<KeyValuePair>();
    }
    this.originProperties.add(originPropertiesItem);
    return this;
  }

   /**
   * Array of additional specific properties of container project in key-value format. 
   * @return originProperties
  **/
  @Schema(description = "Array of additional specific properties of container project in key-value format. ")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

  public void setOriginProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
  }

  public ContainerProject externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier of the container project.
   * @return externalId
  **/
  @Schema(required = true, description = "External identifier of the container project.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerProject containerProject = (ContainerProject) o;
    return Objects.equals(this.containerClusterId, containerProject.containerClusterId) &&
        Objects.equals(this.originProperties, containerProject.originProperties) &&
        Objects.equals(this.externalId, containerProject.externalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerClusterId, originProperties, externalId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerProject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    containerClusterId: ").append(toIndentedString(containerClusterId)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
