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
    root.SkilClient.ModelHistoryEntity = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ModelHistoryEntity model module.
   * @module ai/skymind/skil/model/ModelHistoryEntity
   * @version 1.1.0-beta
   */

  /**
   * Constructs a new <code>ModelHistoryEntity</code>.
   * @alias module:ai/skymind/skil/model/ModelHistoryEntity
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>ModelHistoryEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/ModelHistoryEntity} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/ModelHistoryEntity} The populated <code>ModelHistoryEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
      if (data.hasOwnProperty('modelHistoryId')) {
        obj['modelHistoryId'] = ApiClient.convertToType(data['modelHistoryId'], 'String');
      }
      if (data.hasOwnProperty('modelName')) {
        obj['modelName'] = ApiClient.convertToType(data['modelName'], 'String');
      }
      if (data.hasOwnProperty('modelLabels')) {
        obj['modelLabels'] = ApiClient.convertToType(data['modelLabels'], 'String');
      }
    }
    return obj;
  }

  /**
   * When the model history / workspace was created
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;
  /**
   * The GUID of the model history / workspace
   * @member {String} modelHistoryId
   */
  exports.prototype['modelHistoryId'] = undefined;
  /**
   * Name of the model history / workspace
   * @member {String} modelName
   */
  exports.prototype['modelName'] = undefined;
  /**
   * Model history / workspace labels
   * @member {String} modelLabels
   */
  exports.prototype['modelLabels'] = undefined;



  return exports;
}));


