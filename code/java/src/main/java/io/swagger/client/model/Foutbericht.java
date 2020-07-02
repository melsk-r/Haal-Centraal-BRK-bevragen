/*
 * Kadastraal onroerende zaken
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.
 *
 * OpenAPI spec version: 1.0.0
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
 * Terugmelding bij een fout. JSON representatie in lijn met [RFC7807](https://tools.ietf.org/html/rfc7807).
 */
@Schema(description = "Terugmelding bij een fout. JSON representatie in lijn met [RFC7807](https://tools.ietf.org/html/rfc7807).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class Foutbericht {
  @SerializedName("type")
  private String type = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("instance")
  private String instance = null;

  @SerializedName("code")
  private String code = null;

  public Foutbericht type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Link naar meer informatie over deze fout
   * @return type
  **/
  @Schema(description = "Link naar meer informatie over deze fout")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Foutbericht title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Beschrijving van de fout
   * @return title
  **/
  @Schema(description = "Beschrijving van de fout")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Foutbericht status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Http status code
   * @return status
  **/
  @Schema(description = "Http status code")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Foutbericht detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Details over de fout
   * @return detail
  **/
  @Schema(description = "Details over de fout")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Foutbericht instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Uri van de aanroep die de fout heeft veroorzaakt
   * @return instance
  **/
  @Schema(description = "Uri van de aanroep die de fout heeft veroorzaakt")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public Foutbericht code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Systeemcode die het type fout aangeeft
   * @return code
  **/
  @Schema(description = "Systeemcode die het type fout aangeeft")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Foutbericht foutbericht = (Foutbericht) o;
    return Objects.equals(this.type, foutbericht.type) &&
        Objects.equals(this.title, foutbericht.title) &&
        Objects.equals(this.status, foutbericht.status) &&
        Objects.equals(this.detail, foutbericht.detail) &&
        Objects.equals(this.instance, foutbericht.instance) &&
        Objects.equals(this.code, foutbericht.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Foutbericht {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
