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
 * Details of infrastructure hosting the container cluster e.g. vSphere, AWS, VMC etc.. 
 */
@Schema(description = "Details of infrastructure hosting the container cluster e.g. vSphere, AWS, VMC etc.. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ContainerInfrastructureInfo {
  /**
   * Type of the infrastructure.
   */
  @JsonAdapter(InfraTypeEnum.Adapter.class)
  public enum InfraTypeEnum {
    VSPHERE("vSphere"),
    AWS("AWS"),
    AZURE("Azure"),
    VMC("VMC"),
    KVM("KVM"),
    BAREMETAL("Baremetal");

    private String value;

    InfraTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InfraTypeEnum fromValue(String text) {
      for (InfraTypeEnum b : InfraTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InfraTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InfraTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InfraTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InfraTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("infra_type")
  private InfraTypeEnum infraType = null;

  public ContainerInfrastructureInfo infraType(InfraTypeEnum infraType) {
    this.infraType = infraType;
    return this;
  }

   /**
   * Type of the infrastructure.
   * @return infraType
  **/
  @Schema(required = true, description = "Type of the infrastructure.")
  public InfraTypeEnum getInfraType() {
    return infraType;
  }

  public void setInfraType(InfraTypeEnum infraType) {
    this.infraType = infraType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerInfrastructureInfo containerInfrastructureInfo = (ContainerInfrastructureInfo) o;
    return Objects.equals(this.infraType, containerInfrastructureInfo.infraType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infraType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerInfrastructureInfo {\n");
    
    sb.append("    infraType: ").append(toIndentedString(infraType)).append("\n");
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