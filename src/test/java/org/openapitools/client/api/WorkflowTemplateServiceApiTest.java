/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argo-workflows.readthedocs.io/en/latest/
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.GrpcGatewayRuntimeError;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplate;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplateLintRequest;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplateList;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1WorkflowTemplateUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowTemplateServiceApi
 */
@Disabled
public class WorkflowTemplateServiceApiTest {

    private final WorkflowTemplateServiceApi api = new WorkflowTemplateServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceCreateWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplateCreateRequest body = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplate response = api.workflowTemplateServiceCreateWorkflowTemplate(namespace, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceDeleteWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.workflowTemplateServiceDeleteWorkflowTemplate(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceGetWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        String getOptionsResourceVersion = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplate response = api.workflowTemplateServiceGetWorkflowTemplate(namespace, name, getOptionsResourceVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceLintWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplateLintRequest body = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplate response = api.workflowTemplateServiceLintWorkflowTemplate(namespace, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceListWorkflowTemplatesTest() throws ApiException {
        String namespace = null;
        String namePattern = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        Boolean listOptionsSendInitialEvents = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplateList response = api.workflowTemplateServiceListWorkflowTemplates(namespace, namePattern, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, listOptionsSendInitialEvents);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowTemplateServiceUpdateWorkflowTemplateTest() throws ApiException {
        String namespace = null;
        String name = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplateUpdateRequest body = null;
        IoArgoprojWorkflowV1alpha1WorkflowTemplate response = api.workflowTemplateServiceUpdateWorkflowTemplate(namespace, name, body);
        // TODO: test validations
    }

}
