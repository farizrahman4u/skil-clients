# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' INDArray Class
#'
#' @field array 
#' @field shape 
#' @field ordering 
#' @field data 
#' @field dataType 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
INDArray <- R6::R6Class(
  'INDArray',
  public = list(
    `array` = NULL,
    `shape` = NULL,
    `ordering` = NULL,
    `data` = NULL,
    `dataType` = NULL,
    initialize = function(`array`, `shape`, `ordering`, `data`, `dataType`){
      if (!missing(`array`)) {
        stopifnot(is.character(`array`), length(`array`) == 1)
        self$`array` <- `array`
      }
      if (!missing(`shape`)) {
        stopifnot(is.list(`shape`), length(`shape`) != 0)
        lapply(`shape`, function(x) stopifnot(is.character(x)))
        self$`shape` <- `shape`
      }
      if (!missing(`ordering`)) {
        stopifnot(is.character(`ordering`), length(`ordering`) == 1)
        self$`ordering` <- `ordering`
      }
      if (!missing(`data`)) {
        stopifnot(is.list(`data`), length(`data`) != 0)
        lapply(`data`, function(x) stopifnot(is.character(x)))
        self$`data` <- `data`
      }
      if (!missing(`dataType`)) {
        stopifnot(is.character(`dataType`), length(`dataType`) == 1)
        self$`dataType` <- `dataType`
      }
    },
    toJSON = function() {
      INDArrayObject <- list()
      if (!is.null(self$`array`)) {
        INDArrayObject[['array']] <- self$`array`
      }
      if (!is.null(self$`shape`)) {
        INDArrayObject[['shape']] <- self$`shape`
      }
      if (!is.null(self$`ordering`)) {
        INDArrayObject[['ordering']] <- self$`ordering`
      }
      if (!is.null(self$`data`)) {
        INDArrayObject[['data']] <- self$`data`
      }
      if (!is.null(self$`dataType`)) {
        INDArrayObject[['dataType']] <- self$`dataType`
      }

      INDArrayObject
    },
    fromJSON = function(INDArrayJson) {
      INDArrayObject <- jsonlite::fromJSON(INDArrayJson)
      if (!is.null(INDArrayObject$`array`)) {
        self$`array` <- INDArrayObject$`array`
      }
      if (!is.null(INDArrayObject$`shape`)) {
        self$`shape` <- INDArrayObject$`shape`
      }
      if (!is.null(INDArrayObject$`ordering`)) {
        self$`ordering` <- INDArrayObject$`ordering`
      }
      if (!is.null(INDArrayObject$`data`)) {
        self$`data` <- INDArrayObject$`data`
      }
      if (!is.null(INDArrayObject$`dataType`)) {
        self$`dataType` <- INDArrayObject$`dataType`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "array": %s,
           "shape": [%s],
           "ordering": %s,
           "data": [%s],
           "dataType": %s
        }',
        self$`array`,
        lapply(self$`shape`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`ordering`,
        lapply(self$`data`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`dataType`
      )
    },
    fromJSONString = function(INDArrayJson) {
      INDArrayObject <- jsonlite::fromJSON(INDArrayJson)
      self$`array` <- INDArrayObject$`array`
      self$`shape` <- INDArrayObject$`shape`
      self$`ordering` <- INDArrayObject$`ordering`
      self$`data` <- INDArrayObject$`data`
      self$`dataType` <- INDArrayObject$`dataType`
    }
  )
)
