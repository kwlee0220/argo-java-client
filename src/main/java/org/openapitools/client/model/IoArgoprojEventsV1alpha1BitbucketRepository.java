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
 * IoArgoprojEventsV1alpha1BitbucketRepository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1BitbucketRepository {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  @javax.annotation.Nullable
  private String owner;

  public static final String SERIALIZED_NAME_REPOSITORY_SLUG = "repositorySlug";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SLUG)
  @javax.annotation.Nullable
  private String repositorySlug;

  public IoArgoprojEventsV1alpha1BitbucketRepository() {
  }

  public IoArgoprojEventsV1alpha1BitbucketRepository owner(@javax.annotation.Nullable String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(@javax.annotation.Nullable String owner) {
    this.owner = owner;
  }


  public IoArgoprojEventsV1alpha1BitbucketRepository repositorySlug(@javax.annotation.Nullable String repositorySlug) {
    this.repositorySlug = repositorySlug;
    return this;
  }

  /**
   * Get repositorySlug
   * @return repositorySlug
   */
  @javax.annotation.Nullable
  public String getRepositorySlug() {
    return repositorySlug;
  }

  public void setRepositorySlug(@javax.annotation.Nullable String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1BitbucketRepository ioArgoprojEventsV1alpha1BitbucketRepository = (IoArgoprojEventsV1alpha1BitbucketRepository) o;
    return Objects.equals(this.owner, ioArgoprojEventsV1alpha1BitbucketRepository.owner) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketRepository.repositorySlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, repositorySlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1BitbucketRepository {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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
    openapiFields.add("owner");
    openapiFields.add("repositorySlug");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1BitbucketRepository
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1BitbucketRepository.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1BitbucketRepository is not found in the empty JSON string", IoArgoprojEventsV1alpha1BitbucketRepository.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1BitbucketRepository.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1BitbucketRepository` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("repositorySlug") != null && !jsonObj.get("repositorySlug").isJsonNull()) && !jsonObj.get("repositorySlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositorySlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositorySlug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1BitbucketRepository.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1BitbucketRepository' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1BitbucketRepository> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1BitbucketRepository.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1BitbucketRepository>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1BitbucketRepository value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1BitbucketRepository read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1BitbucketRepository given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1BitbucketRepository
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1BitbucketRepository
   */
  public static IoArgoprojEventsV1alpha1BitbucketRepository fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1BitbucketRepository.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1BitbucketRepository to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

