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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1Backoff;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1TLSConfig;
import org.openapitools.client.model.IoArgoprojEventsV1alpha1TriggerParameter;
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
 * PulsarTrigger refers to the specification of the Pulsar trigger.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojEventsV1alpha1PulsarTrigger {
  public static final String SERIALIZED_NAME_AUTH_ATHENZ_PARAMS = "authAthenzParams";
  @SerializedName(SERIALIZED_NAME_AUTH_ATHENZ_PARAMS)
  @javax.annotation.Nullable
  private Map<String, String> authAthenzParams = new HashMap<>();

  public static final String SERIALIZED_NAME_AUTH_ATHENZ_SECRET = "authAthenzSecret";
  @SerializedName(SERIALIZED_NAME_AUTH_ATHENZ_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector authAthenzSecret;

  public static final String SERIALIZED_NAME_AUTH_TOKEN_SECRET = "authTokenSecret";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector authTokenSecret;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1Backoff connectionBackoff;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  @javax.annotation.Nullable
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = new ArrayList<>();

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  @javax.annotation.Nullable
  private IoArgoprojEventsV1alpha1TLSConfig tls;

  public static final String SERIALIZED_NAME_TLS_ALLOW_INSECURE_CONNECTION = "tlsAllowInsecureConnection";
  @SerializedName(SERIALIZED_NAME_TLS_ALLOW_INSECURE_CONNECTION)
  @javax.annotation.Nullable
  private Boolean tlsAllowInsecureConnection;

  public static final String SERIALIZED_NAME_TLS_TRUST_CERTS_SECRET = "tlsTrustCertsSecret";
  @SerializedName(SERIALIZED_NAME_TLS_TRUST_CERTS_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret;

  public static final String SERIALIZED_NAME_TLS_VALIDATE_HOSTNAME = "tlsValidateHostname";
  @SerializedName(SERIALIZED_NAME_TLS_VALIDATE_HOSTNAME)
  @javax.annotation.Nullable
  private Boolean tlsValidateHostname;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  @javax.annotation.Nullable
  private String topic;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public IoArgoprojEventsV1alpha1PulsarTrigger() {
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger authAthenzParams(@javax.annotation.Nullable Map<String, String> authAthenzParams) {
    this.authAthenzParams = authAthenzParams;
    return this;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger putAuthAthenzParamsItem(String key, String authAthenzParamsItem) {
    if (this.authAthenzParams == null) {
      this.authAthenzParams = new HashMap<>();
    }
    this.authAthenzParams.put(key, authAthenzParamsItem);
    return this;
  }

  /**
   * Get authAthenzParams
   * @return authAthenzParams
   */
  @javax.annotation.Nullable
  public Map<String, String> getAuthAthenzParams() {
    return authAthenzParams;
  }

  public void setAuthAthenzParams(@javax.annotation.Nullable Map<String, String> authAthenzParams) {
    this.authAthenzParams = authAthenzParams;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger authAthenzSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector authAthenzSecret) {
    this.authAthenzSecret = authAthenzSecret;
    return this;
  }

  /**
   * Get authAthenzSecret
   * @return authAthenzSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getAuthAthenzSecret() {
    return authAthenzSecret;
  }

  public void setAuthAthenzSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector authAthenzSecret) {
    this.authAthenzSecret = authAthenzSecret;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger authTokenSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector authTokenSecret) {
    this.authTokenSecret = authTokenSecret;
    return this;
  }

  /**
   * Get authTokenSecret
   * @return authTokenSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getAuthTokenSecret() {
    return authTokenSecret;
  }

  public void setAuthTokenSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector authTokenSecret) {
    this.authTokenSecret = authTokenSecret;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger connectionBackoff(@javax.annotation.Nullable IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
    return this;
  }

  /**
   * Get connectionBackoff
   * @return connectionBackoff
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1Backoff getConnectionBackoff() {
    return connectionBackoff;
  }

  public void setConnectionBackoff(@javax.annotation.Nullable IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger parameters(@javax.annotation.Nullable List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
   * @return parameters
   */
  @javax.annotation.Nullable
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }

  public void setParameters(@javax.annotation.Nullable List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger payload(@javax.annotation.Nullable List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1PulsarTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<>();
    }
    this.payload.add(payloadItem);
    return this;
  }

  /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
   */
  @javax.annotation.Nullable
  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger tls(@javax.annotation.Nullable IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
    return this;
  }

  /**
   * Get tls
   * @return tls
   */
  @javax.annotation.Nullable
  public IoArgoprojEventsV1alpha1TLSConfig getTls() {
    return tls;
  }

  public void setTls(@javax.annotation.Nullable IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger tlsAllowInsecureConnection(@javax.annotation.Nullable Boolean tlsAllowInsecureConnection) {
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
    return this;
  }

  /**
   * Get tlsAllowInsecureConnection
   * @return tlsAllowInsecureConnection
   */
  @javax.annotation.Nullable
  public Boolean getTlsAllowInsecureConnection() {
    return tlsAllowInsecureConnection;
  }

  public void setTlsAllowInsecureConnection(@javax.annotation.Nullable Boolean tlsAllowInsecureConnection) {
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger tlsTrustCertsSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret) {
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
    return this;
  }

  /**
   * Get tlsTrustCertsSecret
   * @return tlsTrustCertsSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getTlsTrustCertsSecret() {
    return tlsTrustCertsSecret;
  }

  public void setTlsTrustCertsSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector tlsTrustCertsSecret) {
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger tlsValidateHostname(@javax.annotation.Nullable Boolean tlsValidateHostname) {
    this.tlsValidateHostname = tlsValidateHostname;
    return this;
  }

  /**
   * Get tlsValidateHostname
   * @return tlsValidateHostname
   */
  @javax.annotation.Nullable
  public Boolean getTlsValidateHostname() {
    return tlsValidateHostname;
  }

  public void setTlsValidateHostname(@javax.annotation.Nullable Boolean tlsValidateHostname) {
    this.tlsValidateHostname = tlsValidateHostname;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger topic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
  }


  public IoArgoprojEventsV1alpha1PulsarTrigger url(@javax.annotation.Nullable String url) {
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
    IoArgoprojEventsV1alpha1PulsarTrigger ioArgoprojEventsV1alpha1PulsarTrigger = (IoArgoprojEventsV1alpha1PulsarTrigger) o;
    return Objects.equals(this.authAthenzParams, ioArgoprojEventsV1alpha1PulsarTrigger.authAthenzParams) &&
        Objects.equals(this.authAthenzSecret, ioArgoprojEventsV1alpha1PulsarTrigger.authAthenzSecret) &&
        Objects.equals(this.authTokenSecret, ioArgoprojEventsV1alpha1PulsarTrigger.authTokenSecret) &&
        Objects.equals(this.connectionBackoff, ioArgoprojEventsV1alpha1PulsarTrigger.connectionBackoff) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1PulsarTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1PulsarTrigger.payload) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1PulsarTrigger.tls) &&
        Objects.equals(this.tlsAllowInsecureConnection, ioArgoprojEventsV1alpha1PulsarTrigger.tlsAllowInsecureConnection) &&
        Objects.equals(this.tlsTrustCertsSecret, ioArgoprojEventsV1alpha1PulsarTrigger.tlsTrustCertsSecret) &&
        Objects.equals(this.tlsValidateHostname, ioArgoprojEventsV1alpha1PulsarTrigger.tlsValidateHostname) &&
        Objects.equals(this.topic, ioArgoprojEventsV1alpha1PulsarTrigger.topic) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1PulsarTrigger.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAthenzParams, authAthenzSecret, authTokenSecret, connectionBackoff, parameters, payload, tls, tlsAllowInsecureConnection, tlsTrustCertsSecret, tlsValidateHostname, topic, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1PulsarTrigger {\n");
    sb.append("    authAthenzParams: ").append(toIndentedString(authAthenzParams)).append("\n");
    sb.append("    authAthenzSecret: ").append(toIndentedString(authAthenzSecret)).append("\n");
    sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
    sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
    sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
    openapiFields.add("authAthenzParams");
    openapiFields.add("authAthenzSecret");
    openapiFields.add("authTokenSecret");
    openapiFields.add("connectionBackoff");
    openapiFields.add("parameters");
    openapiFields.add("payload");
    openapiFields.add("tls");
    openapiFields.add("tlsAllowInsecureConnection");
    openapiFields.add("tlsTrustCertsSecret");
    openapiFields.add("tlsValidateHostname");
    openapiFields.add("topic");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojEventsV1alpha1PulsarTrigger
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojEventsV1alpha1PulsarTrigger.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojEventsV1alpha1PulsarTrigger is not found in the empty JSON string", IoArgoprojEventsV1alpha1PulsarTrigger.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojEventsV1alpha1PulsarTrigger.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojEventsV1alpha1PulsarTrigger` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `authAthenzSecret`
      if (jsonObj.get("authAthenzSecret") != null && !jsonObj.get("authAthenzSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("authAthenzSecret"));
      }
      // validate the optional field `authTokenSecret`
      if (jsonObj.get("authTokenSecret") != null && !jsonObj.get("authTokenSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("authTokenSecret"));
      }
      // validate the optional field `connectionBackoff`
      if (jsonObj.get("connectionBackoff") != null && !jsonObj.get("connectionBackoff").isJsonNull()) {
        IoArgoprojEventsV1alpha1Backoff.validateJsonElement(jsonObj.get("connectionBackoff"));
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            IoArgoprojEventsV1alpha1TriggerParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        JsonArray jsonArraypayload = jsonObj.getAsJsonArray("payload");
        if (jsonArraypayload != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payload").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payload` to be an array in the JSON string but got `%s`", jsonObj.get("payload").toString()));
          }

          // validate the optional field `payload` (array)
          for (int i = 0; i < jsonArraypayload.size(); i++) {
            IoArgoprojEventsV1alpha1TriggerParameter.validateJsonElement(jsonArraypayload.get(i));
          };
        }
      }
      // validate the optional field `tls`
      if (jsonObj.get("tls") != null && !jsonObj.get("tls").isJsonNull()) {
        IoArgoprojEventsV1alpha1TLSConfig.validateJsonElement(jsonObj.get("tls"));
      }
      // validate the optional field `tlsTrustCertsSecret`
      if (jsonObj.get("tlsTrustCertsSecret") != null && !jsonObj.get("tlsTrustCertsSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("tlsTrustCertsSecret"));
      }
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojEventsV1alpha1PulsarTrigger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojEventsV1alpha1PulsarTrigger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojEventsV1alpha1PulsarTrigger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojEventsV1alpha1PulsarTrigger.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojEventsV1alpha1PulsarTrigger>() {
           @Override
           public void write(JsonWriter out, IoArgoprojEventsV1alpha1PulsarTrigger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojEventsV1alpha1PulsarTrigger read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojEventsV1alpha1PulsarTrigger given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojEventsV1alpha1PulsarTrigger
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojEventsV1alpha1PulsarTrigger
   */
  public static IoArgoprojEventsV1alpha1PulsarTrigger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojEventsV1alpha1PulsarTrigger.class);
  }

  /**
   * Convert an instance of IoArgoprojEventsV1alpha1PulsarTrigger to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

