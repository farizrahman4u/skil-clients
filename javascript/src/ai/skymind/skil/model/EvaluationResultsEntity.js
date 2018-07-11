/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
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
    root.SkilClient.EvaluationResultsEntity = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The EvaluationResultsEntity model module.
   * @module ai/skymind/skil/model/EvaluationResultsEntity
   * @version 1.1.0-beta
   */

  /**
   * Constructs a new <code>EvaluationResultsEntity</code>.
   * @alias module:ai/skymind/skil/model/EvaluationResultsEntity
   * @class
   */
  var exports = function() {
    var _this = this;


















  };

  /**
   * Constructs a <code>EvaluationResultsEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/EvaluationResultsEntity} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/EvaluationResultsEntity} The populated <code>EvaluationResultsEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('evaluation')) {
        obj['evaluation'] = ApiClient.convertToType(data['evaluation'], 'String');
      }
      if (data.hasOwnProperty('evalName')) {
        obj['evalName'] = ApiClient.convertToType(data['evalName'], 'String');
      }
      if (data.hasOwnProperty('modelInstanceId')) {
        obj['modelInstanceId'] = ApiClient.convertToType(data['modelInstanceId'], 'String');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
      if (data.hasOwnProperty('f1')) {
        obj['f1'] = ApiClient.convertToType(data['f1'], 'Number');
      }
      if (data.hasOwnProperty('precision')) {
        obj['precision'] = ApiClient.convertToType(data['precision'], 'Number');
      }
      if (data.hasOwnProperty('recall')) {
        obj['recall'] = ApiClient.convertToType(data['recall'], 'Number');
      }
      if (data.hasOwnProperty('accuracy')) {
        obj['accuracy'] = ApiClient.convertToType(data['accuracy'], 'Number');
      }
      if (data.hasOwnProperty('rmse')) {
        obj['rmse'] = ApiClient.convertToType(data['rmse'], 'Number');
      }
      if (data.hasOwnProperty('auc')) {
        obj['auc'] = ApiClient.convertToType(data['auc'], 'Number');
      }
      if (data.hasOwnProperty('meanAbsoluteError')) {
        obj['meanAbsoluteError'] = ApiClient.convertToType(data['meanAbsoluteError'], 'Number');
      }
      if (data.hasOwnProperty('meanRelativeError')) {
        obj['meanRelativeError'] = ApiClient.convertToType(data['meanRelativeError'], 'Number');
      }
      if (data.hasOwnProperty('r2')) {
        obj['r2'] = ApiClient.convertToType(data['r2'], 'Number');
      }
      if (data.hasOwnProperty('evalId')) {
        obj['evalId'] = ApiClient.convertToType(data['evalId'], 'String');
      }
      if (data.hasOwnProperty('evalVersion')) {
        obj['evalVersion'] = ApiClient.convertToType(data['evalVersion'], 'Number');
      }
      if (data.hasOwnProperty('binaryThreshold')) {
        obj['binaryThreshold'] = ApiClient.convertToType(data['binaryThreshold'], 'Number');
      }
      if (data.hasOwnProperty('binaryThresholds')) {
        obj['binaryThresholds'] = ApiClient.convertToType(data['binaryThresholds'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} evaluation
   */
  exports.prototype['evaluation'] = undefined;
  /**
   * @member {String} evalName
   */
  exports.prototype['evalName'] = undefined;
  /**
   * @member {String} modelInstanceId
   */
  exports.prototype['modelInstanceId'] = undefined;
  /**
   * When the evaluation result was created
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;
  /**
   * @member {Number} f1
   */
  exports.prototype['f1'] = undefined;
  /**
   * @member {Number} precision
   */
  exports.prototype['precision'] = undefined;
  /**
   * @member {Number} recall
   */
  exports.prototype['recall'] = undefined;
  /**
   * @member {Number} accuracy
   */
  exports.prototype['accuracy'] = undefined;
  /**
   * @member {Number} rmse
   */
  exports.prototype['rmse'] = undefined;
  /**
   * @member {Number} auc
   */
  exports.prototype['auc'] = undefined;
  /**
   * @member {Number} meanAbsoluteError
   */
  exports.prototype['meanAbsoluteError'] = undefined;
  /**
   * @member {Number} meanRelativeError
   */
  exports.prototype['meanRelativeError'] = undefined;
  /**
   * @member {Number} r2
   */
  exports.prototype['r2'] = undefined;
  /**
   * GUID of the evaluation
   * @member {String} evalId
   */
  exports.prototype['evalId'] = undefined;
  /**
   * @member {Number} evalVersion
   */
  exports.prototype['evalVersion'] = undefined;
  /**
   * @member {Number} binaryThreshold
   */
  exports.prototype['binaryThreshold'] = undefined;
  /**
   * @member {String} binaryThresholds
   */
  exports.prototype['binaryThresholds'] = undefined;



  return exports;
}));


