/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
    root.SkilClient.AccumulatedResults = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AccumulatedResults model module.
   * @module ai/skymind/skil/model/AccumulatedResults
   * @version 1.2.1.4
   */

  /**
   * Constructs a new <code>AccumulatedResults</code>.
   * @alias module:ai/skymind/skil/model/AccumulatedResults
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>AccumulatedResults</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/AccumulatedResults} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/AccumulatedResults} The populated <code>AccumulatedResults</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('accumulatedDataWithLabels')) {
        obj['accumulatedDataWithLabels'] = ApiClient.convertToType(data['accumulatedDataWithLabels'], 'Number');
      }
      if (data.hasOwnProperty('accumulatedDataWithOutLabels')) {
        obj['accumulatedDataWithOutLabels'] = ApiClient.convertToType(data['accumulatedDataWithOutLabels'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} accumulatedDataWithLabels
   */
  exports.prototype['accumulatedDataWithLabels'] = undefined;
  /**
   * @member {Number} accumulatedDataWithOutLabels
   */
  exports.prototype['accumulatedDataWithOutLabels'] = undefined;



  return exports;
}));


