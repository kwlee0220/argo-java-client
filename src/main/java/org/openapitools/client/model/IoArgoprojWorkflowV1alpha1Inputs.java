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
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1Artifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1Parameter;

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
 * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1Inputs {
  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  @javax.annotation.Nullable
  private List<IoArgoprojWorkflowV1alpha1Artifact> artifacts = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  @javax.annotation.Nullable
  private List<IoArgoprojWorkflowV1alpha1Parameter> parameters = new ArrayList<>();

  public IoArgoprojWorkflowV1alpha1Inputs() {
  }

  public IoArgoprojWorkflowV1alpha1Inputs artifacts(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Inputs addArtifactsItem(IoArgoprojWorkflowV1alpha1Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Artifact are a list of artifacts passed as inputs
   * @return artifacts
   */
  @javax.annotation.Nullable
  public List<IoArgoprojWorkflowV1alpha1Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  public IoArgoprojWorkflowV1alpha1Inputs parameters(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Inputs addParametersItem(IoArgoprojWorkflowV1alpha1Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters are a list of parameters passed as inputs
   * @return parameters
   */
  @javax.annotation.Nullable
  public List<IoArgoprojWorkflowV1alpha1Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Inputs ioArgoprojWorkflowV1alpha1Inputs = (IoArgoprojWorkflowV1alpha1Inputs) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Inputs.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Inputs.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Inputs {\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("artifacts");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1Inputs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1Inputs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1Inputs is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1Inputs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1Inputs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1Inputs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("artifacts") != null && !jsonObj.get("artifacts").isJsonNull()) {
        JsonArray jsonArrayartifacts = jsonObj.getAsJsonArray("artifacts");
        if (jsonArrayartifacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("artifacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `artifacts` to be an array in the JSON string but got `%s`", jsonObj.get("artifacts").toString()));
          }

          // validate the optional field `artifacts` (array)
          for (int i = 0; i < jsonArrayartifacts.size(); i++) {
            IoArgoprojWorkflowV1alpha1Artifact.validateJsonElement(jsonArrayartifacts.get(i));
          };
        }
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            IoArgoprojWorkflowV1alpha1Parameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1Inputs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1Inputs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1Inputs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1Inputs.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1Inputs>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1Inputs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1Inputs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1Inputs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1Inputs
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1Inputs
   */
  public static IoArgoprojWorkflowV1alpha1Inputs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1Inputs.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1Inputs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

