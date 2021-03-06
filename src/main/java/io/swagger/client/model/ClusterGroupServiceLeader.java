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
 * Each cluster node entity provides multiple services. When working in a group, each service can elect a cluster node entity to be the leader of the service. Leader election helps in coordination of the service. The leader holds a renewable lease on the leadership for a fixed period of time. The lease version is incremented every time the leadership lease is renewed. This type contains the attributes of a leader.
 */
@Schema(description = "Each cluster node entity provides multiple services. When working in a group, each service can elect a cluster node entity to be the leader of the service. Leader election helps in coordination of the service. The leader holds a renewable lease on the leadership for a fixed period of time. The lease version is incremented every time the leadership lease is renewed. This type contains the attributes of a leader.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ClusterGroupServiceLeader {
  @SerializedName("service_name")
  private String serviceName = null;

  @SerializedName("lease_version")
  private Long leaseVersion = null;

  @SerializedName("leader_uuid")
  private String leaderUuid = null;

   /**
   * Name of the service
   * @return serviceName
  **/
  @Schema(description = "Name of the service")
  public String getServiceName() {
    return serviceName;
  }

   /**
   * Number of times the lease has been renewed
   * @return leaseVersion
  **/
  @Schema(description = "Number of times the lease has been renewed")
  public Long getLeaseVersion() {
    return leaseVersion;
  }

   /**
   * Member UUID of the leader
   * @return leaderUuid
  **/
  @Schema(description = "Member UUID of the leader")
  public String getLeaderUuid() {
    return leaderUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterGroupServiceLeader clusterGroupServiceLeader = (ClusterGroupServiceLeader) o;
    return Objects.equals(this.serviceName, clusterGroupServiceLeader.serviceName) &&
        Objects.equals(this.leaseVersion, clusterGroupServiceLeader.leaseVersion) &&
        Objects.equals(this.leaderUuid, clusterGroupServiceLeader.leaderUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, leaseVersion, leaderUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterGroupServiceLeader {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    leaseVersion: ").append(toIndentedString(leaseVersion)).append("\n");
    sb.append("    leaderUuid: ").append(toIndentedString(leaderUuid)).append("\n");
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
