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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IoArgoprojWorkflowV1alpha1WorkflowRetryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1WorkflowRetryRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_NODE_FIELD_SELECTOR = "nodeFieldSelector";
  @SerializedName(SERIALIZED_NAME_NODE_FIELD_SELECTOR)
  @javax.annotation.Nullable
  private String nodeFieldSelector;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  @javax.annotation.Nullable
  private List<String> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESTART_SUCCESSFUL = "restartSuccessful";
  @SerializedName(SERIALIZED_NAME_RESTART_SUCCESSFUL)
  @javax.annotation.Nullable
  private Boolean restartSuccessful;

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest() {
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest nodeFieldSelector(@javax.annotation.Nullable String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
    return this;
  }

  /**
   * Get nodeFieldSelector
   * @return nodeFieldSelector
   */
  @javax.annotation.Nullable
  public String getNodeFieldSelector() {
    return nodeFieldSelector;
  }

  public void setNodeFieldSelector(@javax.annotation.Nullable String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest parameters(@javax.annotation.Nullable List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nullable
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(@javax.annotation.Nullable List<String> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest restartSuccessful(@javax.annotation.Nullable Boolean restartSuccessful) {
    this.restartSuccessful = restartSuccessful;
    return this;
  }

  /**
   * Get restartSuccessful
   * @return restartSuccessful
   */
  @javax.annotation.Nullable
  public Boolean getRestartSuccessful() {
    return restartSuccessful;
  }

  public void setRestartSuccessful(@javax.annotation.Nullable Boolean restartSuccessful) {
    this.restartSuccessful = restartSuccessful;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowRetryRequest ioArgoprojWorkflowV1alpha1WorkflowRetryRequest = (IoArgoprojWorkflowV1alpha1WorkflowRetryRequest) o;
    return Objects.equals(this.name, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.namespace) &&
        Objects.equals(this.nodeFieldSelector, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.nodeFieldSelector) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.parameters) &&
        Objects.equals(this.restartSuccessful, ioArgoprojWorkflowV1alpha1WorkflowRetryRequest.restartSuccessful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, nodeFieldSelector, parameters, restartSuccessful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowRetryRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    restartSuccessful: ").append(toIndentedString(restartSuccessful)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("nodeFieldSelector");
    openapiFields.add("parameters");
    openapiFields.add("restartSuccessful");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1WorkflowRetryRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1WorkflowRetryRequest is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1WorkflowRetryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("nodeFieldSelector") != null && !jsonObj.get("nodeFieldSelector").isJsonNull()) && !jsonObj.get("nodeFieldSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeFieldSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeFieldSelector").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull() && !jsonObj.get("parameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1WorkflowRetryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1WorkflowRetryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1WorkflowRetryRequest>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1WorkflowRetryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1WorkflowRetryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1WorkflowRetryRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1WorkflowRetryRequest
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1WorkflowRetryRequest
   */
  public static IoArgoprojWorkflowV1alpha1WorkflowRetryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1WorkflowRetryRequest.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1WorkflowRetryRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

