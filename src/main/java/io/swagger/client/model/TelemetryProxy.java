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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * TelemetryProxy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class TelemetryProxy extends ManagedResource {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  /**
   * The scheme accepted by the proxy server. Specify one of HTTP and HTTPS. 
   */
  @JsonAdapter(SchemeEnum.Adapter.class)
  public enum SchemeEnum {
    HTTP("HTTP"),
    HTTPS("HTTPS");

    private String value;

    SchemeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SchemeEnum fromValue(String text) {
      for (SchemeEnum b : SchemeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SchemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchemeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchemeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SchemeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("scheme")
  private SchemeEnum scheme = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("port")
  private Integer port = null;

  public TelemetryProxy username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Specify the user name used to authenticate with the proxy server, if required. 
   * @return username
  **/
  @Schema(description = "Specify the user name used to authenticate with the proxy server, if required. ")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public TelemetryProxy password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specify the password used to authenticate with the proxy server, if required. A GET call on /telemetry/config returns a non-meaningful password to maintain security. To change the password to a new value, issue a PUT call after updating this field. To remove the password, issue a PUT call after emptying this field. To retain a previously set password, issue a PUT call keeping the non-meaningful value obtained from the GET call. 
   * @return password
  **/
  @Schema(description = "Specify the password used to authenticate with the proxy server, if required. A GET call on /telemetry/config returns a non-meaningful password to maintain security. To change the password to a new value, issue a PUT call after updating this field. To remove the password, issue a PUT call after emptying this field. To retain a previously set password, issue a PUT call keeping the non-meaningful value obtained from the GET call. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TelemetryProxy scheme(SchemeEnum scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme accepted by the proxy server. Specify one of HTTP and HTTPS. 
   * @return scheme
  **/
  @Schema(required = true, description = "The scheme accepted by the proxy server. Specify one of HTTP and HTTPS. ")
  public SchemeEnum getScheme() {
    return scheme;
  }

  public void setScheme(SchemeEnum scheme) {
    this.scheme = scheme;
  }

  public TelemetryProxy hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Specify the fully qualified domain name, or ip address, of the proxy server. 
   * @return hostname
  **/
  @Schema(required = true, description = "Specify the fully qualified domain name, or ip address, of the proxy server. ")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public TelemetryProxy port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Specify the port of the proxy server.
   * @return port
  **/
  @Schema(required = true, description = "Specify the port of the proxy server.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryProxy telemetryProxy = (TelemetryProxy) o;
    return Objects.equals(this.username, telemetryProxy.username) &&
        Objects.equals(this.password, telemetryProxy.password) &&
        Objects.equals(this.scheme, telemetryProxy.scheme) &&
        Objects.equals(this.hostname, telemetryProxy.hostname) &&
        Objects.equals(this.port, telemetryProxy.port) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, scheme, hostname, port, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryProxy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
