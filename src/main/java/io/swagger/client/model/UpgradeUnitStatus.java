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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * UpgradeUnitStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UpgradeUnitStatus {
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

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("percent_complete")
  private BigDecimal percentComplete = null;

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

   /**
   * List of errors occurred during upgrade of this upgrade unit
   * @return errors
  **/
  @Schema(description = "List of errors occurred during upgrade of this upgrade unit")
  public List<String> getErrors() {
    return errors;
  }

   /**
   * Name of upgrade unit
   * @return displayName
  **/
  @Schema(description = "Name of upgrade unit")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Indicator of upgrade progress in percentage
   * @return percentComplete
  **/
  @Schema(description = "Indicator of upgrade progress in percentage")
  public BigDecimal getPercentComplete() {
    return percentComplete;
  }

   /**
   * Identifier of upgrade unit
   * @return id
  **/
  @Schema(description = "Identifier of upgrade unit")
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
    UpgradeUnitStatus upgradeUnitStatus = (UpgradeUnitStatus) o;
    return Objects.equals(this.status, upgradeUnitStatus.status) &&
        Objects.equals(this.errors, upgradeUnitStatus.errors) &&
        Objects.equals(this.displayName, upgradeUnitStatus.displayName) &&
        Objects.equals(this.percentComplete, upgradeUnitStatus.percentComplete) &&
        Objects.equals(this.id, upgradeUnitStatus.id) &&
        Objects.equals(this.metadata, upgradeUnitStatus.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors, displayName, percentComplete, id, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeUnitStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
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