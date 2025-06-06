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
import org.openapitools.client.model.EventsourceCreateEventSourceRequest;
import org.openapitools.client.model.EventsourceUpdateEventSourceRequest;
import org.openapitools.client.model.GrpcGatewayRuntimeError;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1EventSource;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1EventSourceList;
import org.openapitools.client.model.StreamResultOfEventsourceEventSourceWatchEvent;
import org.openapitools.client.model.StreamResultOfEventsourceLogEntry;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventSourceServiceApi
 */
@Disabled
public class EventSourceServiceApiTest {

    private final EventSourceServiceApi api = new EventSourceServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceCreateEventSourceTest() throws ApiException {
        String namespace = null;
        EventsourceCreateEventSourceRequest body = null;
        IoArgoprojEventsV1alpha1EventSource response = api.eventSourceServiceCreateEventSource(namespace, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceDeleteEventSourceTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.eventSourceServiceDeleteEventSource(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceEventSourcesLogsTest() throws ApiException {
        String namespace = null;
        String name = null;
        String eventSourceType = null;
        String eventName = null;
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
        StreamResultOfEventsourceLogEntry response = api.eventSourceServiceEventSourcesLogs(namespace, name, eventSourceType, eventName, grep, podLogOptionsContainer, podLogOptionsFollow, podLogOptionsPrevious, podLogOptionsSinceSeconds, podLogOptionsSinceTimeSeconds, podLogOptionsSinceTimeNanos, podLogOptionsTimestamps, podLogOptionsTailLines, podLogOptionsLimitBytes, podLogOptionsInsecureSkipTLSVerifyBackend);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceGetEventSourceTest() throws ApiException {
        String namespace = null;
        String name = null;
        IoArgoprojEventsV1alpha1EventSource response = api.eventSourceServiceGetEventSource(namespace, name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceListEventSourcesTest() throws ApiException {
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
        IoArgoprojEventsV1alpha1EventSourceList response = api.eventSourceServiceListEventSources(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, listOptionsSendInitialEvents);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceUpdateEventSourceTest() throws ApiException {
        String namespace = null;
        String name = null;
        EventsourceUpdateEventSourceRequest body = null;
        IoArgoprojEventsV1alpha1EventSource response = api.eventSourceServiceUpdateEventSource(namespace, name, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventSourceServiceWatchEventSourcesTest() throws ApiException {
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
        StreamResultOfEventsourceEventSourceWatchEvent response = api.eventSourceServiceWatchEventSources(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, listOptionsSendInitialEvents);
        // TODO: test validations
    }

}
