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
 * DnsHeader
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DnsHeader {
  /**
   * This is used to specify the type of the address. V4 - The address provided is an IPv4 domain name/IP address, the Type in query or response will be A V6 - The address provided is an IPv6 domain name/IP address, the Type in query or response will be AAAA
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    V4("V4"),
    V6("V6");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("address_type")
  private AddressTypeEnum addressType = AddressTypeEnum.V4;

  /**
   * Specifies the message type whether it is a query or a response.
   */
  @JsonAdapter(MessageTypeEnum.Adapter.class)
  public enum MessageTypeEnum {
    QUERY("QUERY"),
    RESPONSE("RESPONSE");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MessageTypeEnum fromValue(String text) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MessageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MessageTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("message_type")
  private MessageTypeEnum messageType = MessageTypeEnum.QUERY;

  @SerializedName("address")
  private String address = null;

  public DnsHeader addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * This is used to specify the type of the address. V4 - The address provided is an IPv4 domain name/IP address, the Type in query or response will be A V6 - The address provided is an IPv6 domain name/IP address, the Type in query or response will be AAAA
   * @return addressType
  **/
  @Schema(description = "This is used to specify the type of the address. V4 - The address provided is an IPv4 domain name/IP address, the Type in query or response will be A V6 - The address provided is an IPv6 domain name/IP address, the Type in query or response will be AAAA")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public DnsHeader messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Specifies the message type whether it is a query or a response.
   * @return messageType
  **/
  @Schema(description = "Specifies the message type whether it is a query or a response.")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public DnsHeader address(String address) {
    this.address = address;
    return this;
  }

   /**
   * This is used to define what is being asked or responded.
   * @return address
  **/
  @Schema(description = "This is used to define what is being asked or responded.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsHeader dnsHeader = (DnsHeader) o;
    return Objects.equals(this.addressType, dnsHeader.addressType) &&
        Objects.equals(this.messageType, dnsHeader.messageType) &&
        Objects.equals(this.address, dnsHeader.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, messageType, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsHeader {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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