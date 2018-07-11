/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
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
    /// MultiPredictResponse
    /// </summary>
    [DataContract]
    public partial class MultiPredictResponse :  IEquatable<MultiPredictResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MultiPredictResponse" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="needsPreProcessing">needsPreProcessing.</param>
        /// <param name="outputs">outputs.</param>
        public MultiPredictResponse(string id = default(string), bool? needsPreProcessing = default(bool?), List<INDArray> outputs = default(List<INDArray>))
        {
            this.Id = id;
            this.NeedsPreProcessing = needsPreProcessing;
            this.Outputs = outputs;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets NeedsPreProcessing
        /// </summary>
        [DataMember(Name="needsPreProcessing", EmitDefaultValue=false)]
        public bool? NeedsPreProcessing { get; set; }

        /// <summary>
        /// Gets or Sets Outputs
        /// </summary>
        [DataMember(Name="outputs", EmitDefaultValue=false)]
        public List<INDArray> Outputs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MultiPredictResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NeedsPreProcessing: ").Append(NeedsPreProcessing).Append("\n");
            sb.Append("  Outputs: ").Append(Outputs).Append("\n");
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
            return this.Equals(input as MultiPredictResponse);
        }

        /// <summary>
        /// Returns true if MultiPredictResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of MultiPredictResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MultiPredictResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.NeedsPreProcessing == input.NeedsPreProcessing ||
                    (this.NeedsPreProcessing != null &&
                    this.NeedsPreProcessing.Equals(input.NeedsPreProcessing))
                ) && 
                (
                    this.Outputs == input.Outputs ||
                    this.Outputs != null &&
                    this.Outputs.SequenceEqual(input.Outputs)
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.NeedsPreProcessing != null)
                    hashCode = hashCode * 59 + this.NeedsPreProcessing.GetHashCode();
                if (this.Outputs != null)
                    hashCode = hashCode * 59 + this.Outputs.GetHashCode();
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
