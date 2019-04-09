# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' BatchCSVRecord Class
#'
#' @field records 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchCSVRecord <- R6::R6Class(
  'BatchCSVRecord',
  public = list(
    `records` = NULL,
    initialize = function(`records`){
      if (!missing(`records`)) {
        stopifnot(is.list(`records`), length(`records`) != 0)
        lapply(`records`, function(x) stopifnot(R6::is.R6(x)))
        self$`records` <- `records`
      }
    },
    toJSON = function() {
      BatchCSVRecordObject <- list()
      if (!is.null(self$`records`)) {
        BatchCSVRecordObject[['records']] <- lapply(self$`records`, function(x) x$toJSON())
      }

      BatchCSVRecordObject
    },
    fromJSON = function(BatchCSVRecordJson) {
      BatchCSVRecordObject <- jsonlite::fromJSON(BatchCSVRecordJson)
      if (!is.null(BatchCSVRecordObject$`records`)) {
        self$`records` <- lapply(BatchCSVRecordObject$`records`, function(x) {
          recordsObject <- SingleCSVRecord$new()
          recordsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          recordsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "records": [%s]
        }',
        lapply(self$`records`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(BatchCSVRecordJson) {
      BatchCSVRecordObject <- jsonlite::fromJSON(BatchCSVRecordJson)
      self$`records` <- lapply(BatchCSVRecordObject$`records`, function(x) SingleCSVRecord$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
