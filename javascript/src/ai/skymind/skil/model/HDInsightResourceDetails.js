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
    root.SkilClient.HDInsightResourceDetails = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The HDInsightResourceDetails model module.
   * @module ai/skymind/skil/model/HDInsightResourceDetails
   * @version 1.2.1.4
   */

  /**
   * Constructs a new <code>HDInsightResourceDetails</code>.
   * @alias module:ai/skymind/skil/model/HDInsightResourceDetails
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>HDInsightResourceDetails</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/HDInsightResourceDetails} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/HDInsightResourceDetails} The populated <code>HDInsightResourceDetails</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('@class')) {
        obj['@class'] = ApiClient.convertToType(data['@class'], 'String');
      }
      if (data.hasOwnProperty('resourceId')) {
        obj['resourceId'] = ApiClient.convertToType(data['resourceId'], 'Number');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('subType')) {
        obj['subType'] = ApiClient.convertToType(data['subType'], 'String');
      }
      if (data.hasOwnProperty('subscriptionId')) {
        obj['subscriptionId'] = ApiClient.convertToType(data['subscriptionId'], 'String');
      }
      if (data.hasOwnProperty('resourceGroupName')) {
        obj['resourceGroupName'] = ApiClient.convertToType(data['resourceGroupName'], 'String');
      }
      if (data.hasOwnProperty('clusterName')) {
        obj['clusterName'] = ApiClient.convertToType(data['clusterName'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} @class
   * @default 'io.skymind.resource.model.subtypes.compute.HDInsightResourceDetails'
   */
  exports.prototype['@class'] = 'io.skymind.resource.model.subtypes.compute.HDInsightResourceDetails';
  /**
   * ID of the resource
   * @member {Number} resourceId
   */
  exports.prototype['resourceId'] = undefined;
  /**
   * Resource type
   * @member {module:ai/skymind/skil/model/HDInsightResourceDetails.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Resource subtype
   * @member {module:ai/skymind/skil/model/HDInsightResourceDetails.SubTypeEnum} subType
   */
  exports.prototype['subType'] = undefined;
  /**
   * Azure subscription ID
   * @member {String} subscriptionId
   */
  exports.prototype['subscriptionId'] = undefined;
  /**
   * name of the resource group
   * @member {String} resourceGroupName
   */
  exports.prototype['resourceGroupName'] = undefined;
  /**
   * Cluster name
   * @member {String} clusterName
   */
  exports.prototype['clusterName'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "COMPUTE"
     * @const
     */
    "COMPUTE": "COMPUTE"  };

  /**
   * Allowed values for the <code>subType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SubTypeEnum = {
    /**
     * value: "HDInsight"
     * @const
     */
    "HDInsight": "HDInsight"  };


  return exports;
}));


