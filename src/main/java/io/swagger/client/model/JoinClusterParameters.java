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
 * To join a new node to the NSX cluster, issue a JoinCluster API on the new node. The JoinCluster API takes this object as a parameter. Provide the ID of the NSX cluster you want the new node to join and the IP address of one of the nodes already in that cluster. The Cluster Boot Manager running on the new node will then add the new node to the NSX cluster by making a AttachClusterNode REST API call on the node that is already part of the cluster. In order to make a REST API call to the node in the cluster, the Cluster Boot Manager will need username and password of a priviledged user on the node in the cluster. In place of a username and password, Cluster Boot Manager could also use a OAuth token provided. The Cluster Boot Manager needs either the username and password or the OAuth token to make the REST call but not both.
 */
@Schema(description = "To join a new node to the NSX cluster, issue a JoinCluster API on the new node. The JoinCluster API takes this object as a parameter. Provide the ID of the NSX cluster you want the new node to join and the IP address of one of the nodes already in that cluster. The Cluster Boot Manager running on the new node will then add the new node to the NSX cluster by making a AttachClusterNode REST API call on the node that is already part of the cluster. In order to make a REST API call to the node in the cluster, the Cluster Boot Manager will need username and password of a priviledged user on the node in the cluster. In place of a username and password, Cluster Boot Manager could also use a OAuth token provided. The Cluster Boot Manager needs either the username and password or the OAuth token to make the REST call but not both.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class JoinClusterParameters {
  @SerializedName("username")
  private String username = null;

  @SerializedName("certficate_sha256_thumbprint")
  private String certficateSha256Thumbprint = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("cluster_id")
  private String clusterId = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("port")
  private Long port = 443l;

  public JoinClusterParameters username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username on the cluster node
   * @return username
  **/
  @Schema(description = "Username on the cluster node")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public JoinClusterParameters certficateSha256Thumbprint(String certficateSha256Thumbprint) {
    this.certficateSha256Thumbprint = certficateSha256Thumbprint;
    return this;
  }

   /**
   * SHA256 Thumbprint of the API certificate of the cluster node
   * @return certficateSha256Thumbprint
  **/
  @Schema(required = true, description = "SHA256 Thumbprint of the API certificate of the cluster node")
  public String getCertficateSha256Thumbprint() {
    return certficateSha256Thumbprint;
  }

  public void setCertficateSha256Thumbprint(String certficateSha256Thumbprint) {
    this.certficateSha256Thumbprint = certficateSha256Thumbprint;
  }

  public JoinClusterParameters token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Limited time OAuth token instead of the username/password
   * @return token
  **/
  @Schema(description = "Limited time OAuth token instead of the username/password")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public JoinClusterParameters clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * UUID of the cluster to join
   * @return clusterId
  **/
  @Schema(required = true, description = "UUID of the cluster to join")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public JoinClusterParameters password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of the user on the cluster node
   * @return password
  **/
  @Schema(description = "Password of the user on the cluster node")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public JoinClusterParameters ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of a node already part of the cluster to join
   * @return ipAddress
  **/
  @Schema(required = true, description = "IP address of a node already part of the cluster to join")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public JoinClusterParameters port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * API port on the cluster node
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @Schema(description = "API port on the cluster node")
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
    JoinClusterParameters joinClusterParameters = (JoinClusterParameters) o;
    return Objects.equals(this.username, joinClusterParameters.username) &&
        Objects.equals(this.certficateSha256Thumbprint, joinClusterParameters.certficateSha256Thumbprint) &&
        Objects.equals(this.token, joinClusterParameters.token) &&
        Objects.equals(this.clusterId, joinClusterParameters.clusterId) &&
        Objects.equals(this.password, joinClusterParameters.password) &&
        Objects.equals(this.ipAddress, joinClusterParameters.ipAddress) &&
        Objects.equals(this.port, joinClusterParameters.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, certficateSha256Thumbprint, token, clusterId, password, ipAddress, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinClusterParameters {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    certficateSha256Thumbprint: ").append(toIndentedString(certficateSha256Thumbprint)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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