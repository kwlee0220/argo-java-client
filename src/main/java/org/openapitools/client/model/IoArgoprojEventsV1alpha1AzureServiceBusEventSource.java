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
import org.openapitools.client.model.IoArgoprojEventsV1alpha1EventSourceFilter;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import org.openapitools.client.model.IoK8sApiCoreV1SecretKeySelector;

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
 * IoArgoprojEventsV1alpha1AzureServiceBusEventSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1AzureServiceBusEventSource {
  public static final String SERIALIZED_NAME_CONNECTION_STRING = "connectionString";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STRING)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector connectionString;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1EventSourceFilter filter;

  public static final String SERIALIZED_NAME_FULLY_QUALIFIED_NAMESPACE = "fullyQualifiedNamespace";
  @SerializedName(SERIALIZED_NAME_FULLY_QUALIFIED_NAMESPACE)
  @javax.annotation.Nullable
  private String fullyQualifiedNamespace;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  @javax.annotation.Nullable
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_QUEUE_NAME = "queueName";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  @javax.annotation.Nullable
  private String queueName;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_NAME = "subscriptionName";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_NAME)
  @javax.annotation.Nullable
  private String subscriptionName;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1TLSConfig tls;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  @javax.annotation.Nullable
  private String topicName;

  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource() {
  }

  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource connectionString(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector connectionString) {
    this.connectionString = connectionString;
    return this;
  }

  /**
   * Get connectionString
   * @return connectionString
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector connectionString) {
    this.connectionString = connectionString;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource filter(@javax.annotation.Nullable IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1EventSourceFilter getFilter() {
    return filter;
  }

  public void setFilter(@javax.annotation.Nullable IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource fullyQualifiedNamespace(@javax.annotation.Nullable String fullyQualifiedNamespace) {
    this.fullyQualifiedNamespace = fullyQualifiedNamespace;
    return this;
  }

  /**
   * Get fullyQualifiedNamespace
   * @return fullyQualifiedNamespace
   */
  @javax.annotation.Nullable
  public String getFullyQualifiedNamespace() {
    return fullyQualifiedNamespace;
  }

  public void setFullyQualifiedNamespace(@javax.annotation.Nullable String fullyQualifiedNamespace) {
    this.fullyQualifiedNamespace = fullyQualifiedNamespace;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource jsonBody(@javax.annotation.Nullable Boolean jsonBody) {
    this.jsonBody = jsonBody;
    return this;
  }

  /**
   * Get jsonBody
   * @return jsonBody
   */
  @javax.annotation.Nullable
  public Boolean getJsonBody() {
    return jsonBody;
  }

  public void setJsonBody(@javax.annotation.Nullable Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource queueName(@javax.annotation.Nullable String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
   */
  @javax.annotation.Nullable
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(@javax.annotation.Nullable String queueName) {
    this.queueName = queueName;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource subscriptionName(@javax.annotation.Nullable String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

  /**
   * Get subscriptionName
   * @return subscriptionName
   */
  @javax.annotation.Nullable
  public String getSubscriptionName() {
    return subscriptionName;
  }

  public void setSubscriptionName(@javax.annotation.Nullable String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource tls(@javax.annotation.Nullable IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
    return this;
  }

  /**
   * Get tls
   * @return tls
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1TLSConfig getTls() {
    return tls;
  }

  public void setTls(@javax.annotation.Nullable IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
  }


  public IoArgoprojEventsV1alpha1AzureServiceBusEventSource topicName(@javax.annotation.Nullable String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Get topicName
   * @return topicName
   */
  @javax.annotation.Nullable
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(@javax.annotation.Nullable String topicName) {
    this.topicName = topicName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AzureServiceBusEventSource ioArgoprojEventsV1alpha1AzureServiceBusEventSource = (IoArgoprojEventsV1alpha1AzureServiceBusEventSource) o;
    return Objects.equals(this.connectionString, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.connectionString) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.filter) &&
        Objects.equals(this.fullyQualifiedNamespace, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.fullyQualifiedNamespace) &&
        Objects.equals(this.jsonBody, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.jsonBody) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.metadata) &&
        Objects.equals(this.queueName, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.queueName) &&
        Objects.equals(this.subscriptionName, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.subscriptionName) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.tls) &&
        Objects.equals(this.topicName, ioArgoprojEventsV1alpha1AzureServiceBusEventSource.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionString, filter, fullyQualifiedNamespace, jsonBody, metadata, queueName, subscriptionName, tls, topicName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AzureServiceBusEventSource {\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    fullyQualifiedNamespace: ").append(toIndentedString(fullyQualifiedNamespace)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
    openapiFields.add("connectionString");
    openapiFields.add("filter");
    openapiFields.add("fullyQualifiedNamespace");
    openapiFields.add("jsonBody");
    openapiFields.add("metadata");
    openapiFields.add("queueName");
    openapiFields.add("subscriptionName");
    openapiFields.add("tls");
    openapiFields.add("topicName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1AzureServiceBusEventSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1AzureServiceBusEventSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1AzureServiceBusEventSource is not found in the empty JSON string", IoArgoprojEventsV1alpha1AzureServiceBusEventSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1AzureServiceBusEventSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1AzureServiceBusEventSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `connectionString`
      if (jsonObj.get("connectionString") != null && !jsonObj.get("connectionString").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("connectionString"));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        IoArgoprojEventsV1alpha1EventSourceFilter.validateJsonElement(jsonObj.get("filter"));
      }
      if ((jsonObj.get("fullyQualifiedNamespace") != null && !jsonObj.get("fullyQualifiedNamespace").isJsonNull()) && !jsonObj.get("fullyQualifiedNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullyQualifiedNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullyQualifiedNamespace").toString()));
      }
      if ((jsonObj.get("queueName") != null && !jsonObj.get("queueName").isJsonNull()) && !jsonObj.get("queueName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueName").toString()));
      }
      if ((jsonObj.get("subscriptionName") != null && !jsonObj.get("subscriptionName").isJsonNull()) && !jsonObj.get("subscriptionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionName").toString()));
      }
      // validate the optional field `tls`
      if (jsonObj.get("tls") != null && !jsonObj.get("tls").isJsonNull()) {
        IoArgoprojEventsV1alpha1TLSConfig.validateJsonElement(jsonObj.get("tls"));
      }
      if ((jsonObj.get("topicName") != null && !jsonObj.get("topicName").isJsonNull()) && !jsonObj.get("topicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topicName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1AzureServiceBusEventSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1AzureServiceBusEventSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1AzureServiceBusEventSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1AzureServiceBusEventSource.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1AzureServiceBusEventSource>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1AzureServiceBusEventSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1AzureServiceBusEventSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1AzureServiceBusEventSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1AzureServiceBusEventSource
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1AzureServiceBusEventSource
   */
  public static IoArgoprojEventsV1alpha1AzureServiceBusEventSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1AzureServiceBusEventSource.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1AzureServiceBusEventSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

