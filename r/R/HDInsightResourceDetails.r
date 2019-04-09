# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' HDInsightResourceDetails Class
#'
#' @field @class 
#' @field resourceId 
#' @field type 
#' @field subType 
#' @field subscriptionId 
#' @field resourceGroupName 
#' @field clusterName 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
HDInsightResourceDetails <- R6::R6Class(
  'HDInsightResourceDetails',
  public = list(
    `@class` = NULL,
    `resourceId` = NULL,
    `type` = NULL,
    `subType` = NULL,
    `subscriptionId` = NULL,
    `resourceGroupName` = NULL,
    `clusterName` = NULL,
    initialize = function(`@class`, `resourceId`, `type`, `subType`, `subscriptionId`, `resourceGroupName`, `clusterName`){
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
      if (!missing(`subscriptionId`)) {
        stopifnot(is.character(`subscriptionId`), length(`subscriptionId`) == 1)
        self$`subscriptionId` <- `subscriptionId`
      }
      if (!missing(`resourceGroupName`)) {
        stopifnot(is.character(`resourceGroupName`), length(`resourceGroupName`) == 1)
        self$`resourceGroupName` <- `resourceGroupName`
      }
      if (!missing(`clusterName`)) {
        stopifnot(is.character(`clusterName`), length(`clusterName`) == 1)
        self$`clusterName` <- `clusterName`
      }
    },
    toJSON = function() {
      HDInsightResourceDetailsObject <- list()
      if (!is.null(self$`@class`)) {
        HDInsightResourceDetailsObject[['@class']] <- self$`@class`
      }
      if (!is.null(self$`resourceId`)) {
        HDInsightResourceDetailsObject[['resourceId']] <- self$`resourceId`
      }
      if (!is.null(self$`type`)) {
        HDInsightResourceDetailsObject[['type']] <- self$`type`
      }
      if (!is.null(self$`subType`)) {
        HDInsightResourceDetailsObject[['subType']] <- self$`subType`
      }
      if (!is.null(self$`subscriptionId`)) {
        HDInsightResourceDetailsObject[['subscriptionId']] <- self$`subscriptionId`
      }
      if (!is.null(self$`resourceGroupName`)) {
        HDInsightResourceDetailsObject[['resourceGroupName']] <- self$`resourceGroupName`
      }
      if (!is.null(self$`clusterName`)) {
        HDInsightResourceDetailsObject[['clusterName']] <- self$`clusterName`
      }

      HDInsightResourceDetailsObject
    },
    fromJSON = function(HDInsightResourceDetailsJson) {
      HDInsightResourceDetailsObject <- jsonlite::fromJSON(HDInsightResourceDetailsJson)
      if (!is.null(HDInsightResourceDetailsObject$`@class`)) {
        self$`@class` <- HDInsightResourceDetailsObject$`@class`
      }
      if (!is.null(HDInsightResourceDetailsObject$`resourceId`)) {
        self$`resourceId` <- HDInsightResourceDetailsObject$`resourceId`
      }
      if (!is.null(HDInsightResourceDetailsObject$`type`)) {
        self$`type` <- HDInsightResourceDetailsObject$`type`
      }
      if (!is.null(HDInsightResourceDetailsObject$`subType`)) {
        self$`subType` <- HDInsightResourceDetailsObject$`subType`
      }
      if (!is.null(HDInsightResourceDetailsObject$`subscriptionId`)) {
        self$`subscriptionId` <- HDInsightResourceDetailsObject$`subscriptionId`
      }
      if (!is.null(HDInsightResourceDetailsObject$`resourceGroupName`)) {
        self$`resourceGroupName` <- HDInsightResourceDetailsObject$`resourceGroupName`
      }
      if (!is.null(HDInsightResourceDetailsObject$`clusterName`)) {
        self$`clusterName` <- HDInsightResourceDetailsObject$`clusterName`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "@class": %s,
           "resourceId": %d,
           "type": %s,
           "subType": %s,
           "subscriptionId": %s,
           "resourceGroupName": %s,
           "clusterName": %s
        }',
        self$`@class`,
        self$`resourceId`,
        self$`type`,
        self$`subType`,
        self$`subscriptionId`,
        self$`resourceGroupName`,
        self$`clusterName`
      )
    },
    fromJSONString = function(HDInsightResourceDetailsJson) {
      HDInsightResourceDetailsObject <- jsonlite::fromJSON(HDInsightResourceDetailsJson)
      self$`@class` <- HDInsightResourceDetailsObject$`@class`
      self$`resourceId` <- HDInsightResourceDetailsObject$`resourceId`
      self$`type` <- HDInsightResourceDetailsObject$`type`
      self$`subType` <- HDInsightResourceDetailsObject$`subType`
      self$`subscriptionId` <- HDInsightResourceDetailsObject$`subscriptionId`
      self$`resourceGroupName` <- HDInsightResourceDetailsObject$`resourceGroupName`
      self$`clusterName` <- HDInsightResourceDetailsObject$`clusterName`
    }
  )
)
