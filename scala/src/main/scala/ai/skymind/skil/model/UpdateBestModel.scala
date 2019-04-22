/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model


case class UpdateBestModel (
  // GUID of the experiment to update.
  ExperimentId: Option[String] = None,
  // GUID of the model to set as the best model.
  BestModelId: Option[String] = None
)
