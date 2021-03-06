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
 * Status LDAP server of directory domain
 */
@Schema(description = "Status LDAP server of directory domain")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DirectoryLdapServerStatus {
  @SerializedName("error_id")
  private Long errorId = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  public DirectoryLdapServerStatus errorId(Long errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * Error ID of the directory LDAP server status maintained by the NSX directory service.
   * @return errorId
  **/
  @Schema(description = "Error ID of the directory LDAP server status maintained by the NSX directory service.")
  public Long getErrorId() {
    return errorId;
  }

  public void setErrorId(Long errorId) {
    this.errorId = errorId;
  }

  public DirectoryLdapServerStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message of the directory LDAP server status maintained by the NSX directory service.
   * @return errorMessage
  **/
  @Schema(description = "Error message of the directory LDAP server status maintained by the NSX directory service.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectoryLdapServerStatus directoryLdapServerStatus = (DirectoryLdapServerStatus) o;
    return Objects.equals(this.errorId, directoryLdapServerStatus.errorId) &&
        Objects.equals(this.errorMessage, directoryLdapServerStatus.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryLdapServerStatus {\n");
    
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
