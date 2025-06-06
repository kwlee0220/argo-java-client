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
import org.openapitools.client.model.IoArgoprojEventsV1alpha1Sensor;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1SensorList;
import org.openapitools.client.model.SensorCreateSensorRequest;
import org.openapitools.client.model.SensorUpdateSensorRequest;
import org.openapitools.client.model.StreamResultOfSensorLogEntry;
import org.openapitools.client.model.StreamResultOfSensorSensorWatchEvent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SensorServiceApi
 */
@Disabled
public class SensorServiceApiTest {

    private final SensorServiceApi api = new SensorServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceCreateSensorTest() throws ApiException {
        String namespace = null;
        SensorCreateSensorRequest body = null;
        IoArgoprojEventsV1alpha1Sensor response = api.sensorServiceCreateSensor(namespace, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceDeleteSensorTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.sensorServiceDeleteSensor(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceGetSensorTest() throws ApiException {
        String namespace = null;
        String name = null;
        String getOptionsResourceVersion = null;
        IoArgoprojEventsV1alpha1Sensor response = api.sensorServiceGetSensor(namespace, name, getOptionsResourceVersion);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceListSensorsTest() throws ApiException {
        String namespace = null;
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
        IoArgoprojEventsV1alpha1SensorList response = api.sensorServiceListSensors(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, listOptionsSendInitialEvents);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceSensorsLogsTest() throws ApiException {
        String namespace = null;
        String name = null;
        String triggerName = null;
        String grep = null;
        String podLogOptionsContainer = null;
        Boolean podLogOptionsFollow = null;
        Boolean podLogOptionsPrevious = null;
        String podLogOptionsSinceSeconds = null;
        String podLogOptionsSinceTimeSeconds = null;
        Integer podLogOptionsSinceTimeNanos = null;
        Boolean podLogOptionsTimestamps = null;
        String podLogOptionsTailLines = null;
        String podLogOptionsLimitBytes = null;
        Boolean podLogOptionsInsecureSkipTLSVerifyBackend = null;
        StreamResultOfSensorLogEntry response = api.sensorServiceSensorsLogs(namespace, name, triggerName, grep, podLogOptionsContainer, podLogOptionsFollow, podLogOptionsPrevious, podLogOptionsSinceSeconds, podLogOptionsSinceTimeSeconds, podLogOptionsSinceTimeNanos, podLogOptionsTimestamps, podLogOptionsTailLines, podLogOptionsLimitBytes, podLogOptionsInsecureSkipTLSVerifyBackend);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceUpdateSensorTest() throws ApiException {
        String namespace = null;
        String name = null;
        SensorUpdateSensorRequest body = null;
        IoArgoprojEventsV1alpha1Sensor response = api.sensorServiceUpdateSensor(namespace, name, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sensorServiceWatchSensorsTest() throws ApiException {
        String namespace = null;
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
        StreamResultOfSensorSensorWatchEvent response = api.sensorServiceWatchSensors(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, listOptionsSendInitialEvents);
        // TODO: test validations
    }

}
