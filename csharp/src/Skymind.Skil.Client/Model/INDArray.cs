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
using SwaggerDateConverter = Skymind.Skil.Client.Client.SwaggerDateConverter;

namespace Skymind.Skil.Client.Model
{
    /// <summary>
    /// INDArray
    /// </summary>
    [DataContract]
    public partial class INDArray :  IEquatable<INDArray>, IValidatableObject
    {
        /// <summary>
        /// Defines Ordering
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OrderingEnum
        {
            
            /// <summary>
            /// Enum F for value: f
            /// </summary>
            [EnumMember(Value = "f")]
            F = 1,
            
            /// <summary>
            /// Enum C for value: c
            /// </summary>
            [EnumMember(Value = "c")]
            C = 2
        }

        /// <summary>
        /// Gets or Sets Ordering
        /// </summary>
        [DataMember(Name="ordering", EmitDefaultValue=false)]
        public OrderingEnum? Ordering { get; set; }
        /// <summary>
        /// Defines DataType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataTypeEnum
        {
            
            /// <summary>
            /// Enum INT8 for value: INT8
            /// </summary>
            [EnumMember(Value = "INT8")]
            INT8 = 1,
            
            /// <summary>
            /// Enum UINT8 for value: UINT8
            /// </summary>
            [EnumMember(Value = "UINT8")]
            UINT8 = 2,
            
            /// <summary>
            /// Enum INT16 for value: INT16
            /// </summary>
            [EnumMember(Value = "INT16")]
            INT16 = 3,
            
            /// <summary>
            /// Enum FLOAT16 for value: FLOAT16
            /// </summary>
            [EnumMember(Value = "FLOAT16")]
            FLOAT16 = 4
        }

        /// <summary>
        /// Gets or Sets DataType
        /// </summary>
        [DataMember(Name="dataType", EmitDefaultValue=false)]
        public DataTypeEnum? DataType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="INDArray" /> class.
        /// </summary>
        /// <param name="array">array.</param>
        /// <param name="shape">shape.</param>
        /// <param name="ordering">ordering.</param>
        /// <param name="data">data.</param>
        /// <param name="dataType">dataType.</param>
        public INDArray(string array = default(string), List<int?> shape = default(List<int?>), OrderingEnum? ordering = default(OrderingEnum?), List<float?> data = default(List<float?>), DataTypeEnum? dataType = default(DataTypeEnum?))
        {
            this.Array = array;
            this.Shape = shape;
            this.Ordering = ordering;
            this.Data = data;
            this.DataType = dataType;
        }
        
        /// <summary>
        /// Gets or Sets Array
        /// </summary>
        [DataMember(Name="array", EmitDefaultValue=false)]
        public string Array { get; set; }

        /// <summary>
        /// Gets or Sets Shape
        /// </summary>
        [DataMember(Name="shape", EmitDefaultValue=false)]
        public List<int?> Shape { get; set; }


        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name="data", EmitDefaultValue=false)]
        public List<float?> Data { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class INDArray {\n");
            sb.Append("  Array: ").Append(Array).Append("\n");
            sb.Append("  Shape: ").Append(Shape).Append("\n");
            sb.Append("  Ordering: ").Append(Ordering).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
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
            return this.Equals(input as INDArray);
        }

        /// <summary>
        /// Returns true if INDArray instances are equal
        /// </summary>
        /// <param name="input">Instance of INDArray to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(INDArray input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Array == input.Array ||
                    (this.Array != null &&
                    this.Array.Equals(input.Array))
                ) && 
                (
                    this.Shape == input.Shape ||
                    this.Shape != null &&
                    this.Shape.SequenceEqual(input.Shape)
                ) && 
                (
                    this.Ordering == input.Ordering ||
                    (this.Ordering != null &&
                    this.Ordering.Equals(input.Ordering))
                ) && 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    this.Data.SequenceEqual(input.Data)
                ) && 
                (
                    this.DataType == input.DataType ||
                    (this.DataType != null &&
                    this.DataType.Equals(input.DataType))
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
                if (this.Array != null)
                    hashCode = hashCode * 59 + this.Array.GetHashCode();
                if (this.Shape != null)
                    hashCode = hashCode * 59 + this.Shape.GetHashCode();
                if (this.Ordering != null)
                    hashCode = hashCode * 59 + this.Ordering.GetHashCode();
                if (this.Data != null)
                    hashCode = hashCode * 59 + this.Data.GetHashCode();
                if (this.DataType != null)
                    hashCode = hashCode * 59 + this.DataType.GetHashCode();
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
