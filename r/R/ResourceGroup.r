# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ResourceGroup Class
#'
#' @field groupId 
#' @field groupName 
#' @field added 
#' @field updated 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResourceGroup <- R6::R6Class(
  'ResourceGroup',
  public = list(
    `groupId` = NULL,
    `groupName` = NULL,
    `added` = NULL,
    `updated` = NULL,
    initialize = function(`groupId`, `groupName`, `added`, `updated`){
      if (!missing(`groupId`)) {
        stopifnot(is.numeric(`groupId`), length(`groupId`) == 1)
        self$`groupId` <- `groupId`
      }
      if (!missing(`groupName`)) {
        stopifnot(is.character(`groupName`), length(`groupName`) == 1)
        self$`groupName` <- `groupName`
      }
      if (!missing(`added`)) {
        stopifnot(is.numeric(`added`), length(`added`) == 1)
        self$`added` <- `added`
      }
      if (!missing(`updated`)) {
        stopifnot(is.numeric(`updated`), length(`updated`) == 1)
        self$`updated` <- `updated`
      }
    },
    toJSON = function() {
      ResourceGroupObject <- list()
      if (!is.null(self$`groupId`)) {
        ResourceGroupObject[['groupId']] <- self$`groupId`
      }
      if (!is.null(self$`groupName`)) {
        ResourceGroupObject[['groupName']] <- self$`groupName`
      }
      if (!is.null(self$`added`)) {
        ResourceGroupObject[['added']] <- self$`added`
      }
      if (!is.null(self$`updated`)) {
        ResourceGroupObject[['updated']] <- self$`updated`
      }

      ResourceGroupObject
    },
    fromJSON = function(ResourceGroupJson) {
      ResourceGroupObject <- jsonlite::fromJSON(ResourceGroupJson)
      if (!is.null(ResourceGroupObject$`groupId`)) {
        self$`groupId` <- ResourceGroupObject$`groupId`
      }
      if (!is.null(ResourceGroupObject$`groupName`)) {
        self$`groupName` <- ResourceGroupObject$`groupName`
      }
      if (!is.null(ResourceGroupObject$`added`)) {
        self$`added` <- ResourceGroupObject$`added`
      }
      if (!is.null(ResourceGroupObject$`updated`)) {
        self$`updated` <- ResourceGroupObject$`updated`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "groupId": %d,
           "groupName": %s,
           "added": %d,
           "updated": %d
        }',
        self$`groupId`,
        self$`groupName`,
        self$`added`,
        self$`updated`
      )
    },
    fromJSONString = function(ResourceGroupJson) {
      ResourceGroupObject <- jsonlite::fromJSON(ResourceGroupJson)
      self$`groupId` <- ResourceGroupObject$`groupId`
      self$`groupName` <- ResourceGroupObject$`groupName`
      self$`added` <- ResourceGroupObject$`added`
      self$`updated` <- ResourceGroupObject$`updated`
    }
  )
)
