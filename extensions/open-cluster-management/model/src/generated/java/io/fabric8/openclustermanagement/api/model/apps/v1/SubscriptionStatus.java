
package io.fabric8.openclustermanagement.api.model.apps.v1;

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
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ansiblejobs",
    "appstatusReference",
    "lastUpdateTime",
    "message",
    "phase",
    "reason",
    "statuses"
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
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("jsonschema2pojo")
public class SubscriptionStatus implements Editable<SubscriptionStatusBuilder> , KubernetesResource
{

    @JsonProperty("ansiblejobs")
    private AnsibleJobsStatus ansiblejobs;
    @JsonProperty("appstatusReference")
    private String appstatusReference;
    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;
    @JsonProperty("message")
    private String message;
    @JsonProperty("phase")
    private String phase;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("statuses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, SubscriptionPerClusterStatus> statuses = new LinkedHashMap<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubscriptionStatus() {
    }

    public SubscriptionStatus(AnsibleJobsStatus ansiblejobs, String appstatusReference, String lastUpdateTime, String message, String phase, String reason, Map<String, SubscriptionPerClusterStatus> statuses) {
        super();
        this.ansiblejobs = ansiblejobs;
        this.appstatusReference = appstatusReference;
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
        this.phase = phase;
        this.reason = reason;
        this.statuses = statuses;
    }

    @JsonProperty("ansiblejobs")
    public AnsibleJobsStatus getAnsiblejobs() {
        return ansiblejobs;
    }

    @JsonProperty("ansiblejobs")
    public void setAnsiblejobs(AnsibleJobsStatus ansiblejobs) {
        this.ansiblejobs = ansiblejobs;
    }

    @JsonProperty("appstatusReference")
    public String getAppstatusReference() {
        return appstatusReference;
    }

    @JsonProperty("appstatusReference")
    public void setAppstatusReference(String appstatusReference) {
        this.appstatusReference = appstatusReference;
    }

    @JsonProperty("lastUpdateTime")
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    @JsonProperty("lastUpdateTime")
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonProperty("statuses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, SubscriptionPerClusterStatus> getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(Map<String, SubscriptionPerClusterStatus> statuses) {
        this.statuses = statuses;
    }

    @JsonIgnore
    public SubscriptionStatusBuilder edit() {
        return new SubscriptionStatusBuilder(this);
    }

    @JsonIgnore
    public SubscriptionStatusBuilder toBuilder() {
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