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
import io.swagger.client.model.LbActiveMonitor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LbTcpMonitor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbTcpMonitor extends LbActiveMonitor {
  @SerializedName("receive")
  private String receive = null;

  @SerializedName("send")
  private String send = null;

  public LbTcpMonitor receive(String receive) {
    this.receive = receive;
    return this;
  }

   /**
   * Expected data, if specified, can be anywhere in the response and it has to be a string, regular expressions are not supported. 
   * @return receive
  **/
  @Schema(description = "Expected data, if specified, can be anywhere in the response and it has to be a string, regular expressions are not supported. ")
  public String getReceive() {
    return receive;
  }

  public void setReceive(String receive) {
    this.receive = receive;
  }

  public LbTcpMonitor send(String send) {
    this.send = send;
    return this;
  }

   /**
   * If both send and receive are not specified, then just a TCP connection is established (3-way handshake) to validate server is healthy, no data is sent. 
   * @return send
  **/
  @Schema(description = "If both send and receive are not specified, then just a TCP connection is established (3-way handshake) to validate server is healthy, no data is sent. ")
  public String getSend() {
    return send;
  }

  public void setSend(String send) {
    this.send = send;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbTcpMonitor lbTcpMonitor = (LbTcpMonitor) o;
    return Objects.equals(this.receive, lbTcpMonitor.receive) &&
        Objects.equals(this.send, lbTcpMonitor.send) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receive, send, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbTcpMonitor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    receive: ").append(toIndentedString(receive)).append("\n");
    sb.append("    send: ").append(toIndentedString(send)).append("\n");
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
