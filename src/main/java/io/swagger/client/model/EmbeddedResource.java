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
import io.swagger.client.model.OwnerResourceLink;
import io.swagger.client.model.RevisionedResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Base class for resources that are embedded in other resources
 */
@Schema(description = "Base class for resources that are embedded in other resources")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class EmbeddedResource extends RevisionedResource {
  @SerializedName("_owner")
  private OwnerResourceLink _owner = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("resource_type")
  private String resourceType = null;

  @SerializedName("description")
  private String description = null;

  public EmbeddedResource _owner(OwnerResourceLink _owner) {
    this._owner = _owner;
    return this;
  }

   /**
   * Get _owner
   * @return _owner
  **/
  @Schema(description = "")
  public OwnerResourceLink getOwner() {
    return _owner;
  }

  public void setOwner(OwnerResourceLink _owner) {
    this._owner = _owner;
  }

  public EmbeddedResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Defaults to ID if not set
   * @return displayName
  **/
  @Schema(description = "Defaults to ID if not set")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

   /**
   * Identifier of the resource
   * @return id
  **/
  @Schema(description = "Identifier of the resource")
  public String getId() {
    return id;
  }

  public EmbeddedResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The type of this resource.
   * @return resourceType
  **/
  @Schema(description = "The type of this resource.")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public EmbeddedResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of this resource
   * @return description
  **/
  @Schema(description = "Description of this resource")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedResource embeddedResource = (EmbeddedResource) o;
    return Objects.equals(this._owner, embeddedResource._owner) &&
        Objects.equals(this.displayName, embeddedResource.displayName) &&
        Objects.equals(this.id, embeddedResource.id) &&
        Objects.equals(this.resourceType, embeddedResource.resourceType) &&
        Objects.equals(this.description, embeddedResource.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_owner, displayName, id, resourceType, description, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _owner: ").append(toIndentedString(_owner)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
