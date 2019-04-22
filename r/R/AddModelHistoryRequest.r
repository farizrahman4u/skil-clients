# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' AddModelHistoryRequest Class
#'
#' @field modelName 
#' @field modelLabels 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AddModelHistoryRequest <- R6::R6Class(
  'AddModelHistoryRequest',
  public = list(
    `modelName` = NULL,
    `modelLabels` = NULL,
    initialize = function(`modelName`, `modelLabels`){
      if (!missing(`modelName`)) {
        stopifnot(is.character(`modelName`), length(`modelName`) == 1)
        self$`modelName` <- `modelName`
      }
      if (!missing(`modelLabels`)) {
        stopifnot(is.character(`modelLabels`), length(`modelLabels`) == 1)
        self$`modelLabels` <- `modelLabels`
      }
    },
    toJSON = function() {
      AddModelHistoryRequestObject <- list()
      if (!is.null(self$`modelName`)) {
        AddModelHistoryRequestObject[['modelName']] <- self$`modelName`
      }
      if (!is.null(self$`modelLabels`)) {
        AddModelHistoryRequestObject[['modelLabels']] <- self$`modelLabels`
      }

      AddModelHistoryRequestObject
    },
    fromJSON = function(AddModelHistoryRequestJson) {
      AddModelHistoryRequestObject <- jsonlite::fromJSON(AddModelHistoryRequestJson)
      if (!is.null(AddModelHistoryRequestObject$`modelName`)) {
        self$`modelName` <- AddModelHistoryRequestObject$`modelName`
      }
      if (!is.null(AddModelHistoryRequestObject$`modelLabels`)) {
        self$`modelLabels` <- AddModelHistoryRequestObject$`modelLabels`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "modelName": %s,
           "modelLabels": %s
        }',
        self$`modelName`,
        self$`modelLabels`
      )
    },
    fromJSONString = function(AddModelHistoryRequestJson) {
      AddModelHistoryRequestObject <- jsonlite::fromJSON(AddModelHistoryRequestJson)
      self$`modelName` <- AddModelHistoryRequestObject$`modelName`
      self$`modelLabels` <- AddModelHistoryRequestObject$`modelLabels`
    }
  )
)