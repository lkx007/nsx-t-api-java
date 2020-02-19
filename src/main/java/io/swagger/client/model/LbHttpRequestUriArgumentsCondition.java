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
 * This condition is used to match URI arguments aka query string of Http request messages, for example, in URI http://exaple.com?foo&#x3D;1&amp;bar&#x3D;2, the \&quot;foo&#x3D;1&amp;bar&#x3D;2\&quot; is the query string containing URI arguments. In an URI scheme, query string is indicated by the first question mark (\&quot;?\&quot;) character and terminated by a number sign (\&quot;#\&quot;) character or by the end of the URI. The uri_arguments field can be specified as a regular expression(Set match_type to REGEX). For example, \&quot;foo&#x3D;(?&amp;lt;x&amp;gt;\\d+)\&quot;. It matches HTTP requests whose URI arguments containing \&quot;foo\&quot;, the value of foo contains only digits. And the value of foo is captured as $x which can be used in LbRuleAction fields which support variables. 
 */
@Schema(description = "This condition is used to match URI arguments aka query string of Http request messages, for example, in URI http://exaple.com?foo=1&bar=2, the \"foo=1&bar=2\" is the query string containing URI arguments. In an URI scheme, query string is indicated by the first question mark (\"?\") character and terminated by a number sign (\"#\") character or by the end of the URI. The uri_arguments field can be specified as a regular expression(Set match_type to REGEX). For example, \"foo=(?&lt;x&gt;\\d+)\". It matches HTTP requests whose URI arguments containing \"foo\", the value of foo contains only digits. And the value of foo is captured as $x which can be used in LbRuleAction fields which support variables. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbHttpRequestUriArgumentsCondition extends LbRuleCondition {
  @SerializedName("uri_arguments")
  private String uriArguments = null;

  /**
   * Match type of URI arguments
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

  @SerializedName("case_sensitive")
  private Boolean caseSensitive = true;

  public LbHttpRequestUriArgumentsCondition uriArguments(String uriArguments) {
    this.uriArguments = uriArguments;
    return this;
  }

   /**
   * URI arguments, aka query string of URI. 
   * @return uriArguments
  **/
  @Schema(required = true, description = "URI arguments, aka query string of URI. ")
  public String getUriArguments() {
    return uriArguments;
  }

  public void setUriArguments(String uriArguments) {
    this.uriArguments = uriArguments;
  }

  public LbHttpRequestUriArgumentsCondition matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Match type of URI arguments
   * @return matchType
  **/
  @Schema(description = "Match type of URI arguments")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  public LbHttpRequestUriArgumentsCondition caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * If true, case is significant when comparing URI arguments. 
   * @return caseSensitive
  **/
  @Schema(description = "If true, case is significant when comparing URI arguments. ")
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
    LbHttpRequestUriArgumentsCondition lbHttpRequestUriArgumentsCondition = (LbHttpRequestUriArgumentsCondition) o;
    return Objects.equals(this.uriArguments, lbHttpRequestUriArgumentsCondition.uriArguments) &&
        Objects.equals(this.matchType, lbHttpRequestUriArgumentsCondition.matchType) &&
        Objects.equals(this.caseSensitive, lbHttpRequestUriArgumentsCondition.caseSensitive) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriArguments, matchType, caseSensitive, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbHttpRequestUriArgumentsCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uriArguments: ").append(toIndentedString(uriArguments)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
