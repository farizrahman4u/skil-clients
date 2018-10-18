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
    root.SkilClient.ExperimentEntity = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ExperimentEntity model module.
   * @module ai/skymind/skil/model/ExperimentEntity
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>ExperimentEntity</code>.
   * @alias module:ai/skymind/skil/model/ExperimentEntity
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>ExperimentEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/ExperimentEntity} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/ExperimentEntity} The populated <code>ExperimentEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('bestModelId')) {
        obj['bestModelId'] = ApiClient.convertToType(data['bestModelId'], 'String');
      }
      if (data.hasOwnProperty('inputDataUri')) {
        obj['inputDataUri'] = ApiClient.convertToType(data['inputDataUri'], 'String');
      }
      if (data.hasOwnProperty('experimentId')) {
        obj['experimentId'] = ApiClient.convertToType(data['experimentId'], 'String');
      }
      if (data.hasOwnProperty('experimentName')) {
        obj['experimentName'] = ApiClient.convertToType(data['experimentName'], 'String');
      }
      if (data.hasOwnProperty('experimentDescription')) {
        obj['experimentDescription'] = ApiClient.convertToType(data['experimentDescription'], 'String');
      }
      if (data.hasOwnProperty('notebookJson')) {
        obj['notebookJson'] = ApiClient.convertToType(data['notebookJson'], 'String');
      }
      if (data.hasOwnProperty('notebookUrl')) {
        obj['notebookUrl'] = ApiClient.convertToType(data['notebookUrl'], 'String');
      }
      if (data.hasOwnProperty('zeppelinId')) {
        obj['zeppelinId'] = ApiClient.convertToType(data['zeppelinId'], 'String');
      }
      if (data.hasOwnProperty('modelHistoryId')) {
        obj['modelHistoryId'] = ApiClient.convertToType(data['modelHistoryId'], 'String');
      }
      if (data.hasOwnProperty('lastUpdated')) {
        obj['lastUpdated'] = ApiClient.convertToType(data['lastUpdated'], 'Number');
      }
    }
    return obj;
  }

  /**
   * GUID of the best selected model in an experiment
   * @member {String} bestModelId
   */
  exports.prototype['bestModelId'] = undefined;
  /**
   * Input data URI
   * @member {String} inputDataUri
   */
  exports.prototype['inputDataUri'] = undefined;
  /**
   * GUID of the experiment
   * @member {String} experimentId
   */
  exports.prototype['experimentId'] = undefined;
  /**
   * Experiment's name
   * @member {String} experimentName
   */
  exports.prototype['experimentName'] = undefined;
  /**
   * Experiment's description
   * @member {String} experimentDescription
   */
  exports.prototype['experimentDescription'] = undefined;
  /**
   * The associated Zeppelin notebook JSON string
   * @member {String} notebookJson
   */
  exports.prototype['notebookJson'] = undefined;
  /**
   * URL of the associated Zeppelin notebook
   * @member {String} notebookUrl
   */
  exports.prototype['notebookUrl'] = undefined;
  /**
   * Zeppelin ID
   * @member {String} zeppelinId
   */
  exports.prototype['zeppelinId'] = undefined;
  /**
   * Id of the model history / workspace
   * @member {String} modelHistoryId
   */
  exports.prototype['modelHistoryId'] = undefined;
  /**
   * Indicates the time when experiment was last updated
   * @member {Number} lastUpdated
   */
  exports.prototype['lastUpdated'] = undefined;



  return exports;
}));

