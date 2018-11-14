/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
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
    /// HDFSResourceDetails
    /// </summary>
    [DataContract]
    public partial class HDFSResourceDetails :  IEquatable<HDFSResourceDetails>, IValidatableObject
    {
        /// <summary>
        /// Resource type
        /// </summary>
        /// <value>Resource type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum STORAGE for value: STORAGE
            /// </summary>
            [EnumMember(Value = "STORAGE")]
            STORAGE = 1
        }

        /// <summary>
        /// Resource type
        /// </summary>
        /// <value>Resource type</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Resource subtype
        /// </summary>
        /// <value>Resource subtype</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SubTypeEnum
        {
            
            /// <summary>
            /// Enum HDFS for value: HDFS
            /// </summary>
            [EnumMember(Value = "HDFS")]
            HDFS = 1
        }

        /// <summary>
        /// Resource subtype
        /// </summary>
        /// <value>Resource subtype</value>
        [DataMember(Name="subType", EmitDefaultValue=false)]
        public SubTypeEnum? SubType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HDFSResourceDetails" /> class.
        /// </summary>
        /// <param name="_class">_class (default to &quot;io.skymind.resource.model.subtypes.storage.HDFSResourceDetails&quot;).</param>
        /// <param name="resourceId">ID of the resource.</param>
        /// <param name="type">Resource type.</param>
        /// <param name="subType">Resource subtype.</param>
        /// <param name="nameNodeHost">Host of the node running the NameNode.</param>
        /// <param name="nameNodePort">Port of the node running the NameNode.</param>
        public HDFSResourceDetails(string _class = "io.skymind.resource.model.subtypes.storage.HDFSResourceDetails", long? resourceId = default(long?), TypeEnum? type = default(TypeEnum?), SubTypeEnum? subType = default(SubTypeEnum?), string nameNodeHost = default(string), string nameNodePort = default(string))
        {
            // use default value if no "_class" provided
            if (_class == null)
            {
                this.Class = "io.skymind.resource.model.subtypes.storage.HDFSResourceDetails";
            }
            else
            {
                this.Class = _class;
            }
            this.ResourceId = resourceId;
            this.Type = type;
            this.SubType = subType;
            this.NameNodeHost = nameNodeHost;
            this.NameNodePort = nameNodePort;
        }
        
        /// <summary>
        /// Gets or Sets Class
        /// </summary>
        [DataMember(Name="@class", EmitDefaultValue=false)]
        public string Class { get; set; }

        /// <summary>
        /// ID of the resource
        /// </summary>
        /// <value>ID of the resource</value>
        [DataMember(Name="resourceId", EmitDefaultValue=false)]
        public long? ResourceId { get; set; }



        /// <summary>
        /// Host of the node running the NameNode
        /// </summary>
        /// <value>Host of the node running the NameNode</value>
        [DataMember(Name="nameNodeHost", EmitDefaultValue=false)]
        public string NameNodeHost { get; set; }

        /// <summary>
        /// Port of the node running the NameNode
        /// </summary>
        /// <value>Port of the node running the NameNode</value>
        [DataMember(Name="nameNodePort", EmitDefaultValue=false)]
        public string NameNodePort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HDFSResourceDetails {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  ResourceId: ").Append(ResourceId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  SubType: ").Append(SubType).Append("\n");
            sb.Append("  NameNodeHost: ").Append(NameNodeHost).Append("\n");
            sb.Append("  NameNodePort: ").Append(NameNodePort).Append("\n");
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
            return this.Equals(input as HDFSResourceDetails);
        }

        /// <summary>
        /// Returns true if HDFSResourceDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of HDFSResourceDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HDFSResourceDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Class == input.Class ||
                    (this.Class != null &&
                    this.Class.Equals(input.Class))
                ) && 
                (
                    this.ResourceId == input.ResourceId ||
                    (this.ResourceId != null &&
                    this.ResourceId.Equals(input.ResourceId))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.SubType == input.SubType ||
                    (this.SubType != null &&
                    this.SubType.Equals(input.SubType))
                ) && 
                (
                    this.NameNodeHost == input.NameNodeHost ||
                    (this.NameNodeHost != null &&
                    this.NameNodeHost.Equals(input.NameNodeHost))
                ) && 
                (
                    this.NameNodePort == input.NameNodePort ||
                    (this.NameNodePort != null &&
                    this.NameNodePort.Equals(input.NameNodePort))
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
                if (this.Class != null)
                    hashCode = hashCode * 59 + this.Class.GetHashCode();
                if (this.ResourceId != null)
                    hashCode = hashCode * 59 + this.ResourceId.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.SubType != null)
                    hashCode = hashCode * 59 + this.SubType.GetHashCode();
                if (this.NameNodeHost != null)
                    hashCode = hashCode * 59 + this.NameNodeHost.GetHashCode();
                if (this.NameNodePort != null)
                    hashCode = hashCode * 59 + this.NameNodePort.GetHashCode();
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
