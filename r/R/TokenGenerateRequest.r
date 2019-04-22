# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' TokenGenerateRequest Class
#'
#' @field userId 
#' @field expiry 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TokenGenerateRequest <- R6::R6Class(
  'TokenGenerateRequest',
  public = list(
    `userId` = NULL,
    `expiry` = NULL,
    initialize = function(`userId`, `expiry`){
      if (!missing(`userId`)) {
        stopifnot(is.character(`userId`), length(`userId`) == 1)
        self$`userId` <- `userId`
      }
      if (!missing(`expiry`)) {
        stopifnot(is.numeric(`expiry`), length(`expiry`) == 1)
        self$`expiry` <- `expiry`
      }
    },
    toJSON = function() {
      TokenGenerateRequestObject <- list()
      if (!is.null(self$`userId`)) {
        TokenGenerateRequestObject[['userId']] <- self$`userId`
      }
      if (!is.null(self$`expiry`)) {
        TokenGenerateRequestObject[['expiry']] <- self$`expiry`
      }

      TokenGenerateRequestObject
    },
    fromJSON = function(TokenGenerateRequestJson) {
      TokenGenerateRequestObject <- jsonlite::fromJSON(TokenGenerateRequestJson)
      if (!is.null(TokenGenerateRequestObject$`userId`)) {
        self$`userId` <- TokenGenerateRequestObject$`userId`
      }
      if (!is.null(TokenGenerateRequestObject$`expiry`)) {
        self$`expiry` <- TokenGenerateRequestObject$`expiry`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "userId": %s,
           "expiry": %d
        }',
        self$`userId`,
        self$`expiry`
      )
    },
    fromJSONString = function(TokenGenerateRequestJson) {
      TokenGenerateRequestObject <- jsonlite::fromJSON(TokenGenerateRequestJson)
      self$`userId` <- TokenGenerateRequestObject$`userId`
      self$`expiry` <- TokenGenerateRequestObject$`expiry`
    }
  )
)