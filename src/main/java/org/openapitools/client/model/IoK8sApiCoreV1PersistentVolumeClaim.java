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
import org.openapitools.client.model.IoK8sApiCoreV1PersistentVolumeClaimSpec;
import org.openapitools.client.model.IoK8sApiCoreV1PersistentVolumeClaimStatus;
import org.openapitools.client.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

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
 * PersistentVolumeClaim is a user&#39;s request for and claim to a persistent volume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1PersistentVolumeClaim {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @javax.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @javax.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1PersistentVolumeClaimSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1PersistentVolumeClaimStatus status;

  public IoK8sApiCoreV1PersistentVolumeClaim() {
  }

  public IoK8sApiCoreV1PersistentVolumeClaim apiVersion(@javax.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @javax.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@javax.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public IoK8sApiCoreV1PersistentVolumeClaim kind(@javax.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @javax.annotation.Nullable
  public String getKind() {
    return kind;
  }

  public void setKind(@javax.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public IoK8sApiCoreV1PersistentVolumeClaim metadata(@javax.annotation.Nullable IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public IoK8sApiCoreV1PersistentVolumeClaim spec(@javax.annotation.Nullable IoK8sApiCoreV1PersistentVolumeClaimSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1PersistentVolumeClaimSpec getSpec() {
    return spec;
  }

  public void setSpec(@javax.annotation.Nullable IoK8sApiCoreV1PersistentVolumeClaimSpec spec) {
    this.spec = spec;
  }


  public IoK8sApiCoreV1PersistentVolumeClaim status(@javax.annotation.Nullable IoK8sApiCoreV1PersistentVolumeClaimStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1PersistentVolumeClaimStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable IoK8sApiCoreV1PersistentVolumeClaimStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PersistentVolumeClaim ioK8sApiCoreV1PersistentVolumeClaim = (IoK8sApiCoreV1PersistentVolumeClaim) o;
    return Objects.equals(this.apiVersion, ioK8sApiCoreV1PersistentVolumeClaim.apiVersion) &&
        Objects.equals(this.kind, ioK8sApiCoreV1PersistentVolumeClaim.kind) &&
        Objects.equals(this.metadata, ioK8sApiCoreV1PersistentVolumeClaim.metadata) &&
        Objects.equals(this.spec, ioK8sApiCoreV1PersistentVolumeClaim.spec) &&
        Objects.equals(this.status, ioK8sApiCoreV1PersistentVolumeClaim.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaim {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("spec");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1PersistentVolumeClaim
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1PersistentVolumeClaim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1PersistentVolumeClaim is not found in the empty JSON string", IoK8sApiCoreV1PersistentVolumeClaim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1PersistentVolumeClaim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1PersistentVolumeClaim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        IoK8sApimachineryPkgApisMetaV1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        IoK8sApiCoreV1PersistentVolumeClaimSpec.validateJsonElement(jsonObj.get("spec"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        IoK8sApiCoreV1PersistentVolumeClaimStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1PersistentVolumeClaim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1PersistentVolumeClaim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1PersistentVolumeClaim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1PersistentVolumeClaim.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1PersistentVolumeClaim>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1PersistentVolumeClaim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1PersistentVolumeClaim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1PersistentVolumeClaim given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1PersistentVolumeClaim
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1PersistentVolumeClaim
   */
  public static IoK8sApiCoreV1PersistentVolumeClaim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1PersistentVolumeClaim.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1PersistentVolumeClaim to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

