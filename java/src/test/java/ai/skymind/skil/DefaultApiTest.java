/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.skymind.skil;

import ai.skymind.ApiException;
import ai.skymind.skil.model.AddExampleRequest;
import ai.skymind.skil.model.AddModelHistoryRequest;
import ai.skymind.skil.model.AggregatePrediction;
import ai.skymind.skil.model.Base64NDArrayBody;
import ai.skymind.skil.model.Base64NDArrayBodyKNN;
import ai.skymind.skil.model.BatchCSVRecord;
import ai.skymind.skil.model.BatchImageRecord;
import ai.skymind.skil.model.BestModel;
import ai.skymind.skil.model.ClassificationResult;
import ai.skymind.skil.model.CreateDeploymentRequest;
import ai.skymind.skil.model.Credentials;
import ai.skymind.skil.model.DeploymentResponse;
import ai.skymind.skil.model.DetectionResult;
import ai.skymind.skil.model.EvaluationResultsEntity;
import ai.skymind.skil.model.ExampleEntity;
import ai.skymind.skil.model.ExperimentEntity;
import java.io.File;
import ai.skymind.skil.model.FileUploadList;
import ai.skymind.skil.model.ImageTransformProcess;
import ai.skymind.skil.model.ImportModelRequest;
import ai.skymind.skil.model.InlineResponse200;
import ai.skymind.skil.model.JsonArrayResponse;
import ai.skymind.skil.model.LogBatch;
import ai.skymind.skil.model.LogRequest;
import ai.skymind.skil.model.MetaData;
import ai.skymind.skil.model.MinibatchEntity;
import ai.skymind.skil.model.ModelEntity;
import ai.skymind.skil.model.ModelFeedBackRequest;
import ai.skymind.skil.model.ModelHistoryEntity;
import ai.skymind.skil.model.ModelInstanceEntity;
import ai.skymind.skil.model.ModelStatus;
import ai.skymind.skil.model.MultiClassClassificationResult;
import ai.skymind.skil.model.MultiPredictRequest;
import ai.skymind.skil.model.MultiPredictResponse;
import ai.skymind.skil.model.NearestNeighborRequest;
import ai.skymind.skil.model.NearestNeighborsResults;
import ai.skymind.skil.model.Prediction;
import ai.skymind.skil.model.SetState;
import ai.skymind.skil.model.SingleCSVRecord;
import ai.skymind.skil.model.SingleImageRecord;
import ai.skymind.skil.model.Token;
import ai.skymind.skil.model.TransformProcess;
import ai.skymind.skil.model.UpdateBestModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Adds an evaluation result
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEvaluationResultTest() throws ApiException {
        String modelHistoryServerId = null;
        EvaluationResultsEntity evaluationResultsEntity = null;
        EvaluationResultsEntity response = api.addEvaluationResult(modelHistoryServerId, evaluationResultsEntity);

        // TODO: test validations
    }
    
    /**
     * Adds a number of examples to a minibatch ID given an AddExampleRequest.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addExampleForBatchTest() throws ApiException {
        String modelHistoryServerId = null;
        AddExampleRequest addExampleRequest = null;
        AddExampleRequest response = api.addExampleForBatch(modelHistoryServerId, addExampleRequest);

        // TODO: test validations
    }
    
    /**
     * Adds an example to a minibatch
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addExampleToMinibatchTest() throws ApiException {
        String modelHistoryServerId = null;
        ExampleEntity exampleEntity = null;
        ExampleEntity response = api.addExampleToMinibatch(modelHistoryServerId, exampleEntity);

        // TODO: test validations
    }
    
    /**
     * Add an experiment, given an experiment entity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        ExperimentEntity experimentEntity = null;
        ExperimentEntity response = api.addExperiment(modelHistoryServerId, experimentEntity);

        // TODO: test validations
    }
    
    /**
     * Adds a minibatch
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMinibatchTest() throws ApiException {
        String modelHistoryServerId = null;
        MinibatchEntity minibatchEntity = null;
        MinibatchEntity response = api.addMinibatch(modelHistoryServerId, minibatchEntity);

        // TODO: test validations
    }
    
    /**
     * Adds an evaluation feedback to the model against a given minibatch id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addModelFeedbackTest() throws ApiException {
        String modelHistoryServerId = null;
        ModelFeedBackRequest modelFeedBackRequest = null;
        ModelFeedBackRequest response = api.addModelFeedback(modelHistoryServerId, modelFeedBackRequest);

        // TODO: test validations
    }
    
    /**
     * Add a model history / workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        AddModelHistoryRequest addModelHistoryRequest = null;
        ModelHistoryEntity response = api.addModelHistory(modelHistoryServerId, addModelHistoryRequest);

        // TODO: test validations
    }
    
    /**
     * Adds a model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addModelInstanceTest() throws ApiException {
        String modelHistoryServerId = null;
        ModelInstanceEntity modelInstanceEntity = null;
        ModelInstanceEntity response = api.addModelInstance(modelHistoryServerId, modelInstanceEntity);

        // TODO: test validations
    }
    
    /**
     * Aggregates the evaluaition results of a model instance, based on the evaluation type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateModelResultsTest() throws ApiException {
        String modelHistoryServerId = null;
        AggregatePrediction aggregatePrediction = null;
        EvaluationResultsEntity response = api.aggregateModelResults(modelHistoryServerId, aggregatePrediction);

        // TODO: test validations
    }
    
    /**
     * Use the deployed model to classify the input
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void classifyTest() throws ApiException {
        Prediction body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        ClassificationResult response = api.classify(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Same as /classify but returns the output as Base64NDArrayBody
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void classifyarrayTest() throws ApiException {
        Prediction body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        Base64NDArrayBody response = api.classifyarray(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Use the deployed model to classify the input, using input image file from multipart form data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void classifyimageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        File image = null;
        ClassificationResult response = api.classifyimage(deploymentName, versionName, modelName, image);

        // TODO: test validations
    }
    
    /**
     * Creates model History
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        ModelHistoryEntity modelHistoryEntity = null;
        ModelHistoryEntity response = api.createModelHistory(modelHistoryServerId, modelHistoryEntity);

        // TODO: test validations
    }
    
    /**
     * Deletes an experiment, given an experiment entity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        String experimentID = null;
        InlineResponse200 response = api.deleteExperiment(modelHistoryServerId, experimentID);

        // TODO: test validations
    }
    
    /**
     * Delete a model by deployment and model id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String deploymentId = null;
        String modelId = null;
        InlineResponse200 response = api.deleteModel(deploymentId, modelId);

        // TODO: test validations
    }
    
    /**
     * Deletes a model history / workspace, given its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelHistoryID = null;
        InlineResponse200 response = api.deleteModelHistory(modelHistoryServerId, modelHistoryID);

        // TODO: test validations
    }
    
    /**
     * Deletes a model instance, given its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelInstanceTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelInstanceID = null;
        api.deleteModelInstance(modelHistoryServerId, modelInstanceID);

        // TODO: test validations
    }
    
    /**
     * Deploy a model in a deployment group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deployModelTest() throws ApiException {
        String deploymentId = null;
        ImportModelRequest body = null;
        ModelEntity response = api.deployModel(deploymentId, body);

        // TODO: test validations
    }
    
    /**
     * Create a new deployment group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deploymentCreateTest() throws ApiException {
        CreateDeploymentRequest body = null;
        DeploymentResponse response = api.deploymentCreate(body);

        // TODO: test validations
    }
    
    /**
     * Delete a deployment by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deploymentDeleteTest() throws ApiException {
        String deploymentId = null;
        InlineResponse200 response = api.deploymentDelete(deploymentId);

        // TODO: test validations
    }
    
    /**
     * Get a deployment details by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deploymentGetTest() throws ApiException {
        String deploymentId = null;
        DeploymentResponse response = api.deploymentGet(deploymentId);

        // TODO: test validations
    }
    
    /**
     * Get a list of deployments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deploymentsTest() throws ApiException {
        List<DeploymentResponse> response = api.deployments();

        // TODO: test validations
    }
    
    /**
     * Detect the objects, given a (input) prediction request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detectobjectsTest() throws ApiException {
        String id = null;
        Boolean needsPreprocessing = null;
        Float threshold = null;
        File imageFile = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        DetectionResult response = api.detectobjects(id, needsPreprocessing, threshold, imageFile, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Gets the best model among the given model instance IDs, based on the evaluation type and column metric
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBestModelAmongModelIdsTest() throws ApiException {
        String modelHistoryServerId = null;
        BestModel bestModel = null;
        ModelInstanceEntity response = api.getBestModelAmongModelIds(modelHistoryServerId, bestModel);

        // TODO: test validations
    }
    
    /**
     * Gets the list of evaluation results entity, given a model instance ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationForModelIDTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelInstanceID = null;
        List<EvaluationResultsEntity> response = api.getEvaluationForModelID(modelHistoryServerId, modelInstanceID);

        // TODO: test validations
    }
    
    /**
     * Gets all the examples for a minibatch ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExamplesForMinibatchTest() throws ApiException {
        String modelHistoryServerId = null;
        String minibatchId = null;
        List<ExampleEntity> response = api.getExamplesForMinibatch(modelHistoryServerId, minibatchId);

        // TODO: test validations
    }
    
    /**
     * Obtain an experiment&#39;s details, given its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        String experimentID = null;
        ExperimentEntity response = api.getExperiment(modelHistoryServerId, experimentID);

        // TODO: test validations
    }
    
    /**
     * Obtain all experiments for a model history / workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExperimentsForModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelHistoryID = null;
        ExperimentEntity response = api.getExperimentsForModelHistory(modelHistoryServerId, modelHistoryID);

        // TODO: test validations
    }
    
    /**
     * Gets a minibatch for the model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMinibatchTest() throws ApiException {
        String modelHistoryServerId = null;
        String minibatchId = null;
        MinibatchEntity response = api.getMinibatch(modelHistoryServerId, minibatchId);

        // TODO: test validations
    }
    
    /**
     * Gets a model history, given its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelHistoryID = null;
        ModelHistoryEntity response = api.getModelHistory(modelHistoryServerId, modelHistoryID);

        // TODO: test validations
    }
    
    /**
     * Gets a model instance, given its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelInstanceTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelInstanceID = null;
        ModelInstanceEntity response = api.getModelInstance(modelHistoryServerId, modelInstanceID);

        // TODO: test validations
    }
    
    /**
     * Obtain a list of all the models for an experiment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelsForExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        String experimentID = null;
        List<ModelInstanceEntity> response = api.getModelsForExperiment(modelHistoryServerId, experimentID);

        // TODO: test validations
    }
    
    /**
     * Retrieves the image transform process JSON string
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagetransformprocessGetTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        ImageTransformProcess response = api.imagetransformprocessGet(deploymentName, versionName, imageTransformName);

        // TODO: test validations
    }
    
    /**
     * Sets the image transform process through the provided JSON string
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagetransformprocessPostTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        ImageTransformProcess body = null;
        ImageTransformProcess response = api.imagetransformprocessPost(deploymentName, versionName, imageTransformName, body);

        // TODO: test validations
    }
    
    /**
     * Run inference on the input and returns it as a JsonArrayResponse
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jsonarrayTest() throws ApiException {
        Prediction body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        JsonArrayResponse response = api.jsonarray(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Runs knn on the given index with the given k
     *
     * Runs knn on the given index with the given k (note that this is for data already within the existing dataset not new data)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knnTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String knnName = null;
        NearestNeighborRequest body = null;
        NearestNeighborsResults response = api.knn(deploymentName, versionName, knnName, body);

        // TODO: test validations
    }
    
    /**
     * Run a k nearest neighbors search on a NEW data point
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knnnewTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String knnName = null;
        Base64NDArrayBodyKNN body = null;
        NearestNeighborsResults response = api.knnnew(deploymentName, versionName, knnName, body);

        // TODO: test validations
    }
    
    /**
     * List all of the experiments in every model history / workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllExperimentsTest() throws ApiException {
        List<ExperimentEntity> response = api.listAllExperiments();

        // TODO: test validations
    }
    
    /**
     * Get logs file path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logfilepathTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        String response = api.logfilepath(deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Post JSON credentials and obtain a JWT authorization token.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        Credentials credentials = null;
        Token response = api.login(credentials);

        // TODO: test validations
    }
    
    /**
     * Get logs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logsTest() throws ApiException {
        LogRequest body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        LogBatch response = api.logs(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * this method can be used to get the meta data for the current model which set to the server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metaGetTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        MetaData response = api.metaGet(deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * This method can be used to set meta data for the current model which is set to the server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metaPostTest() throws ApiException {
        MetaData body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        MetaData response = api.metaPost(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Modify the state (start/stop) of a deployed model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelStateChangeTest() throws ApiException {
        String deploymentId = null;
        String modelId = null;
        SetState body = null;
        ModelEntity response = api.modelStateChange(deploymentId, modelId, body);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of all the deployed models given a deployment id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelsTest() throws ApiException {
        String deploymentId = null;
        List<ModelEntity> response = api.models(deploymentId);

        // TODO: test validations
    }
    
    /**
     * Set the model to be served
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelsetTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        File file = null;
        ModelStatus response = api.modelset(deploymentName, versionName, modelName, file);

        // TODO: test validations
    }
    
    /**
     * Update the model to be served
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelupdateTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        File file = null;
        ModelStatus response = api.modelupdate(deploymentName, versionName, modelName, file);

        // TODO: test validations
    }
    
    /**
     * Represents all of the labels for a given classification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multiclassifyTest() throws ApiException {
        Prediction body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        MultiClassClassificationResult response = api.multiclassify(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Get the output from the network, based on the given INDArray[] input
     *
     * Networks with multiple input/output are supported via this method. A Normalizer will be used if needsPreProcessing is set to true. The output/returned array of INDArray will be the raw predictions, and consequently this method can be used for classification or regression networks, with any type of output layer (standard, time series / RnnOutputLayer, etc).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multipredictTest() throws ApiException {
        MultiPredictRequest body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        MultiPredictResponse response = api.multipredict(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Get the output from the network using the given image file using the /multipredict endpoint&#39;s method
     *
     * Networks with multiple input/output are supported via this method. A Normalizer will be used if needsPreProcessing is set to true. The output/returned array of INDArray will be the raw predictions, and consequently this method can be used for classification or regression networks, with any type of output layer (standard, time series / RnnOutputLayer, etc).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multipredictimageTest() throws ApiException {
        File file = null;
        String id = null;
        Boolean needsPreprocessing = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        MultiPredictResponse response = api.multipredictimage(file, id, needsPreprocessing, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Run inference on the input array.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictTest() throws ApiException {
        Prediction body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        Prediction response = api.predict(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Run inference on the input array, using input image file from multipart form data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictimageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        File image = null;
        Prediction response = api.predictimage(deploymentName, versionName, modelName, image);

        // TODO: test validations
    }
    
    /**
     * Preprocesses the input and run inference on it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictwithpreprocessTest() throws ApiException {
        List<String> body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        Prediction response = api.predictwithpreprocess(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Preprocesses the input and run inference on it and returns it as a JsonArrayResponse
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictwithpreprocessjsonTest() throws ApiException {
        List<String> body = null;
        String deploymentName = null;
        String versionName = null;
        String modelName = null;
        JsonArrayResponse response = api.predictwithpreprocessjson(body, deploymentName, versionName, modelName);

        // TODO: test validations
    }
    
    /**
     * Reimport a model to a previous deployed model in a deployment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reimportModelTest() throws ApiException {
        String deploymentId = null;
        String modelId = null;
        ImportModelRequest body = null;
        ModelEntity response = api.reimportModel(deploymentId, modelId, body);

        // TODO: test validations
    }
    
    /**
     * Takes a BatchCSVRecord and returns the transformed array as BatchCSVRecord
     *
     * Takes a batch of SingleCSVRecord object and transforms it into the desired format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformCsvTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        BatchCSVRecord batchCSVRecord = null;
        BatchCSVRecord response = api.transformCsv(deploymentName, versionName, transformName, batchCSVRecord);

        // TODO: test validations
    }
    
    /**
     * Takes a batch input arrays and transforms it
     *
     * Takes a batch of SingleCSVRecord object and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformarrayCsvTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        BatchCSVRecord batchCSVRecord = null;
        Base64NDArrayBody response = api.transformarrayCsv(deploymentName, versionName, transformName, batchCSVRecord);

        // TODO: test validations
    }
    
    /**
     * Takes a batch of images uri and transforms it and returns Base64NDArrayBody
     *
     * Takes a batch of SingleImageRecord object and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformarrayImageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        BatchImageRecord batchImageRecord = null;
        Base64NDArrayBody response = api.transformarrayImage(deploymentName, versionName, imageTransformName, batchImageRecord);

        // TODO: test validations
    }
    
    /**
     * Takes multiple multipart image file to transform and returns Base64NDArrayBody
     *
     * Takes multiple multipart image file and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformimageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        List<byte[]> files = null;
        Base64NDArrayBody response = api.transformimage(deploymentName, versionName, imageTransformName, files);

        // TODO: test validations
    }
    
    /**
     * Takes SingleCSVRecord as input and returns the transformed array as SingleCSVRecord
     *
     * Takes a SingleCSVRecord object and transforms it into the desired format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformincrementalCsvTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        SingleCSVRecord singleCSVRecord = null;
        SingleCSVRecord response = api.transformincrementalCsv(deploymentName, versionName, transformName, singleCSVRecord);

        // TODO: test validations
    }
    
    /**
     * Same as /transformincremental but returns Base64NDArrayBody
     *
     * Takes a SingleCSVRecord object and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformincrementalarrayCsvTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        SingleCSVRecord singleCSVRecord = null;
        Base64NDArrayBody response = api.transformincrementalarrayCsv(deploymentName, versionName, transformName, singleCSVRecord);

        // TODO: test validations
    }
    
    /**
     * Takes SingleImageRecord to transform and returns Base64NDArrayBody
     *
     * Takes a SingleImageRecord object and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformincrementalarrayImageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        SingleImageRecord singleImageRecord = null;
        Base64NDArrayBody response = api.transformincrementalarrayImage(deploymentName, versionName, imageTransformName, singleImageRecord);

        // TODO: test validations
    }
    
    /**
     * Takes a single multipart image file to transform and returns Base64NDArrayBody
     *
     * Takes a single multipart image file and transforms it into the desired format and returns it in the form of Base64NDArrayBody
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformincrementalimageTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String imageTransformName = null;
        File file = null;
        Base64NDArrayBody response = api.transformincrementalimage(deploymentName, versionName, imageTransformName, file);

        // TODO: test validations
    }
    
    /**
     * Gets the JSON string of the deployed transform process
     *
     * Retrieves the JSON string of the deployed transform process 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformprocessGetTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        TransformProcess response = api.transformprocessGet(deploymentName, versionName, transformName);

        // TODO: test validations
    }
    
    /**
     * Sets the deployed transform process through the provided JSON string
     *
     * Sets the transform process with the provided JSON string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transformprocessPostTest() throws ApiException {
        String deploymentName = null;
        String versionName = null;
        String transformName = null;
        TransformProcess transformProcess = null;
        api.transformprocessPost(deploymentName, versionName, transformName, transformProcess);

        // TODO: test validations
    }
    
    /**
     * Updates the best model for an experiment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBestModelForExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        UpdateBestModel updateBestModel = null;
        ExperimentEntity response = api.updateBestModelForExperiment(modelHistoryServerId, updateBestModel);

        // TODO: test validations
    }
    
    /**
     * Updates an experiment, given an experiment entity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateExperimentTest() throws ApiException {
        String modelHistoryServerId = null;
        String experimentID = null;
        ExperimentEntity experimentEntity = null;
        ExperimentEntity response = api.updateExperiment(modelHistoryServerId, experimentID, experimentEntity);

        // TODO: test validations
    }
    
    /**
     * Update a model history / workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelHistoryTest() throws ApiException {
        String modelHistoryServerId = null;
        String modelHistoryID = null;
        AddModelHistoryRequest updateModelHistoryRequest = null;
        ModelHistoryEntity response = api.updateModelHistory(modelHistoryServerId, modelHistoryID, updateModelHistoryRequest);

        // TODO: test validations
    }
    
    /**
     * Upload a model file to SKIL for import.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadTest() throws ApiException {
        File file = null;
        FileUploadList response = api.upload(file);

        // TODO: test validations
    }
    
}
