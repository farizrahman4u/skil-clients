# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DeploymentResponse Class
#'
#' @field id 
#' @field name 
#' @field deploymentSlug 
#' @field status 
#' @field body 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeploymentResponse <- R6::R6Class(
  'DeploymentResponse',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `deploymentSlug` = NULL,
    `status` = NULL,
    `body` = NULL,
    initialize = function(`id`, `name`, `deploymentSlug`, `status`, `body`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`deploymentSlug`)) {
        stopifnot(is.character(`deploymentSlug`), length(`deploymentSlug`) == 1)
        self$`deploymentSlug` <- `deploymentSlug`
      }
      if (!missing(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
      if (!missing(`body`)) {
        stopifnot(R6::is.R6(`body`))
        self$`body` <- `body`
      }
    },
    toJSON = function() {
      DeploymentResponseObject <- list()
      if (!is.null(self$`id`)) {
        DeploymentResponseObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        DeploymentResponseObject[['name']] <- self$`name`
      }
      if (!is.null(self$`deploymentSlug`)) {
        DeploymentResponseObject[['deploymentSlug']] <- self$`deploymentSlug`
      }
      if (!is.null(self$`status`)) {
        DeploymentResponseObject[['status']] <- self$`status`
      }
      if (!is.null(self$`body`)) {
        DeploymentResponseObject[['body']] <- self$`body`$toJSON()
      }

      DeploymentResponseObject
    },
    fromJSON = function(DeploymentResponseJson) {
      DeploymentResponseObject <- jsonlite::fromJSON(DeploymentResponseJson)
      if (!is.null(DeploymentResponseObject$`id`)) {
        self$`id` <- DeploymentResponseObject$`id`
      }
      if (!is.null(DeploymentResponseObject$`name`)) {
        self$`name` <- DeploymentResponseObject$`name`
      }
      if (!is.null(DeploymentResponseObject$`deploymentSlug`)) {
        self$`deploymentSlug` <- DeploymentResponseObject$`deploymentSlug`
      }
      if (!is.null(DeploymentResponseObject$`status`)) {
        self$`status` <- DeploymentResponseObject$`status`
      }
      if (!is.null(DeploymentResponseObject$`body`)) {
        bodyObject <- DeploymentObjects$new()
        bodyObject$fromJSON(jsonlite::toJSON(DeploymentResponseObject$body, auto_unbox = TRUE))
        self$`body` <- bodyObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "deploymentSlug": %s,
           "status": %s,
           "body": %s
        }',
        self$`id`,
        self$`name`,
        self$`deploymentSlug`,
        self$`status`,
        self$`body`$toJSON()
      )
    },
    fromJSONString = function(DeploymentResponseJson) {
      DeploymentResponseObject <- jsonlite::fromJSON(DeploymentResponseJson)
      self$`id` <- DeploymentResponseObject$`id`
      self$`name` <- DeploymentResponseObject$`name`
      self$`deploymentSlug` <- DeploymentResponseObject$`deploymentSlug`
      self$`status` <- DeploymentResponseObject$`status`
      DeploymentObjectsObject <- DeploymentObjects$new()
      self$`body` <- DeploymentObjectsObject$fromJSON(jsonlite::toJSON(DeploymentResponseObject$body, auto_unbox = TRUE))
    }
  )
)