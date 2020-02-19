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
 * SuccessNodeSupportBundleResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SuccessNodeSupportBundleResult {
  @SerializedName("bundle_name")
  private String bundleName = null;

  @SerializedName("node_display_name")
  private String nodeDisplayName = null;

  @SerializedName("node_id")
  private String nodeId = null;

  @SerializedName("sha256_thumbprint")
  private String sha256Thumbprint = null;

  @SerializedName("bundle_size")
  private Long bundleSize = null;

   /**
   * Name of support bundle, e.g. nsx_NODETYPE_UUID_YYYYMMDD_HHMMSS.tgz
   * @return bundleName
  **/
  @Schema(description = "Name of support bundle, e.g. nsx_NODETYPE_UUID_YYYYMMDD_HHMMSS.tgz")
  public String getBundleName() {
    return bundleName;
  }

   /**
   * Display name of node
   * @return nodeDisplayName
  **/
  @Schema(description = "Display name of node")
  public String getNodeDisplayName() {
    return nodeDisplayName;
  }

   /**
   * UUID of node
   * @return nodeId
  **/
  @Schema(description = "UUID of node")
  public String getNodeId() {
    return nodeId;
  }

   /**
   * File&#x27;s SHA256 thumbprint
   * @return sha256Thumbprint
  **/
  @Schema(description = "File's SHA256 thumbprint")
  public String getSha256Thumbprint() {
    return sha256Thumbprint;
  }

   /**
   * Size of support bundle in bytes
   * @return bundleSize
  **/
  @Schema(description = "Size of support bundle in bytes")
  public Long getBundleSize() {
    return bundleSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessNodeSupportBundleResult successNodeSupportBundleResult = (SuccessNodeSupportBundleResult) o;
    return Objects.equals(this.bundleName, successNodeSupportBundleResult.bundleName) &&
        Objects.equals(this.nodeDisplayName, successNodeSupportBundleResult.nodeDisplayName) &&
        Objects.equals(this.nodeId, successNodeSupportBundleResult.nodeId) &&
        Objects.equals(this.sha256Thumbprint, successNodeSupportBundleResult.sha256Thumbprint) &&
        Objects.equals(this.bundleSize, successNodeSupportBundleResult.bundleSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleName, nodeDisplayName, nodeId, sha256Thumbprint, bundleSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessNodeSupportBundleResult {\n");
    
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    nodeDisplayName: ").append(toIndentedString(nodeDisplayName)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    sha256Thumbprint: ").append(toIndentedString(sha256Thumbprint)).append("\n");
    sb.append("    bundleSize: ").append(toIndentedString(bundleSize)).append("\n");
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