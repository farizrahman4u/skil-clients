# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' NearestNeighborsResult Class
#'
#' @field index 
#' @field distance 
#' @field label 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NearestNeighborsResult <- R6::R6Class(
  'NearestNeighborsResult',
  public = list(
    `index` = NULL,
    `distance` = NULL,
    `label` = NULL,
    initialize = function(`index`, `distance`, `label`){
      if (!missing(`index`)) {
        stopifnot(is.numeric(`index`), length(`index`) == 1)
        self$`index` <- `index`
      }
      if (!missing(`distance`)) {
        self$`distance` <- `distance`
      }
      if (!missing(`label`)) {
        stopifnot(is.character(`label`), length(`label`) == 1)
        self$`label` <- `label`
      }
    },
    toJSON = function() {
      NearestNeighborsResultObject <- list()
      if (!is.null(self$`index`)) {
        NearestNeighborsResultObject[['index']] <- self$`index`
      }
      if (!is.null(self$`distance`)) {
        NearestNeighborsResultObject[['distance']] <- self$`distance`
      }
      if (!is.null(self$`label`)) {
        NearestNeighborsResultObject[['label']] <- self$`label`
      }

      NearestNeighborsResultObject
    },
    fromJSON = function(NearestNeighborsResultJson) {
      NearestNeighborsResultObject <- jsonlite::fromJSON(NearestNeighborsResultJson)
      if (!is.null(NearestNeighborsResultObject$`index`)) {
        self$`index` <- NearestNeighborsResultObject$`index`
      }
      if (!is.null(NearestNeighborsResultObject$`distance`)) {
        self$`distance` <- NearestNeighborsResultObject$`distance`
      }
      if (!is.null(NearestNeighborsResultObject$`label`)) {
        self$`label` <- NearestNeighborsResultObject$`label`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "index": %d,
           "distance": %s,
           "label": %s
        }',
        self$`index`,
        self$`distance`,
        self$`label`
      )
    },
    fromJSONString = function(NearestNeighborsResultJson) {
      NearestNeighborsResultObject <- jsonlite::fromJSON(NearestNeighborsResultJson)
      self$`index` <- NearestNeighborsResultObject$`index`
      self$`distance` <- NearestNeighborsResultObject$`distance`
      self$`label` <- NearestNeighborsResultObject$`label`
    }
  )
)
