# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ChangePasswordRequest Class
#'
#' @field password 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChangePasswordRequest <- R6::R6Class(
  'ChangePasswordRequest',
  public = list(
    `password` = NULL,
    initialize = function(`password`){
      if (!missing(`password`)) {
        stopifnot(is.character(`password`), length(`password`) == 1)
        self$`password` <- `password`
      }
    },
    toJSON = function() {
      ChangePasswordRequestObject <- list()
      if (!is.null(self$`password`)) {
        ChangePasswordRequestObject[['password']] <- self$`password`
      }

      ChangePasswordRequestObject
    },
    fromJSON = function(ChangePasswordRequestJson) {
      ChangePasswordRequestObject <- jsonlite::fromJSON(ChangePasswordRequestJson)
      if (!is.null(ChangePasswordRequestObject$`password`)) {
        self$`password` <- ChangePasswordRequestObject$`password`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "password": %s
        }',
        self$`password`
      )
    },
    fromJSONString = function(ChangePasswordRequestJson) {
      ChangePasswordRequestObject <- jsonlite::fromJSON(ChangePasswordRequestJson)
      self$`password` <- ChangePasswordRequestObject$`password`
    }
  )
)
