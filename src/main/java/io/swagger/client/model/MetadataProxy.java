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
import java.util.ArrayList;
import java.util.List;
/**
 * MetadataProxy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MetadataProxy extends ManagedResource {
  @SerializedName("secret")
  private String secret = null;

  @SerializedName("metadata_server_ca_ids")
  private List<String> metadataServerCaIds = null;

  @SerializedName("edge_cluster_member_indexes")
  private List<Long> edgeClusterMemberIndexes = null;

  /**
   * Metadata proxy supported cryptographic protocol
   */
  @JsonAdapter(CryptoProtocolsEnum.Adapter.class)
  public enum CryptoProtocolsEnum {
    V1("TLS_V1"),
    V1_1("TLS_V1_1"),
    V1_2("TLS_V1_2");

    private String value;

    CryptoProtocolsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CryptoProtocolsEnum fromValue(String text) {
      for (CryptoProtocolsEnum b : CryptoProtocolsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CryptoProtocolsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CryptoProtocolsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CryptoProtocolsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CryptoProtocolsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("crypto_protocols")
  private List<CryptoProtocolsEnum> cryptoProtocols = null;

  @SerializedName("metadata_server_url")
  private String metadataServerUrl = null;

  @SerializedName("attached_logical_port_id")
  private String attachedLogicalPortId = null;

  @SerializedName("enable_standby_relocation")
  private Boolean enableStandbyRelocation = false;

  @SerializedName("edge_cluster_id")
  private String edgeClusterId = null;

  public MetadataProxy secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * secret to access metadata server
   * @return secret
  **/
  @Schema(description = "secret to access metadata server")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public MetadataProxy metadataServerCaIds(List<String> metadataServerCaIds) {
    this.metadataServerCaIds = metadataServerCaIds;
    return this;
  }

  public MetadataProxy addMetadataServerCaIdsItem(String metadataServerCaIdsItem) {
    if (this.metadataServerCaIds == null) {
      this.metadataServerCaIds = new ArrayList<String>();
    }
    this.metadataServerCaIds.add(metadataServerCaIdsItem);
    return this;
  }

   /**
   * The CAs referenced here must be uploaded to the truststore using the API POST /api/v1/trust-management/certificates?action&#x3D;import. User needs to ensure a correct CA for this metedata server is used. The REST API can not detect a wrong CA which was used to verify a different server. If the Metadata Proxy reports an ERROR or NO_BACKUP status, user can check the metadata proxy log at transport node for a possible CA issue. 
   * @return metadataServerCaIds
  **/
  @Schema(description = "The CAs referenced here must be uploaded to the truststore using the API POST /api/v1/trust-management/certificates?action=import. User needs to ensure a correct CA for this metedata server is used. The REST API can not detect a wrong CA which was used to verify a different server. If the Metadata Proxy reports an ERROR or NO_BACKUP status, user can check the metadata proxy log at transport node for a possible CA issue. ")
  public List<String> getMetadataServerCaIds() {
    return metadataServerCaIds;
  }

  public void setMetadataServerCaIds(List<String> metadataServerCaIds) {
    this.metadataServerCaIds = metadataServerCaIds;
  }

  public MetadataProxy edgeClusterMemberIndexes(List<Long> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
    return this;
  }

  public MetadataProxy addEdgeClusterMemberIndexesItem(Long edgeClusterMemberIndexesItem) {
    if (this.edgeClusterMemberIndexes == null) {
      this.edgeClusterMemberIndexes = new ArrayList<Long>();
    }
    this.edgeClusterMemberIndexes.add(edgeClusterMemberIndexesItem);
    return this;
  }

   /**
   * If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If user provides only one edge node, there will be no HA support. 
   * @return edgeClusterMemberIndexes
  **/
  @Schema(description = "If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If user provides only one edge node, there will be no HA support. ")
  public List<Long> getEdgeClusterMemberIndexes() {
    return edgeClusterMemberIndexes;
  }

  public void setEdgeClusterMemberIndexes(List<Long> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
  }

  public MetadataProxy cryptoProtocols(List<CryptoProtocolsEnum> cryptoProtocols) {
    this.cryptoProtocols = cryptoProtocols;
    return this;
  }

  public MetadataProxy addCryptoProtocolsItem(CryptoProtocolsEnum cryptoProtocolsItem) {
    if (this.cryptoProtocols == null) {
      this.cryptoProtocols = new ArrayList<CryptoProtocolsEnum>();
    }
    this.cryptoProtocols.add(cryptoProtocolsItem);
    return this;
  }

   /**
   * The cryptographic protocols listed here are supported by the metadata proxy. The TLSv1.1 and TLSv1.2 are supported by default. 
   * @return cryptoProtocols
  **/
  @Schema(description = "The cryptographic protocols listed here are supported by the metadata proxy. The TLSv1.1 and TLSv1.2 are supported by default. ")
  public List<CryptoProtocolsEnum> getCryptoProtocols() {
    return cryptoProtocols;
  }

  public void setCryptoProtocols(List<CryptoProtocolsEnum> cryptoProtocols) {
    this.cryptoProtocols = cryptoProtocols;
  }

  public MetadataProxy metadataServerUrl(String metadataServerUrl) {
    this.metadataServerUrl = metadataServerUrl;
    return this;
  }

   /**
   * The URL in format scheme://host:port/path. Please note, the scheme supports only http and https as of now, port supports range 3000 - 9000, inclusive. 
   * @return metadataServerUrl
  **/
  @Schema(required = true, description = "The URL in format scheme://host:port/path. Please note, the scheme supports only http and https as of now, port supports range 3000 - 9000, inclusive. ")
  public String getMetadataServerUrl() {
    return metadataServerUrl;
  }

  public void setMetadataServerUrl(String metadataServerUrl) {
    this.metadataServerUrl = metadataServerUrl;
  }

   /**
   * id of attached logical port
   * @return attachedLogicalPortId
  **/
  @Schema(description = "id of attached logical port")
  public String getAttachedLogicalPortId() {
    return attachedLogicalPortId;
  }

  public MetadataProxy enableStandbyRelocation(Boolean enableStandbyRelocation) {
    this.enableStandbyRelocation = enableStandbyRelocation;
    return this;
  }

   /**
   * Flag to enable the auto-relocation of standby Metadata Proxy in case of edge node failure. Only tier 1 and auto placed Metadata Proxy are considered for the relocation. 
   * @return enableStandbyRelocation
  **/
  @Schema(description = "Flag to enable the auto-relocation of standby Metadata Proxy in case of edge node failure. Only tier 1 and auto placed Metadata Proxy are considered for the relocation. ")
  public Boolean isEnableStandbyRelocation() {
    return enableStandbyRelocation;
  }

  public void setEnableStandbyRelocation(Boolean enableStandbyRelocation) {
    this.enableStandbyRelocation = enableStandbyRelocation;
  }

  public MetadataProxy edgeClusterId(String edgeClusterId) {
    this.edgeClusterId = edgeClusterId;
    return this;
  }

   /**
   * edge cluster uuid
   * @return edgeClusterId
  **/
  @Schema(required = true, description = "edge cluster uuid")
  public String getEdgeClusterId() {
    return edgeClusterId;
  }

  public void setEdgeClusterId(String edgeClusterId) {
    this.edgeClusterId = edgeClusterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataProxy metadataProxy = (MetadataProxy) o;
    return Objects.equals(this.secret, metadataProxy.secret) &&
        Objects.equals(this.metadataServerCaIds, metadataProxy.metadataServerCaIds) &&
        Objects.equals(this.edgeClusterMemberIndexes, metadataProxy.edgeClusterMemberIndexes) &&
        Objects.equals(this.cryptoProtocols, metadataProxy.cryptoProtocols) &&
        Objects.equals(this.metadataServerUrl, metadataProxy.metadataServerUrl) &&
        Objects.equals(this.attachedLogicalPortId, metadataProxy.attachedLogicalPortId) &&
        Objects.equals(this.enableStandbyRelocation, metadataProxy.enableStandbyRelocation) &&
        Objects.equals(this.edgeClusterId, metadataProxy.edgeClusterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, metadataServerCaIds, edgeClusterMemberIndexes, cryptoProtocols, metadataServerUrl, attachedLogicalPortId, enableStandbyRelocation, edgeClusterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataProxy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    metadataServerCaIds: ").append(toIndentedString(metadataServerCaIds)).append("\n");
    sb.append("    edgeClusterMemberIndexes: ").append(toIndentedString(edgeClusterMemberIndexes)).append("\n");
    sb.append("    cryptoProtocols: ").append(toIndentedString(cryptoProtocols)).append("\n");
    sb.append("    metadataServerUrl: ").append(toIndentedString(metadataServerUrl)).append("\n");
    sb.append("    attachedLogicalPortId: ").append(toIndentedString(attachedLogicalPortId)).append("\n");
    sb.append("    enableStandbyRelocation: ").append(toIndentedString(enableStandbyRelocation)).append("\n");
    sb.append("    edgeClusterId: ").append(toIndentedString(edgeClusterId)).append("\n");
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
