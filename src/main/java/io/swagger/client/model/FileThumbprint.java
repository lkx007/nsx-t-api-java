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
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * File thumbprint
 */
@Schema(description = "File thumbprint")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FileThumbprint extends Resource {
  @SerializedName("sha256")
  private String sha256 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sha1")
  private String sha1 = null;

  public FileThumbprint sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * File&#x27;s SHA256 thumbprint
   * @return sha256
  **/
  @Schema(required = true, description = "File's SHA256 thumbprint")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public FileThumbprint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File name
   * @return name
  **/
  @Schema(required = true, description = "File name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileThumbprint sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * File&#x27;s SHA1 thumbprint
   * @return sha1
  **/
  @Schema(required = true, description = "File's SHA1 thumbprint")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileThumbprint fileThumbprint = (FileThumbprint) o;
    return Objects.equals(this.sha256, fileThumbprint.sha256) &&
        Objects.equals(this.name, fileThumbprint.name) &&
        Objects.equals(this.sha1, fileThumbprint.sha1) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha256, name, sha1, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileThumbprint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
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
