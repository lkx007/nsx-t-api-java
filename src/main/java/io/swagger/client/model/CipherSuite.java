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
 * TLS cipher suite
 */
@Schema(description = "TLS cipher suite")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class CipherSuite {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("name")
  private String name = null;

  public CipherSuite enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable status for this cipher suite
   * @return enabled
  **/
  @Schema(required = true, description = "Enable status for this cipher suite")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CipherSuite name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the TLS cipher suite
   * @return name
  **/
  @Schema(required = true, description = "Name of the TLS cipher suite")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CipherSuite cipherSuite = (CipherSuite) o;
    return Objects.equals(this.enabled, cipherSuite.enabled) &&
        Objects.equals(this.name, cipherSuite.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CipherSuite {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
