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
 * VolumeMount describes a mounting of a Volume within a container.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1VolumeMount {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  @javax.annotation.Nonnull
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";
  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  @javax.annotation.Nullable
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @javax.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY = "recursiveReadOnly";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY)
  @javax.annotation.Nullable
  private String recursiveReadOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  @javax.annotation.Nullable
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";
  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  @javax.annotation.Nullable
  private String subPathExpr;

  public IoK8sApiCoreV1VolumeMount() {
  }

  public IoK8sApiCoreV1VolumeMount mountPath(@javax.annotation.Nonnull String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

  /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
   */
  @javax.annotation.Nonnull
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(@javax.annotation.Nonnull String mountPath) {
    this.mountPath = mountPath;
  }


  public IoK8sApiCoreV1VolumeMount mountPropagation(@javax.annotation.Nullable String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return this;
  }

  /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).
   * @return mountPropagation
   */
  @javax.annotation.Nullable
  public String getMountPropagation() {
    return mountPropagation;
  }

  public void setMountPropagation(@javax.annotation.Nullable String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }


  public IoK8sApiCoreV1VolumeMount name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * This must match the Name of a Volume.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public IoK8sApiCoreV1VolumeMount readOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
   */
  @javax.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public IoK8sApiCoreV1VolumeMount recursiveReadOnly(@javax.annotation.Nullable String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

  /**
   * RecursiveReadOnly specifies whether read-only mounts should be handled recursively.  If ReadOnly is false, this field has no meaning and must be unspecified.  If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.  If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).  If this field is not specified, it is treated as an equivalent of Disabled.
   * @return recursiveReadOnly
   */
  @javax.annotation.Nullable
  public String getRecursiveReadOnly() {
    return recursiveReadOnly;
  }

  public void setRecursiveReadOnly(@javax.annotation.Nullable String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
  }


  public IoK8sApiCoreV1VolumeMount subPath(@javax.annotation.Nullable String subPath) {
    this.subPath = subPath;
    return this;
  }

  /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
   */
  @javax.annotation.Nullable
  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(@javax.annotation.Nullable String subPath) {
    this.subPath = subPath;
  }


  public IoK8sApiCoreV1VolumeMount subPathExpr(@javax.annotation.Nullable String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return this;
  }

  /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   * @return subPathExpr
   */
  @javax.annotation.Nullable
  public String getSubPathExpr() {
    return subPathExpr;
  }

  public void setSubPathExpr(@javax.annotation.Nullable String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VolumeMount ioK8sApiCoreV1VolumeMount = (IoK8sApiCoreV1VolumeMount) o;
    return Objects.equals(this.mountPath, ioK8sApiCoreV1VolumeMount.mountPath) &&
        Objects.equals(this.mountPropagation, ioK8sApiCoreV1VolumeMount.mountPropagation) &&
        Objects.equals(this.name, ioK8sApiCoreV1VolumeMount.name) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1VolumeMount.readOnly) &&
        Objects.equals(this.recursiveReadOnly, ioK8sApiCoreV1VolumeMount.recursiveReadOnly) &&
        Objects.equals(this.subPath, ioK8sApiCoreV1VolumeMount.subPath) &&
        Objects.equals(this.subPathExpr, ioK8sApiCoreV1VolumeMount.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, recursiveReadOnly, subPath, subPathExpr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeMount {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recursiveReadOnly: ").append(toIndentedString(recursiveReadOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
    openapiFields.add("mountPath");
    openapiFields.add("mountPropagation");
    openapiFields.add("name");
    openapiFields.add("readOnly");
    openapiFields.add("recursiveReadOnly");
    openapiFields.add("subPath");
    openapiFields.add("subPathExpr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1VolumeMount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1VolumeMount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1VolumeMount is not found in the empty JSON string", IoK8sApiCoreV1VolumeMount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1VolumeMount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1VolumeMount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IoK8sApiCoreV1VolumeMount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if ((jsonObj.get("mountPropagation") != null && !jsonObj.get("mountPropagation").isJsonNull()) && !jsonObj.get("mountPropagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPropagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPropagation").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("recursiveReadOnly") != null && !jsonObj.get("recursiveReadOnly").isJsonNull()) && !jsonObj.get("recursiveReadOnly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recursiveReadOnly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recursiveReadOnly").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
      if ((jsonObj.get("subPathExpr") != null && !jsonObj.get("subPathExpr").isJsonNull()) && !jsonObj.get("subPathExpr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPathExpr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPathExpr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1VolumeMount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1VolumeMount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1VolumeMount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1VolumeMount.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1VolumeMount>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1VolumeMount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1VolumeMount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1VolumeMount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1VolumeMount
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1VolumeMount
   */
  public static IoK8sApiCoreV1VolumeMount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1VolumeMount.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1VolumeMount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

