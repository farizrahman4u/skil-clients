/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.1.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type FileUpload struct {
	Key string `json:"key,omitempty"`
	FileName string `json:"fileName,omitempty"`
	Status string `json:"status,omitempty"`
	Type_ string `json:"type,omitempty"`
	Path string `json:"path,omitempty"`
	FileContent string `json:"fileContent,omitempty"`
}
