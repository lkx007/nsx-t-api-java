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
 * Section query parameters
 */
@Schema(description = "Section query parameters")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DSSectionQueryParameters {
  @SerializedName("cascade")
  private Boolean cascade = false;

  public DSSectionQueryParameters cascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

   /**
   * Flag to cascade delete of this object to all it&#x27;s child objects.
   * @return cascade
  **/
  @Schema(description = "Flag to cascade delete of this object to all it's child objects.")
  public Boolean isCascade() {
    return cascade;
  }

  public void setCascade(Boolean cascade) {
    this.cascade = cascade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSSectionQueryParameters dsSectionQueryParameters = (DSSectionQueryParameters) o;
    return Objects.equals(this.cascade, dsSectionQueryParameters.cascade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSSectionQueryParameters {\n");
    
    sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
