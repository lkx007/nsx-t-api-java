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
 * DeploymentConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class DeploymentConfig {
  /**
   * Gets or Sets placementType
   */
  @JsonAdapter(PlacementTypeEnum.Adapter.class)
  public enum PlacementTypeEnum {
    VSPHEREDEPLOYMENTCONFIG("VsphereDeploymentConfig");

    private String value;

    PlacementTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PlacementTypeEnum fromValue(String text) {
      for (PlacementTypeEnum b : PlacementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PlacementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlacementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlacementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlacementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("placement_type")
  private PlacementTypeEnum placementType = null;

  public DeploymentConfig() {
    this.placement_type = this.getClass().getSimpleName();
  }
  public DeploymentConfig placementType(PlacementTypeEnum placementType) {
    this.placementType = placementType;
    return this;
  }

   /**
   * Get placementType
   * @return placementType
  **/
  @Schema(required = true, description = "")
  public PlacementTypeEnum getPlacementType() {
    return placementType;
  }

  public void setPlacementType(PlacementTypeEnum placementType) {
    this.placementType = placementType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentConfig deploymentConfig = (DeploymentConfig) o;
    return Objects.equals(this.placementType, deploymentConfig.placementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentConfig {\n");
    
    sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
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
