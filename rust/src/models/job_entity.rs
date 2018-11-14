/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct JobEntity {
  /// Job ID
  #[serde(rename = "jobId")]
  job_id: Option<i64>,
  /// Whether a job is for training or inference
  #[serde(rename = "jobType")]
  job_type: Option<String>,
  /// Compute resource ID
  #[serde(rename = "computeResourceId")]
  compute_resource_id: Option<i64>,
  /// Storage resource ID
  #[serde(rename = "storageResourceId")]
  storage_resource_id: Option<i64>,
  /// Job arguments
  #[serde(rename = "jobArgs")]
  job_args: Option<String>,
  /// Job run ID
  #[serde(rename = "runId")]
  run_id: Option<String>,
  /// Job's status
  #[serde(rename = "status")]
  status: Option<String>,
  /// Output file name
  #[serde(rename = "outputFileName")]
  output_file_name: Option<String>
}

impl JobEntity {
  pub fn new() -> JobEntity {
    JobEntity {
      job_id: None,
      job_type: None,
      compute_resource_id: None,
      storage_resource_id: None,
      job_args: None,
      run_id: None,
      status: None,
      output_file_name: None
    }
  }

  pub fn set_job_id(&mut self, job_id: i64) {
    self.job_id = Some(job_id);
  }

  pub fn with_job_id(mut self, job_id: i64) -> JobEntity {
    self.job_id = Some(job_id);
    self
  }

  pub fn job_id(&self) -> Option<&i64> {
    self.job_id.as_ref()
  }

  pub fn reset_job_id(&mut self) {
    self.job_id = None;
  }

  pub fn set_job_type(&mut self, job_type: String) {
    self.job_type = Some(job_type);
  }

  pub fn with_job_type(mut self, job_type: String) -> JobEntity {
    self.job_type = Some(job_type);
    self
  }

  pub fn job_type(&self) -> Option<&String> {
    self.job_type.as_ref()
  }

  pub fn reset_job_type(&mut self) {
    self.job_type = None;
  }

  pub fn set_compute_resource_id(&mut self, compute_resource_id: i64) {
    self.compute_resource_id = Some(compute_resource_id);
  }

  pub fn with_compute_resource_id(mut self, compute_resource_id: i64) -> JobEntity {
    self.compute_resource_id = Some(compute_resource_id);
    self
  }

  pub fn compute_resource_id(&self) -> Option<&i64> {
    self.compute_resource_id.as_ref()
  }

  pub fn reset_compute_resource_id(&mut self) {
    self.compute_resource_id = None;
  }

  pub fn set_storage_resource_id(&mut self, storage_resource_id: i64) {
    self.storage_resource_id = Some(storage_resource_id);
  }

  pub fn with_storage_resource_id(mut self, storage_resource_id: i64) -> JobEntity {
    self.storage_resource_id = Some(storage_resource_id);
    self
  }

  pub fn storage_resource_id(&self) -> Option<&i64> {
    self.storage_resource_id.as_ref()
  }

  pub fn reset_storage_resource_id(&mut self) {
    self.storage_resource_id = None;
  }

  pub fn set_job_args(&mut self, job_args: String) {
    self.job_args = Some(job_args);
  }

  pub fn with_job_args(mut self, job_args: String) -> JobEntity {
    self.job_args = Some(job_args);
    self
  }

  pub fn job_args(&self) -> Option<&String> {
    self.job_args.as_ref()
  }

  pub fn reset_job_args(&mut self) {
    self.job_args = None;
  }

  pub fn set_run_id(&mut self, run_id: String) {
    self.run_id = Some(run_id);
  }

  pub fn with_run_id(mut self, run_id: String) -> JobEntity {
    self.run_id = Some(run_id);
    self
  }

  pub fn run_id(&self) -> Option<&String> {
    self.run_id.as_ref()
  }

  pub fn reset_run_id(&mut self) {
    self.run_id = None;
  }

  pub fn set_status(&mut self, status: String) {
    self.status = Some(status);
  }

  pub fn with_status(mut self, status: String) -> JobEntity {
    self.status = Some(status);
    self
  }

  pub fn status(&self) -> Option<&String> {
    self.status.as_ref()
  }

  pub fn reset_status(&mut self) {
    self.status = None;
  }

  pub fn set_output_file_name(&mut self, output_file_name: String) {
    self.output_file_name = Some(output_file_name);
  }

  pub fn with_output_file_name(mut self, output_file_name: String) -> JobEntity {
    self.output_file_name = Some(output_file_name);
    self
  }

  pub fn output_file_name(&self) -> Option<&String> {
    self.output_file_name.as_ref()
  }

  pub fn reset_output_file_name(&mut self) {
    self.output_file_name = None;
  }

}



