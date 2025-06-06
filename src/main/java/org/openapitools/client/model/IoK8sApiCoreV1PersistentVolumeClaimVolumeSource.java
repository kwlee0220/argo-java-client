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
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1PersistentVolumeClaimVolumeSource {
  public static final String SERIALIZED_NAME_CLAIM_NAME = "claimName";
  @SerializedName(SERIALIZED_NAME_CLAIM_NAME)
  @javax.annotation.Nonnull
  private String claimName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @javax.annotation.Nullable
  private Boolean readOnly;

  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource() {
  }

  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource claimName(@javax.annotation.Nonnull String claimName) {
    this.claimName = claimName;
    return this;
  }

  /**
   * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return claimName
   */
  @javax.annotation.Nonnull
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(@javax.annotation.Nonnull String claimName) {
    this.claimName = claimName;
  }


  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource readOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
   * @return readOnly
   */
  @javax.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PersistentVolumeClaimVolumeSource ioK8sApiCoreV1PersistentVolumeClaimVolumeSource = (IoK8sApiCoreV1PersistentVolumeClaimVolumeSource) o;
    return Objects.equals(this.claimName, ioK8sApiCoreV1PersistentVolumeClaimVolumeSource.claimName) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1PersistentVolumeClaimVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimVolumeSource {\n");
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
    openapiFields.add("claimName");
    openapiFields.add("readOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("claimName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1PersistentVolumeClaimVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1PersistentVolumeClaimVolumeSource is not found in the empty JSON string", IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1PersistentVolumeClaimVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("claimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1PersistentVolumeClaimVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1PersistentVolumeClaimVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1PersistentVolumeClaimVolumeSource>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1PersistentVolumeClaimVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1PersistentVolumeClaimVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1PersistentVolumeClaimVolumeSource
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1PersistentVolumeClaimVolumeSource
   */
  public static IoK8sApiCoreV1PersistentVolumeClaimVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1PersistentVolumeClaimVolumeSource.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1PersistentVolumeClaimVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

