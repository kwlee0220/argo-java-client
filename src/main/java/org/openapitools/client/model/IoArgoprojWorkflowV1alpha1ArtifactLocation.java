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
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1ArtifactoryArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1AzureArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1GCSArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1GitArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1HDFSArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1HTTPArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1OSSArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1RawArtifact;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1S3Artifact;

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
 * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1ArtifactLocation {
  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  @javax.annotation.Nullable
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1ArtifactoryArtifact artifactory;

  public static final String SERIALIZED_NAME_AZURE = "azure";
  @SerializedName(SERIALIZED_NAME_AZURE)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1AzureArtifact azure;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1GCSArtifact gcs;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1GitArtifact git;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1HDFSArtifact hdfs;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1HTTPArtifact http;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1OSSArtifact oss;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1RawArtifact raw;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1S3Artifact s3;

  public IoArgoprojWorkflowV1alpha1ArtifactLocation() {
  }

  public IoArgoprojWorkflowV1alpha1ArtifactLocation archiveLogs(@javax.annotation.Nullable Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
    return this;
  }

  /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
   */
  @javax.annotation.Nullable
  public Boolean getArchiveLogs() {
    return archiveLogs;
  }

  public void setArchiveLogs(@javax.annotation.Nullable Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation artifactory(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
    return this;
  }

  /**
   * Get artifactory
   * @return artifactory
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }

  public void setArtifactory(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation azure(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1AzureArtifact azure) {
    this.azure = azure;
    return this;
  }

  /**
   * Get azure
   * @return azure
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1AzureArtifact getAzure() {
    return azure;
  }

  public void setAzure(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1AzureArtifact azure) {
    this.azure = azure;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation gcs(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1GCSArtifact gcs) {
    this.gcs = gcs;
    return this;
  }

  /**
   * Get gcs
   * @return gcs
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1GCSArtifact getGcs() {
    return gcs;
  }

  public void setGcs(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1GCSArtifact gcs) {
    this.gcs = gcs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation git(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1GitArtifact git) {
    this.git = git;
    return this;
  }

  /**
   * Get git
   * @return git
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1GitArtifact getGit() {
    return git;
  }

  public void setGit(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1GitArtifact git) {
    this.git = git;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation hdfs(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1HDFSArtifact hdfs) {
    this.hdfs = hdfs;
    return this;
  }

  /**
   * Get hdfs
   * @return hdfs
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1HDFSArtifact getHdfs() {
    return hdfs;
  }

  public void setHdfs(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation http(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1HTTPArtifact http) {
    this.http = http;
    return this;
  }

  /**
   * Get http
   * @return http
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1HTTPArtifact getHttp() {
    return http;
  }

  public void setHttp(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1HTTPArtifact http) {
    this.http = http;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation oss(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1OSSArtifact oss) {
    this.oss = oss;
    return this;
  }

  /**
   * Get oss
   * @return oss
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1OSSArtifact getOss() {
    return oss;
  }

  public void setOss(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1OSSArtifact oss) {
    this.oss = oss;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation raw(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1RawArtifact raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1RawArtifact getRaw() {
    return raw;
  }

  public void setRaw(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1RawArtifact raw) {
    this.raw = raw;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactLocation s3(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1S3Artifact s3) {
    this.s3 = s3;
    return this;
  }

  /**
   * Get s3
   * @return s3
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1S3Artifact getS3() {
    return s3;
  }

  public void setS3(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1S3Artifact s3) {
    this.s3 = s3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactLocation ioArgoprojWorkflowV1alpha1ArtifactLocation = (IoArgoprojWorkflowV1alpha1ArtifactLocation) o;
    return Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1ArtifactLocation.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1ArtifactLocation.artifactory) &&
        Objects.equals(this.azure, ioArgoprojWorkflowV1alpha1ArtifactLocation.azure) &&
        Objects.equals(this.gcs, ioArgoprojWorkflowV1alpha1ArtifactLocation.gcs) &&
        Objects.equals(this.git, ioArgoprojWorkflowV1alpha1ArtifactLocation.git) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1ArtifactLocation.hdfs) &&
        Objects.equals(this.http, ioArgoprojWorkflowV1alpha1ArtifactLocation.http) &&
        Objects.equals(this.oss, ioArgoprojWorkflowV1alpha1ArtifactLocation.oss) &&
        Objects.equals(this.raw, ioArgoprojWorkflowV1alpha1ArtifactLocation.raw) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1ArtifactLocation.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLogs, artifactory, azure, gcs, git, hdfs, http, oss, raw, s3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactLocation {\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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
    openapiFields.add("archiveLogs");
    openapiFields.add("artifactory");
    openapiFields.add("azure");
    openapiFields.add("gcs");
    openapiFields.add("git");
    openapiFields.add("hdfs");
    openapiFields.add("http");
    openapiFields.add("oss");
    openapiFields.add("raw");
    openapiFields.add("s3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1ArtifactLocation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1ArtifactLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1ArtifactLocation is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1ArtifactLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1ArtifactLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1ArtifactLocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `artifactory`
      if (jsonObj.get("artifactory") != null && !jsonObj.get("artifactory").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1ArtifactoryArtifact.validateJsonElement(jsonObj.get("artifactory"));
      }
      // validate the optional field `azure`
      if (jsonObj.get("azure") != null && !jsonObj.get("azure").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1AzureArtifact.validateJsonElement(jsonObj.get("azure"));
      }
      // validate the optional field `gcs`
      if (jsonObj.get("gcs") != null && !jsonObj.get("gcs").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1GCSArtifact.validateJsonElement(jsonObj.get("gcs"));
      }
      // validate the optional field `git`
      if (jsonObj.get("git") != null && !jsonObj.get("git").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1GitArtifact.validateJsonElement(jsonObj.get("git"));
      }
      // validate the optional field `hdfs`
      if (jsonObj.get("hdfs") != null && !jsonObj.get("hdfs").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1HDFSArtifact.validateJsonElement(jsonObj.get("hdfs"));
      }
      // validate the optional field `http`
      if (jsonObj.get("http") != null && !jsonObj.get("http").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1HTTPArtifact.validateJsonElement(jsonObj.get("http"));
      }
      // validate the optional field `oss`
      if (jsonObj.get("oss") != null && !jsonObj.get("oss").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1OSSArtifact.validateJsonElement(jsonObj.get("oss"));
      }
      // validate the optional field `raw`
      if (jsonObj.get("raw") != null && !jsonObj.get("raw").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1RawArtifact.validateJsonElement(jsonObj.get("raw"));
      }
      // validate the optional field `s3`
      if (jsonObj.get("s3") != null && !jsonObj.get("s3").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1S3Artifact.validateJsonElement(jsonObj.get("s3"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1ArtifactLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1ArtifactLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1ArtifactLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1ArtifactLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1ArtifactLocation>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1ArtifactLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1ArtifactLocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1ArtifactLocation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1ArtifactLocation
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1ArtifactLocation
   */
  public static IoArgoprojWorkflowV1alpha1ArtifactLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1ArtifactLocation.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1ArtifactLocation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

