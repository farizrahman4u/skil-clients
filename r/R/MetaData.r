# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MetaData Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MetaData <- R6::R6Class(
  'MetaData',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      MetaDataObject <- list()

      MetaDataObject
    },
    fromJSON = function(MetaDataJson) {
      MetaDataObject <- jsonlite::fromJSON(MetaDataJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(MetaDataJson) {
      MetaDataObject <- jsonlite::fromJSON(MetaDataJson)
    }
  )
)
