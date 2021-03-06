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
import io.swagger.client.model.DirectoryGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DirectoryAdGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DirectoryAdGroup extends DirectoryGroup {
  @SerializedName("object_guid")
  private String objectGuid = null;

  @SerializedName("secure_id")
  private String secureId = null;

  public DirectoryAdGroup objectGuid(String objectGuid) {
    this.objectGuid = objectGuid;
    return this;
  }

   /**
   * GUID is a 128-bit value that is unique not only in the enterprise but also across the world. GUIDs are assigned to every object created by Active Directory, not just User and Group objects.
   * @return objectGuid
  **/
  @Schema(required = true, description = "GUID is a 128-bit value that is unique not only in the enterprise but also across the world. GUIDs are assigned to every object created by Active Directory, not just User and Group objects.")
  public String getObjectGuid() {
    return objectGuid;
  }

  public void setObjectGuid(String objectGuid) {
    this.objectGuid = objectGuid;
  }

  public DirectoryAdGroup secureId(String secureId) {
    this.secureId = secureId;
    return this;
  }

   /**
   * A security identifier (SID) is a unique value of variable length used to identify a trustee. A SID consists of the following components - The revision level of the SID structure; A 48-bit identifier authority value that identifies the authority that issued the SID; A variable number of subauthority or relative identifier (RID) values that uniquely identify the trustee relative to the authority that issued the SID.
   * @return secureId
  **/
  @Schema(required = true, description = "A security identifier (SID) is a unique value of variable length used to identify a trustee. A SID consists of the following components - The revision level of the SID structure; A 48-bit identifier authority value that identifies the authority that issued the SID; A variable number of subauthority or relative identifier (RID) values that uniquely identify the trustee relative to the authority that issued the SID.")
  public String getSecureId() {
    return secureId;
  }

  public void setSecureId(String secureId) {
    this.secureId = secureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectoryAdGroup directoryAdGroup = (DirectoryAdGroup) o;
    return Objects.equals(this.objectGuid, directoryAdGroup.objectGuid) &&
        Objects.equals(this.secureId, directoryAdGroup.secureId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectGuid, secureId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryAdGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    objectGuid: ").append(toIndentedString(objectGuid)).append("\n");
    sb.append("    secureId: ").append(toIndentedString(secureId)).append("\n");
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
