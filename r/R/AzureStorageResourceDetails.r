# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' AzureStorageResourceDetails Class
#'
#' @field @class 
#' @field resourceId 
#' @field type 
#' @field subType 
#' @field containerName 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AzureStorageResourceDetails <- R6::R6Class(
  'AzureStorageResourceDetails',
  public = list(
    `@class` = NULL,
    `resourceId` = NULL,
    `type` = NULL,
    `subType` = NULL,
    `containerName` = NULL,
    initialize = function(`@class`, `resourceId`, `type`, `subType`, `containerName`){
      if (!missing(`@class`)) {
        stopifnot(is.character(`@class`), length(`@class`) == 1)
        self$`@class` <- `@class`
      }
      if (!missing(`resourceId`)) {
        stopifnot(is.numeric(`resourceId`), length(`resourceId`) == 1)
        self$`resourceId` <- `resourceId`
      }
      if (!missing(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`subType`)) {
        stopifnot(is.character(`subType`), length(`subType`) == 1)
        self$`subType` <- `subType`
      }
      if (!missing(`containerName`)) {
        stopifnot(is.character(`containerName`), length(`containerName`) == 1)
        self$`containerName` <- `containerName`
      }
    },
    toJSON = function() {
      AzureStorageResourceDetailsObject <- list()
      if (!is.null(self$`@class`)) {
        AzureStorageResourceDetailsObject[['@class']] <- self$`@class`
      }
      if (!is.null(self$`resourceId`)) {
        AzureStorageResourceDetailsObject[['resourceId']] <- self$`resourceId`
      }
      if (!is.null(self$`type`)) {
        AzureStorageResourceDetailsObject[['type']] <- self$`type`
      }
      if (!is.null(self$`subType`)) {
        AzureStorageResourceDetailsObject[['subType']] <- self$`subType`
      }
      if (!is.null(self$`containerName`)) {
        AzureStorageResourceDetailsObject[['containerName']] <- self$`containerName`
      }

      AzureStorageResourceDetailsObject
    },
    fromJSON = function(AzureStorageResourceDetailsJson) {
      AzureStorageResourceDetailsObject <- jsonlite::fromJSON(AzureStorageResourceDetailsJson)
      if (!is.null(AzureStorageResourceDetailsObject$`@class`)) {
        self$`@class` <- AzureStorageResourceDetailsObject$`@class`
      }
      if (!is.null(AzureStorageResourceDetailsObject$`resourceId`)) {
        self$`resourceId` <- AzureStorageResourceDetailsObject$`resourceId`
      }
      if (!is.null(AzureStorageResourceDetailsObject$`type`)) {
        self$`type` <- AzureStorageResourceDetailsObject$`type`
      }
      if (!is.null(AzureStorageResourceDetailsObject$`subType`)) {
        self$`subType` <- AzureStorageResourceDetailsObject$`subType`
      }
      if (!is.null(AzureStorageResourceDetailsObject$`containerName`)) {
        self$`containerName` <- AzureStorageResourceDetailsObject$`containerName`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "@class": %s,
           "resourceId": %d,
           "type": %s,
           "subType": %s,
           "containerName": %s
        }',
        self$`@class`,
        self$`resourceId`,
        self$`type`,
        self$`subType`,
        self$`containerName`
      )
    },
    fromJSONString = function(AzureStorageResourceDetailsJson) {
      AzureStorageResourceDetailsObject <- jsonlite::fromJSON(AzureStorageResourceDetailsJson)
      self$`@class` <- AzureStorageResourceDetailsObject$`@class`
      self$`resourceId` <- AzureStorageResourceDetailsObject$`resourceId`
      self$`type` <- AzureStorageResourceDetailsObject$`type`
      self$`subType` <- AzureStorageResourceDetailsObject$`subType`
      self$`containerName` <- AzureStorageResourceDetailsObject$`containerName`
    }
  )
)
