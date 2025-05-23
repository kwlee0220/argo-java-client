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
import org.openapitools.client.model.IoArgoprojEventsV1alpha1GitCreds;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1GitRemoteConfig;
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
 * IoArgoprojEventsV1alpha1GitArtifact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1GitArtifact {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  @javax.annotation.Nullable
  private String branch;

  public static final String SERIALIZED_NAME_CLONE_DIRECTORY = "cloneDirectory";
  @SerializedName(SERIALIZED_NAME_CLONE_DIRECTORY)
  @javax.annotation.Nullable
  private String cloneDirectory;

  public static final String SERIALIZED_NAME_CREDS = "creds";
  @SerializedName(SERIALIZED_NAME_CREDS)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1GitCreds creds;

  public static final String SERIALIZED_NAME_FILE_PATH = "filePath";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  @javax.annotation.Nullable
  private String filePath;

  public static final String SERIALIZED_NAME_INSECURE_IGNORE_HOST_KEY = "insecureIgnoreHostKey";
  @SerializedName(SERIALIZED_NAME_INSECURE_IGNORE_HOST_KEY)
  @javax.annotation.Nullable
  private Boolean insecureIgnoreHostKey;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  @javax.annotation.Nullable
  private String ref;

  public static final String SERIALIZED_NAME_REMOTE = "remote";
  @SerializedName(SERIALIZED_NAME_REMOTE)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1GitRemoteConfig remote;

  public static final String SERIALIZED_NAME_SSH_KEY_SECRET = "sshKeySecret";
  @SerializedName(SERIALIZED_NAME_SSH_KEY_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector sshKeySecret;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nullable
  private String tag;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public IoArgoprojEventsV1alpha1GitArtifact() {
  }

  public IoArgoprojEventsV1alpha1GitArtifact branch(@javax.annotation.Nullable String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   */
  @javax.annotation.Nullable
  public String getBranch() {
    return branch;
  }

  public void setBranch(@javax.annotation.Nullable String branch) {
    this.branch = branch;
  }


  public IoArgoprojEventsV1alpha1GitArtifact cloneDirectory(@javax.annotation.Nullable String cloneDirectory) {
    this.cloneDirectory = cloneDirectory;
    return this;
  }

  /**
   * Directory to clone the repository. We clone complete directory because GitArtifact is not limited to any specific Git service providers. Hence we don&#39;t use any specific git provider client.
   * @return cloneDirectory
   */
  @javax.annotation.Nullable
  public String getCloneDirectory() {
    return cloneDirectory;
  }

  public void setCloneDirectory(@javax.annotation.Nullable String cloneDirectory) {
    this.cloneDirectory = cloneDirectory;
  }


  public IoArgoprojEventsV1alpha1GitArtifact creds(@javax.annotation.Nullable IoArgoprojEventsV1alpha1GitCreds creds) {
    this.creds = creds;
    return this;
  }

  /**
   * Get creds
   * @return creds
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1GitCreds getCreds() {
    return creds;
  }

  public void setCreds(@javax.annotation.Nullable IoArgoprojEventsV1alpha1GitCreds creds) {
    this.creds = creds;
  }


  public IoArgoprojEventsV1alpha1GitArtifact filePath(@javax.annotation.Nullable String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
   */
  @javax.annotation.Nullable
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(@javax.annotation.Nullable String filePath) {
    this.filePath = filePath;
  }


  public IoArgoprojEventsV1alpha1GitArtifact insecureIgnoreHostKey(@javax.annotation.Nullable Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    return this;
  }

  /**
   * Get insecureIgnoreHostKey
   * @return insecureIgnoreHostKey
   */
  @javax.annotation.Nullable
  public Boolean getInsecureIgnoreHostKey() {
    return insecureIgnoreHostKey;
  }

  public void setInsecureIgnoreHostKey(@javax.annotation.Nullable Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
  }


  public IoArgoprojEventsV1alpha1GitArtifact ref(@javax.annotation.Nullable String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
   */
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }

  public void setRef(@javax.annotation.Nullable String ref) {
    this.ref = ref;
  }


  public IoArgoprojEventsV1alpha1GitArtifact remote(@javax.annotation.Nullable IoArgoprojEventsV1alpha1GitRemoteConfig remote) {
    this.remote = remote;
    return this;
  }

  /**
   * Get remote
   * @return remote
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1GitRemoteConfig getRemote() {
    return remote;
  }

  public void setRemote(@javax.annotation.Nullable IoArgoprojEventsV1alpha1GitRemoteConfig remote) {
    this.remote = remote;
  }


  public IoArgoprojEventsV1alpha1GitArtifact sshKeySecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector sshKeySecret) {
    this.sshKeySecret = sshKeySecret;
    return this;
  }

  /**
   * Get sshKeySecret
   * @return sshKeySecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getSshKeySecret() {
    return sshKeySecret;
  }

  public void setSshKeySecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector sshKeySecret) {
    this.sshKeySecret = sshKeySecret;
  }


  public IoArgoprojEventsV1alpha1GitArtifact tag(@javax.annotation.Nullable String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(@javax.annotation.Nullable String tag) {
    this.tag = tag;
  }


  public IoArgoprojEventsV1alpha1GitArtifact url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
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
    IoArgoprojEventsV1alpha1GitArtifact ioArgoprojEventsV1alpha1GitArtifact = (IoArgoprojEventsV1alpha1GitArtifact) o;
    return Objects.equals(this.branch, ioArgoprojEventsV1alpha1GitArtifact.branch) &&
        Objects.equals(this.cloneDirectory, ioArgoprojEventsV1alpha1GitArtifact.cloneDirectory) &&
        Objects.equals(this.creds, ioArgoprojEventsV1alpha1GitArtifact.creds) &&
        Objects.equals(this.filePath, ioArgoprojEventsV1alpha1GitArtifact.filePath) &&
        Objects.equals(this.insecureIgnoreHostKey, ioArgoprojEventsV1alpha1GitArtifact.insecureIgnoreHostKey) &&
        Objects.equals(this.ref, ioArgoprojEventsV1alpha1GitArtifact.ref) &&
        Objects.equals(this.remote, ioArgoprojEventsV1alpha1GitArtifact.remote) &&
        Objects.equals(this.sshKeySecret, ioArgoprojEventsV1alpha1GitArtifact.sshKeySecret) &&
        Objects.equals(this.tag, ioArgoprojEventsV1alpha1GitArtifact.tag) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1GitArtifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, cloneDirectory, creds, filePath, insecureIgnoreHostKey, ref, remote, sshKeySecret, tag, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1GitArtifact {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    cloneDirectory: ").append(toIndentedString(cloneDirectory)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    sshKeySecret: ").append(toIndentedString(sshKeySecret)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("branch");
    openapiFields.add("cloneDirectory");
    openapiFields.add("creds");
    openapiFields.add("filePath");
    openapiFields.add("insecureIgnoreHostKey");
    openapiFields.add("ref");
    openapiFields.add("remote");
    openapiFields.add("sshKeySecret");
    openapiFields.add("tag");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1GitArtifact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1GitArtifact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1GitArtifact is not found in the empty JSON string", IoArgoprojEventsV1alpha1GitArtifact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1GitArtifact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1GitArtifact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull()) && !jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if ((jsonObj.get("cloneDirectory") != null && !jsonObj.get("cloneDirectory").isJsonNull()) && !jsonObj.get("cloneDirectory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloneDirectory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloneDirectory").toString()));
      }
      // validate the optional field `creds`
      if (jsonObj.get("creds") != null && !jsonObj.get("creds").isJsonNull()) {
        IoArgoprojEventsV1alpha1GitCreds.validateJsonElement(jsonObj.get("creds"));
      }
      if ((jsonObj.get("filePath") != null && !jsonObj.get("filePath").isJsonNull()) && !jsonObj.get("filePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filePath").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the optional field `remote`
      if (jsonObj.get("remote") != null && !jsonObj.get("remote").isJsonNull()) {
        IoArgoprojEventsV1alpha1GitRemoteConfig.validateJsonElement(jsonObj.get("remote"));
      }
      // validate the optional field `sshKeySecret`
      if (jsonObj.get("sshKeySecret") != null && !jsonObj.get("sshKeySecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("sshKeySecret"));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1GitArtifact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1GitArtifact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1GitArtifact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1GitArtifact.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1GitArtifact>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1GitArtifact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1GitArtifact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1GitArtifact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1GitArtifact
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1GitArtifact
   */
  public static IoArgoprojEventsV1alpha1GitArtifact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1GitArtifact.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1GitArtifact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

