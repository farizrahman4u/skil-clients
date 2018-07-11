/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.1.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type MultiPredictResponse struct {
	Id string `json:"id,omitempty"`
	NeedsPreProcessing bool `json:"needsPreProcessing,omitempty"`
	Outputs []IndArray `json:"outputs,omitempty"`
}
