# Endpoints
#
# Endpoints API for different services in SKIL
#
# OpenAPI spec version: 1.2.0-rc1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DownloadOutputFileRequest Class
#'
#' @field localDownloadPath 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DownloadOutputFileRequest <- R6::R6Class(
  'DownloadOutputFileRequest',
  public = list(
    `localDownloadPath` = NULL,
    initialize = function(`localDownloadPath`){
      if (!missing(`localDownloadPath`)) {
        stopifnot(is.character(`localDownloadPath`), length(`localDownloadPath`) == 1)
        self$`localDownloadPath` <- `localDownloadPath`
      }
    },
    toJSON = function() {
      DownloadOutputFileRequestObject <- list()
      if (!is.null(self$`localDownloadPath`)) {
        DownloadOutputFileRequestObject[['localDownloadPath']] <- self$`localDownloadPath`
      }

      DownloadOutputFileRequestObject
    },
    fromJSON = function(DownloadOutputFileRequestJson) {
      DownloadOutputFileRequestObject <- jsonlite::fromJSON(DownloadOutputFileRequestJson)
      if (!is.null(DownloadOutputFileRequestObject$`localDownloadPath`)) {
        self$`localDownloadPath` <- DownloadOutputFileRequestObject$`localDownloadPath`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "localDownloadPath": %s
        }',
        self$`localDownloadPath`
      )
    },
    fromJSONString = function(DownloadOutputFileRequestJson) {
      DownloadOutputFileRequestObject <- jsonlite::fromJSON(DownloadOutputFileRequestJson)
      self$`localDownloadPath` <- DownloadOutputFileRequestObject$`localDownloadPath`
    }
  )
)
