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
import io.swagger.client.model.HealthCheckResultPerTransportNode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Result of health check .
 */
@Schema(description = "Result of health check .")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HealthCheckResult {
  /**
   * Status of VLAN-MTU health check result; TRUNKED - all specified VLAN IDs are allowed by VLAN and MTU settings; UNTRUNKED - some/all specified VLAN IDs may be disallowed by VLAN or MTU settings; UNKNOWN - some/all health check result are unknown due to infrastructure issues. 
   */
  @JsonAdapter(VlanMtuStatusEnum.Adapter.class)
  public enum VlanMtuStatusEnum {
    TRUNKED("TRUNKED"),
    UNTRUNKED("UNTRUNKED"),
    UNKNOWN("UNKNOWN");

    private String value;

    VlanMtuStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VlanMtuStatusEnum fromValue(String text) {
      for (VlanMtuStatusEnum b : VlanMtuStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VlanMtuStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VlanMtuStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VlanMtuStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VlanMtuStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("vlan_mtu_status")
  private VlanMtuStatusEnum vlanMtuStatus = null;

  @SerializedName("results_per_transport_node")
  private List<HealthCheckResultPerTransportNode> resultsPerTransportNode = null;

   /**
   * Status of VLAN-MTU health check result; TRUNKED - all specified VLAN IDs are allowed by VLAN and MTU settings; UNTRUNKED - some/all specified VLAN IDs may be disallowed by VLAN or MTU settings; UNKNOWN - some/all health check result are unknown due to infrastructure issues. 
   * @return vlanMtuStatus
  **/
  @Schema(description = "Status of VLAN-MTU health check result; TRUNKED - all specified VLAN IDs are allowed by VLAN and MTU settings; UNTRUNKED - some/all specified VLAN IDs may be disallowed by VLAN or MTU settings; UNKNOWN - some/all health check result are unknown due to infrastructure issues. ")
  public VlanMtuStatusEnum getVlanMtuStatus() {
    return vlanMtuStatus;
  }

   /**
   * List of health check results on specific transport node 
   * @return resultsPerTransportNode
  **/
  @Schema(description = "List of health check results on specific transport node ")
  public List<HealthCheckResultPerTransportNode> getResultsPerTransportNode() {
    return resultsPerTransportNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.vlanMtuStatus, healthCheckResult.vlanMtuStatus) &&
        Objects.equals(this.resultsPerTransportNode, healthCheckResult.resultsPerTransportNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlanMtuStatus, resultsPerTransportNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    
    sb.append("    vlanMtuStatus: ").append(toIndentedString(vlanMtuStatus)).append("\n");
    sb.append("    resultsPerTransportNode: ").append(toIndentedString(resultsPerTransportNode)).append("\n");
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