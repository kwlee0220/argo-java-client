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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1Backoff;

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
 * IoArgoprojEventsV1alpha1K8SResourcePolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1K8SResourcePolicy {
  public static final String SERIALIZED_NAME_BACKOFF = "backoff";
  @SerializedName(SERIALIZED_NAME_BACKOFF)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1Backoff backoff;

  public static final String SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT = "errorOnBackoffTimeout";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT)
  @javax.annotation.Nullable
  private Boolean errorOnBackoffTimeout;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  @javax.annotation.Nullable
  private Map<String, String> labels = new HashMap<>();

  public IoArgoprojEventsV1alpha1K8SResourcePolicy() {
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy backoff(@javax.annotation.Nullable IoArgoprojEventsV1alpha1Backoff backoff) {
    this.backoff = backoff;
    return this;
  }

  /**
   * Get backoff
   * @return backoff
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1Backoff getBackoff() {
    return backoff;
  }

  public void setBackoff(@javax.annotation.Nullable IoArgoprojEventsV1alpha1Backoff backoff) {
    this.backoff = backoff;
  }


  public IoArgoprojEventsV1alpha1K8SResourcePolicy errorOnBackoffTimeout(@javax.annotation.Nullable Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
    return this;
  }

  /**
   * Get errorOnBackoffTimeout
   * @return errorOnBackoffTimeout
   */
  @javax.annotation.Nullable
  public Boolean getErrorOnBackoffTimeout() {
    return errorOnBackoffTimeout;
  }

  public void setErrorOnBackoffTimeout(@javax.annotation.Nullable Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
  }


  public IoArgoprojEventsV1alpha1K8SResourcePolicy labels(@javax.annotation.Nullable Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(@javax.annotation.Nullable Map<String, String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1K8SResourcePolicy ioArgoprojEventsV1alpha1K8SResourcePolicy = (IoArgoprojEventsV1alpha1K8SResourcePolicy) o;
    return Objects.equals(this.backoff, ioArgoprojEventsV1alpha1K8SResourcePolicy.backoff) &&
        Objects.equals(this.errorOnBackoffTimeout, ioArgoprojEventsV1alpha1K8SResourcePolicy.errorOnBackoffTimeout) &&
        Objects.equals(this.labels, ioArgoprojEventsV1alpha1K8SResourcePolicy.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, errorOnBackoffTimeout, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1K8SResourcePolicy {\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("backoff");
    openapiFields.add("errorOnBackoffTimeout");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1K8SResourcePolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1K8SResourcePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1K8SResourcePolicy is not found in the empty JSON string", IoArgoprojEventsV1alpha1K8SResourcePolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1K8SResourcePolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1K8SResourcePolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `backoff`
      if (jsonObj.get("backoff") != null && !jsonObj.get("backoff").isJsonNull()) {
        IoArgoprojEventsV1alpha1Backoff.validateJsonElement(jsonObj.get("backoff"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1K8SResourcePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1K8SResourcePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1K8SResourcePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1K8SResourcePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1K8SResourcePolicy>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1K8SResourcePolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1K8SResourcePolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1K8SResourcePolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1K8SResourcePolicy
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1K8SResourcePolicy
   */
  public static IoArgoprojEventsV1alpha1K8SResourcePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1K8SResourcePolicy.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1K8SResourcePolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

