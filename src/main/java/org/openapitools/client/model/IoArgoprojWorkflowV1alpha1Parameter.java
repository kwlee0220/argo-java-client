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
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1ValueFrom;

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
 * Parameter indicate a passed string parameter to a service template with an optional default value
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1Parameter {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @javax.annotation.Nullable
  private String _default;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ENUM = "enum";
  @SerializedName(SERIALIZED_NAME_ENUM)
  @javax.annotation.Nullable
  private List<String> _enum = new ArrayList<>();

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  @javax.annotation.Nullable
  private String globalName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  @javax.annotation.Nullable
  private IoArgoprojWorkflowV1alpha1ValueFrom valueFrom;

  public IoArgoprojWorkflowV1alpha1Parameter() {
  }

  public IoArgoprojWorkflowV1alpha1Parameter _default(@javax.annotation.Nullable String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Default is the default value to use for an input parameter if a value was not supplied
   * @return _default
   */
  @javax.annotation.Nullable
  public String getDefault() {
    return _default;
  }

  public void setDefault(@javax.annotation.Nullable String _default) {
    this._default = _default;
  }


  public IoArgoprojWorkflowV1alpha1Parameter description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description is the parameter description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public IoArgoprojWorkflowV1alpha1Parameter _enum(@javax.annotation.Nullable List<String> _enum) {
    this._enum = _enum;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Parameter addEnumItem(String _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

  /**
   * Enum holds a list of string values to choose from, for the actual value of the parameter
   * @return _enum
   */
  @javax.annotation.Nullable
  public List<String> getEnum() {
    return _enum;
  }

  public void setEnum(@javax.annotation.Nullable List<String> _enum) {
    this._enum = _enum;
  }


  public IoArgoprojWorkflowV1alpha1Parameter globalName(@javax.annotation.Nullable String globalName) {
    this.globalName = globalName;
    return this;
  }

  /**
   * GlobalName exports an output parameter to the global scope, making it available as &#39;{{io.argoproj.workflow.v1alpha1.outputs.parameters.XXXX}} and in workflow.status.outputs.parameters
   * @return globalName
   */
  @javax.annotation.Nullable
  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(@javax.annotation.Nullable String globalName) {
    this.globalName = globalName;
  }


  public IoArgoprojWorkflowV1alpha1Parameter name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the parameter name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public IoArgoprojWorkflowV1alpha1Parameter value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }


  public IoArgoprojWorkflowV1alpha1Parameter valueFrom(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1ValueFrom valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * Get valueFrom
   * @return valueFrom
   */
  @javax.annotation.Nullable
  public IoArgoprojWorkflowV1alpha1ValueFrom getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(@javax.annotation.Nullable IoArgoprojWorkflowV1alpha1ValueFrom valueFrom) {
    this.valueFrom = valueFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Parameter ioArgoprojWorkflowV1alpha1Parameter = (IoArgoprojWorkflowV1alpha1Parameter) o;
    return Objects.equals(this._default, ioArgoprojWorkflowV1alpha1Parameter._default) &&
        Objects.equals(this.description, ioArgoprojWorkflowV1alpha1Parameter.description) &&
        Objects.equals(this._enum, ioArgoprojWorkflowV1alpha1Parameter._enum) &&
        Objects.equals(this.globalName, ioArgoprojWorkflowV1alpha1Parameter.globalName) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Parameter.name) &&
        Objects.equals(this.value, ioArgoprojWorkflowV1alpha1Parameter.value) &&
        Objects.equals(this.valueFrom, ioArgoprojWorkflowV1alpha1Parameter.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, description, _enum, globalName, name, value, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Parameter {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("description");
    openapiFields.add("enum");
    openapiFields.add("globalName");
    openapiFields.add("name");
    openapiFields.add("value");
    openapiFields.add("valueFrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1Parameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1Parameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1Parameter is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1Parameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1Parameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1Parameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IoArgoprojWorkflowV1alpha1Parameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default") != null && !jsonObj.get("default").isJsonNull()) && !jsonObj.get("default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enum") != null && !jsonObj.get("enum").isJsonNull() && !jsonObj.get("enum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum` to be an array in the JSON string but got `%s`", jsonObj.get("enum").toString()));
      }
      if ((jsonObj.get("globalName") != null && !jsonObj.get("globalName").isJsonNull()) && !jsonObj.get("globalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // validate the optional field `valueFrom`
      if (jsonObj.get("valueFrom") != null && !jsonObj.get("valueFrom").isJsonNull()) {
        IoArgoprojWorkflowV1alpha1ValueFrom.validateJsonElement(jsonObj.get("valueFrom"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1Parameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1Parameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1Parameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1Parameter.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1Parameter>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1Parameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1Parameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1Parameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1Parameter
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1Parameter
   */
  public static IoArgoprojWorkflowV1alpha1Parameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1Parameter.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1Parameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

