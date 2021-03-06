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
 * Match condition for client certficate issuer DN
 */
@Schema(description = "Match condition for client certficate issuer DN")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbClientCertificateIssuerDnCondition {
  @SerializedName("case_sensitive")
  private Boolean caseSensitive = true;

  /**
   * Match type of issuer DN
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

  @SerializedName("issuer_dn")
  private String issuerDn = null;

  public LbClientCertificateIssuerDnCondition caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * If true, case is significant when comparing issuer DN value. 
   * @return caseSensitive
  **/
  @Schema(description = "If true, case is significant when comparing issuer DN value. ")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public LbClientCertificateIssuerDnCondition matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Match type of issuer DN
   * @return matchType
  **/
  @Schema(description = "Match type of issuer DN")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  public LbClientCertificateIssuerDnCondition issuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
    return this;
  }

   /**
   * Value of issuer DN
   * @return issuerDn
  **/
  @Schema(required = true, description = "Value of issuer DN")
  public String getIssuerDn() {
    return issuerDn;
  }

  public void setIssuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbClientCertificateIssuerDnCondition lbClientCertificateIssuerDnCondition = (LbClientCertificateIssuerDnCondition) o;
    return Objects.equals(this.caseSensitive, lbClientCertificateIssuerDnCondition.caseSensitive) &&
        Objects.equals(this.matchType, lbClientCertificateIssuerDnCondition.matchType) &&
        Objects.equals(this.issuerDn, lbClientCertificateIssuerDnCondition.issuerDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, matchType, issuerDn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbClientCertificateIssuerDnCondition {\n");
    
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    issuerDn: ").append(toIndentedString(issuerDn)).append("\n");
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
