/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.client.model.ErfpachtCanon;
import org.openapitools.client.model.PersoonBeperkt;
import org.openapitools.client.model.Tenaamstelling;
import org.openapitools.client.model.TypeGerechtigdeEnum;

/**
 * ZakelijkGerechtigde
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T09:44:54.145Z[Etc/UTC]")
public class ZakelijkGerechtigde {
  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeGerechtigdeEnum type;

  public static final String SERIALIZED_NAME_AANVANGSDATUM = "aanvangsdatum";
  @SerializedName(SERIALIZED_NAME_AANVANGSDATUM)
  private LocalDate aanvangsdatum;

  public static final String SERIALIZED_NAME_ERFPACHT_CANON = "erfpachtCanon";
  @SerializedName(SERIALIZED_NAME_ERFPACHT_CANON)
  private ErfpachtCanon erfpachtCanon;

  public static final String SERIALIZED_NAME_TENAAMSTELLING = "tenaamstelling";
  @SerializedName(SERIALIZED_NAME_TENAAMSTELLING)
  private Tenaamstelling tenaamstelling;

  public static final String SERIALIZED_NAME_PERSOON = "persoon";
  @SerializedName(SERIALIZED_NAME_PERSOON)
  private PersoonBeperkt persoon = null;


  public ZakelijkGerechtigde identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Identificatie van de zakelijk gerechtigde. 
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identificatie van de zakelijk gerechtigde. ")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  public ZakelijkGerechtigde type(TypeGerechtigdeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeGerechtigdeEnum getType() {
    return type;
  }


  public void setType(TypeGerechtigdeEnum type) {
    this.type = type;
  }


  public ZakelijkGerechtigde aanvangsdatum(LocalDate aanvangsdatum) {
    
    this.aanvangsdatum = aanvangsdatum;
    return this;
  }

   /**
   * Datum waarop het zakelijk recht van kracht is geworden. 
   * @return aanvangsdatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datum waarop het zakelijk recht van kracht is geworden. ")

  public LocalDate getAanvangsdatum() {
    return aanvangsdatum;
  }


  public void setAanvangsdatum(LocalDate aanvangsdatum) {
    this.aanvangsdatum = aanvangsdatum;
  }


  public ZakelijkGerechtigde erfpachtCanon(ErfpachtCanon erfpachtCanon) {
    
    this.erfpachtCanon = erfpachtCanon;
    return this;
  }

   /**
   * Get erfpachtCanon
   * @return erfpachtCanon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ErfpachtCanon getErfpachtCanon() {
    return erfpachtCanon;
  }


  public void setErfpachtCanon(ErfpachtCanon erfpachtCanon) {
    this.erfpachtCanon = erfpachtCanon;
  }


  public ZakelijkGerechtigde tenaamstelling(Tenaamstelling tenaamstelling) {
    
    this.tenaamstelling = tenaamstelling;
    return this;
  }

   /**
   * Get tenaamstelling
   * @return tenaamstelling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Tenaamstelling getTenaamstelling() {
    return tenaamstelling;
  }


  public void setTenaamstelling(Tenaamstelling tenaamstelling) {
    this.tenaamstelling = tenaamstelling;
  }


  public ZakelijkGerechtigde persoon(PersoonBeperkt persoon) {
    
    this.persoon = persoon;
    return this;
  }

   /**
   * Get persoon
   * @return persoon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersoonBeperkt getPersoon() {
    return persoon;
  }


  public void setPersoon(PersoonBeperkt persoon) {
    this.persoon = persoon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZakelijkGerechtigde zakelijkGerechtigde = (ZakelijkGerechtigde) o;
    return Objects.equals(this.identificatie, zakelijkGerechtigde.identificatie) &&
        Objects.equals(this.type, zakelijkGerechtigde.type) &&
        Objects.equals(this.aanvangsdatum, zakelijkGerechtigde.aanvangsdatum) &&
        Objects.equals(this.erfpachtCanon, zakelijkGerechtigde.erfpachtCanon) &&
        Objects.equals(this.tenaamstelling, zakelijkGerechtigde.tenaamstelling) &&
        Objects.equals(this.persoon, zakelijkGerechtigde.persoon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificatie, type, aanvangsdatum, erfpachtCanon, tenaamstelling, persoon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZakelijkGerechtigde {\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aanvangsdatum: ").append(toIndentedString(aanvangsdatum)).append("\n");
    sb.append("    erfpachtCanon: ").append(toIndentedString(erfpachtCanon)).append("\n");
    sb.append("    tenaamstelling: ").append(toIndentedString(tenaamstelling)).append("\n");
    sb.append("    persoon: ").append(toIndentedString(persoon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

