# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MultiClassClassificationResult Class
#'
#' @field rankedOutcomes 
#' @field maxOutcomes 
#' @field probabilities 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MultiClassClassificationResult <- R6::R6Class(
  'MultiClassClassificationResult',
  public = list(
    `rankedOutcomes` = NULL,
    `maxOutcomes` = NULL,
    `probabilities` = NULL,
    initialize = function(`rankedOutcomes`, `maxOutcomes`, `probabilities`){
      if (!missing(`rankedOutcomes`)) {
        stopifnot(is.list(`rankedOutcomes`), length(`rankedOutcomes`) != 0)
        lapply(`rankedOutcomes`, function(x) stopifnot(R6::is.R6(x)))
        self$`rankedOutcomes` <- `rankedOutcomes`
      }
      if (!missing(`maxOutcomes`)) {
        stopifnot(is.list(`maxOutcomes`), length(`maxOutcomes`) != 0)
        lapply(`maxOutcomes`, function(x) stopifnot(is.character(x)))
        self$`maxOutcomes` <- `maxOutcomes`
      }
      if (!missing(`probabilities`)) {
        stopifnot(is.list(`probabilities`), length(`probabilities`) != 0)
        lapply(`probabilities`, function(x) stopifnot(R6::is.R6(x)))
        self$`probabilities` <- `probabilities`
      }
    },
    toJSON = function() {
      MultiClassClassificationResultObject <- list()
      if (!is.null(self$`rankedOutcomes`)) {
        MultiClassClassificationResultObject[['rankedOutcomes']] <- lapply(self$`rankedOutcomes`, function(x) x$toJSON())
      }
      if (!is.null(self$`maxOutcomes`)) {
        MultiClassClassificationResultObject[['maxOutcomes']] <- self$`maxOutcomes`
      }
      if (!is.null(self$`probabilities`)) {
        MultiClassClassificationResultObject[['probabilities']] <- lapply(self$`probabilities`, function(x) x$toJSON())
      }

      MultiClassClassificationResultObject
    },
    fromJSON = function(MultiClassClassificationResultJson) {
      MultiClassClassificationResultObject <- jsonlite::fromJSON(MultiClassClassificationResultJson)
      if (!is.null(MultiClassClassificationResultObject$`rankedOutcomes`)) {
        self$`rankedOutcomes` <- lapply(MultiClassClassificationResultObject$`rankedOutcomes`, function(x) {
          rankedOutcomesObject <- Character$new()
          rankedOutcomesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          rankedOutcomesObject
        })
      }
      if (!is.null(MultiClassClassificationResultObject$`maxOutcomes`)) {
        self$`maxOutcomes` <- MultiClassClassificationResultObject$`maxOutcomes`
      }
      if (!is.null(MultiClassClassificationResultObject$`probabilities`)) {
        self$`probabilities` <- lapply(MultiClassClassificationResultObject$`probabilities`, function(x) {
          probabilitiesObject <- Numeric$new()
          probabilitiesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          probabilitiesObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "rankedOutcomes": [%s],
           "maxOutcomes": [%s],
           "probabilities": [%s]
        }',
        lapply(self$`rankedOutcomes`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`maxOutcomes`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`probabilities`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(MultiClassClassificationResultJson) {
      MultiClassClassificationResultObject <- jsonlite::fromJSON(MultiClassClassificationResultJson)
      self$`rankedOutcomes` <- lapply(MultiClassClassificationResultObject$`rankedOutcomes`, function(x) Character$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`maxOutcomes` <- MultiClassClassificationResultObject$`maxOutcomes`
      self$`probabilities` <- lapply(MultiClassClassificationResultObject$`probabilities`, function(x) Numeric$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
