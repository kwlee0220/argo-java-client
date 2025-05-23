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
import org.openapitools.client.model.IoK8sApiCoreV1PodAffinityTerm;

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
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1WeightedPodAffinityTerm {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  @javax.annotation.Nonnull
  private IoK8sApiCoreV1PodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  @javax.annotation.Nonnull
  private Integer weight;

  public IoK8sApiCoreV1WeightedPodAffinityTerm() {
  }

  public IoK8sApiCoreV1WeightedPodAffinityTerm podAffinityTerm(@javax.annotation.Nonnull IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

  /**
   * Get podAffinityTerm
   * @return podAffinityTerm
   */
  @javax.annotation.Nonnull
  public IoK8sApiCoreV1PodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }

  public void setPodAffinityTerm(@javax.annotation.Nonnull IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public IoK8sApiCoreV1WeightedPodAffinityTerm weight(@javax.annotation.Nonnull Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
   */
  @javax.annotation.Nonnull
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(@javax.annotation.Nonnull Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1WeightedPodAffinityTerm ioK8sApiCoreV1WeightedPodAffinityTerm = (IoK8sApiCoreV1WeightedPodAffinityTerm) o;
    return Objects.equals(this.podAffinityTerm, ioK8sApiCoreV1WeightedPodAffinityTerm.podAffinityTerm) &&
        Objects.equals(this.weight, ioK8sApiCoreV1WeightedPodAffinityTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1WeightedPodAffinityTerm {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("podAffinityTerm");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("podAffinityTerm");
    openapiRequiredFields.add("weight");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1WeightedPodAffinityTerm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1WeightedPodAffinityTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1WeightedPodAffinityTerm is not found in the empty JSON string", IoK8sApiCoreV1WeightedPodAffinityTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1WeightedPodAffinityTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1WeightedPodAffinityTerm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IoK8sApiCoreV1WeightedPodAffinityTerm.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `podAffinityTerm`
      IoK8sApiCoreV1PodAffinityTerm.validateJsonElement(jsonObj.get("podAffinityTerm"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1WeightedPodAffinityTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1WeightedPodAffinityTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1WeightedPodAffinityTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1WeightedPodAffinityTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1WeightedPodAffinityTerm>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1WeightedPodAffinityTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1WeightedPodAffinityTerm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1WeightedPodAffinityTerm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1WeightedPodAffinityTerm
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1WeightedPodAffinityTerm
   */
  public static IoK8sApiCoreV1WeightedPodAffinityTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1WeightedPodAffinityTerm.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1WeightedPodAffinityTerm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

