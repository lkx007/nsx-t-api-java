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
import io.swagger.client.model.IdfwUserSessionData;
import io.swagger.client.model.ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Identity Firewall user login/session data for a single VM
 */
@Schema(description = "Identity Firewall user login/session data for a single VM")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IdfwVmDetail {
  @SerializedName("vm_ext_id")
  private String vmExtId = null;

  @SerializedName("vm_ip_addresses")
  private List<String> vmIpAddresses = null;

  @SerializedName("last_login_user_session")
  private ResourceReference lastLoginUserSession = null;

  @SerializedName("user_sessions")
  private List<IdfwUserSessionData> userSessions = new ArrayList<IdfwUserSessionData>();

  public IdfwVmDetail vmExtId(String vmExtId) {
    this.vmExtId = vmExtId;
    return this;
  }

   /**
   * Virtual machine (external ID or BIOS UUID) where login/logout event occurred.
   * @return vmExtId
  **/
  @Schema(required = true, description = "Virtual machine (external ID or BIOS UUID) where login/logout event occurred.")
  public String getVmExtId() {
    return vmExtId;
  }

  public void setVmExtId(String vmExtId) {
    this.vmExtId = vmExtId;
  }

  public IdfwVmDetail vmIpAddresses(List<String> vmIpAddresses) {
    this.vmIpAddresses = vmIpAddresses;
    return this;
  }

  public IdfwVmDetail addVmIpAddressesItem(String vmIpAddressesItem) {
    if (this.vmIpAddresses == null) {
      this.vmIpAddresses = new ArrayList<String>();
    }
    this.vmIpAddresses.add(vmIpAddressesItem);
    return this;
  }

   /**
   * List of client machine IP addresses.
   * @return vmIpAddresses
  **/
  @Schema(description = "List of client machine IP addresses.")
  public List<String> getVmIpAddresses() {
    return vmIpAddresses;
  }

  public void setVmIpAddresses(List<String> vmIpAddresses) {
    this.vmIpAddresses = vmIpAddresses;
  }

  public IdfwVmDetail lastLoginUserSession(ResourceReference lastLoginUserSession) {
    this.lastLoginUserSession = lastLoginUserSession;
    return this;
  }

   /**
   * Get lastLoginUserSession
   * @return lastLoginUserSession
  **/
  @Schema(description = "")
  public ResourceReference getLastLoginUserSession() {
    return lastLoginUserSession;
  }

  public void setLastLoginUserSession(ResourceReference lastLoginUserSession) {
    this.lastLoginUserSession = lastLoginUserSession;
  }

  public IdfwVmDetail userSessions(List<IdfwUserSessionData> userSessions) {
    this.userSessions = userSessions;
    return this;
  }

  public IdfwVmDetail addUserSessionsItem(IdfwUserSessionData userSessionsItem) {
    this.userSessions.add(userSessionsItem);
    return this;
  }

   /**
   * List of user session data.
   * @return userSessions
  **/
  @Schema(required = true, description = "List of user session data.")
  public List<IdfwUserSessionData> getUserSessions() {
    return userSessions;
  }

  public void setUserSessions(List<IdfwUserSessionData> userSessions) {
    this.userSessions = userSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdfwVmDetail idfwVmDetail = (IdfwVmDetail) o;
    return Objects.equals(this.vmExtId, idfwVmDetail.vmExtId) &&
        Objects.equals(this.vmIpAddresses, idfwVmDetail.vmIpAddresses) &&
        Objects.equals(this.lastLoginUserSession, idfwVmDetail.lastLoginUserSession) &&
        Objects.equals(this.userSessions, idfwVmDetail.userSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmExtId, vmIpAddresses, lastLoginUserSession, userSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfwVmDetail {\n");
    
    sb.append("    vmExtId: ").append(toIndentedString(vmExtId)).append("\n");
    sb.append("    vmIpAddresses: ").append(toIndentedString(vmIpAddresses)).append("\n");
    sb.append("    lastLoginUserSession: ").append(toIndentedString(lastLoginUserSession)).append("\n");
    sb.append("    userSessions: ").append(toIndentedString(userSessions)).append("\n");
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
