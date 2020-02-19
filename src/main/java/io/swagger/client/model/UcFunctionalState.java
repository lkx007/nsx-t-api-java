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
 * Upgrade coordinator Uc functional State.
 */
@Schema(description = "Upgrade coordinator Uc functional State.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UcFunctionalState {
  /**
   * function state of the upgrade coordinator
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    STANDBY("STANDBY");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("error_message")
  private String errorMessage = null;

   /**
   * function state of the upgrade coordinator
   * @return state
  **/
  @Schema(description = "function state of the upgrade coordinator")
  public StateEnum getState() {
    return state;
  }

   /**
   * error message that explains why UC is on standby mode.
   * @return errorMessage
  **/
  @Schema(description = "error message that explains why UC is on standby mode.")
  public String getErrorMessage() {
    return errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcFunctionalState ucFunctionalState = (UcFunctionalState) o;
    return Objects.equals(this.state, ucFunctionalState.state) &&
        Objects.equals(this.errorMessage, ucFunctionalState.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcFunctionalState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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