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
 * NSX Cluster is made up of multiple cluster nodes. Each node can perform multiple functions, commonly referred to as roles. Cluster node entities are processes running in a cluster node that assist in the performance of a role. Cluster Boot Manager is a daemon that securely bootstraps and configures the entities. This type contains attributes of a cluster node entity that are relevant to the Cluster Boot Manager.
 */
@Schema(description = "NSX Cluster is made up of multiple cluster nodes. Each node can perform multiple functions, commonly referred to as roles. Cluster node entities are processes running in a cluster node that assist in the performance of a role. Cluster Boot Manager is a daemon that securely bootstraps and configures the entities. This type contains attributes of a cluster node entity that are relevant to the Cluster Boot Manager.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ClusterNodeEntity {
  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("entity_uuid")
  private String entityUuid = null;

  /**
   * Type of the entity
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    MANAGER("MANAGER"),
    CONTROLLER("CONTROLLER"),
    POLICY("POLICY"),
    HTTPS("HTTPS"),
    CLUSTER_BOOT_MANAGER("CLUSTER_BOOT_MANAGER"),
    DATASTORE("DATASTORE");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("entity_type")
  private EntityTypeEnum entityType = null;

  @SerializedName("subnet_prefix_length")
  private Long subnetPrefixLength = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("fqdn")
  private String fqdn = null;

  @SerializedName("port")
  private Long port = null;

  public ClusterNodeEntity certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Public certificate of the entity in PEM format
   * @return certificate
  **/
  @Schema(required = true, description = "Public certificate of the entity in PEM format")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public ClusterNodeEntity entityUuid(String entityUuid) {
    this.entityUuid = entityUuid;
    return this;
  }

   /**
   * UUID of the entity
   * @return entityUuid
  **/
  @Schema(required = true, description = "UUID of the entity")
  public String getEntityUuid() {
    return entityUuid;
  }

  public void setEntityUuid(String entityUuid) {
    this.entityUuid = entityUuid;
  }

  public ClusterNodeEntity entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Type of the entity
   * @return entityType
  **/
  @Schema(required = true, description = "Type of the entity")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public ClusterNodeEntity subnetPrefixLength(Long subnetPrefixLength) {
    this.subnetPrefixLength = subnetPrefixLength;
    return this;
  }

   /**
   * Subnet mask prefix length of the entity binds to
   * minimum: 0
   * maximum: 32
   * @return subnetPrefixLength
  **/
  @Schema(description = "Subnet mask prefix length of the entity binds to")
  public Long getSubnetPrefixLength() {
    return subnetPrefixLength;
  }

  public void setSubnetPrefixLength(Long subnetPrefixLength) {
    this.subnetPrefixLength = subnetPrefixLength;
  }

  public ClusterNodeEntity ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address the entity binds to
   * @return ipAddress
  **/
  @Schema(description = "IP address the entity binds to")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ClusterNodeEntity fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

   /**
   * Domain name the entity binds to
   * @return fqdn
  **/
  @Schema(description = "Domain name the entity binds to")
  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  public ClusterNodeEntity port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Port the entity binds to
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @Schema(description = "Port the entity binds to")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodeEntity clusterNodeEntity = (ClusterNodeEntity) o;
    return Objects.equals(this.certificate, clusterNodeEntity.certificate) &&
        Objects.equals(this.entityUuid, clusterNodeEntity.entityUuid) &&
        Objects.equals(this.entityType, clusterNodeEntity.entityType) &&
        Objects.equals(this.subnetPrefixLength, clusterNodeEntity.subnetPrefixLength) &&
        Objects.equals(this.ipAddress, clusterNodeEntity.ipAddress) &&
        Objects.equals(this.fqdn, clusterNodeEntity.fqdn) &&
        Objects.equals(this.port, clusterNodeEntity.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, entityUuid, entityType, subnetPrefixLength, ipAddress, fqdn, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodeEntity {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    subnetPrefixLength: ").append(toIndentedString(subnetPrefixLength)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
