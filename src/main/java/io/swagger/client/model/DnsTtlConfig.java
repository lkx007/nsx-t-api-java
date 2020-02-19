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
 * Firewall to use TTL config to manage firewall cache to expire snooped FQDN entries from DNS response.
 */
@Schema(description = "Firewall to use TTL config to manage firewall cache to expire snooped FQDN entries from DNS response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DnsTtlConfig {
  @SerializedName("ttl")
  private Long ttl = 86400l;

  /**
   * TTL type to decide how to manage ttl.
   */
  @JsonAdapter(DnsTtlTypeEnum.Adapter.class)
  public enum DnsTtlTypeEnum {
    USE_TTL("USE_TTL"),
    AUTO("AUTO"),
    NEVER_EXPIRE("NEVER_EXPIRE");

    private String value;

    DnsTtlTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DnsTtlTypeEnum fromValue(String text) {
      for (DnsTtlTypeEnum b : DnsTtlTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DnsTtlTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DnsTtlTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DnsTtlTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DnsTtlTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dns_ttl_type")
  private DnsTtlTypeEnum dnsTtlType = null;

  public DnsTtlConfig ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * The number of seconds that snooped DNS responses are retained in the cache. Used only when dns_ttl_type is USE_TTL.
   * minimum: 3600
   * maximum: 864000
   * @return ttl
  **/
  @Schema(description = "The number of seconds that snooped DNS responses are retained in the cache. Used only when dns_ttl_type is USE_TTL.")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }

  public DnsTtlConfig dnsTtlType(DnsTtlTypeEnum dnsTtlType) {
    this.dnsTtlType = dnsTtlType;
    return this;
  }

   /**
   * TTL type to decide how to manage ttl.
   * @return dnsTtlType
  **/
  @Schema(required = true, description = "TTL type to decide how to manage ttl.")
  public DnsTtlTypeEnum getDnsTtlType() {
    return dnsTtlType;
  }

  public void setDnsTtlType(DnsTtlTypeEnum dnsTtlType) {
    this.dnsTtlType = dnsTtlType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTtlConfig dnsTtlConfig = (DnsTtlConfig) o;
    return Objects.equals(this.ttl, dnsTtlConfig.ttl) &&
        Objects.equals(this.dnsTtlType, dnsTtlConfig.dnsTtlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, dnsTtlType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTtlConfig {\n");
    
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    dnsTtlType: ").append(toIndentedString(dnsTtlType)).append("\n");
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