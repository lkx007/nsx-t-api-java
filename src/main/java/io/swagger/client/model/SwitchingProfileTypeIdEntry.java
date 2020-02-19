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
 * SwitchingProfileTypeIdEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SwitchingProfileTypeIdEntry {
  @SerializedName("value")
  private String value = null;

  /**
   * Supported switching profiles. &#x27;PortMirroringSwitchingProfile&#x27; is deprecated, please turn to \&quot;Troubleshooting And Monitoring: Portmirroring\&quot; and use PortMirroringSession API for port mirror function. 
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    QOSSWITCHINGPROFILE("QosSwitchingProfile"),
    PORTMIRRORINGSWITCHINGPROFILE("PortMirroringSwitchingProfile"),
    IPDISCOVERYSWITCHINGPROFILE("IpDiscoverySwitchingProfile"),
    SPOOFGUARDSWITCHINGPROFILE("SpoofGuardSwitchingProfile"),
    SWITCHSECURITYSWITCHINGPROFILE("SwitchSecuritySwitchingProfile"),
    MACMANAGEMENTSWITCHINGPROFILE("MacManagementSwitchingProfile");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KeyEnum fromValue(String text) {
      for (KeyEnum b : KeyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("key")
  private KeyEnum key = null;

  public SwitchingProfileTypeIdEntry value(String value) {
    this.value = value;
    return this;
  }

   /**
   * key value
   * @return value
  **/
  @Schema(required = true, description = "key value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SwitchingProfileTypeIdEntry key(KeyEnum key) {
    this.key = key;
    return this;
  }

   /**
   * Supported switching profiles. &#x27;PortMirroringSwitchingProfile&#x27; is deprecated, please turn to \&quot;Troubleshooting And Monitoring: Portmirroring\&quot; and use PortMirroringSession API for port mirror function. 
   * @return key
  **/
  @Schema(description = "Supported switching profiles. 'PortMirroringSwitchingProfile' is deprecated, please turn to \"Troubleshooting And Monitoring: Portmirroring\" and use PortMirroringSession API for port mirror function. ")
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchingProfileTypeIdEntry switchingProfileTypeIdEntry = (SwitchingProfileTypeIdEntry) o;
    return Objects.equals(this.value, switchingProfileTypeIdEntry.value) &&
        Objects.equals(this.key, switchingProfileTypeIdEntry.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchingProfileTypeIdEntry {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
