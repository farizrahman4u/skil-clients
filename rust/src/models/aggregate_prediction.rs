/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct AggregatePrediction {
  /// GUID of model instance
  #[serde(rename = "modelId")]
  model_id: Option<String>,
  /// the evaluation type to aggregate
  #[serde(rename = "evalType")]
  eval_type: Option<String>
}

impl AggregatePrediction {
  pub fn new() -> AggregatePrediction {
    AggregatePrediction {
      model_id: None,
      eval_type: None
    }
  }

  pub fn set_model_id(&mut self, model_id: String) {
    self.model_id = Some(model_id);
  }

  pub fn with_model_id(mut self, model_id: String) -> AggregatePrediction {
    self.model_id = Some(model_id);
    self
  }

  pub fn model_id(&self) -> Option<&String> {
    self.model_id.as_ref()
  }

  pub fn reset_model_id(&mut self) {
    self.model_id = None;
  }

  pub fn set_eval_type(&mut self, eval_type: String) {
    self.eval_type = Some(eval_type);
  }

  pub fn with_eval_type(mut self, eval_type: String) -> AggregatePrediction {
    self.eval_type = Some(eval_type);
    self
  }

  pub fn eval_type(&self) -> Option<&String> {
    self.eval_type.as_ref()
  }

  pub fn reset_eval_type(&mut self) {
    self.eval_type = None;
  }

}



