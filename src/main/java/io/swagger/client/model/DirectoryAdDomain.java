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
import io.swagger.client.model.DirectoryDomain;
import io.swagger.client.model.DirectoryDomainSyncSettings;
import io.swagger.client.model.DirectoryLdapServer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Active Directory Domain
 */
@Schema(description = "Active Directory Domain")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DirectoryAdDomain extends DirectoryDomain {
  @SerializedName("base_distinguished_name")
  private String baseDistinguishedName = null;

  @SerializedName("sync_settings")
  private DirectoryDomainSyncSettings syncSettings = null;

  @SerializedName("netbios_name")
  private String netbiosName = null;

  public DirectoryAdDomain baseDistinguishedName(String baseDistinguishedName) {
    this.baseDistinguishedName = baseDistinguishedName;
    return this;
  }

   /**
   * Each active directory domain has a domain naming context (NC), which contains domain-specific data. The root of this naming context is represented by a domain&#x27;s distinguished name (DN) and is typically referred to as the NC head.
   * @return baseDistinguishedName
  **/
  @Schema(required = true, description = "Each active directory domain has a domain naming context (NC), which contains domain-specific data. The root of this naming context is represented by a domain's distinguished name (DN) and is typically referred to as the NC head.")
  public String getBaseDistinguishedName() {
    return baseDistinguishedName;
  }

  public void setBaseDistinguishedName(String baseDistinguishedName) {
    this.baseDistinguishedName = baseDistinguishedName;
  }

  public DirectoryAdDomain syncSettings(DirectoryDomainSyncSettings syncSettings) {
    this.syncSettings = syncSettings;
    return this;
  }

   /**
   * Get syncSettings
   * @return syncSettings
  **/
  @Schema(description = "")
  public DirectoryDomainSyncSettings getSyncSettings() {
    return syncSettings;
  }

  public void setSyncSettings(DirectoryDomainSyncSettings syncSettings) {
    this.syncSettings = syncSettings;
  }

  public DirectoryAdDomain netbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
    return this;
  }

   /**
   * NetBIOS names can contain all alphanumeric characters except for the certain disallowed characters. Names can contain a period, but names cannot start with a period. NetBIOS is similar to DNS in that it can serve as a directory service, but more limited as it has no provisions for a name hierarchy and names are limited to 15 characters. The netbios name is case insensitive and is stored in upper case regardless of input case.
   * @return netbiosName
  **/
  @Schema(required = true, description = "NetBIOS names can contain all alphanumeric characters except for the certain disallowed characters. Names can contain a period, but names cannot start with a period. NetBIOS is similar to DNS in that it can serve as a directory service, but more limited as it has no provisions for a name hierarchy and names are limited to 15 characters. The netbios name is case insensitive and is stored in upper case regardless of input case.")
  public String getNetbiosName() {
    return netbiosName;
  }

  public void setNetbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectoryAdDomain directoryAdDomain = (DirectoryAdDomain) o;
    return Objects.equals(this.baseDistinguishedName, directoryAdDomain.baseDistinguishedName) &&
        Objects.equals(this.syncSettings, directoryAdDomain.syncSettings) &&
        Objects.equals(this.netbiosName, directoryAdDomain.netbiosName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDistinguishedName, syncSettings, netbiosName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryAdDomain {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baseDistinguishedName: ").append(toIndentedString(baseDistinguishedName)).append("\n");
    sb.append("    syncSettings: ").append(toIndentedString(syncSettings)).append("\n");
    sb.append("    netbiosName: ").append(toIndentedString(netbiosName)).append("\n");
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
