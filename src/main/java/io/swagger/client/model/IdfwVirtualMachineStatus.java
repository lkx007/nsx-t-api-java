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
import io.swagger.client.model.IdfwVirtualMachineCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ID and status of the VM on Identity Firewall compute collection. 
 */
@Schema(description = "ID and status of the VM on Identity Firewall compute collection. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IdfwVirtualMachineStatus {
  @SerializedName("vm_status")
  private List<IdfwVirtualMachineCondition> vmStatus = new ArrayList<IdfwVirtualMachineCondition>();

  @SerializedName("vm_id")
  private String vmId = null;

  public IdfwVirtualMachineStatus vmStatus(List<IdfwVirtualMachineCondition> vmStatus) {
    this.vmStatus = vmStatus;
    return this;
  }

  public IdfwVirtualMachineStatus addVmStatusItem(IdfwVirtualMachineCondition vmStatusItem) {
    this.vmStatus.add(vmStatusItem);
    return this;
  }

   /**
   * Status of the Identity Firewall compute collection&#x27;s Virtual Machine. 
   * @return vmStatus
  **/
  @Schema(required = true, description = "Status of the Identity Firewall compute collection's Virtual Machine. ")
  public List<IdfwVirtualMachineCondition> getVmStatus() {
    return vmStatus;
  }

  public void setVmStatus(List<IdfwVirtualMachineCondition> vmStatus) {
    this.vmStatus = vmStatus;
  }

  public IdfwVirtualMachineStatus vmId(String vmId) {
    this.vmId = vmId;
    return this;
  }

   /**
   * VM ID of the VM on Identity Firewall compute collection. 
   * @return vmId
  **/
  @Schema(required = true, description = "VM ID of the VM on Identity Firewall compute collection. ")
  public String getVmId() {
    return vmId;
  }

  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdfwVirtualMachineStatus idfwVirtualMachineStatus = (IdfwVirtualMachineStatus) o;
    return Objects.equals(this.vmStatus, idfwVirtualMachineStatus.vmStatus) &&
        Objects.equals(this.vmId, idfwVirtualMachineStatus.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmStatus, vmId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfwVirtualMachineStatus {\n");
    
    sb.append("    vmStatus: ").append(toIndentedString(vmStatus)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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