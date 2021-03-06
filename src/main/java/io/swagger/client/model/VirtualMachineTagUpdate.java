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
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VirtualMachineTagUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VirtualMachineTagUpdate {
  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("tags")
  private List<Tag> tags = new ArrayList<Tag>();

  public VirtualMachineTagUpdate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External id of the virtual machine to which tags are to be applied
   * @return externalId
  **/
  @Schema(required = true, description = "External id of the virtual machine to which tags are to be applied")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public VirtualMachineTagUpdate tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public VirtualMachineTagUpdate addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags to be applied to the virtual machine
   * @return tags
  **/
  @Schema(required = true, description = "List of tags to be applied to the virtual machine")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualMachineTagUpdate virtualMachineTagUpdate = (VirtualMachineTagUpdate) o;
    return Objects.equals(this.externalId, virtualMachineTagUpdate.externalId) &&
        Objects.equals(this.tags, virtualMachineTagUpdate.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualMachineTagUpdate {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
