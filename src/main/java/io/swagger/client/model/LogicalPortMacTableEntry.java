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
 * LogicalPortMacTableEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LogicalPortMacTableEntry {
  /**
   * The type of the MAC address
   */
  @JsonAdapter(MacTypeEnum.Adapter.class)
  public enum MacTypeEnum {
    STATIC("STATIC"),
    LEARNED("LEARNED");

    private String value;

    MacTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MacTypeEnum fromValue(String text) {
      for (MacTypeEnum b : MacTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MacTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MacTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MacTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MacTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("mac_type")
  private MacTypeEnum macType = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  public LogicalPortMacTableEntry macType(MacTypeEnum macType) {
    this.macType = macType;
    return this;
  }

   /**
   * The type of the MAC address
   * @return macType
  **/
  @Schema(required = true, description = "The type of the MAC address")
  public MacTypeEnum getMacType() {
    return macType;
  }

  public void setMacType(MacTypeEnum macType) {
    this.macType = macType;
  }

  public LogicalPortMacTableEntry macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The MAC address
   * @return macAddress
  **/
  @Schema(required = true, description = "The MAC address")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalPortMacTableEntry logicalPortMacTableEntry = (LogicalPortMacTableEntry) o;
    return Objects.equals(this.macType, logicalPortMacTableEntry.macType) &&
        Objects.equals(this.macAddress, logicalPortMacTableEntry.macAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macType, macAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalPortMacTableEntry {\n");
    
    sb.append("    macType: ").append(toIndentedString(macType)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
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
