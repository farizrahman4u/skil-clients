# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' SingleRecord Class
#'
#' @field values 
#' @field uri 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SingleRecord <- R6::R6Class(
  'SingleRecord',
  public = list(
    `values` = NULL,
    `uri` = NULL,
    initialize = function(`values`, `uri`){
      if (!missing(`values`)) {
        stopifnot(is.list(`values`), length(`values`) != 0)
        lapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
      if (!missing(`uri`)) {
        stopifnot(is.character(`uri`), length(`uri`) == 1)
        self$`uri` <- `uri`
      }
    },
    toJSON = function() {
      SingleRecordObject <- list()
      if (!is.null(self$`values`)) {
        SingleRecordObject[['values']] <- self$`values`
      }
      if (!is.null(self$`uri`)) {
        SingleRecordObject[['uri']] <- self$`uri`
      }

      SingleRecordObject
    },
    fromJSON = function(SingleRecordJson) {
      SingleRecordObject <- jsonlite::fromJSON(SingleRecordJson)
      if (!is.null(SingleRecordObject$`values`)) {
        self$`values` <- SingleRecordObject$`values`
      }
      if (!is.null(SingleRecordObject$`uri`)) {
        self$`uri` <- SingleRecordObject$`uri`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "values": [%s],
           "uri": %s
        }',
        lapply(self$`values`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`uri`
      )
    },
    fromJSONString = function(SingleRecordJson) {
      SingleRecordObject <- jsonlite::fromJSON(SingleRecordJson)
      self$`values` <- SingleRecordObject$`values`
      self$`uri` <- SingleRecordObject$`uri`
    }
  )
)
