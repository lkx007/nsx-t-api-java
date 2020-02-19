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
import io.swagger.client.model.MigrationUnit;
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * MigrationUnitAggregateInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MigrationUnitAggregateInfo extends Resource {
  /**
   * Status of migration unit
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED"),
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

  @SerializedName("percent_complete")
  private BigDecimal percentComplete = null;

  @SerializedName("errors")
  private List<String> errors = null;

  @SerializedName("unit")
  private MigrationUnit unit = null;

   /**
   * Status of migration unit
   * @return status
  **/
  @Schema(description = "Status of migration unit")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * Indicator of migration progress in percentage
   * @return percentComplete
  **/
  @Schema(description = "Indicator of migration progress in percentage")
  public BigDecimal getPercentComplete() {
    return percentComplete;
  }

   /**
   * List of errors occurred during migration of this migration unit
   * @return errors
  **/
  @Schema(description = "List of errors occurred during migration of this migration unit")
  public List<String> getErrors() {
    return errors;
  }

  public MigrationUnitAggregateInfo unit(MigrationUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public MigrationUnit getUnit() {
    return unit;
  }

  public void setUnit(MigrationUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationUnitAggregateInfo migrationUnitAggregateInfo = (MigrationUnitAggregateInfo) o;
    return Objects.equals(this.status, migrationUnitAggregateInfo.status) &&
        Objects.equals(this.percentComplete, migrationUnitAggregateInfo.percentComplete) &&
        Objects.equals(this.errors, migrationUnitAggregateInfo.errors) &&
        Objects.equals(this.unit, migrationUnitAggregateInfo.unit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, percentComplete, errors, unit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationUnitAggregateInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
