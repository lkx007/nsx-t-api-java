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
import io.swagger.client.model.BaseSwitchingProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SpoofGuard configuration
 */
@Schema(description = "SpoofGuard configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SpoofGuardSwitchingProfile extends BaseSwitchingProfile {
  /**
   * Ways to provide white listed addresses for SpoofGuard
   */
  @JsonAdapter(WhiteListProvidersEnum.Adapter.class)
  public enum WhiteListProvidersEnum {
    LPORT_BINDINGS("LPORT_BINDINGS"),
    LSWITCH_BINDINGS("LSWITCH_BINDINGS");

    private String value;

    WhiteListProvidersEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WhiteListProvidersEnum fromValue(String text) {
      for (WhiteListProvidersEnum b : WhiteListProvidersEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WhiteListProvidersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhiteListProvidersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WhiteListProvidersEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WhiteListProvidersEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("white_list_providers")
  private List<WhiteListProvidersEnum> whiteListProviders = new ArrayList<WhiteListProvidersEnum>();

  public SpoofGuardSwitchingProfile whiteListProviders(List<WhiteListProvidersEnum> whiteListProviders) {
    this.whiteListProviders = whiteListProviders;
    return this;
  }

  public SpoofGuardSwitchingProfile addWhiteListProvidersItem(WhiteListProvidersEnum whiteListProvidersItem) {
    this.whiteListProviders.add(whiteListProvidersItem);
    return this;
  }

   /**
   * List of providers for white listed address bindings.
   * @return whiteListProviders
  **/
  @Schema(required = true, description = "List of providers for white listed address bindings.")
  public List<WhiteListProvidersEnum> getWhiteListProviders() {
    return whiteListProviders;
  }

  public void setWhiteListProviders(List<WhiteListProvidersEnum> whiteListProviders) {
    this.whiteListProviders = whiteListProviders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpoofGuardSwitchingProfile spoofGuardSwitchingProfile = (SpoofGuardSwitchingProfile) o;
    return Objects.equals(this.whiteListProviders, spoofGuardSwitchingProfile.whiteListProviders) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whiteListProviders, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpoofGuardSwitchingProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    whiteListProviders: ").append(toIndentedString(whiteListProviders)).append("\n");
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
