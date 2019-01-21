/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
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
using SwaggerDateConverter = Skymind.SKIL.Client.SwaggerDateConverter;

namespace Skymind.SKIL.Model
{
    /// <summary>
    /// Base64NDArrayBodyKNN
    /// </summary>
    [DataContract]
    public partial class Base64NDArrayBodyKNN :  IEquatable<Base64NDArrayBodyKNN>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Base64NDArrayBodyKNN" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Base64NDArrayBodyKNN() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Base64NDArrayBodyKNN" /> class.
        /// </summary>
        /// <param name="ndarray">the array to run the search on. Note that this must be a row vector (required).</param>
        /// <param name="k">the number of results to retrieve (required).</param>
        /// <param name="forceFillK">If &#39;True&#39; it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched..</param>
        public Base64NDArrayBodyKNN(string ndarray = default(string), int? k = default(int?), bool? forceFillK = default(bool?))
        {
            // to ensure "ndarray" is required (not null)
            if (ndarray == null)
            {
                throw new InvalidDataException("ndarray is a required property for Base64NDArrayBodyKNN and cannot be null");
            }
            else
            {
                this.Ndarray = ndarray;
            }
            // to ensure "k" is required (not null)
            if (k == null)
            {
                throw new InvalidDataException("k is a required property for Base64NDArrayBodyKNN and cannot be null");
            }
            else
            {
                this.K = k;
            }
            this.ForceFillK = forceFillK;
        }
        
        /// <summary>
        /// the array to run the search on. Note that this must be a row vector
        /// </summary>
        /// <value>the array to run the search on. Note that this must be a row vector</value>
        [DataMember(Name="ndarray", EmitDefaultValue=false)]
        public string Ndarray { get; set; }

        /// <summary>
        /// the number of results to retrieve
        /// </summary>
        /// <value>the number of results to retrieve</value>
        [DataMember(Name="k", EmitDefaultValue=false)]
        public int? K { get; set; }

        /// <summary>
        /// If &#39;True&#39; it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched.
        /// </summary>
        /// <value>If &#39;True&#39; it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched.</value>
        [DataMember(Name="forceFillK", EmitDefaultValue=false)]
        public bool? ForceFillK { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Base64NDArrayBodyKNN {\n");
            sb.Append("  Ndarray: ").Append(Ndarray).Append("\n");
            sb.Append("  K: ").Append(K).Append("\n");
            sb.Append("  ForceFillK: ").Append(ForceFillK).Append("\n");
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
            return this.Equals(input as Base64NDArrayBodyKNN);
        }

        /// <summary>
        /// Returns true if Base64NDArrayBodyKNN instances are equal
        /// </summary>
        /// <param name="input">Instance of Base64NDArrayBodyKNN to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Base64NDArrayBodyKNN input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ndarray == input.Ndarray ||
                    (this.Ndarray != null &&
                    this.Ndarray.Equals(input.Ndarray))
                ) && 
                (
                    this.K == input.K ||
                    (this.K != null &&
                    this.K.Equals(input.K))
                ) && 
                (
                    this.ForceFillK == input.ForceFillK ||
                    (this.ForceFillK != null &&
                    this.ForceFillK.Equals(input.ForceFillK))
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
                if (this.Ndarray != null)
                    hashCode = hashCode * 59 + this.Ndarray.GetHashCode();
                if (this.K != null)
                    hashCode = hashCode * 59 + this.K.GetHashCode();
                if (this.ForceFillK != null)
                    hashCode = hashCode * 59 + this.ForceFillK.GetHashCode();
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
