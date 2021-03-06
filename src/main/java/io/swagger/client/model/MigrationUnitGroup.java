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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.MigrationUnit;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MigrationUnitGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MigrationUnitGroup extends ManagedResource {
  @SerializedName("migration_unit_count")
  private Integer migrationUnitCount = null;

  @SerializedName("migration_units")
  private List<MigrationUnit> migrationUnits = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("type")
  private String type = null;

  @SerializedName("parallel")
  private Boolean parallel = true;

  @SerializedName("extended_configuration")
  private List<KeyValuePair> extendedConfiguration = null;

   /**
   * Number of migration units in the group
   * @return migrationUnitCount
  **/
  @Schema(description = "Number of migration units in the group")
  public Integer getMigrationUnitCount() {
    return migrationUnitCount;
  }

  public MigrationUnitGroup migrationUnits(List<MigrationUnit> migrationUnits) {
    this.migrationUnits = migrationUnits;
    return this;
  }

  public MigrationUnitGroup addMigrationUnitsItem(MigrationUnit migrationUnitsItem) {
    if (this.migrationUnits == null) {
      this.migrationUnits = new ArrayList<MigrationUnit>();
    }
    this.migrationUnits.add(migrationUnitsItem);
    return this;
  }

   /**
   * List of migration units in the group
   * @return migrationUnits
  **/
  @Schema(description = "List of migration units in the group")
  public List<MigrationUnit> getMigrationUnits() {
    return migrationUnits;
  }

  public void setMigrationUnits(List<MigrationUnit> migrationUnits) {
    this.migrationUnits = migrationUnits;
  }

  public MigrationUnitGroup enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag to indicate whether migration of this group is enabled or not
   * @return enabled
  **/
  @Schema(description = "Flag to indicate whether migration of this group is enabled or not")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public MigrationUnitGroup type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Component type
   * @return type
  **/
  @Schema(required = true, description = "Component type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MigrationUnitGroup parallel(Boolean parallel) {
    this.parallel = parallel;
    return this;
  }

   /**
   * Migration method to specify whether the migration is to be performed in parallel or serially
   * @return parallel
  **/
  @Schema(description = "Migration method to specify whether the migration is to be performed in parallel or serially")
  public Boolean isParallel() {
    return parallel;
  }

  public void setParallel(Boolean parallel) {
    this.parallel = parallel;
  }

  public MigrationUnitGroup extendedConfiguration(List<KeyValuePair> extendedConfiguration) {
    this.extendedConfiguration = extendedConfiguration;
    return this;
  }

  public MigrationUnitGroup addExtendedConfigurationItem(KeyValuePair extendedConfigurationItem) {
    if (this.extendedConfiguration == null) {
      this.extendedConfiguration = new ArrayList<KeyValuePair>();
    }
    this.extendedConfiguration.add(extendedConfigurationItem);
    return this;
  }

   /**
   * Extended configuration for the group
   * @return extendedConfiguration
  **/
  @Schema(description = "Extended configuration for the group")
  public List<KeyValuePair> getExtendedConfiguration() {
    return extendedConfiguration;
  }

  public void setExtendedConfiguration(List<KeyValuePair> extendedConfiguration) {
    this.extendedConfiguration = extendedConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationUnitGroup migrationUnitGroup = (MigrationUnitGroup) o;
    return Objects.equals(this.migrationUnitCount, migrationUnitGroup.migrationUnitCount) &&
        Objects.equals(this.migrationUnits, migrationUnitGroup.migrationUnits) &&
        Objects.equals(this.enabled, migrationUnitGroup.enabled) &&
        Objects.equals(this.type, migrationUnitGroup.type) &&
        Objects.equals(this.parallel, migrationUnitGroup.parallel) &&
        Objects.equals(this.extendedConfiguration, migrationUnitGroup.extendedConfiguration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationUnitCount, migrationUnits, enabled, type, parallel, extendedConfiguration, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationUnitGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    migrationUnitCount: ").append(toIndentedString(migrationUnitCount)).append("\n");
    sb.append("    migrationUnits: ").append(toIndentedString(migrationUnits)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
    sb.append("    extendedConfiguration: ").append(toIndentedString(extendedConfiguration)).append("\n");
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
