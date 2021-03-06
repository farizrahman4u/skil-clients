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
pub struct ModelHistoryEntity {
  /// When the model history / workspace was created
  #[serde(rename = "created")]
  created: Option<i64>,
  /// The GUID of the model history / workspace
  #[serde(rename = "modelHistoryId")]
  model_history_id: Option<String>,
  /// Name of the model history / workspace
  #[serde(rename = "modelName")]
  model_name: Option<String>,
  /// Model history / workspace labels
  #[serde(rename = "modelLabels")]
  model_labels: Option<String>
}

impl ModelHistoryEntity {
  pub fn new() -> ModelHistoryEntity {
    ModelHistoryEntity {
      created: None,
      model_history_id: None,
      model_name: None,
      model_labels: None
    }
  }

  pub fn set_created(&mut self, created: i64) {
    self.created = Some(created);
  }

  pub fn with_created(mut self, created: i64) -> ModelHistoryEntity {
    self.created = Some(created);
    self
  }

  pub fn created(&self) -> Option<&i64> {
    self.created.as_ref()
  }

  pub fn reset_created(&mut self) {
    self.created = None;
  }

  pub fn set_model_history_id(&mut self, model_history_id: String) {
    self.model_history_id = Some(model_history_id);
  }

  pub fn with_model_history_id(mut self, model_history_id: String) -> ModelHistoryEntity {
    self.model_history_id = Some(model_history_id);
    self
  }

  pub fn model_history_id(&self) -> Option<&String> {
    self.model_history_id.as_ref()
  }

  pub fn reset_model_history_id(&mut self) {
    self.model_history_id = None;
  }

  pub fn set_model_name(&mut self, model_name: String) {
    self.model_name = Some(model_name);
  }

  pub fn with_model_name(mut self, model_name: String) -> ModelHistoryEntity {
    self.model_name = Some(model_name);
    self
  }

  pub fn model_name(&self) -> Option<&String> {
    self.model_name.as_ref()
  }

  pub fn reset_model_name(&mut self) {
    self.model_name = None;
  }

  pub fn set_model_labels(&mut self, model_labels: String) {
    self.model_labels = Some(model_labels);
  }

  pub fn with_model_labels(mut self, model_labels: String) -> ModelHistoryEntity {
    self.model_labels = Some(model_labels);
    self
  }

  pub fn model_labels(&self) -> Option<&String> {
    self.model_labels.as_ref()
  }

  pub fn reset_model_labels(&mut self) {
    self.model_labels = None;
  }

}



