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
import io.swagger.client.model.LbCookieTime;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LbSessionCookieTime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbSessionCookieTime extends LbCookieTime {
  @SerializedName("cookie_max_idle")
  private Long cookieMaxIdle = null;

  @SerializedName("cookie_max_life")
  private Long cookieMaxLife = null;

  public LbSessionCookieTime cookieMaxIdle(Long cookieMaxIdle) {
    this.cookieMaxIdle = cookieMaxIdle;
    return this;
  }

   /**
   * Instead of using HTTP Cookie max-age and relying on client to expire the cookie, max idle time and/or max lifetime of the cookie can be used. Max idle time, if configured, specifies the maximum interval the cookie is valid for from the last time it was seen in a request. It is available for insert mode. 
   * minimum: 1
   * maximum: 2147483647
   * @return cookieMaxIdle
  **/
  @Schema(description = "Instead of using HTTP Cookie max-age and relying on client to expire the cookie, max idle time and/or max lifetime of the cookie can be used. Max idle time, if configured, specifies the maximum interval the cookie is valid for from the last time it was seen in a request. It is available for insert mode. ")
  public Long getCookieMaxIdle() {
    return cookieMaxIdle;
  }

  public void setCookieMaxIdle(Long cookieMaxIdle) {
    this.cookieMaxIdle = cookieMaxIdle;
  }

  public LbSessionCookieTime cookieMaxLife(Long cookieMaxLife) {
    this.cookieMaxLife = cookieMaxLife;
    return this;
  }

   /**
   * Max life time, if configured, specifies the maximum interval the cookie is valid for from the first time the cookie was seen in a request. It is available for insert mode. 
   * minimum: 1
   * maximum: 2147483647
   * @return cookieMaxLife
  **/
  @Schema(description = "Max life time, if configured, specifies the maximum interval the cookie is valid for from the first time the cookie was seen in a request. It is available for insert mode. ")
  public Long getCookieMaxLife() {
    return cookieMaxLife;
  }

  public void setCookieMaxLife(Long cookieMaxLife) {
    this.cookieMaxLife = cookieMaxLife;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbSessionCookieTime lbSessionCookieTime = (LbSessionCookieTime) o;
    return Objects.equals(this.cookieMaxIdle, lbSessionCookieTime.cookieMaxIdle) &&
        Objects.equals(this.cookieMaxLife, lbSessionCookieTime.cookieMaxLife) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieMaxIdle, cookieMaxLife, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbSessionCookieTime {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cookieMaxIdle: ").append(toIndentedString(cookieMaxIdle)).append("\n");
    sb.append("    cookieMaxLife: ").append(toIndentedString(cookieMaxLife)).append("\n");
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
