
package io.fabric8.openshift.api.model.operator.v1alpha1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.fabric8.openshift.api.model.config.v1.HTTPServingInfo;
import io.fabric8.openshift.api.model.config.v1.LeaderElection;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.transform.annotations.TemplateTransformation;
import io.sundr.transform.annotations.TemplateTransformations;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "authentication",
    "authorization",
    "leaderElection",
    "servingInfo"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@TemplateTransformations({
    @TemplateTransformation(value = "/manifest.vm", outputPath = "META-INF/services/io.fabric8.kubernetes.api.model.KubernetesResource", gather = true)
})
@Version("v1alpha1")
@Group("operator.openshift.io")
@Generated("jsonschema2pojo")
public class GenericOperatorConfig implements Editable<GenericOperatorConfigBuilder> , KubernetesResource, Namespaced
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    private String apiVersion = "operator.openshift.io/v1alpha1";
    @JsonProperty("authentication")
    private DelegatedAuthentication authentication;
    @JsonProperty("authorization")
    private DelegatedAuthorization authorization;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    private String kind = "GenericOperatorConfig";
    @JsonProperty("leaderElection")
    private LeaderElection leaderElection;
    @JsonProperty("servingInfo")
    private HTTPServingInfo servingInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GenericOperatorConfig() {
    }

    public GenericOperatorConfig(String apiVersion, DelegatedAuthentication authentication, DelegatedAuthorization authorization, String kind, LeaderElection leaderElection, HTTPServingInfo servingInfo) {
        super();
        this.apiVersion = apiVersion;
        this.authentication = authentication;
        this.authorization = authorization;
        this.kind = kind;
        this.leaderElection = leaderElection;
        this.servingInfo = servingInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("authentication")
    public DelegatedAuthentication getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(DelegatedAuthentication authentication) {
        this.authentication = authentication;
    }

    @JsonProperty("authorization")
    public DelegatedAuthorization getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(DelegatedAuthorization authorization) {
        this.authorization = authorization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("leaderElection")
    public LeaderElection getLeaderElection() {
        return leaderElection;
    }

    @JsonProperty("leaderElection")
    public void setLeaderElection(LeaderElection leaderElection) {
        this.leaderElection = leaderElection;
    }

    @JsonProperty("servingInfo")
    public HTTPServingInfo getServingInfo() {
        return servingInfo;
    }

    @JsonProperty("servingInfo")
    public void setServingInfo(HTTPServingInfo servingInfo) {
        this.servingInfo = servingInfo;
    }

    @JsonIgnore
    public GenericOperatorConfigBuilder edit() {
        return new GenericOperatorConfigBuilder(this);
    }

    @JsonIgnore
    public GenericOperatorConfigBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}