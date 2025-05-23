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
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1OAuth2EndpointParam;
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
 * OAuth2Auth holds all information for client authentication via OAuth2 tokens
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T03:51:41.763920791Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class IoArgoprojWorkflowV1alpha1OAuth2Auth {
  public static final String SERIALIZED_NAME_CLIENT_I_D_SECRET = "clientIDSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector clientIDSecret;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_SECRET = "clientSecretSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector clientSecretSecret;

  public static final String SERIALIZED_NAME_ENDPOINT_PARAMS = "endpointParams";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_PARAMS)
  @javax.annotation.Nullable
  private List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  @javax.annotation.Nullable
  private List<String> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_U_R_L_SECRET = "tokenURLSecret";
  @SerializedName(SERIALIZED_NAME_TOKEN_U_R_L_SECRET)
  @javax.annotation.Nullable
  private IoK8sApiCoreV1SecretKeySelector tokenURLSecret;

  public IoArgoprojWorkflowV1alpha1OAuth2Auth() {
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth clientIDSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector clientIDSecret) {
    this.clientIDSecret = clientIDSecret;
    return this;
  }

  /**
   * Get clientIDSecret
   * @return clientIDSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getClientIDSecret() {
    return clientIDSecret;
  }

  public void setClientIDSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector clientIDSecret) {
    this.clientIDSecret = clientIDSecret;
  }


  public IoArgoprojWorkflowV1alpha1OAuth2Auth clientSecretSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector clientSecretSecret) {
    this.clientSecretSecret = clientSecretSecret;
    return this;
  }

  /**
   * Get clientSecretSecret
   * @return clientSecretSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getClientSecretSecret() {
    return clientSecretSecret;
  }

  public void setClientSecretSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector clientSecretSecret) {
    this.clientSecretSecret = clientSecretSecret;
  }


  public IoArgoprojWorkflowV1alpha1OAuth2Auth endpointParams(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams) {
    this.endpointParams = endpointParams;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth addEndpointParamsItem(IoArgoprojWorkflowV1alpha1OAuth2EndpointParam endpointParamsItem) {
    if (this.endpointParams == null) {
      this.endpointParams = new ArrayList<>();
    }
    this.endpointParams.add(endpointParamsItem);
    return this;
  }

  /**
   * Get endpointParams
   * @return endpointParams
   */
  @javax.annotation.Nullable
  public List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> getEndpointParams() {
    return endpointParams;
  }

  public void setEndpointParams(@javax.annotation.Nullable List<IoArgoprojWorkflowV1alpha1OAuth2EndpointParam> endpointParams) {
    this.endpointParams = endpointParams;
  }


  public IoArgoprojWorkflowV1alpha1OAuth2Auth scopes(@javax.annotation.Nullable List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1OAuth2Auth addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @javax.annotation.Nullable
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(@javax.annotation.Nullable List<String> scopes) {
    this.scopes = scopes;
  }


  public IoArgoprojWorkflowV1alpha1OAuth2Auth tokenURLSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector tokenURLSecret) {
    this.tokenURLSecret = tokenURLSecret;
    return this;
  }

  /**
   * Get tokenURLSecret
   * @return tokenURLSecret
   */
  @javax.annotation.Nullable
  public IoK8sApiCoreV1SecretKeySelector getTokenURLSecret() {
    return tokenURLSecret;
  }

  public void setTokenURLSecret(@javax.annotation.Nullable IoK8sApiCoreV1SecretKeySelector tokenURLSecret) {
    this.tokenURLSecret = tokenURLSecret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1OAuth2Auth ioArgoprojWorkflowV1alpha1OAuth2Auth = (IoArgoprojWorkflowV1alpha1OAuth2Auth) o;
    return Objects.equals(this.clientIDSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientIDSecret) &&
        Objects.equals(this.clientSecretSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientSecretSecret) &&
        Objects.equals(this.endpointParams, ioArgoprojWorkflowV1alpha1OAuth2Auth.endpointParams) &&
        Objects.equals(this.scopes, ioArgoprojWorkflowV1alpha1OAuth2Auth.scopes) &&
        Objects.equals(this.tokenURLSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.tokenURLSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIDSecret, clientSecretSecret, endpointParams, scopes, tokenURLSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1OAuth2Auth {\n");
    sb.append("    clientIDSecret: ").append(toIndentedString(clientIDSecret)).append("\n");
    sb.append("    clientSecretSecret: ").append(toIndentedString(clientSecretSecret)).append("\n");
    sb.append("    endpointParams: ").append(toIndentedString(endpointParams)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    tokenURLSecret: ").append(toIndentedString(tokenURLSecret)).append("\n");
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
    openapiFields.add("clientIDSecret");
    openapiFields.add("clientSecretSecret");
    openapiFields.add("endpointParams");
    openapiFields.add("scopes");
    openapiFields.add("tokenURLSecret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IoArgoprojWorkflowV1alpha1OAuth2Auth
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IoArgoprojWorkflowV1alpha1OAuth2Auth.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IoArgoprojWorkflowV1alpha1OAuth2Auth is not found in the empty JSON string", IoArgoprojWorkflowV1alpha1OAuth2Auth.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IoArgoprojWorkflowV1alpha1OAuth2Auth.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IoArgoprojWorkflowV1alpha1OAuth2Auth` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `clientIDSecret`
      if (jsonObj.get("clientIDSecret") != null && !jsonObj.get("clientIDSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("clientIDSecret"));
      }
      // validate the optional field `clientSecretSecret`
      if (jsonObj.get("clientSecretSecret") != null && !jsonObj.get("clientSecretSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("clientSecretSecret"));
      }
      if (jsonObj.get("endpointParams") != null && !jsonObj.get("endpointParams").isJsonNull()) {
        JsonArray jsonArrayendpointParams = jsonObj.getAsJsonArray("endpointParams");
        if (jsonArrayendpointParams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpointParams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpointParams` to be an array in the JSON string but got `%s`", jsonObj.get("endpointParams").toString()));
          }

          // validate the optional field `endpointParams` (array)
          for (int i = 0; i < jsonArrayendpointParams.size(); i++) {
            IoArgoprojWorkflowV1alpha1OAuth2EndpointParam.validateJsonElement(jsonArrayendpointParams.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull() && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      // validate the optional field `tokenURLSecret`
      if (jsonObj.get("tokenURLSecret") != null && !jsonObj.get("tokenURLSecret").isJsonNull()) {
        IoK8sApiCoreV1SecretKeySelector.validateJsonElement(jsonObj.get("tokenURLSecret"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IoArgoprojWorkflowV1alpha1OAuth2Auth.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IoArgoprojWorkflowV1alpha1OAuth2Auth' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IoArgoprojWorkflowV1alpha1OAuth2Auth> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IoArgoprojWorkflowV1alpha1OAuth2Auth.class));

       return (TypeAdapter<T>) new TypeAdapter<IoArgoprojWorkflowV1alpha1OAuth2Auth>() {
           @Override
           public void write(JsonWriter out, IoArgoprojWorkflowV1alpha1OAuth2Auth value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IoArgoprojWorkflowV1alpha1OAuth2Auth read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IoArgoprojWorkflowV1alpha1OAuth2Auth given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IoArgoprojWorkflowV1alpha1OAuth2Auth
   * @throws IOException if the JSON string is invalid with respect to IoArgoprojWorkflowV1alpha1OAuth2Auth
   */
  public static IoArgoprojWorkflowV1alpha1OAuth2Auth fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IoArgoprojWorkflowV1alpha1OAuth2Auth.class);
  }

  /**
   * Convert an instance of IoArgoprojWorkflowV1alpha1OAuth2Auth to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

