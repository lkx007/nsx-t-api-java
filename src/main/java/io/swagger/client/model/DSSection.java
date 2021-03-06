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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DSSection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DSSection extends ManagedResource {
  @SerializedName("stateful")
  private Boolean stateful = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("applied_tos")
  private List<ResourceReference> appliedTos = null;

  @SerializedName("rule_count")
  private Long ruleCount = null;

  /**
   * Type of the rules which a section can contain. Only homogeneous sections are supported.
   */
  @JsonAdapter(SectionTypeEnum.Adapter.class)
  public enum SectionTypeEnum {
    LAYER2("LAYER2"),
    LAYER3("LAYER3"),
    L3REDIRECT("L3REDIRECT");

    private String value;

    SectionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SectionTypeEnum fromValue(String text) {
      for (SectionTypeEnum b : SectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SectionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("section_type")
  private SectionTypeEnum sectionType = null;

  public DSSection stateful(Boolean stateful) {
    this.stateful = stateful;
    return this;
  }

   /**
   * Stateful or Stateless nature of distributed service section is enforced on all rules inside the section. Layer3 sections can be stateful or stateless. Layer2 sections can only be stateless.
   * @return stateful
  **/
  @Schema(required = true, description = "Stateful or Stateless nature of distributed service section is enforced on all rules inside the section. Layer3 sections can be stateful or stateless. Layer2 sections can only be stateless.")
  public Boolean isStateful() {
    return stateful;
  }

  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }

   /**
   * It is a boolean flag which reflects whether a distributed service section is default section or not. Each Layer 3 and Layer 2 section will have at least and at most one default section.
   * @return isDefault
  **/
  @Schema(description = "It is a boolean flag which reflects whether a distributed service section is default section or not. Each Layer 3 and Layer 2 section will have at least and at most one default section.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public DSSection appliedTos(List<ResourceReference> appliedTos) {
    this.appliedTos = appliedTos;
    return this;
  }

  public DSSection addAppliedTosItem(ResourceReference appliedTosItem) {
    if (this.appliedTos == null) {
      this.appliedTos = new ArrayList<ResourceReference>();
    }
    this.appliedTos.add(appliedTosItem);
    return this;
  }

   /**
   * List of objects where the rules in this section will be enforced. This will take precedence over rule level appliedTo.
   * @return appliedTos
  **/
  @Schema(description = "List of objects where the rules in this section will be enforced. This will take precedence over rule level appliedTo.")
  public List<ResourceReference> getAppliedTos() {
    return appliedTos;
  }

  public void setAppliedTos(List<ResourceReference> appliedTos) {
    this.appliedTos = appliedTos;
  }

   /**
   * Number of rules in this section.
   * @return ruleCount
  **/
  @Schema(description = "Number of rules in this section.")
  public Long getRuleCount() {
    return ruleCount;
  }

  public DSSection sectionType(SectionTypeEnum sectionType) {
    this.sectionType = sectionType;
    return this;
  }

   /**
   * Type of the rules which a section can contain. Only homogeneous sections are supported.
   * @return sectionType
  **/
  @Schema(required = true, description = "Type of the rules which a section can contain. Only homogeneous sections are supported.")
  public SectionTypeEnum getSectionType() {
    return sectionType;
  }

  public void setSectionType(SectionTypeEnum sectionType) {
    this.sectionType = sectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSSection dsSection = (DSSection) o;
    return Objects.equals(this.stateful, dsSection.stateful) &&
        Objects.equals(this.isDefault, dsSection.isDefault) &&
        Objects.equals(this.appliedTos, dsSection.appliedTos) &&
        Objects.equals(this.ruleCount, dsSection.ruleCount) &&
        Objects.equals(this.sectionType, dsSection.sectionType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateful, isDefault, appliedTos, ruleCount, sectionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSSection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    appliedTos: ").append(toIndentedString(appliedTos)).append("\n");
    sb.append("    ruleCount: ").append(toIndentedString(ruleCount)).append("\n");
    sb.append("    sectionType: ").append(toIndentedString(sectionType)).append("\n");
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
