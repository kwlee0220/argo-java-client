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
import java.util.Arrays;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;

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
 * PodGC describes how to delete completed pods as they complete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1PodGC {
  public static final String SERIALIZED_NAME_DELETE_DELAY_DURATION = "deleteDelayDuration";
  @SerializedName(SERIALIZED_NAME_DELETE_DELAY_DURATION)
  @javax.annotation.Nullable
  private String deleteDelayDuration;

  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  @javax.annotation.Nullable
  private IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @javax.annotation.Nullable
  private String strategy;

  public IoArgoprojWorkflowV1alpha1PodGC() {
  }

  public IoArgoprojWorkflowV1alpha1PodGC deleteDelayDuration(@javax.annotation.Nullable String deleteDelayDuration) {
    this.deleteDelayDuration = deleteDelayDuration;
    return this;
  }

  /**
   * DeleteDelayDuration specifies the duration before pods in the GC queue get deleted.
   * @return deleteDelayDuration
   */
  @javax.annotation.Nullable
  public String getDeleteDelayDuration() {
    return deleteDelayDuration;
  }

  public void setDeleteDelayDuration(@javax.annotation.Nullable String deleteDelayDuration) {
    this.deleteDelayDuration = deleteDelayDuration;
  }


  public IoArgoprojWorkflowV1alpha1PodGC labelSelector(@javax.annotation.Nullable IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   * @return labelSelector
   */
  @javax.annotation.Nullable
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(@javax.annotation.Nullable IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public IoArgoprojWorkflowV1alpha1PodGC strategy(@javax.annotation.Nullable String strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Strategy is the strategy to use. One of \&quot;OnPodCompletion\&quot;, \&quot;OnPodSuccess\&quot;, \&quot;OnWorkflowCompletion\&quot;, \&quot;OnWorkflowSuccess\&quot;. If unset, does not delete Pods
   * @return strategy
   */
  @javax.annotation.Nullable
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(@javax.annotation.Nullable String strategy) {
    this.strategy = strategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1PodGC ioArgoprojWorkflowV1alpha1PodGC = (IoArgoprojWorkflowV1alpha1PodGC) o;
    return Objects.equals(this.deleteDelayDuration, ioArgoprojWorkflowV1alpha1PodGC.deleteDelayDuration) &&
        Objects.equals(this.labelSelector, ioArgoprojWorkflowV1alpha1PodGC.labelSelector) &&
        Objects.equals(this.strategy, ioArgoprojWorkflowV1alpha1PodGC.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteDelayDuration, labelSelector, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1PodGC {\n");
    sb.append("    deleteDelayDuration: ").append(toIndentedString(deleteDelayDuration)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
    openapiFields.add("deleteDelayDuration");
    openapiFields.add("labelSelector");
    openapiFields.add("strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1PodGC
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1PodGC.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1PodGC is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1PodGC.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1PodGC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1PodGC` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deleteDelayDuration") != null && !jsonObj.get("deleteDelayDuration").isJsonNull()) && !jsonObj.get("deleteDelayDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleteDelayDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleteDelayDuration").toString()));
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        IoK8sApimachineryPkgApisMetaV1LabelSelector.validateJsonElement(jsonObj.get("labelSelector"));
      }
      if ((jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) && !jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1PodGC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1PodGC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1PodGC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1PodGC.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1PodGC>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1PodGC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1PodGC read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1PodGC given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1PodGC
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1PodGC
   */
  public static IoArgoprojWorkflowV1alpha1PodGC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1PodGC.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1PodGC to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

