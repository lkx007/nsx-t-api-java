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
import io.swagger.client.model.LbRuleAction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This action is used to rewrite header fields of HTTP response messages to specified new values at HTTP_RESPONSE_REWRITE phase. One action can be used to rewrite one header field. To rewrite multiple header fields, multiple actions must be defined. Captured variables and built-in variables can be used in the header_value field, header_name field does not support variables. 
 */
@Schema(description = "This action is used to rewrite header fields of HTTP response messages to specified new values at HTTP_RESPONSE_REWRITE phase. One action can be used to rewrite one header field. To rewrite multiple header fields, multiple actions must be defined. Captured variables and built-in variables can be used in the header_value field, header_name field does not support variables. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbHttpResponseHeaderRewriteAction extends LbRuleAction {
  @SerializedName("header_value")
  private String headerValue = null;

  @SerializedName("header_name")
  private String headerName = null;

  public LbHttpResponseHeaderRewriteAction headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Value of header field
   * @return headerValue
  **/
  @Schema(required = true, description = "Value of header field")
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }

  public LbHttpResponseHeaderRewriteAction headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Name of a header field of HTTP request message
   * @return headerName
  **/
  @Schema(required = true, description = "Name of a header field of HTTP request message")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbHttpResponseHeaderRewriteAction lbHttpResponseHeaderRewriteAction = (LbHttpResponseHeaderRewriteAction) o;
    return Objects.equals(this.headerValue, lbHttpResponseHeaderRewriteAction.headerValue) &&
        Objects.equals(this.headerName, lbHttpResponseHeaderRewriteAction.headerName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerValue, headerName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbHttpResponseHeaderRewriteAction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
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
