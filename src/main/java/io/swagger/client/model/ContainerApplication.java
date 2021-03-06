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
 * Container application within a project.
 */
@Schema(description = "Container application within a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ContainerApplication extends DiscoveredResource {
  /**
   * Status of the container application.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("UNKNOWN"),
    HEALTHY("HEALTHY"),
    UP("UP"),
    DOWN("DOWN"),
    DEGRADED("DEGRADED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("container_cluster_id")
  private String containerClusterId = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("container_project_id")
  private String containerProjectId = null;

  public ContainerApplication status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the container application.
   * @return status
  **/
  @Schema(description = "Status of the container application.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Identifier of the container cluster this container application belongs to.
   * @return containerClusterId
  **/
  @Schema(description = "Identifier of the container cluster this container application belongs to.")
  public String getContainerClusterId() {
    return containerClusterId;
  }

  public ContainerApplication originProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
    return this;
  }

  public ContainerApplication addOriginPropertiesItem(KeyValuePair originPropertiesItem) {
    if (this.originProperties == null) {
      this.originProperties = new ArrayList<KeyValuePair>();
    }
    this.originProperties.add(originPropertiesItem);
    return this;
  }

   /**
   * Array of additional specific properties of container application in key-value format. 
   * @return originProperties
  **/
  @Schema(description = "Array of additional specific properties of container application in key-value format. ")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

  public void setOriginProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
  }

  public ContainerApplication externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Identifier of the container application on container cluster e.g. PCF app id, k8s service id. 
   * @return externalId
  **/
  @Schema(required = true, description = "Identifier of the container application on container cluster e.g. PCF app id, k8s service id. ")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ContainerApplication containerProjectId(String containerProjectId) {
    this.containerProjectId = containerProjectId;
    return this;
  }

   /**
   * Identifier of the project which this container application belongs to.
   * @return containerProjectId
  **/
  @Schema(description = "Identifier of the project which this container application belongs to.")
  public String getContainerProjectId() {
    return containerProjectId;
  }

  public void setContainerProjectId(String containerProjectId) {
    this.containerProjectId = containerProjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerApplication containerApplication = (ContainerApplication) o;
    return Objects.equals(this.status, containerApplication.status) &&
        Objects.equals(this.containerClusterId, containerApplication.containerClusterId) &&
        Objects.equals(this.originProperties, containerApplication.originProperties) &&
        Objects.equals(this.externalId, containerApplication.externalId) &&
        Objects.equals(this.containerProjectId, containerApplication.containerProjectId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, containerClusterId, originProperties, externalId, containerProjectId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerApplication {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    containerClusterId: ").append(toIndentedString(containerClusterId)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    containerProjectId: ").append(toIndentedString(containerProjectId)).append("\n");
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
