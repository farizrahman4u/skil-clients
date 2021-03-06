# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ImageTransformProcess Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImageTransformProcess <- R6::R6Class(
  'ImageTransformProcess',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      ImageTransformProcessObject <- list()

      ImageTransformProcessObject
    },
    fromJSON = function(ImageTransformProcessJson) {
      ImageTransformProcessObject <- jsonlite::fromJSON(ImageTransformProcessJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(ImageTransformProcessJson) {
      ImageTransformProcessObject <- jsonlite::fromJSON(ImageTransformProcessJson)
    }
  )
)
