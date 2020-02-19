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
import io.swagger.client.model.ClusterGroupStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of the statuses of all the groups in the cluster.
 */
@Schema(description = "A list of the statuses of all the groups in the cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AllClusterGroupStatus {
  /**
   * Overall status of the cluster
   */
  @JsonAdapter(OverallStatusEnum.Adapter.class)
  public enum OverallStatusEnum {
    STABLE("STABLE"),
    DEGRADED("DEGRADED"),
    UNAVAILABLE("UNAVAILABLE");

    private String value;

    OverallStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OverallStatusEnum fromValue(String text) {
      for (OverallStatusEnum b : OverallStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OverallStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OverallStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OverallStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OverallStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("overall_status")
  private OverallStatusEnum overallStatus = null;

  @SerializedName("cluster_id")
  private String clusterId = null;

  @SerializedName("groups")
  private List<ClusterGroupStatus> groups = null;

   /**
   * Overall status of the cluster
   * @return overallStatus
  **/
  @Schema(description = "Overall status of the cluster")
  public OverallStatusEnum getOverallStatus() {
    return overallStatus;
  }

   /**
   * UUID of the cluster
   * @return clusterId
  **/
  @Schema(description = "UUID of the cluster")
  public String getClusterId() {
    return clusterId;
  }

   /**
   * Array of groups and their statuses
   * @return groups
  **/
  @Schema(description = "Array of groups and their statuses")
  public List<ClusterGroupStatus> getGroups() {
    return groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllClusterGroupStatus allClusterGroupStatus = (AllClusterGroupStatus) o;
    return Objects.equals(this.overallStatus, allClusterGroupStatus.overallStatus) &&
        Objects.equals(this.clusterId, allClusterGroupStatus.clusterId) &&
        Objects.equals(this.groups, allClusterGroupStatus.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallStatus, clusterId, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllClusterGroupStatus {\n");
    
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
