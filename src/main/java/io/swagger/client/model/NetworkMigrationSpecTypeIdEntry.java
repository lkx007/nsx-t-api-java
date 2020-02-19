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
 * Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
 */
@Schema(description = "Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NetworkMigrationSpecTypeIdEntry {
  @SerializedName("value")
  private String value = null;

  /**
   * the type of the NetworkMigrationSpec
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    HOSTPROFILENETWORKMIGRATIONSPEC("HostProfileNetworkMigrationSpec");

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

  public NetworkMigrationSpecTypeIdEntry value(String value) {
    this.value = value;
    return this;
  }

   /**
   * the id of the NetworkMigrationSpec
   * @return value
  **/
  @Schema(required = true, description = "the id of the NetworkMigrationSpec")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

   /**
   * the type of the NetworkMigrationSpec
   * @return key
  **/
  @Schema(description = "the type of the NetworkMigrationSpec")
  public KeyEnum getKey() {
    return key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkMigrationSpecTypeIdEntry networkMigrationSpecTypeIdEntry = (NetworkMigrationSpecTypeIdEntry) o;
    return Objects.equals(this.value, networkMigrationSpecTypeIdEntry.value) &&
        Objects.equals(this.key, networkMigrationSpecTypeIdEntry.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkMigrationSpecTypeIdEntry {\n");
    
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
