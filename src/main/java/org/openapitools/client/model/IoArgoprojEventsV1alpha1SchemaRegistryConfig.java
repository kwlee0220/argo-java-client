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
import org.openapitools.client.model.IoArgoprojEventsV1alpha1BasicAuth;

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
 * IoArgoprojEventsV1alpha1SchemaRegistryConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1SchemaRegistryConfig {
  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1BasicAuth auth;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  @javax.annotation.Nullable
  private Integer schemaId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public IoArgoprojEventsV1alpha1SchemaRegistryConfig() {
  }

  public IoArgoprojEventsV1alpha1SchemaRegistryConfig auth(@javax.annotation.Nullable IoArgoprojEventsV1alpha1BasicAuth auth) {
    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1BasicAuth getAuth() {
    return auth;
  }

  public void setAuth(@javax.annotation.Nullable IoArgoprojEventsV1alpha1BasicAuth auth) {
    this.auth = auth;
  }


  public IoArgoprojEventsV1alpha1SchemaRegistryConfig schemaId(@javax.annotation.Nullable Integer schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * Get schemaId
   * @return schemaId
   */
  @javax.annotation.Nullable
  public Integer getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(@javax.annotation.Nullable Integer schemaId) {
    this.schemaId = schemaId;
  }


  public IoArgoprojEventsV1alpha1SchemaRegistryConfig url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Schema Registry URL.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1SchemaRegistryConfig ioArgoprojEventsV1alpha1SchemaRegistryConfig = (IoArgoprojEventsV1alpha1SchemaRegistryConfig) o;
    return Objects.equals(this.auth, ioArgoprojEventsV1alpha1SchemaRegistryConfig.auth) &&
        Objects.equals(this.schemaId, ioArgoprojEventsV1alpha1SchemaRegistryConfig.schemaId) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1SchemaRegistryConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, schemaId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1SchemaRegistryConfig {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("auth");
    openapiFields.add("schemaId");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1SchemaRegistryConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1SchemaRegistryConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1SchemaRegistryConfig is not found in the empty JSON string", IoArgoprojEventsV1alpha1SchemaRegistryConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1SchemaRegistryConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1SchemaRegistryConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `auth`
      if (jsonObj.get("auth") != null && !jsonObj.get("auth").isJsonNull()) {
        IoArgoprojEventsV1alpha1BasicAuth.validateJsonElement(jsonObj.get("auth"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1SchemaRegistryConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1SchemaRegistryConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1SchemaRegistryConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1SchemaRegistryConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1SchemaRegistryConfig>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1SchemaRegistryConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1SchemaRegistryConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1SchemaRegistryConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1SchemaRegistryConfig
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1SchemaRegistryConfig
   */
  public static IoArgoprojEventsV1alpha1SchemaRegistryConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1SchemaRegistryConfig.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1SchemaRegistryConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

