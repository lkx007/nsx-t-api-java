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
import io.swagger.client.model.IdfwDirGroupUserSessionMapping;
import io.swagger.client.model.IdfwUserSessionData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Identity Firewall user session data list and Directory Group to user mappings. 
 */
@Schema(description = "Identity Firewall user session data list and Directory Group to user mappings. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IdfwUserSessionDataAndMappings {
  @SerializedName("archived_user_sessions")
  private List<IdfwUserSessionData> archivedUserSessions = new ArrayList<IdfwUserSessionData>();

  @SerializedName("active_user_sessions")
  private List<IdfwUserSessionData> activeUserSessions = new ArrayList<IdfwUserSessionData>();

  @SerializedName("dir_group_to_user_session_data_mappings")
  private List<IdfwDirGroupUserSessionMapping> dirGroupToUserSessionDataMappings = new ArrayList<IdfwDirGroupUserSessionMapping>();

  public IdfwUserSessionDataAndMappings archivedUserSessions(List<IdfwUserSessionData> archivedUserSessions) {
    this.archivedUserSessions = archivedUserSessions;
    return this;
  }

  public IdfwUserSessionDataAndMappings addArchivedUserSessionsItem(IdfwUserSessionData archivedUserSessionsItem) {
    this.archivedUserSessions.add(archivedUserSessionsItem);
    return this;
  }

   /**
   * Archived user session data list
   * @return archivedUserSessions
  **/
  @Schema(required = true, description = "Archived user session data list")
  public List<IdfwUserSessionData> getArchivedUserSessions() {
    return archivedUserSessions;
  }

  public void setArchivedUserSessions(List<IdfwUserSessionData> archivedUserSessions) {
    this.archivedUserSessions = archivedUserSessions;
  }

  public IdfwUserSessionDataAndMappings activeUserSessions(List<IdfwUserSessionData> activeUserSessions) {
    this.activeUserSessions = activeUserSessions;
    return this;
  }

  public IdfwUserSessionDataAndMappings addActiveUserSessionsItem(IdfwUserSessionData activeUserSessionsItem) {
    this.activeUserSessions.add(activeUserSessionsItem);
    return this;
  }

   /**
   * Active user session data list
   * @return activeUserSessions
  **/
  @Schema(required = true, description = "Active user session data list")
  public List<IdfwUserSessionData> getActiveUserSessions() {
    return activeUserSessions;
  }

  public void setActiveUserSessions(List<IdfwUserSessionData> activeUserSessions) {
    this.activeUserSessions = activeUserSessions;
  }

  public IdfwUserSessionDataAndMappings dirGroupToUserSessionDataMappings(List<IdfwDirGroupUserSessionMapping> dirGroupToUserSessionDataMappings) {
    this.dirGroupToUserSessionDataMappings = dirGroupToUserSessionDataMappings;
    return this;
  }

  public IdfwUserSessionDataAndMappings addDirGroupToUserSessionDataMappingsItem(IdfwDirGroupUserSessionMapping dirGroupToUserSessionDataMappingsItem) {
    this.dirGroupToUserSessionDataMappings.add(dirGroupToUserSessionDataMappingsItem);
    return this;
  }

   /**
   * Directory Group to user session data mappings
   * @return dirGroupToUserSessionDataMappings
  **/
  @Schema(required = true, description = "Directory Group to user session data mappings")
  public List<IdfwDirGroupUserSessionMapping> getDirGroupToUserSessionDataMappings() {
    return dirGroupToUserSessionDataMappings;
  }

  public void setDirGroupToUserSessionDataMappings(List<IdfwDirGroupUserSessionMapping> dirGroupToUserSessionDataMappings) {
    this.dirGroupToUserSessionDataMappings = dirGroupToUserSessionDataMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdfwUserSessionDataAndMappings idfwUserSessionDataAndMappings = (IdfwUserSessionDataAndMappings) o;
    return Objects.equals(this.archivedUserSessions, idfwUserSessionDataAndMappings.archivedUserSessions) &&
        Objects.equals(this.activeUserSessions, idfwUserSessionDataAndMappings.activeUserSessions) &&
        Objects.equals(this.dirGroupToUserSessionDataMappings, idfwUserSessionDataAndMappings.dirGroupToUserSessionDataMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivedUserSessions, activeUserSessions, dirGroupToUserSessionDataMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfwUserSessionDataAndMappings {\n");
    
    sb.append("    archivedUserSessions: ").append(toIndentedString(archivedUserSessions)).append("\n");
    sb.append("    activeUserSessions: ").append(toIndentedString(activeUserSessions)).append("\n");
    sb.append("    dirGroupToUserSessionDataMappings: ").append(toIndentedString(dirGroupToUserSessionDataMappings)).append("\n");
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
