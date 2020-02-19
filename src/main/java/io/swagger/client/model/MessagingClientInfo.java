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
 * MessagingClientInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MessagingClientInfo {
  /**
   * Type of messaging client
   */
  @JsonAdapter(ClientTypeEnum.Adapter.class)
  public enum ClientTypeEnum {
    MPA("MPA"),
    HOST("HOST");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClientTypeEnum fromValue(String text) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClientTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("client_type")
  private ClientTypeEnum clientType = null;

  @SerializedName("account_name")
  private String accountName = null;

  public MessagingClientInfo clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Type of messaging client
   * @return clientType
  **/
  @Schema(description = "Type of messaging client")
  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public MessagingClientInfo accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name in messaging client
   * @return accountName
  **/
  @Schema(description = "Account name in messaging client")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingClientInfo messagingClientInfo = (MessagingClientInfo) o;
    return Objects.equals(this.clientType, messagingClientInfo.clientType) &&
        Objects.equals(this.accountName, messagingClientInfo.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientType, accountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingClientInfo {\n");
    
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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
