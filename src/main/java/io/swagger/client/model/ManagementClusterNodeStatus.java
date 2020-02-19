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
 * ManagementClusterNodeStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ManagementClusterNodeStatus {
  /**
   * Status of this node&#x27;s connection to the management cluster
   */
  @JsonAdapter(MgmtClusterStatusEnum.Adapter.class)
  public enum MgmtClusterStatusEnum {
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    UNKNOWN("UNKNOWN");

    private String value;

    MgmtClusterStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MgmtClusterStatusEnum fromValue(String text) {
      for (MgmtClusterStatusEnum b : MgmtClusterStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MgmtClusterStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MgmtClusterStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MgmtClusterStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MgmtClusterStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("mgmt_cluster_status")
  private MgmtClusterStatusEnum mgmtClusterStatus = null;

   /**
   * Status of this node&#x27;s connection to the management cluster
   * @return mgmtClusterStatus
  **/
  @Schema(description = "Status of this node's connection to the management cluster")
  public MgmtClusterStatusEnum getMgmtClusterStatus() {
    return mgmtClusterStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementClusterNodeStatus managementClusterNodeStatus = (ManagementClusterNodeStatus) o;
    return Objects.equals(this.mgmtClusterStatus, managementClusterNodeStatus.mgmtClusterStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mgmtClusterStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementClusterNodeStatus {\n");
    
    sb.append("    mgmtClusterStatus: ").append(toIndentedString(mgmtClusterStatus)).append("\n");
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
