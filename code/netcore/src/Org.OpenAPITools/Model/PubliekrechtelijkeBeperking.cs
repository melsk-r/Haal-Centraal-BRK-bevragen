/* 
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Beperkingen op een kadastraal onroerende zaak die door de overheid zijn opgelegd. Deze bepalen wat een eigenaar wel of niet mag doen met een woning, een ander gebouw of een stuk grond. Het gaat het bijvoorbeeld om beschermde monumenten, natuurmonumenten, bodembescherming, eisen die binnen de Woningwet worden gesteld, of maatregelen die nodig zijn voor landsverdediging. 
    /// </summary>
    [DataContract]
    public partial class PubliekrechtelijkeBeperking :  IEquatable<PubliekrechtelijkeBeperking>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PubliekrechtelijkeBeperking" /> class.
        /// </summary>
        /// <param name="identificatie">identificatie.</param>
        /// <param name="domein">Het domein waartoe de identificatie behoort. .</param>
        /// <param name="grondslag">grondslag.</param>
        /// <param name="datumInWerking">datumInWerking.</param>
        /// <param name="datumBeeindiging">datumBeeindiging.</param>
        /// <param name="bevoegdGezag">bevoegdGezag.</param>
        public PubliekrechtelijkeBeperking(string identificatie = default(string), string domein = default(string), Waardelijst grondslag = default(Waardelijst), DateTime datumInWerking = default(DateTime), DateTime datumBeeindiging = default(DateTime), NietNatuurlijkPersoonBeperkt bevoegdGezag = default(NietNatuurlijkPersoonBeperkt))
        {
            this.Identificatie = identificatie;
            this.Domein = domein;
            this.Grondslag = grondslag;
            this.DatumInWerking = datumInWerking;
            this.DatumBeeindiging = datumBeeindiging;
            this.BevoegdGezag = bevoegdGezag;
        }
        
        /// <summary>
        /// Gets or Sets Identificatie
        /// </summary>
        [DataMember(Name="identificatie", EmitDefaultValue=false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Het domein waartoe de identificatie behoort. 
        /// </summary>
        /// <value>Het domein waartoe de identificatie behoort. </value>
        [DataMember(Name="domein", EmitDefaultValue=false)]
        public string Domein { get; set; }

        /// <summary>
        /// Gets or Sets Grondslag
        /// </summary>
        [DataMember(Name="grondslag", EmitDefaultValue=false)]
        public Waardelijst Grondslag { get; set; }

        /// <summary>
        /// Gets or Sets DatumInWerking
        /// </summary>
        [DataMember(Name="datumInWerking", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime DatumInWerking { get; set; }

        /// <summary>
        /// Gets or Sets DatumBeeindiging
        /// </summary>
        [DataMember(Name="datumBeeindiging", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime DatumBeeindiging { get; set; }

        /// <summary>
        /// Gets or Sets BevoegdGezag
        /// </summary>
        [DataMember(Name="bevoegdGezag", EmitDefaultValue=false)]
        public NietNatuurlijkPersoonBeperkt BevoegdGezag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PubliekrechtelijkeBeperking {\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  Domein: ").Append(Domein).Append("\n");
            sb.Append("  Grondslag: ").Append(Grondslag).Append("\n");
            sb.Append("  DatumInWerking: ").Append(DatumInWerking).Append("\n");
            sb.Append("  DatumBeeindiging: ").Append(DatumBeeindiging).Append("\n");
            sb.Append("  BevoegdGezag: ").Append(BevoegdGezag).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PubliekrechtelijkeBeperking);
        }

        /// <summary>
        /// Returns true if PubliekrechtelijkeBeperking instances are equal
        /// </summary>
        /// <param name="input">Instance of PubliekrechtelijkeBeperking to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PubliekrechtelijkeBeperking input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identificatie == input.Identificatie ||
                    (this.Identificatie != null &&
                    this.Identificatie.Equals(input.Identificatie))
                ) && 
                (
                    this.Domein == input.Domein ||
                    (this.Domein != null &&
                    this.Domein.Equals(input.Domein))
                ) && 
                (
                    this.Grondslag == input.Grondslag ||
                    (this.Grondslag != null &&
                    this.Grondslag.Equals(input.Grondslag))
                ) && 
                (
                    this.DatumInWerking == input.DatumInWerking ||
                    (this.DatumInWerking != null &&
                    this.DatumInWerking.Equals(input.DatumInWerking))
                ) && 
                (
                    this.DatumBeeindiging == input.DatumBeeindiging ||
                    (this.DatumBeeindiging != null &&
                    this.DatumBeeindiging.Equals(input.DatumBeeindiging))
                ) && 
                (
                    this.BevoegdGezag == input.BevoegdGezag ||
                    (this.BevoegdGezag != null &&
                    this.BevoegdGezag.Equals(input.BevoegdGezag))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Identificatie != null)
                    hashCode = hashCode * 59 + this.Identificatie.GetHashCode();
                if (this.Domein != null)
                    hashCode = hashCode * 59 + this.Domein.GetHashCode();
                if (this.Grondslag != null)
                    hashCode = hashCode * 59 + this.Grondslag.GetHashCode();
                if (this.DatumInWerking != null)
                    hashCode = hashCode * 59 + this.DatumInWerking.GetHashCode();
                if (this.DatumBeeindiging != null)
                    hashCode = hashCode * 59 + this.DatumBeeindiging.GetHashCode();
                if (this.BevoegdGezag != null)
                    hashCode = hashCode * 59 + this.BevoegdGezag.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
