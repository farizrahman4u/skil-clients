# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MultiPredictResponse Class
#'
#' @field id 
#' @field needsPreProcessing 
#' @field outputs 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MultiPredictResponse <- R6::R6Class(
  'MultiPredictResponse',
  public = list(
    `id` = NULL,
    `needsPreProcessing` = NULL,
    `outputs` = NULL,
    initialize = function(`id`, `needsPreProcessing`, `outputs`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`needsPreProcessing`)) {
        self$`needsPreProcessing` <- `needsPreProcessing`
      }
      if (!missing(`outputs`)) {
        stopifnot(is.list(`outputs`), length(`outputs`) != 0)
        lapply(`outputs`, function(x) stopifnot(R6::is.R6(x)))
        self$`outputs` <- `outputs`
      }
    },
    toJSON = function() {
      MultiPredictResponseObject <- list()
      if (!is.null(self$`id`)) {
        MultiPredictResponseObject[['id']] <- self$`id`
      }
      if (!is.null(self$`needsPreProcessing`)) {
        MultiPredictResponseObject[['needsPreProcessing']] <- self$`needsPreProcessing`
      }
      if (!is.null(self$`outputs`)) {
        MultiPredictResponseObject[['outputs']] <- lapply(self$`outputs`, function(x) x$toJSON())
      }

      MultiPredictResponseObject
    },
    fromJSON = function(MultiPredictResponseJson) {
      MultiPredictResponseObject <- jsonlite::fromJSON(MultiPredictResponseJson)
      if (!is.null(MultiPredictResponseObject$`id`)) {
        self$`id` <- MultiPredictResponseObject$`id`
      }
      if (!is.null(MultiPredictResponseObject$`needsPreProcessing`)) {
        self$`needsPreProcessing` <- MultiPredictResponseObject$`needsPreProcessing`
      }
      if (!is.null(MultiPredictResponseObject$`outputs`)) {
        self$`outputs` <- lapply(MultiPredictResponseObject$`outputs`, function(x) {
          outputsObject <- INDArray$new()
          outputsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          outputsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "needsPreProcessing": %s,
           "outputs": [%s]
        }',
        self$`id`,
        self$`needsPreProcessing`,
        lapply(self$`outputs`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(MultiPredictResponseJson) {
      MultiPredictResponseObject <- jsonlite::fromJSON(MultiPredictResponseJson)
      self$`id` <- MultiPredictResponseObject$`id`
      self$`needsPreProcessing` <- MultiPredictResponseObject$`needsPreProcessing`
      self$`outputs` <- lapply(MultiPredictResponseObject$`outputs`, function(x) INDArray$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
