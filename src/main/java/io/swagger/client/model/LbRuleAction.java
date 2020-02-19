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
 * Load balancer rule actions are used to manipulate application traffic. Currently load balancer rules can be used at three load balancer processing phases. Each phase has its own supported type of actions. Supported actions in HTTP_REQUST_REWRITE phase are:   LbHttpRequestUriRewriteAction   LbHttpRequestHeaderRewriteAction   LbHttpRequestHeaderDeleteAction   LbVariableAssignmentAction Supported actions in HTTP_FORWARDING phase are:   LbHttpRejectAction   LbHttpRedirectAction   LbSelectPoolAction   LbVariablePersistenceOnAction Supported action in HTTP_RESPONSE_REWRITE phase is:   LbHttpResponseHeaderRewriteAction   LbHttpResponseHeaderDeleteAction   LbVariablePersistenceLearnAction  If the match type of an LbRuleCondition field is specified as REGEX and named capturing groups are used in the specified regular expression. The groups can be used as variables in LbRuleAction fields. For example, define a rule with LbHttpRequestUriCondition as match condition and LbHttpRequestUriRewriteAction as action. Set match_type field of LbHttpRequestUriCondition to REGEX, and set uri field to   \&quot;/news/(?&amp;lt;year&amp;gt;\\d+)/(?&amp;lt;month&amp;gt;\\d+)/(?&amp;lt;article&amp;gt;.*)\&quot;. Set uri field of LbHttpRequestUriRewriteAction to:   \&quot;/news/$year-$month/$article\&quot; In uri field of LbHttpRequestUriCondition, the (?&amp;lt;year&amp;gt;\\d+), (?&amp;lt;month&amp;gt;\\d+) and (?&amp;lt;article&amp;gt;.*) are named capturing groups, they define variables named $year, $month and $article respectively. The defined variables are used in LbHttpRequestUriRewriteAction. For a matched HTTP request with URI \&quot;/news/2017/06/xyz.html\&quot;, the substring \&quot;2017\&quot; is captured in variable $year, \&quot;06\&quot; is captured in variable $month, and \&quot;xyz.html\&quot; is captured in variable $article. The LbHttpRequestUriRewriteAction will rewrite the URI to:   \&quot;/news/2017-06/xyz.html\&quot; A set of built-in variables can be used in LbRuleAction as well. The name of built-in variables start with underscore, the name of user defined variables is not allowed to start with underscore. Following are some of the built-in variables:   $_scheme: Reference the scheme part of matched HTTP messages, could be \&quot;http\&quot; or \&quot;https\&quot;.   $_host: Host of matched HTTP messages, for example \&quot;www.example.com\&quot;.   $_server_port: Port part of URI, it is also the port of the server which accepted a request. Default port is 80 for http and 443 for https.   $_uri: The URI path, for example \&quot;/products/sample.html\&quot;.   $_request_uri: Full original request URI with arguments, for example,     \&quot;/products/sample.html?a&#x3D;b&amp;c&#x3D;d\&quot;.   $_args: URI arguments, for instance \&quot;a&#x3D;b&amp;c&#x3D;d\&quot;   $_is_args: \&quot;?\&quot; if a request has URI arguments, or an empty string otherwise. For the full list of built-in variables, please reference the NSX-T Administrator&#x27;s Guide. 
 */
@Schema(description = "Load balancer rule actions are used to manipulate application traffic. Currently load balancer rules can be used at three load balancer processing phases. Each phase has its own supported type of actions. Supported actions in HTTP_REQUST_REWRITE phase are:   LbHttpRequestUriRewriteAction   LbHttpRequestHeaderRewriteAction   LbHttpRequestHeaderDeleteAction   LbVariableAssignmentAction Supported actions in HTTP_FORWARDING phase are:   LbHttpRejectAction   LbHttpRedirectAction   LbSelectPoolAction   LbVariablePersistenceOnAction Supported action in HTTP_RESPONSE_REWRITE phase is:   LbHttpResponseHeaderRewriteAction   LbHttpResponseHeaderDeleteAction   LbVariablePersistenceLearnAction  If the match type of an LbRuleCondition field is specified as REGEX and named capturing groups are used in the specified regular expression. The groups can be used as variables in LbRuleAction fields. For example, define a rule with LbHttpRequestUriCondition as match condition and LbHttpRequestUriRewriteAction as action. Set match_type field of LbHttpRequestUriCondition to REGEX, and set uri field to   \"/news/(?&lt;year&gt;\\d+)/(?&lt;month&gt;\\d+)/(?&lt;article&gt;.*)\". Set uri field of LbHttpRequestUriRewriteAction to:   \"/news/$year-$month/$article\" In uri field of LbHttpRequestUriCondition, the (?&lt;year&gt;\\d+), (?&lt;month&gt;\\d+) and (?&lt;article&gt;.*) are named capturing groups, they define variables named $year, $month and $article respectively. The defined variables are used in LbHttpRequestUriRewriteAction. For a matched HTTP request with URI \"/news/2017/06/xyz.html\", the substring \"2017\" is captured in variable $year, \"06\" is captured in variable $month, and \"xyz.html\" is captured in variable $article. The LbHttpRequestUriRewriteAction will rewrite the URI to:   \"/news/2017-06/xyz.html\" A set of built-in variables can be used in LbRuleAction as well. The name of built-in variables start with underscore, the name of user defined variables is not allowed to start with underscore. Following are some of the built-in variables:   $_scheme: Reference the scheme part of matched HTTP messages, could be \"http\" or \"https\".   $_host: Host of matched HTTP messages, for example \"www.example.com\".   $_server_port: Port part of URI, it is also the port of the server which accepted a request. Default port is 80 for http and 443 for https.   $_uri: The URI path, for example \"/products/sample.html\".   $_request_uri: Full original request URI with arguments, for example,     \"/products/sample.html?a=b&c=d\".   $_args: URI arguments, for instance \"a=b&c=d\"   $_is_args: \"?\" if a request has URI arguments, or an empty string otherwise. For the full list of built-in variables, please reference the NSX-T Administrator's Guide. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class LbRuleAction {
  /**
   * The property identifies the load balancer rule action type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LBHTTPREQUESTURIREWRITEACTION("LbHttpRequestUriRewriteAction"),
    LBHTTPREQUESTHEADERREWRITEACTION("LbHttpRequestHeaderRewriteAction"),
    LBHTTPREJECTACTION("LbHttpRejectAction"),
    LBHTTPREDIRECTACTION("LbHttpRedirectAction"),
    LBSELECTPOOLACTION("LbSelectPoolAction"),
    LBSELECTSERVERACTION("LbSelectServerAction"),
    LBHTTPRESPONSEHEADERREWRITEACTION("LbHttpResponseHeaderRewriteAction"),
    LBHTTPREQUESTHEADERDELETEACTION("LbHttpRequestHeaderDeleteAction"),
    LBHTTPRESPONSEHEADERDELETEACTION("LbHttpResponseHeaderDeleteAction"),
    LBVARIABLEASSIGNMENTACTION("LbVariableAssignmentAction"),
    LBVARIABLEPERSISTENCEONACTION("LbVariablePersistenceOnAction"),
    LBVARIABLEPERSISTENCELEARNACTION("LbVariablePersistenceLearnAction");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public LbRuleAction() {
    this.type = this.getClass().getSimpleName();
  }
  public LbRuleAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The property identifies the load balancer rule action type. 
   * @return type
  **/
  @Schema(required = true, description = "The property identifies the load balancer rule action type. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbRuleAction lbRuleAction = (LbRuleAction) o;
    return Objects.equals(this.type, lbRuleAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbRuleAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
