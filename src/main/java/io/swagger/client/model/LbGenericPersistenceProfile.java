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
import io.swagger.client.model.LbPersistenceProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The profile is used to define the persistence entry expiration time, mirroring enabled flag to synchronize persistence entries, persistence shared flag for the associated virtual servers. The profile cannot be attached to virtual server directly, it can be only consumed by LB rule action. In HTTP forwarding phase, LBVariablePersistenceOnAction can be used to consume LbGenericPersistenceProfile. In HTTP response rewriting phase, LBVariablePersistenceLearnAction is used instead. 
 */
@Schema(description = "The profile is used to define the persistence entry expiration time, mirroring enabled flag to synchronize persistence entries, persistence shared flag for the associated virtual servers. The profile cannot be attached to virtual server directly, it can be only consumed by LB rule action. In HTTP forwarding phase, LBVariablePersistenceOnAction can be used to consume LbGenericPersistenceProfile. In HTTP response rewriting phase, LBVariablePersistenceLearnAction is used instead. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbGenericPersistenceProfile extends LbPersistenceProfile {
  @SerializedName("ha_persistence_mirroring_enabled")
  private Boolean haPersistenceMirroringEnabled = false;

  @SerializedName("timeout")
  private Long timeout = 300l;

  public LbGenericPersistenceProfile haPersistenceMirroringEnabled(Boolean haPersistenceMirroringEnabled) {
    this.haPersistenceMirroringEnabled = haPersistenceMirroringEnabled;
    return this;
  }

   /**
   * The mirroring enabled flag is to synchronize persistence entries. Persistence entries are not synchronized to the HA peer by default. 
   * @return haPersistenceMirroringEnabled
  **/
  @Schema(description = "The mirroring enabled flag is to synchronize persistence entries. Persistence entries are not synchronized to the HA peer by default. ")
  public Boolean isHaPersistenceMirroringEnabled() {
    return haPersistenceMirroringEnabled;
  }

  public void setHaPersistenceMirroringEnabled(Boolean haPersistenceMirroringEnabled) {
    this.haPersistenceMirroringEnabled = haPersistenceMirroringEnabled;
  }

  public LbGenericPersistenceProfile timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * When all connections complete (reference count reaches 0), persistence entry timer is started with the expiration time. 
   * minimum: 1
   * maximum: 2147483647
   * @return timeout
  **/
  @Schema(description = "When all connections complete (reference count reaches 0), persistence entry timer is started with the expiration time. ")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbGenericPersistenceProfile lbGenericPersistenceProfile = (LbGenericPersistenceProfile) o;
    return Objects.equals(this.haPersistenceMirroringEnabled, lbGenericPersistenceProfile.haPersistenceMirroringEnabled) &&
        Objects.equals(this.timeout, lbGenericPersistenceProfile.timeout) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haPersistenceMirroringEnabled, timeout, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbGenericPersistenceProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    haPersistenceMirroringEnabled: ").append(toIndentedString(haPersistenceMirroringEnabled)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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