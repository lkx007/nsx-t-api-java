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
import io.swagger.client.model.NicInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Contains a set of information of a VM on the network interfaces present on the partner appliance that needs to be configured by the NSX Manager.
 */
@Schema(description = "Contains a set of information of a VM on the network interfaces present on the partner appliance that needs to be configured by the NSX Manager.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VmNicInfo {
  @SerializedName("nic_infos")
  private List<NicInfo> nicInfos = new ArrayList<NicInfo>();

  public VmNicInfo nicInfos(List<NicInfo> nicInfos) {
    this.nicInfos = nicInfos;
    return this;
  }

  public VmNicInfo addNicInfosItem(NicInfo nicInfosItem) {
    this.nicInfos.add(nicInfosItem);
    return this;
  }

   /**
   * Set of information of a VM on the network interfaces present on the partner appliance that needs to be configured by the NSX Manager.
   * @return nicInfos
  **/
  @Schema(required = true, description = "Set of information of a VM on the network interfaces present on the partner appliance that needs to be configured by the NSX Manager.")
  public List<NicInfo> getNicInfos() {
    return nicInfos;
  }

  public void setNicInfos(List<NicInfo> nicInfos) {
    this.nicInfos = nicInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmNicInfo vmNicInfo = (VmNicInfo) o;
    return Objects.equals(this.nicInfos, vmNicInfo.nicInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmNicInfo {\n");
    
    sb.append("    nicInfos: ").append(toIndentedString(nicInfos)).append("\n");
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
