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
 * Domain synchronization settings
 */
@Schema(description = "Domain synchronization settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DirectoryDomainSyncSettings {
  @SerializedName("full_sync_cron_expr")
  private String fullSyncCronExpr = null;

  @SerializedName("delta_sync_interval")
  private Long deltaSyncInterval = 180l;

  public DirectoryDomainSyncSettings fullSyncCronExpr(String fullSyncCronExpr) {
    this.fullSyncCronExpr = fullSyncCronExpr;
    return this;
  }

   /**
   * Directory domain full synchronization schedule using cron expression. For example, cron expression \&quot;0 0 12 ? * SUN *\&quot; means full sync is scheduled every Sunday midnight. If this object is null, it means there is no background cron job running for full sync.
   * @return fullSyncCronExpr
  **/
  @Schema(description = "Directory domain full synchronization schedule using cron expression. For example, cron expression \"0 0 12 ? * SUN *\" means full sync is scheduled every Sunday midnight. If this object is null, it means there is no background cron job running for full sync.")
  public String getFullSyncCronExpr() {
    return fullSyncCronExpr;
  }

  public void setFullSyncCronExpr(String fullSyncCronExpr) {
    this.fullSyncCronExpr = fullSyncCronExpr;
  }

  public DirectoryDomainSyncSettings deltaSyncInterval(Long deltaSyncInterval) {
    this.deltaSyncInterval = deltaSyncInterval;
    return this;
  }

   /**
   * Directory domain delta synchronization interval time between two delta sync in minutes.
   * minimum: 5
   * maximum: 720
   * @return deltaSyncInterval
  **/
  @Schema(description = "Directory domain delta synchronization interval time between two delta sync in minutes.")
  public Long getDeltaSyncInterval() {
    return deltaSyncInterval;
  }

  public void setDeltaSyncInterval(Long deltaSyncInterval) {
    this.deltaSyncInterval = deltaSyncInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectoryDomainSyncSettings directoryDomainSyncSettings = (DirectoryDomainSyncSettings) o;
    return Objects.equals(this.fullSyncCronExpr, directoryDomainSyncSettings.fullSyncCronExpr) &&
        Objects.equals(this.deltaSyncInterval, directoryDomainSyncSettings.deltaSyncInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullSyncCronExpr, deltaSyncInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryDomainSyncSettings {\n");
    
    sb.append("    fullSyncCronExpr: ").append(toIndentedString(fullSyncCronExpr)).append("\n");
    sb.append("    deltaSyncInterval: ").append(toIndentedString(deltaSyncInterval)).append("\n");
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