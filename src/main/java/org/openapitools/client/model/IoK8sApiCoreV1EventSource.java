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
 * EventSource contains information for an event.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1EventSource {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  @javax.annotation.Nullable
  private String component;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

  public IoK8sApiCoreV1EventSource() {
  }

  public IoK8sApiCoreV1EventSource component(@javax.annotation.Nullable String component) {
    this.component = component;
    return this;
  }

  /**
   * Component from which the event is generated.
   * @return component
   */
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(@javax.annotation.Nullable String component) {
    this.component = component;
  }


  public IoK8sApiCoreV1EventSource host(@javax.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Node name on which the event is generated.
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = host;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EventSource ioK8sApiCoreV1EventSource = (IoK8sApiCoreV1EventSource) o;
    return Objects.equals(this.component, ioK8sApiCoreV1EventSource.component) &&
        Objects.equals(this.host, ioK8sApiCoreV1EventSource.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EventSource {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("host");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1EventSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1EventSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1EventSource is not found in the empty JSON string", IoK8sApiCoreV1EventSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1EventSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1EventSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1EventSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1EventSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1EventSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1EventSource.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1EventSource>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1EventSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1EventSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1EventSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1EventSource
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1EventSource
   */
  public static IoK8sApiCoreV1EventSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1EventSource.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1EventSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

