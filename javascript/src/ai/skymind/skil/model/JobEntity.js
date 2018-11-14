/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.JobEntity = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The JobEntity model module.
   * @module ai/skymind/skil/model/JobEntity
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>JobEntity</code>.
   * @alias module:ai/skymind/skil/model/JobEntity
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>JobEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/JobEntity} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/JobEntity} The populated <code>JobEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('jobId')) {
        obj['jobId'] = ApiClient.convertToType(data['jobId'], 'Number');
      }
      if (data.hasOwnProperty('jobType')) {
        obj['jobType'] = ApiClient.convertToType(data['jobType'], 'String');
      }
      if (data.hasOwnProperty('computeResourceId')) {
        obj['computeResourceId'] = ApiClient.convertToType(data['computeResourceId'], 'Number');
      }
      if (data.hasOwnProperty('storageResourceId')) {
        obj['storageResourceId'] = ApiClient.convertToType(data['storageResourceId'], 'Number');
      }
      if (data.hasOwnProperty('jobArgs')) {
        obj['jobArgs'] = ApiClient.convertToType(data['jobArgs'], 'String');
      }
      if (data.hasOwnProperty('runId')) {
        obj['runId'] = ApiClient.convertToType(data['runId'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('outputFileName')) {
        obj['outputFileName'] = ApiClient.convertToType(data['outputFileName'], 'String');
      }
    }
    return obj;
  }

  /**
   * Job ID
   * @member {Number} jobId
   */
  exports.prototype['jobId'] = undefined;
  /**
   * Whether a job is for training or inference
   * @member {module:ai/skymind/skil/model/JobEntity.JobTypeEnum} jobType
   */
  exports.prototype['jobType'] = undefined;
  /**
   * Compute resource ID
   * @member {Number} computeResourceId
   */
  exports.prototype['computeResourceId'] = undefined;
  /**
   * Storage resource ID
   * @member {Number} storageResourceId
   */
  exports.prototype['storageResourceId'] = undefined;
  /**
   * Job arguments
   * @member {String} jobArgs
   */
  exports.prototype['jobArgs'] = undefined;
  /**
   * Job run ID
   * @member {String} runId
   */
  exports.prototype['runId'] = undefined;
  /**
   * Job's status
   * @member {module:ai/skymind/skil/model/JobEntity.StatusEnum} status
   */
  exports.prototype['status'] = undefined;
  /**
   * Output file name
   * @member {String} outputFileName
   */
  exports.prototype['outputFileName'] = undefined;


  /**
   * Allowed values for the <code>jobType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.JobTypeEnum = {
    /**
     * value: "TRAINING"
     * @const
     */
    "TRAINING": "TRAINING",
    /**
     * value: "INFERENCE"
     * @const
     */
    "INFERENCE": "INFERENCE"  };

  /**
   * Allowed values for the <code>status</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatusEnum = {
    /**
     * value: "PENDING"
     * @const
     */
    "PENDING": "PENDING",
    /**
     * value: "RUNNING"
     * @const
     */
    "RUNNING": "RUNNING",
    /**
     * value: "CONTINUE"
     * @const
     */
    "CONTINUE": "CONTINUE",
    /**
     * value: "COMPLETED"
     * @const
     */
    "COMPLETED": "COMPLETED",
    /**
     * value: "CANCELLED"
     * @const
     */
    "CANCELLED": "CANCELLED",
    /**
     * value: "FAILED"
     * @const
     */
    "FAILED": "FAILED",
    /**
     * value: "INTERRUPTED"
     * @const
     */
    "INTERRUPTED": "INTERRUPTED"  };


  return exports;
}));


