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
 * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository {
  public static final String SERIALIZED_NAME_KEY_FORMAT = "keyFormat";
  @SerializedName(SERIALIZED_NAME_KEY_FORMAT)
  @javax.annotation.Nullable
  private String keyFormat;

  public static final String SERIALIZED_NAME_PASSWORD_SECRET = "passwordSecret";
  @SerializedName(SERIALIZED_NAME_PASSWORD_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector passwordSecret;

  public static final String SERIALIZED_NAME_REPO_U_R_L = "repoURL";
  @SerializedName(SERIALIZED_NAME_REPO_U_R_L)
  @javax.annotation.Nullable
  private String repoURL;

  public static final String SERIALIZED_NAME_USERNAME_SECRET = "usernameSecret";
  @SerializedName(SERIALIZED_NAME_USERNAME_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector usernameSecret;

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository() {
  }

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository keyFormat(@javax.annotation.Nullable String keyFormat) {
    this.keyFormat = keyFormat;
    return this;
  }

  /**
   * KeyFormat defines the format of how to store keys and can reference workflow variables.
   * @return keyFormat
   */
  @javax.annotation.Nullable
  public String getKeyFormat() {
    return keyFormat;
  }

  public void setKeyFormat(@javax.annotation.Nullable String keyFormat) {
    this.keyFormat = keyFormat;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository passwordSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
    return this;
  }

  /**
   * Get passwordSecret
   * @return passwordSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }

  public void setPasswordSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository repoURL(@javax.annotation.Nullable String repoURL) {
    this.repoURL = repoURL;
    return this;
  }

  /**
   * RepoURL is the url for artifactory repo.
   * @return repoURL
   */
  @javax.annotation.Nullable
  public String getRepoURL() {
    return repoURL;
  }

  public void setRepoURL(@javax.annotation.Nullable String repoURL) {
    this.repoURL = repoURL;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository usernameSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
    return this;
  }

  /**
   * Get usernameSecret
   * @return usernameSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }

  public void setUsernameSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository ioArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository = (IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository) o;
    return Objects.equals(this.keyFormat, ioArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.keyFormat) &&
        Objects.equals(this.passwordSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.passwordSecret) &&
        Objects.equals(this.repoURL, ioArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.repoURL) &&
        Objects.equals(this.usernameSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyFormat, passwordSecret, repoURL, usernameSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository {\n");
    sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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
    openapiFields.add("keyFormat");
    openapiFields.add("passwordSecret");
    openapiFields.add("repoURL");
    openapiFields.add("usernameSecret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("keyFormat") != null && !jsonObj.get("keyFormat").isJsonNull()) && !jsonObj.get("keyFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyFormat").toString()));
      }
      // validate the optional field `passwordSecret`
      if (jsonObj.get("passwordSecret") != null && !jsonObj.get("passwordSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("passwordSecret"));
      }
      if ((jsonObj.get("repoURL") != null && !jsonObj.get("repoURL").isJsonNull()) && !jsonObj.get("repoURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repoURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repoURL").toString()));
      }
      // validate the optional field `usernameSecret`
      if (jsonObj.get("usernameSecret") != null && !jsonObj.get("usernameSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("usernameSecret"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository
   */
  public static IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

