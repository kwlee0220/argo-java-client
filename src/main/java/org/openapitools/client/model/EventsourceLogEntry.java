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
import java.time.OffsetDateTime;
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
 * EventsourceLogEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class EventsourceLogEntry {
  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  @javax.annotation.Nullable
  private String eventName;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_NAME = "eventSourceName";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_NAME)
  @javax.annotation.Nullable
  private String eventSourceName;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_TYPE = "eventSourceType";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_TYPE)
  @javax.annotation.Nullable
  private String eventSourceType;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  @javax.annotation.Nullable
  private String level;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  @javax.annotation.Nullable
  private String msg;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime time;

  public EventsourceLogEntry() {
  }

  public EventsourceLogEntry eventName(@javax.annotation.Nullable String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
   */
  @javax.annotation.Nullable
  public String getEventName() {
    return eventName;
  }

  public void setEventName(@javax.annotation.Nullable String eventName) {
    this.eventName = eventName;
  }


  public EventsourceLogEntry eventSourceName(@javax.annotation.Nullable String eventSourceName) {
    this.eventSourceName = eventSourceName;
    return this;
  }

  /**
   * Get eventSourceName
   * @return eventSourceName
   */
  @javax.annotation.Nullable
  public String getEventSourceName() {
    return eventSourceName;
  }

  public void setEventSourceName(@javax.annotation.Nullable String eventSourceName) {
    this.eventSourceName = eventSourceName;
  }


  public EventsourceLogEntry eventSourceType(@javax.annotation.Nullable String eventSourceType) {
    this.eventSourceType = eventSourceType;
    return this;
  }

  /**
   * Get eventSourceType
   * @return eventSourceType
   */
  @javax.annotation.Nullable
  public String getEventSourceType() {
    return eventSourceType;
  }

  public void setEventSourceType(@javax.annotation.Nullable String eventSourceType) {
    this.eventSourceType = eventSourceType;
  }


  public EventsourceLogEntry level(@javax.annotation.Nullable String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @javax.annotation.Nullable
  public String getLevel() {
    return level;
  }

  public void setLevel(@javax.annotation.Nullable String level) {
    this.level = level;
  }


  public EventsourceLogEntry msg(@javax.annotation.Nullable String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   */
  @javax.annotation.Nullable
  public String getMsg() {
    return msg;
  }

  public void setMsg(@javax.annotation.Nullable String msg) {
    this.msg = msg;
  }


  public EventsourceLogEntry namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public EventsourceLogEntry time(@javax.annotation.Nullable OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return time
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(@javax.annotation.Nullable OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsourceLogEntry eventsourceLogEntry = (EventsourceLogEntry) o;
    return Objects.equals(this.eventName, eventsourceLogEntry.eventName) &&
        Objects.equals(this.eventSourceName, eventsourceLogEntry.eventSourceName) &&
        Objects.equals(this.eventSourceType, eventsourceLogEntry.eventSourceType) &&
        Objects.equals(this.level, eventsourceLogEntry.level) &&
        Objects.equals(this.msg, eventsourceLogEntry.msg) &&
        Objects.equals(this.namespace, eventsourceLogEntry.namespace) &&
        Objects.equals(this.time, eventsourceLogEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, eventSourceName, eventSourceType, level, msg, namespace, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsourceLogEntry {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
    sb.append("    eventSourceType: ").append(toIndentedString(eventSourceType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("eventName");
    openapiFields.add("eventSourceName");
    openapiFields.add("eventSourceType");
    openapiFields.add("level");
    openapiFields.add("msg");
    openapiFields.add("namespace");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventsourceLogEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventsourceLogEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventsourceLogEntry is not found in the empty JSON string", EventsourceLogEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventsourceLogEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventsourceLogEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonNull()) && !jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      if ((jsonObj.get("eventSourceName") != null && !jsonObj.get("eventSourceName").isJsonNull()) && !jsonObj.get("eventSourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventSourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventSourceName").toString()));
      }
      if ((jsonObj.get("eventSourceType") != null && !jsonObj.get("eventSourceType").isJsonNull()) && !jsonObj.get("eventSourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventSourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventSourceType").toString()));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if ((jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonNull()) && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventsourceLogEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventsourceLogEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventsourceLogEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventsourceLogEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<EventsourceLogEntry>() {
           @Override
           public void write(JsonWriter out, EventsourceLogEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventsourceLogEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventsourceLogEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventsourceLogEntry
   * @throws IOException if the JSON string is invalid with respect to EventsourceLogEntry
   */
  public static EventsourceLogEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventsourceLogEntry.class);
  }

  /**
   * Convert an instance of EventsourceLogEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

