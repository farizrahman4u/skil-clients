# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' InlineResponse200 Class
#'
#' @field status 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InlineResponse200 <- R6::R6Class(
  'InlineResponse200',
  public = list(
    `status` = NULL,
    initialize = function(`status`){
      if (!missing(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
    },
    toJSON = function() {
      InlineResponse200Object <- list()
      if (!is.null(self$`status`)) {
        InlineResponse200Object[['status']] <- self$`status`
      }

      InlineResponse200Object
    },
    fromJSON = function(InlineResponse200Json) {
      InlineResponse200Object <- jsonlite::fromJSON(InlineResponse200Json)
      if (!is.null(InlineResponse200Object$`status`)) {
        self$`status` <- InlineResponse200Object$`status`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "status": %s
        }',
        self$`status`
      )
    },
    fromJSONString = function(InlineResponse200Json) {
      InlineResponse200Object <- jsonlite::fromJSON(InlineResponse200Json)
      self$`status` <- InlineResponse200Object$`status`
    }
  )
)
