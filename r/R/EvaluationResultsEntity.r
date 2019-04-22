# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' EvaluationResultsEntity Class
#'
#' @field evaluation 
#' @field evalName 
#' @field modelInstanceId 
#' @field created 
#' @field f1 
#' @field precision 
#' @field recall 
#' @field accuracy 
#' @field rmse 
#' @field auc 
#' @field meanAbsoluteError 
#' @field meanRelativeError 
#' @field r2 
#' @field evalId 
#' @field evalVersion 
#' @field binaryThreshold 
#' @field binaryThresholds 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvaluationResultsEntity <- R6::R6Class(
  'EvaluationResultsEntity',
  public = list(
    `evaluation` = NULL,
    `evalName` = NULL,
    `modelInstanceId` = NULL,
    `created` = NULL,
    `f1` = NULL,
    `precision` = NULL,
    `recall` = NULL,
    `accuracy` = NULL,
    `rmse` = NULL,
    `auc` = NULL,
    `meanAbsoluteError` = NULL,
    `meanRelativeError` = NULL,
    `r2` = NULL,
    `evalId` = NULL,
    `evalVersion` = NULL,
    `binaryThreshold` = NULL,
    `binaryThresholds` = NULL,
    initialize = function(`evaluation`, `evalName`, `modelInstanceId`, `created`, `f1`, `precision`, `recall`, `accuracy`, `rmse`, `auc`, `meanAbsoluteError`, `meanRelativeError`, `r2`, `evalId`, `evalVersion`, `binaryThreshold`, `binaryThresholds`){
      if (!missing(`evaluation`)) {
        stopifnot(is.character(`evaluation`), length(`evaluation`) == 1)
        self$`evaluation` <- `evaluation`
      }
      if (!missing(`evalName`)) {
        stopifnot(is.character(`evalName`), length(`evalName`) == 1)
        self$`evalName` <- `evalName`
      }
      if (!missing(`modelInstanceId`)) {
        stopifnot(is.character(`modelInstanceId`), length(`modelInstanceId`) == 1)
        self$`modelInstanceId` <- `modelInstanceId`
      }
      if (!missing(`created`)) {
        stopifnot(is.numeric(`created`), length(`created`) == 1)
        self$`created` <- `created`
      }
      if (!missing(`f1`)) {
        stopifnot(is.numeric(`f1`), length(`f1`) == 1)
        self$`f1` <- `f1`
      }
      if (!missing(`precision`)) {
        stopifnot(is.numeric(`precision`), length(`precision`) == 1)
        self$`precision` <- `precision`
      }
      if (!missing(`recall`)) {
        stopifnot(is.numeric(`recall`), length(`recall`) == 1)
        self$`recall` <- `recall`
      }
      if (!missing(`accuracy`)) {
        stopifnot(is.numeric(`accuracy`), length(`accuracy`) == 1)
        self$`accuracy` <- `accuracy`
      }
      if (!missing(`rmse`)) {
        stopifnot(is.numeric(`rmse`), length(`rmse`) == 1)
        self$`rmse` <- `rmse`
      }
      if (!missing(`auc`)) {
        stopifnot(is.numeric(`auc`), length(`auc`) == 1)
        self$`auc` <- `auc`
      }
      if (!missing(`meanAbsoluteError`)) {
        stopifnot(is.numeric(`meanAbsoluteError`), length(`meanAbsoluteError`) == 1)
        self$`meanAbsoluteError` <- `meanAbsoluteError`
      }
      if (!missing(`meanRelativeError`)) {
        stopifnot(is.numeric(`meanRelativeError`), length(`meanRelativeError`) == 1)
        self$`meanRelativeError` <- `meanRelativeError`
      }
      if (!missing(`r2`)) {
        stopifnot(is.numeric(`r2`), length(`r2`) == 1)
        self$`r2` <- `r2`
      }
      if (!missing(`evalId`)) {
        stopifnot(is.character(`evalId`), length(`evalId`) == 1)
        self$`evalId` <- `evalId`
      }
      if (!missing(`evalVersion`)) {
        stopifnot(is.numeric(`evalVersion`), length(`evalVersion`) == 1)
        self$`evalVersion` <- `evalVersion`
      }
      if (!missing(`binaryThreshold`)) {
        stopifnot(is.numeric(`binaryThreshold`), length(`binaryThreshold`) == 1)
        self$`binaryThreshold` <- `binaryThreshold`
      }
      if (!missing(`binaryThresholds`)) {
        stopifnot(is.character(`binaryThresholds`), length(`binaryThresholds`) == 1)
        self$`binaryThresholds` <- `binaryThresholds`
      }
    },
    toJSON = function() {
      EvaluationResultsEntityObject <- list()
      if (!is.null(self$`evaluation`)) {
        EvaluationResultsEntityObject[['evaluation']] <- self$`evaluation`
      }
      if (!is.null(self$`evalName`)) {
        EvaluationResultsEntityObject[['evalName']] <- self$`evalName`
      }
      if (!is.null(self$`modelInstanceId`)) {
        EvaluationResultsEntityObject[['modelInstanceId']] <- self$`modelInstanceId`
      }
      if (!is.null(self$`created`)) {
        EvaluationResultsEntityObject[['created']] <- self$`created`
      }
      if (!is.null(self$`f1`)) {
        EvaluationResultsEntityObject[['f1']] <- self$`f1`
      }
      if (!is.null(self$`precision`)) {
        EvaluationResultsEntityObject[['precision']] <- self$`precision`
      }
      if (!is.null(self$`recall`)) {
        EvaluationResultsEntityObject[['recall']] <- self$`recall`
      }
      if (!is.null(self$`accuracy`)) {
        EvaluationResultsEntityObject[['accuracy']] <- self$`accuracy`
      }
      if (!is.null(self$`rmse`)) {
        EvaluationResultsEntityObject[['rmse']] <- self$`rmse`
      }
      if (!is.null(self$`auc`)) {
        EvaluationResultsEntityObject[['auc']] <- self$`auc`
      }
      if (!is.null(self$`meanAbsoluteError`)) {
        EvaluationResultsEntityObject[['meanAbsoluteError']] <- self$`meanAbsoluteError`
      }
      if (!is.null(self$`meanRelativeError`)) {
        EvaluationResultsEntityObject[['meanRelativeError']] <- self$`meanRelativeError`
      }
      if (!is.null(self$`r2`)) {
        EvaluationResultsEntityObject[['r2']] <- self$`r2`
      }
      if (!is.null(self$`evalId`)) {
        EvaluationResultsEntityObject[['evalId']] <- self$`evalId`
      }
      if (!is.null(self$`evalVersion`)) {
        EvaluationResultsEntityObject[['evalVersion']] <- self$`evalVersion`
      }
      if (!is.null(self$`binaryThreshold`)) {
        EvaluationResultsEntityObject[['binaryThreshold']] <- self$`binaryThreshold`
      }
      if (!is.null(self$`binaryThresholds`)) {
        EvaluationResultsEntityObject[['binaryThresholds']] <- self$`binaryThresholds`
      }

      EvaluationResultsEntityObject
    },
    fromJSON = function(EvaluationResultsEntityJson) {
      EvaluationResultsEntityObject <- jsonlite::fromJSON(EvaluationResultsEntityJson)
      if (!is.null(EvaluationResultsEntityObject$`evaluation`)) {
        self$`evaluation` <- EvaluationResultsEntityObject$`evaluation`
      }
      if (!is.null(EvaluationResultsEntityObject$`evalName`)) {
        self$`evalName` <- EvaluationResultsEntityObject$`evalName`
      }
      if (!is.null(EvaluationResultsEntityObject$`modelInstanceId`)) {
        self$`modelInstanceId` <- EvaluationResultsEntityObject$`modelInstanceId`
      }
      if (!is.null(EvaluationResultsEntityObject$`created`)) {
        self$`created` <- EvaluationResultsEntityObject$`created`
      }
      if (!is.null(EvaluationResultsEntityObject$`f1`)) {
        self$`f1` <- EvaluationResultsEntityObject$`f1`
      }
      if (!is.null(EvaluationResultsEntityObject$`precision`)) {
        self$`precision` <- EvaluationResultsEntityObject$`precision`
      }
      if (!is.null(EvaluationResultsEntityObject$`recall`)) {
        self$`recall` <- EvaluationResultsEntityObject$`recall`
      }
      if (!is.null(EvaluationResultsEntityObject$`accuracy`)) {
        self$`accuracy` <- EvaluationResultsEntityObject$`accuracy`
      }
      if (!is.null(EvaluationResultsEntityObject$`rmse`)) {
        self$`rmse` <- EvaluationResultsEntityObject$`rmse`
      }
      if (!is.null(EvaluationResultsEntityObject$`auc`)) {
        self$`auc` <- EvaluationResultsEntityObject$`auc`
      }
      if (!is.null(EvaluationResultsEntityObject$`meanAbsoluteError`)) {
        self$`meanAbsoluteError` <- EvaluationResultsEntityObject$`meanAbsoluteError`
      }
      if (!is.null(EvaluationResultsEntityObject$`meanRelativeError`)) {
        self$`meanRelativeError` <- EvaluationResultsEntityObject$`meanRelativeError`
      }
      if (!is.null(EvaluationResultsEntityObject$`r2`)) {
        self$`r2` <- EvaluationResultsEntityObject$`r2`
      }
      if (!is.null(EvaluationResultsEntityObject$`evalId`)) {
        self$`evalId` <- EvaluationResultsEntityObject$`evalId`
      }
      if (!is.null(EvaluationResultsEntityObject$`evalVersion`)) {
        self$`evalVersion` <- EvaluationResultsEntityObject$`evalVersion`
      }
      if (!is.null(EvaluationResultsEntityObject$`binaryThreshold`)) {
        self$`binaryThreshold` <- EvaluationResultsEntityObject$`binaryThreshold`
      }
      if (!is.null(EvaluationResultsEntityObject$`binaryThresholds`)) {
        self$`binaryThresholds` <- EvaluationResultsEntityObject$`binaryThresholds`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "evaluation": %s,
           "evalName": %s,
           "modelInstanceId": %s,
           "created": %d,
           "f1": %d,
           "precision": %d,
           "recall": %d,
           "accuracy": %d,
           "rmse": %d,
           "auc": %d,
           "meanAbsoluteError": %d,
           "meanRelativeError": %d,
           "r2": %d,
           "evalId": %s,
           "evalVersion": %d,
           "binaryThreshold": %d,
           "binaryThresholds": %s
        }',
        self$`evaluation`,
        self$`evalName`,
        self$`modelInstanceId`,
        self$`created`,
        self$`f1`,
        self$`precision`,
        self$`recall`,
        self$`accuracy`,
        self$`rmse`,
        self$`auc`,
        self$`meanAbsoluteError`,
        self$`meanRelativeError`,
        self$`r2`,
        self$`evalId`,
        self$`evalVersion`,
        self$`binaryThreshold`,
        self$`binaryThresholds`
      )
    },
    fromJSONString = function(EvaluationResultsEntityJson) {
      EvaluationResultsEntityObject <- jsonlite::fromJSON(EvaluationResultsEntityJson)
      self$`evaluation` <- EvaluationResultsEntityObject$`evaluation`
      self$`evalName` <- EvaluationResultsEntityObject$`evalName`
      self$`modelInstanceId` <- EvaluationResultsEntityObject$`modelInstanceId`
      self$`created` <- EvaluationResultsEntityObject$`created`
      self$`f1` <- EvaluationResultsEntityObject$`f1`
      self$`precision` <- EvaluationResultsEntityObject$`precision`
      self$`recall` <- EvaluationResultsEntityObject$`recall`
      self$`accuracy` <- EvaluationResultsEntityObject$`accuracy`
      self$`rmse` <- EvaluationResultsEntityObject$`rmse`
      self$`auc` <- EvaluationResultsEntityObject$`auc`
      self$`meanAbsoluteError` <- EvaluationResultsEntityObject$`meanAbsoluteError`
      self$`meanRelativeError` <- EvaluationResultsEntityObject$`meanRelativeError`
      self$`r2` <- EvaluationResultsEntityObject$`r2`
      self$`evalId` <- EvaluationResultsEntityObject$`evalId`
      self$`evalVersion` <- EvaluationResultsEntityObject$`evalVersion`
      self$`binaryThreshold` <- EvaluationResultsEntityObject$`binaryThreshold`
      self$`binaryThresholds` <- EvaluationResultsEntityObject$`binaryThresholds`
    }
  )
)