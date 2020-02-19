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
import io.swagger.client.model.ClusterGroupMemberStatus;
import io.swagger.client.model.ClusterGroupServiceLeader;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This type contains the attributes and status of a group.
 */
@Schema(description = "This type contains the attributes and status of a group.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ClusterGroupStatus {
  @SerializedName("members")
  private List<ClusterGroupMemberStatus> members = null;

  @SerializedName("group_id")
  private String groupId = null;

  @SerializedName("leaders")
  private List<ClusterGroupServiceLeader> leaders = null;

  /**
   * Group status
   */
  @JsonAdapter(GroupStatusEnum.Adapter.class)
  public enum GroupStatusEnum {
    STABLE("STABLE"),
    DEGRADED("DEGRADED"),
    UNSTABLE("UNSTABLE"),
    UNAVAILABLE("UNAVAILABLE");

    private String value;

    GroupStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GroupStatusEnum fromValue(String text) {
      for (GroupStatusEnum b : GroupStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GroupStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("group_status")
  private GroupStatusEnum groupStatus = null;

  /**
   * Type of the group
   */
  @JsonAdapter(GroupTypeEnum.Adapter.class)
  public enum GroupTypeEnum {
    MANAGER("MANAGER"),
    CONTROLLER("CONTROLLER"),
    POLICY("POLICY"),
    HTTPS("HTTPS"),
    DATASTORE("DATASTORE"),
    CLUSTER_BOOT_MANAGER("CLUSTER_BOOT_MANAGER");

    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GroupTypeEnum fromValue(String text) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GroupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("group_type")
  private GroupTypeEnum groupType = null;

   /**
   * Array of group members and their statuses
   * @return members
  **/
  @Schema(description = "Array of group members and their statuses")
  public List<ClusterGroupMemberStatus> getMembers() {
    return members;
  }

   /**
   * UUID of the group
   * @return groupId
  **/
  @Schema(description = "UUID of the group")
  public String getGroupId() {
    return groupId;
  }

   /**
   * Array of group leaders and their attributes
   * @return leaders
  **/
  @Schema(description = "Array of group leaders and their attributes")
  public List<ClusterGroupServiceLeader> getLeaders() {
    return leaders;
  }

   /**
   * Group status
   * @return groupStatus
  **/
  @Schema(description = "Group status")
  public GroupStatusEnum getGroupStatus() {
    return groupStatus;
  }

   /**
   * Type of the group
   * @return groupType
  **/
  @Schema(description = "Type of the group")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterGroupStatus clusterGroupStatus = (ClusterGroupStatus) o;
    return Objects.equals(this.members, clusterGroupStatus.members) &&
        Objects.equals(this.groupId, clusterGroupStatus.groupId) &&
        Objects.equals(this.leaders, clusterGroupStatus.leaders) &&
        Objects.equals(this.groupStatus, clusterGroupStatus.groupStatus) &&
        Objects.equals(this.groupType, clusterGroupStatus.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, groupId, leaders, groupStatus, groupType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterGroupStatus {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    leaders: ").append(toIndentedString(leaders)).append("\n");
    sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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