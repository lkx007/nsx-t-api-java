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
 * BgpAddressFamily
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BgpAddressFamily {
  @SerializedName("out_prefix_count")
  private Long outPrefixCount = null;

  /**
   * BGP address family type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IPV4_UNICAST("IPV4_UNICAST"),
    VPNV4_UNICAST("VPNV4_UNICAST"),
    IPV6_UNICAST("IPV6_UNICAST");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("in_prefix_count")
  private Long inPrefixCount = null;

   /**
   * Count of out prefixes
   * @return outPrefixCount
  **/
  @Schema(description = "Count of out prefixes")
  public Long getOutPrefixCount() {
    return outPrefixCount;
  }

   /**
   * BGP address family type
   * @return type
  **/
  @Schema(description = "BGP address family type")
  public TypeEnum getType() {
    return type;
  }

   /**
   * Count of in prefixes
   * @return inPrefixCount
  **/
  @Schema(description = "Count of in prefixes")
  public Long getInPrefixCount() {
    return inPrefixCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpAddressFamily bgpAddressFamily = (BgpAddressFamily) o;
    return Objects.equals(this.outPrefixCount, bgpAddressFamily.outPrefixCount) &&
        Objects.equals(this.type, bgpAddressFamily.type) &&
        Objects.equals(this.inPrefixCount, bgpAddressFamily.inPrefixCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outPrefixCount, type, inPrefixCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpAddressFamily {\n");
    
    sb.append("    outPrefixCount: ").append(toIndentedString(outPrefixCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inPrefixCount: ").append(toIndentedString(inPrefixCount)).append("\n");
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
