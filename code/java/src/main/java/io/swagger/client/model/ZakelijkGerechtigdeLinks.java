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
import io.swagger.client.model.HalLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ZakelijkGerechtigdeLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class ZakelijkGerechtigdeLinks {
  @SerializedName("self")
  private HalLink self = null;

  @SerializedName("persoon")
  private HalLink persoon = null;

  @SerializedName("betrokkenPartner")
  private HalLink betrokkenPartner = null;

  @SerializedName("betrokkenSamenwerkingsverband")
  private HalLink betrokkenSamenwerkingsverband = null;

  @SerializedName("betrokkenGorzenEnAanwassen")
  private HalLink betrokkenGorzenEnAanwassen = null;

  public ZakelijkGerechtigdeLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }

  public ZakelijkGerechtigdeLinks persoon(HalLink persoon) {
    this.persoon = persoon;
    return this;
  }

   /**
   * Get persoon
   * @return persoon
  **/
  @Schema(description = "")
  public HalLink getPersoon() {
    return persoon;
  }

  public void setPersoon(HalLink persoon) {
    this.persoon = persoon;
  }

  public ZakelijkGerechtigdeLinks betrokkenPartner(HalLink betrokkenPartner) {
    this.betrokkenPartner = betrokkenPartner;
    return this;
  }

   /**
   * Get betrokkenPartner
   * @return betrokkenPartner
  **/
  @Schema(description = "")
  public HalLink getBetrokkenPartner() {
    return betrokkenPartner;
  }

  public void setBetrokkenPartner(HalLink betrokkenPartner) {
    this.betrokkenPartner = betrokkenPartner;
  }

  public ZakelijkGerechtigdeLinks betrokkenSamenwerkingsverband(HalLink betrokkenSamenwerkingsverband) {
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
    return this;
  }

   /**
   * Get betrokkenSamenwerkingsverband
   * @return betrokkenSamenwerkingsverband
  **/
  @Schema(description = "")
  public HalLink getBetrokkenSamenwerkingsverband() {
    return betrokkenSamenwerkingsverband;
  }

  public void setBetrokkenSamenwerkingsverband(HalLink betrokkenSamenwerkingsverband) {
    this.betrokkenSamenwerkingsverband = betrokkenSamenwerkingsverband;
  }

  public ZakelijkGerechtigdeLinks betrokkenGorzenEnAanwassen(HalLink betrokkenGorzenEnAanwassen) {
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
    return this;
  }

   /**
   * Get betrokkenGorzenEnAanwassen
   * @return betrokkenGorzenEnAanwassen
  **/
  @Schema(description = "")
  public HalLink getBetrokkenGorzenEnAanwassen() {
    return betrokkenGorzenEnAanwassen;
  }

  public void setBetrokkenGorzenEnAanwassen(HalLink betrokkenGorzenEnAanwassen) {
    this.betrokkenGorzenEnAanwassen = betrokkenGorzenEnAanwassen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZakelijkGerechtigdeLinks zakelijkGerechtigdeLinks = (ZakelijkGerechtigdeLinks) o;
    return Objects.equals(this.self, zakelijkGerechtigdeLinks.self) &&
        Objects.equals(this.persoon, zakelijkGerechtigdeLinks.persoon) &&
        Objects.equals(this.betrokkenPartner, zakelijkGerechtigdeLinks.betrokkenPartner) &&
        Objects.equals(this.betrokkenSamenwerkingsverband, zakelijkGerechtigdeLinks.betrokkenSamenwerkingsverband) &&
        Objects.equals(this.betrokkenGorzenEnAanwassen, zakelijkGerechtigdeLinks.betrokkenGorzenEnAanwassen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, persoon, betrokkenPartner, betrokkenSamenwerkingsverband, betrokkenGorzenEnAanwassen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZakelijkGerechtigdeLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    persoon: ").append(toIndentedString(persoon)).append("\n");
    sb.append("    betrokkenPartner: ").append(toIndentedString(betrokkenPartner)).append("\n");
    sb.append("    betrokkenSamenwerkingsverband: ").append(toIndentedString(betrokkenSamenwerkingsverband)).append("\n");
    sb.append("    betrokkenGorzenEnAanwassen: ").append(toIndentedString(betrokkenGorzenEnAanwassen)).append("\n");
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
