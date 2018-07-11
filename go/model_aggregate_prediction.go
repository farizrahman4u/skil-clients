/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.1.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type AggregatePrediction struct {
	// GUID of model instance
	ModelId string `json:"modelId,omitempty"`
	// the evaluation type to aggregate
	EvalType string `json:"evalType,omitempty"`
}
