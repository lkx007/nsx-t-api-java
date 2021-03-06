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
import io.swagger.client.model.ComponentTargetVersion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UpgradeSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UpgradeSummary {
  @SerializedName("upgrade_coordinator_updated")
  private Boolean upgradeCoordinatorUpdated = null;

  @SerializedName("target_version")
  private String targetVersion = null;

  @SerializedName("upgrade_coordinator_version")
  private String upgradeCoordinatorVersion = null;

  /**
   * Status of upgrade
   */
  @JsonAdapter(UpgradeStatusEnum.Adapter.class)
  public enum UpgradeStatusEnum {
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED"),
    PAUSING("PAUSING"),
    PAUSED("PAUSED");

    private String value;

    UpgradeStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UpgradeStatusEnum fromValue(String text) {
      for (UpgradeStatusEnum b : UpgradeStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UpgradeStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpgradeStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpgradeStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UpgradeStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("upgrade_status")
  private UpgradeStatusEnum upgradeStatus = null;

  @SerializedName("component_target_versions")
  private List<ComponentTargetVersion> componentTargetVersions = null;

  @SerializedName("system_version")
  private String systemVersion = null;

  @SerializedName("upgrade_bundle_file_name")
  private String upgradeBundleFileName = null;

   /**
   * Has upgrade coordinator been updated after upload of upgrade bundle file
   * @return upgradeCoordinatorUpdated
  **/
  @Schema(description = "Has upgrade coordinator been updated after upload of upgrade bundle file")
  public Boolean isUpgradeCoordinatorUpdated() {
    return upgradeCoordinatorUpdated;
  }

   /**
   * Target system version
   * @return targetVersion
  **/
  @Schema(description = "Target system version")
  public String getTargetVersion() {
    return targetVersion;
  }

   /**
   * Current version of upgrade coordinator
   * @return upgradeCoordinatorVersion
  **/
  @Schema(description = "Current version of upgrade coordinator")
  public String getUpgradeCoordinatorVersion() {
    return upgradeCoordinatorVersion;
  }

   /**
   * Status of upgrade
   * @return upgradeStatus
  **/
  @Schema(description = "Status of upgrade")
  public UpgradeStatusEnum getUpgradeStatus() {
    return upgradeStatus;
  }

   /**
   * Get componentTargetVersions
   * @return componentTargetVersions
  **/
  @Schema(description = "")
  public List<ComponentTargetVersion> getComponentTargetVersions() {
    return componentTargetVersions;
  }

   /**
   * Current system version
   * @return systemVersion
  **/
  @Schema(description = "Current system version")
  public String getSystemVersion() {
    return systemVersion;
  }

   /**
   * Name of the last successfully uploaded upgrade bundle file
   * @return upgradeBundleFileName
  **/
  @Schema(description = "Name of the last successfully uploaded upgrade bundle file")
  public String getUpgradeBundleFileName() {
    return upgradeBundleFileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeSummary upgradeSummary = (UpgradeSummary) o;
    return Objects.equals(this.upgradeCoordinatorUpdated, upgradeSummary.upgradeCoordinatorUpdated) &&
        Objects.equals(this.targetVersion, upgradeSummary.targetVersion) &&
        Objects.equals(this.upgradeCoordinatorVersion, upgradeSummary.upgradeCoordinatorVersion) &&
        Objects.equals(this.upgradeStatus, upgradeSummary.upgradeStatus) &&
        Objects.equals(this.componentTargetVersions, upgradeSummary.componentTargetVersions) &&
        Objects.equals(this.systemVersion, upgradeSummary.systemVersion) &&
        Objects.equals(this.upgradeBundleFileName, upgradeSummary.upgradeBundleFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeCoordinatorUpdated, targetVersion, upgradeCoordinatorVersion, upgradeStatus, componentTargetVersions, systemVersion, upgradeBundleFileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeSummary {\n");
    
    sb.append("    upgradeCoordinatorUpdated: ").append(toIndentedString(upgradeCoordinatorUpdated)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    upgradeCoordinatorVersion: ").append(toIndentedString(upgradeCoordinatorVersion)).append("\n");
    sb.append("    upgradeStatus: ").append(toIndentedString(upgradeStatus)).append("\n");
    sb.append("    componentTargetVersions: ").append(toIndentedString(componentTargetVersions)).append("\n");
    sb.append("    systemVersion: ").append(toIndentedString(systemVersion)).append("\n");
    sb.append("    upgradeBundleFileName: ").append(toIndentedString(upgradeBundleFileName)).append("\n");
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
