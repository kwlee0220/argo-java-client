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
import org.openapitools.client.model.IoK8sApiCoreV1LocalObjectReference;

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
 * Represents a StorageOS persistent volume resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1StorageOSVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @javax.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @javax.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  @javax.annotation.Nullable
  private String volumeName;

  public static final String SERIALIZED_NAME_VOLUME_NAMESPACE = "volumeNamespace";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAMESPACE)
  @javax.annotation.Nullable
  private String volumeNamespace;

  public IoK8sApiCoreV1StorageOSVolumeSource() {
  }

  public IoK8sApiCoreV1StorageOSVolumeSource fsType(@javax.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
   */
  @javax.annotation.Nullable
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@javax.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public IoK8sApiCoreV1StorageOSVolumeSource readOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
   */
  @javax.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public IoK8sApiCoreV1StorageOSVolumeSource secretRef(@javax.annotation.Nullable IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   * @return secretRef
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(@javax.annotation.Nullable IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public IoK8sApiCoreV1StorageOSVolumeSource volumeName(@javax.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   * @return volumeName
   */
  @javax.annotation.Nullable
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(@javax.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
  }


  public IoK8sApiCoreV1StorageOSVolumeSource volumeNamespace(@javax.annotation.Nullable String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }

  /**
   * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   * @return volumeNamespace
   */
  @javax.annotation.Nullable
  public String getVolumeNamespace() {
    return volumeNamespace;
  }

  public void setVolumeNamespace(@javax.annotation.Nullable String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1StorageOSVolumeSource ioK8sApiCoreV1StorageOSVolumeSource = (IoK8sApiCoreV1StorageOSVolumeSource) o;
    return Objects.equals(this.fsType, ioK8sApiCoreV1StorageOSVolumeSource.fsType) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1StorageOSVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, ioK8sApiCoreV1StorageOSVolumeSource.secretRef) &&
        Objects.equals(this.volumeName, ioK8sApiCoreV1StorageOSVolumeSource.volumeName) &&
        Objects.equals(this.volumeNamespace, ioK8sApiCoreV1StorageOSVolumeSource.volumeNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1StorageOSVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("volumeName");
    openapiFields.add("volumeNamespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1StorageOSVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1StorageOSVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1StorageOSVolumeSource is not found in the empty JSON string", IoK8sApiCoreV1StorageOSVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1StorageOSVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1StorageOSVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        IoK8sApiCoreV1LocalObjectReference.validateJsonElement(jsonObj.get("secretRef"));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
      if ((jsonObj.get("volumeNamespace") != null && !jsonObj.get("volumeNamespace").isJsonNull()) && !jsonObj.get("volumeNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeNamespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1StorageOSVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1StorageOSVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1StorageOSVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1StorageOSVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1StorageOSVolumeSource>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1StorageOSVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1StorageOSVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1StorageOSVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1StorageOSVolumeSource
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1StorageOSVolumeSource
   */
  public static IoK8sApiCoreV1StorageOSVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1StorageOSVolumeSource.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1StorageOSVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

