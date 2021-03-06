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
import io.swagger.client.model.KeyValuePair;
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.client.model.UpgradeCheckListResults;
import io.swagger.client.model.UpgradeUnitGroupInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * UpgradeUnitAggregateInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UpgradeUnitAggregateInfo extends Resource {
  /**
   * Status of upgrade unit
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED"),
    PAUSING("PAUSING"),
    PAUSED("PAUSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("pre_upgrade_checks")
  private UpgradeCheckListResults preUpgradeChecks = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("post_upgrade_checks")
  private UpgradeCheckListResults postUpgradeChecks = null;

  @SerializedName("warnings")
  private List<String> warnings = null;

  @SerializedName("current_version")
  private String currentVersion = null;

  @SerializedName("group")
  private UpgradeUnitGroupInfo group = null;

  @SerializedName("percent_complete")
  private BigDecimal percentComplete = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("metadata")
  private List<KeyValuePair> metadata = null;

   /**
   * Status of upgrade unit
   * @return status
  **/
  @Schema(description = "Status of upgrade unit")
  public StatusEnum getStatus() {
    return status;
  }

  public UpgradeUnitAggregateInfo preUpgradeChecks(UpgradeCheckListResults preUpgradeChecks) {
    this.preUpgradeChecks = preUpgradeChecks;
    return this;
  }

   /**
   * Get preUpgradeChecks
   * @return preUpgradeChecks
  **/
  @Schema(description = "")
  public UpgradeCheckListResults getPreUpgradeChecks() {
    return preUpgradeChecks;
  }

  public void setPreUpgradeChecks(UpgradeCheckListResults preUpgradeChecks) {
    this.preUpgradeChecks = preUpgradeChecks;
  }

   /**
   * List of errors occurred during upgrade of this upgrade unit
   * @return errors
  **/
  @Schema(description = "List of errors occurred during upgrade of this upgrade unit")
  public List<String> getErrors() {
    return errors;
  }

  public UpgradeUnitAggregateInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the upgrade unit
   * @return displayName
  **/
  @Schema(description = "Name of the upgrade unit")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UpgradeUnitAggregateInfo postUpgradeChecks(UpgradeCheckListResults postUpgradeChecks) {
    this.postUpgradeChecks = postUpgradeChecks;
    return this;
  }

   /**
   * Get postUpgradeChecks
   * @return postUpgradeChecks
  **/
  @Schema(description = "")
  public UpgradeCheckListResults getPostUpgradeChecks() {
    return postUpgradeChecks;
  }

  public void setPostUpgradeChecks(UpgradeCheckListResults postUpgradeChecks) {
    this.postUpgradeChecks = postUpgradeChecks;
  }

   /**
   * List of warnings indicating issues with the upgrade unit that may result in upgrade failure
   * @return warnings
  **/
  @Schema(description = "List of warnings indicating issues with the upgrade unit that may result in upgrade failure")
  public List<String> getWarnings() {
    return warnings;
  }

   /**
   * This is component version e.g. if upgrade unit is of type edge, then this is edge version.
   * @return currentVersion
  **/
  @Schema(description = "This is component version e.g. if upgrade unit is of type edge, then this is edge version.")
  public String getCurrentVersion() {
    return currentVersion;
  }

  public UpgradeUnitAggregateInfo group(UpgradeUnitGroupInfo group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public UpgradeUnitGroupInfo getGroup() {
    return group;
  }

  public void setGroup(UpgradeUnitGroupInfo group) {
    this.group = group;
  }

   /**
   * Indicator of upgrade progress in percentage
   * @return percentComplete
  **/
  @Schema(description = "Indicator of upgrade progress in percentage")
  public BigDecimal getPercentComplete() {
    return percentComplete;
  }

  public UpgradeUnitAggregateInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Upgrade unit type
   * @return type
  **/
  @Schema(description = "Upgrade unit type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * Identifier of the upgrade unit
   * @return id
  **/
  @Schema(description = "Identifier of the upgrade unit")
  public String getId() {
    return id;
  }

   /**
   * Metadata about upgrade unit
   * @return metadata
  **/
  @Schema(description = "Metadata about upgrade unit")
  public List<KeyValuePair> getMetadata() {
    return metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeUnitAggregateInfo upgradeUnitAggregateInfo = (UpgradeUnitAggregateInfo) o;
    return Objects.equals(this.status, upgradeUnitAggregateInfo.status) &&
        Objects.equals(this.preUpgradeChecks, upgradeUnitAggregateInfo.preUpgradeChecks) &&
        Objects.equals(this.errors, upgradeUnitAggregateInfo.errors) &&
        Objects.equals(this.displayName, upgradeUnitAggregateInfo.displayName) &&
        Objects.equals(this.postUpgradeChecks, upgradeUnitAggregateInfo.postUpgradeChecks) &&
        Objects.equals(this.warnings, upgradeUnitAggregateInfo.warnings) &&
        Objects.equals(this.currentVersion, upgradeUnitAggregateInfo.currentVersion) &&
        Objects.equals(this.group, upgradeUnitAggregateInfo.group) &&
        Objects.equals(this.percentComplete, upgradeUnitAggregateInfo.percentComplete) &&
        Objects.equals(this.type, upgradeUnitAggregateInfo.type) &&
        Objects.equals(this.id, upgradeUnitAggregateInfo.id) &&
        Objects.equals(this.metadata, upgradeUnitAggregateInfo.metadata) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, preUpgradeChecks, errors, displayName, postUpgradeChecks, warnings, currentVersion, group, percentComplete, type, id, metadata, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeUnitAggregateInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    preUpgradeChecks: ").append(toIndentedString(preUpgradeChecks)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    postUpgradeChecks: ").append(toIndentedString(postUpgradeChecks)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
