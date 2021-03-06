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
 * Oauth2 Account Credentials
 */
@Schema(description = "Oauth2 Account Credentials")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class Oauth2Credentials {
  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("client_id")
  private String clientId = null;

  public Oauth2Credentials clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret, that will be used for authentication in AWS environment. Can be some passphrase.
   * @return clientSecret
  **/
  @Schema(description = "Client secret, that will be used for authentication in AWS environment. Can be some passphrase.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Oauth2Credentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID, that will be used for authentication in AWS environment,
   * @return clientId
  **/
  @Schema(required = true, description = "Client ID, that will be used for authentication in AWS environment,")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2Credentials oauth2Credentials = (Oauth2Credentials) o;
    return Objects.equals(this.clientSecret, oauth2Credentials.clientSecret) &&
        Objects.equals(this.clientId, oauth2Credentials.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSecret, clientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2Credentials {\n");
    
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
