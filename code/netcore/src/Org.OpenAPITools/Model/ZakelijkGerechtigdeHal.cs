/*
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ZakelijkGerechtigdeHal
    /// </summary>
    [DataContract(Name = "ZakelijkGerechtigdeHal")]
    public partial class ZakelijkGerechtigdeHal : IEquatable<ZakelijkGerechtigdeHal>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeGerechtigdeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ZakelijkGerechtigdeHal" /> class.
        /// </summary>
        /// <param name="identificatie">Identificatie van de zakelijk gerechtigde. .</param>
        /// <param name="type">type.</param>
        /// <param name="aanvangsdatum">Datum waarop het zakelijk recht van kracht is geworden. .</param>
        /// <param name="erfpachtCanon">erfpachtCanon.</param>
        /// <param name="tenaamstelling">tenaamstelling.</param>
        /// <param name="persoon">persoon.</param>
        /// <param name="links">links.</param>
        public ZakelijkGerechtigdeHal(string identificatie = default(string), TypeGerechtigdeEnum? type = default(TypeGerechtigdeEnum?), DateTime aanvangsdatum = default(DateTime), ErfpachtCanon erfpachtCanon = default(ErfpachtCanon), Tenaamstelling tenaamstelling = default(Tenaamstelling), PersoonBeperkt persoon = default(PersoonBeperkt), ZakelijkGerechtigdeLinks links = default(ZakelijkGerechtigdeLinks))
        {
            this.Identificatie = identificatie;
            this.Type = type;
            this.Aanvangsdatum = aanvangsdatum;
            this.ErfpachtCanon = erfpachtCanon;
            this.Tenaamstelling = tenaamstelling;
            this.Persoon = persoon;
            this.Links = links;
        }

        /// <summary>
        /// Identificatie van de zakelijk gerechtigde. 
        /// </summary>
        /// <value>Identificatie van de zakelijk gerechtigde. </value>
        [DataMember(Name = "identificatie", EmitDefaultValue = false)]
        public string Identificatie { get; set; }

        /// <summary>
        /// Datum waarop het zakelijk recht van kracht is geworden. 
        /// </summary>
        /// <value>Datum waarop het zakelijk recht van kracht is geworden. </value>
        [DataMember(Name = "aanvangsdatum", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Aanvangsdatum { get; set; }

        /// <summary>
        /// Gets or Sets ErfpachtCanon
        /// </summary>
        [DataMember(Name = "erfpachtCanon", EmitDefaultValue = false)]
        public ErfpachtCanon ErfpachtCanon { get; set; }

        /// <summary>
        /// Gets or Sets Tenaamstelling
        /// </summary>
        [DataMember(Name = "tenaamstelling", EmitDefaultValue = false)]
        public Tenaamstelling Tenaamstelling { get; set; }

        /// <summary>
        /// Gets or Sets Persoon
        /// </summary>
        [DataMember(Name = "persoon", EmitDefaultValue = false)]
        public PersoonBeperkt Persoon { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name = "_links", EmitDefaultValue = false)]
        public ZakelijkGerechtigdeLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ZakelijkGerechtigdeHal {\n");
            sb.Append("  Identificatie: ").Append(Identificatie).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Aanvangsdatum: ").Append(Aanvangsdatum).Append("\n");
            sb.Append("  ErfpachtCanon: ").Append(ErfpachtCanon).Append("\n");
            sb.Append("  Tenaamstelling: ").Append(Tenaamstelling).Append("\n");
            sb.Append("  Persoon: ").Append(Persoon).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ZakelijkGerechtigdeHal);
        }

        /// <summary>
        /// Returns true if ZakelijkGerechtigdeHal instances are equal
        /// </summary>
        /// <param name="input">Instance of ZakelijkGerechtigdeHal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ZakelijkGerechtigdeHal input)
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
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Aanvangsdatum == input.Aanvangsdatum ||
                    (this.Aanvangsdatum != null &&
                    this.Aanvangsdatum.Equals(input.Aanvangsdatum))
                ) && 
                (
                    this.ErfpachtCanon == input.ErfpachtCanon ||
                    (this.ErfpachtCanon != null &&
                    this.ErfpachtCanon.Equals(input.ErfpachtCanon))
                ) && 
                (
                    this.Tenaamstelling == input.Tenaamstelling ||
                    (this.Tenaamstelling != null &&
                    this.Tenaamstelling.Equals(input.Tenaamstelling))
                ) && 
                (
                    this.Persoon == input.Persoon ||
                    (this.Persoon != null &&
                    this.Persoon.Equals(input.Persoon))
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
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
                hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Aanvangsdatum != null)
                    hashCode = hashCode * 59 + this.Aanvangsdatum.GetHashCode();
                if (this.ErfpachtCanon != null)
                    hashCode = hashCode * 59 + this.ErfpachtCanon.GetHashCode();
                if (this.Tenaamstelling != null)
                    hashCode = hashCode * 59 + this.Tenaamstelling.GetHashCode();
                if (this.Persoon != null)
                    hashCode = hashCode * 59 + this.Persoon.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
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
