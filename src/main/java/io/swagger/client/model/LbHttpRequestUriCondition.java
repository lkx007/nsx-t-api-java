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
import io.swagger.client.model.LbRuleCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This condition is used to match URIs(Uniform Resource Identifier) of HTTP request messages. The URI field can be specified as a regular expression. If an HTTP request message is requesting an URI which matches specified regular expression, it matches the condition. The syntax of whole URI looks like this: scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment] This condition matches only the path part of entire URI. When match_type field is specified as REGEX, the uri field is used as a regular expression to match URI path of HTTP requests. For example, to match any URI that has \&quot;/image/\&quot; or \&quot;/images/\&quot;, uri field can be specified as: \&quot;/image[s]?/\&quot;. Named capturing groups can be used in the uri field to capture substrings of matched URIs and store them in variables for use in LbRuleAction. For example, specify uri field as: \&quot;/news/(?&amp;lt;year&amp;gt;\\d+)/(?&amp;lt;month&amp;gt;\\d+)/(?&amp;lt;article&amp;gt;.*)\&quot; If the URI path is /articles/news/2017/06/xyz.html, then substring \&quot;2017\&quot; is captured in variable year, \&quot;06\&quot; is captured in variable month, and \&quot;xyz.html\&quot; is captured in variable article. These variables can then be used in an LbRuleAction field which supports variables, such as uri field of LbHttpRequestUriRewriteAction. For example, set the uri field of LbHttpRequestUriRewriteAction as: \&quot;/articles/news/$year-$month-$article\&quot; Then the URI path /articles/news/2017/06/xyz.html is rewritten to: \&quot;/articles/news/2017-06-xyz.html\&quot; 
 */
@Schema(description = "This condition is used to match URIs(Uniform Resource Identifier) of HTTP request messages. The URI field can be specified as a regular expression. If an HTTP request message is requesting an URI which matches specified regular expression, it matches the condition. The syntax of whole URI looks like this: scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment] This condition matches only the path part of entire URI. When match_type field is specified as REGEX, the uri field is used as a regular expression to match URI path of HTTP requests. For example, to match any URI that has \"/image/\" or \"/images/\", uri field can be specified as: \"/image[s]?/\". Named capturing groups can be used in the uri field to capture substrings of matched URIs and store them in variables for use in LbRuleAction. For example, specify uri field as: \"/news/(?&lt;year&gt;\\d+)/(?&lt;month&gt;\\d+)/(?&lt;article&gt;.*)\" If the URI path is /articles/news/2017/06/xyz.html, then substring \"2017\" is captured in variable year, \"06\" is captured in variable month, and \"xyz.html\" is captured in variable article. These variables can then be used in an LbRuleAction field which supports variables, such as uri field of LbHttpRequestUriRewriteAction. For example, set the uri field of LbHttpRequestUriRewriteAction as: \"/articles/news/$year-$month-$article\" Then the URI path /articles/news/2017/06/xyz.html is rewritten to: \"/articles/news/2017-06-xyz.html\" ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbHttpRequestUriCondition extends LbRuleCondition {
  /**
   * Match type of URI
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    STARTS_WITH("STARTS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    EQUALS("EQUALS"),
    CONTAINS("CONTAINS"),
    REGEX("REGEX");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MatchTypeEnum fromValue(String text) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("match_type")
  private MatchTypeEnum matchType = MatchTypeEnum.REGEX;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("case_sensitive")
  private Boolean caseSensitive = true;

  public LbHttpRequestUriCondition matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Match type of URI
   * @return matchType
  **/
  @Schema(description = "Match type of URI")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  public LbHttpRequestUriCondition uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * A string used to identify resource
   * @return uri
  **/
  @Schema(required = true, description = "A string used to identify resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public LbHttpRequestUriCondition caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * If true, case is significant when comparing URI. 
   * @return caseSensitive
  **/
  @Schema(description = "If true, case is significant when comparing URI. ")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbHttpRequestUriCondition lbHttpRequestUriCondition = (LbHttpRequestUriCondition) o;
    return Objects.equals(this.matchType, lbHttpRequestUriCondition.matchType) &&
        Objects.equals(this.uri, lbHttpRequestUriCondition.uri) &&
        Objects.equals(this.caseSensitive, lbHttpRequestUriCondition.caseSensitive) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, uri, caseSensitive, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbHttpRequestUriCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
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
