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
 * NodeUserSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeUserSettings {
  @SerializedName("cli_username")
  private String cliUsername = "admin";

  @SerializedName("audit_username")
  private String auditUsername = null;

  @SerializedName("root_password")
  private String rootPassword = null;

  @SerializedName("cli_password")
  private String cliPassword = null;

  @SerializedName("audit_password")
  private String auditPassword = null;

  public NodeUserSettings cliUsername(String cliUsername) {
    this.cliUsername = cliUsername;
    return this;
  }

   /**
   * To configure username, you must provide this property together with &lt;b&gt;cli_password&lt;/b&gt;. Username must contain ASCII characters only. 
   * @return cliUsername
  **/
  @Schema(description = "To configure username, you must provide this property together with <b>cli_password</b>. Username must contain ASCII characters only. ")
  public String getCliUsername() {
    return cliUsername;
  }

  public void setCliUsername(String cliUsername) {
    this.cliUsername = cliUsername;
  }

  public NodeUserSettings auditUsername(String auditUsername) {
    this.auditUsername = auditUsername;
    return this;
  }

   /**
   * The default username is \&quot;audit\&quot;. To configure username, you must provide this property together with &lt;b&gt;audit_password&lt;/b&gt;. Username must contain ASCII characters only. 
   * @return auditUsername
  **/
  @Schema(description = "The default username is \"audit\". To configure username, you must provide this property together with <b>audit_password</b>. Username must contain ASCII characters only. ")
  public String getAuditUsername() {
    return auditUsername;
  }

  public void setAuditUsername(String auditUsername) {
    this.auditUsername = auditUsername;
  }

  public NodeUserSettings rootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
    return this;
  }

   /**
   * Password for the node root user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and  one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. 
   * @return rootPassword
  **/
  @Schema(description = "Password for the node root user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and  one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. ")
  public String getRootPassword() {
    return rootPassword;
  }

  public void setRootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
  }

  public NodeUserSettings cliPassword(String cliPassword) {
    this.cliPassword = cliPassword;
    return this;
  }

   /**
   * Password for the node cli user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. 
   * @return cliPassword
  **/
  @Schema(description = "Password for the node cli user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. ")
  public String getCliPassword() {
    return cliPassword;
  }

  public void setCliPassword(String cliPassword) {
    this.cliPassword = cliPassword;
  }

  public NodeUserSettings auditPassword(String auditPassword) {
    this.auditPassword = auditPassword;
    return this;
  }

   /**
   * Password for the node audit user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. 
   * @return auditPassword
  **/
  @Schema(description = "Password for the node audit user. For deployment, this property is required. After deployment, this property is ignored, and the node cli must be used to change the password. The password specified must be at least 12 characters in length and must contain at least one lowercase, one uppercase, one numeric character and one special character (except quotes). Passwords based on dictionary words and palindromes are invalid. ")
  public String getAuditPassword() {
    return auditPassword;
  }

  public void setAuditPassword(String auditPassword) {
    this.auditPassword = auditPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeUserSettings nodeUserSettings = (NodeUserSettings) o;
    return Objects.equals(this.cliUsername, nodeUserSettings.cliUsername) &&
        Objects.equals(this.auditUsername, nodeUserSettings.auditUsername) &&
        Objects.equals(this.rootPassword, nodeUserSettings.rootPassword) &&
        Objects.equals(this.cliPassword, nodeUserSettings.cliPassword) &&
        Objects.equals(this.auditPassword, nodeUserSettings.auditPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cliUsername, auditUsername, rootPassword, cliPassword, auditPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeUserSettings {\n");
    
    sb.append("    cliUsername: ").append(toIndentedString(cliUsername)).append("\n");
    sb.append("    auditUsername: ").append(toIndentedString(auditUsername)).append("\n");
    sb.append("    rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
    sb.append("    cliPassword: ").append(toIndentedString(cliPassword)).append("\n");
    sb.append("    auditPassword: ").append(toIndentedString(auditPassword)).append("\n");
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
