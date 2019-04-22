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
    define(['ApiClient', 'ai/skymind/skil/model/DeploymentObjects'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DeploymentObjects'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.DeploymentResponse = factory(root.SkilClient.ApiClient, root.SkilClient.DeploymentObjects);
  }
}(this, function(ApiClient, DeploymentObjects) {
  'use strict';




  /**
   * The DeploymentResponse model module.
   * @module ai/skymind/skil/model/DeploymentResponse
   * @version 1.2.1.4
   */

  /**
   * Constructs a new <code>DeploymentResponse</code>.
   * @alias module:ai/skymind/skil/model/DeploymentResponse
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>DeploymentResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/DeploymentResponse} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/DeploymentResponse} The populated <code>DeploymentResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('deploymentSlug')) {
        obj['deploymentSlug'] = ApiClient.convertToType(data['deploymentSlug'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('body')) {
        obj['body'] = DeploymentObjects.constructFromObject(data['body']);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} deploymentSlug
   */
  exports.prototype['deploymentSlug'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/DeploymentObjects} body
   */
  exports.prototype['body'] = undefined;



  return exports;
}));

