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
import io.swagger.client.model.ContainerInfrastructureInfo;
import io.swagger.client.model.DiscoveredResource;
import io.swagger.client.model.KeyValuePair;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of container cluster.
 */
@Schema(description = "Details of container cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ContainerCluster extends DiscoveredResource {
  /**
   * Type of the container cluster. In case of creating container cluster first time, it is expected to pass the valid cluster-type. In case of update, if there is no change in cluster-type, then this field can be omitted in the request. 
   */
  @JsonAdapter(ClusterTypeEnum.Adapter.class)
  public enum ClusterTypeEnum {
    PAS("PAS"),
    PKS("PKS"),
    KUBERNETES("Kubernetes"),
    OPENSHIFT("Openshift"),
    WCP("WCP"),
    OTHER("Other");

    private String value;

    ClusterTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClusterTypeEnum fromValue(String text) {
      for (ClusterTypeEnum b : ClusterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClusterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClusterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClusterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClusterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("cluster_type")
  private ClusterTypeEnum clusterType = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("infrastructure")
  private ContainerInfrastructureInfo infrastructure = null;

  public ContainerCluster clusterType(ClusterTypeEnum clusterType) {
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Type of the container cluster. In case of creating container cluster first time, it is expected to pass the valid cluster-type. In case of update, if there is no change in cluster-type, then this field can be omitted in the request. 
   * @return clusterType
  **/
  @Schema(description = "Type of the container cluster. In case of creating container cluster first time, it is expected to pass the valid cluster-type. In case of update, if there is no change in cluster-type, then this field can be omitted in the request. ")
  public ClusterTypeEnum getClusterType() {
    return clusterType;
  }

  public void setClusterType(ClusterTypeEnum clusterType) {
    this.clusterType = clusterType;
  }

  public ContainerCluster originProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
    return this;
  }

  public ContainerCluster addOriginPropertiesItem(KeyValuePair originPropertiesItem) {
    if (this.originProperties == null) {
      this.originProperties = new ArrayList<KeyValuePair>();
    }
    this.originProperties.add(originPropertiesItem);
    return this;
  }

   /**
   * Array of additional specific properties of container cluster in key-value format. 
   * @return originProperties
  **/
  @Schema(description = "Array of additional specific properties of container cluster in key-value format. ")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

  public void setOriginProperties(List<KeyValuePair> originProperties) {
    this.originProperties = originProperties;
  }

  public ContainerCluster externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier of the container cluster.
   * @return externalId
  **/
  @Schema(description = "External identifier of the container cluster.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ContainerCluster infrastructure(ContainerInfrastructureInfo infrastructure) {
    this.infrastructure = infrastructure;
    return this;
  }

   /**
   * Get infrastructure
   * @return infrastructure
  **/
  @Schema(description = "")
  public ContainerInfrastructureInfo getInfrastructure() {
    return infrastructure;
  }

  public void setInfrastructure(ContainerInfrastructureInfo infrastructure) {
    this.infrastructure = infrastructure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCluster containerCluster = (ContainerCluster) o;
    return Objects.equals(this.clusterType, containerCluster.clusterType) &&
        Objects.equals(this.originProperties, containerCluster.originProperties) &&
        Objects.equals(this.externalId, containerCluster.externalId) &&
        Objects.equals(this.infrastructure, containerCluster.infrastructure) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterType, originProperties, externalId, infrastructure, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerCluster {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
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
