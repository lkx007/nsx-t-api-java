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
 * SSH Service properties
 */
@Schema(description = "SSH Service properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SshServiceProperties {
  @SerializedName("start_on_boot")
  private Boolean startOnBoot = null;

  public SshServiceProperties startOnBoot(Boolean startOnBoot) {
    this.startOnBoot = startOnBoot;
    return this;
  }

   /**
   * Start service when system boots
   * @return startOnBoot
  **/
  @Schema(required = true, description = "Start service when system boots")
  public Boolean isStartOnBoot() {
    return startOnBoot;
  }

  public void setStartOnBoot(Boolean startOnBoot) {
    this.startOnBoot = startOnBoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshServiceProperties sshServiceProperties = (SshServiceProperties) o;
    return Objects.equals(this.startOnBoot, sshServiceProperties.startOnBoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOnBoot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshServiceProperties {\n");
    
    sb.append("    startOnBoot: ").append(toIndentedString(startOnBoot)).append("\n");
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
