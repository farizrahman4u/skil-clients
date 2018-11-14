/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model


case class S3ResourceDetails (
  `Class`: Option[String] = None,
  // ID of the resource
  ResourceId: Option[Long] = None,
  // Resource type
  `Type`: Option[String] = None,
  // Resource subtype
  SubType: Option[String] = None,
  // S3 Bucket Name
  Bucket: Option[String] = None,
  // Region name where the S3 bucket is present
  Region: Option[String] = None
)

