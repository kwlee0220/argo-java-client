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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Adds and removes POSIX capabilities from running containers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoK8sApiCoreV1Capabilities {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  @javax.annotation.Nullable
  private List<String> add = new ArrayList<>();

  public static final String SERIALIZED_NAME_DROP = "drop";
  @SerializedName(SERIALIZED_NAME_DROP)
  @javax.annotation.Nullable
  private List<String> drop = new ArrayList<>();

  public IoK8sApiCoreV1Capabilities() {
  }

  public IoK8sApiCoreV1Capabilities add(@javax.annotation.Nullable List<String> add) {
    this.add = add;
    return this;
  }

  public IoK8sApiCoreV1Capabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * Added capabilities
   * @return add
   */
  @javax.annotation.Nullable
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(@javax.annotation.Nullable List<String> add) {
    this.add = add;
  }


  public IoK8sApiCoreV1Capabilities drop(@javax.annotation.Nullable List<String> drop) {
    this.drop = drop;
    return this;
  }

  public IoK8sApiCoreV1Capabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<>();
    }
    this.drop.add(dropItem);
    return this;
  }

  /**
   * Removed capabilities
   * @return drop
   */
  @javax.annotation.Nullable
  public List<String> getDrop() {
    return drop;
  }

  public void setDrop(@javax.annotation.Nullable List<String> drop) {
    this.drop = drop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Capabilities ioK8sApiCoreV1Capabilities = (IoK8sApiCoreV1Capabilities) o;
    return Objects.equals(this.add, ioK8sApiCoreV1Capabilities.add) &&
        Objects.equals(this.drop, ioK8sApiCoreV1Capabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Capabilities {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("drop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoK8sApiCoreV1Capabilities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoK8sApiCoreV1Capabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoK8sApiCoreV1Capabilities is not found in the empty JSON string", IoK8sApiCoreV1Capabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoK8sApiCoreV1Capabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoK8sApiCoreV1Capabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonNull() && !jsonObj.get("add").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("drop") != null && !jsonObj.get("drop").isJsonNull() && !jsonObj.get("drop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drop` to be an array in the JSON string but got `%s`", jsonObj.get("drop").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoK8sApiCoreV1Capabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoK8sApiCoreV1Capabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoK8sApiCoreV1Capabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoK8sApiCoreV1Capabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<IoK8sApiCoreV1Capabilities>() {
           @Override
           public void write(JsonWriter out, IoK8sApiCoreV1Capabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoK8sApiCoreV1Capabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoK8sApiCoreV1Capabilities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoK8sApiCoreV1Capabilities
   * @throws IOException if the JSON string is invalid with respect to IoK8sApiCoreV1Capabilities
   */
  public static IoK8sApiCoreV1Capabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoK8sApiCoreV1Capabilities.class);
  }

  /**
   * Convert an instance of IoK8sApiCoreV1Capabilities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

