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
    root.SkilClient.INDArray = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The INDArray model module.
   * @module ai/skymind/skil/model/INDArray
   * @version 1.2.1.4
   */

  /**
   * Constructs a new <code>INDArray</code>.
   * @alias module:ai/skymind/skil/model/INDArray
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>INDArray</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/INDArray} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/INDArray} The populated <code>INDArray</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('array')) {
        obj['array'] = ApiClient.convertToType(data['array'], 'String');
      }
      if (data.hasOwnProperty('shape')) {
        obj['shape'] = ApiClient.convertToType(data['shape'], ['Number']);
      }
      if (data.hasOwnProperty('ordering')) {
        obj['ordering'] = ApiClient.convertToType(data['ordering'], 'String');
      }
      if (data.hasOwnProperty('data')) {
        obj['data'] = ApiClient.convertToType(data['data'], ['Number']);
      }
      if (data.hasOwnProperty('dataType')) {
        obj['dataType'] = ApiClient.convertToType(data['dataType'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} array
   */
  exports.prototype['array'] = undefined;
  /**
   * @member {Array.<Number>} shape
   */
  exports.prototype['shape'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/INDArray.OrderingEnum} ordering
   */
  exports.prototype['ordering'] = undefined;
  /**
   * @member {Array.<Number>} data
   */
  exports.prototype['data'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/INDArray.DataTypeEnum} dataType
   */
  exports.prototype['dataType'] = undefined;


  /**
   * Allowed values for the <code>ordering</code> property.
   * @enum {String}
   * @readonly
   */
  exports.OrderingEnum = {
    /**
     * value: "f"
     * @const
     */
    "f": "f",
    /**
     * value: "c"
     * @const
     */
    "c": "c"  };

  /**
   * Allowed values for the <code>dataType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DataTypeEnum = {
    /**
     * value: "INT8"
     * @const
     */
    "INT8": "INT8",
    /**
     * value: "UINT8"
     * @const
     */
    "UINT8": "UINT8",
    /**
     * value: "INT16"
     * @const
     */
    "INT16": "INT16",
    /**
     * value: "FLOAT16"
     * @const
     */
    "FLOAT16": "FLOAT16"  };


  return exports;
}));


