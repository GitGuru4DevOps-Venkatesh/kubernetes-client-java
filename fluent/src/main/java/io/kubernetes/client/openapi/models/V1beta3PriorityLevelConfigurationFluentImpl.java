package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta3PriorityLevelConfigurationFluentImpl<A extends V1beta3PriorityLevelConfigurationFluent<A>> extends BaseFluent<A> implements V1beta3PriorityLevelConfigurationFluent<A>{
  public V1beta3PriorityLevelConfigurationFluentImpl() {
  }
  public V1beta3PriorityLevelConfigurationFluentImpl(V1beta3PriorityLevelConfiguration instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1beta3PriorityLevelConfigurationSpecBuilder spec;
  private V1beta3PriorityLevelConfigurationStatusBuilder status;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1beta3PriorityLevelConfigurationFluentImpl.MetadataNestedImpl();
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1beta3PriorityLevelConfigurationFluentImpl.MetadataNestedImpl(item);
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3PriorityLevelConfigurationSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1beta3PriorityLevelConfigurationSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1beta3PriorityLevelConfigurationSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1beta3PriorityLevelConfigurationSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<A> withNewSpec() {
    return new V1beta3PriorityLevelConfigurationFluentImpl.SpecNestedImpl();
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<A> withNewSpecLike(V1beta3PriorityLevelConfigurationSpec item) {
    return new V1beta3PriorityLevelConfigurationFluentImpl.SpecNestedImpl(item);
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1beta3PriorityLevelConfigurationSpecBuilder().build());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<A> editOrNewSpecLike(V1beta3PriorityLevelConfigurationSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3PriorityLevelConfigurationStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1beta3PriorityLevelConfigurationStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1beta3PriorityLevelConfigurationStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1beta3PriorityLevelConfigurationStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<A> withNewStatus() {
    return new V1beta3PriorityLevelConfigurationFluentImpl.StatusNestedImpl();
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<A> withNewStatusLike(V1beta3PriorityLevelConfigurationStatus item) {
    return new V1beta3PriorityLevelConfigurationFluentImpl.StatusNestedImpl(item);
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1beta3PriorityLevelConfigurationStatusBuilder().build());
  }
  public V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<A> editOrNewStatusLike(V1beta3PriorityLevelConfigurationStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3PriorityLevelConfigurationFluentImpl that = (V1beta3PriorityLevelConfigurationFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    if (!java.util.Objects.equals(status, that.status)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<N>> implements V1beta3PriorityLevelConfigurationFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1beta3PriorityLevelConfigurationSpecFluentImpl<V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<N>> implements V1beta3PriorityLevelConfigurationFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1beta3PriorityLevelConfigurationSpec item) {
      this.builder = new V1beta3PriorityLevelConfigurationSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1beta3PriorityLevelConfigurationSpecBuilder(this);
    }
    V1beta3PriorityLevelConfigurationSpecBuilder builder;
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1beta3PriorityLevelConfigurationStatusFluentImpl<V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<N>> implements V1beta3PriorityLevelConfigurationFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1beta3PriorityLevelConfigurationStatus item) {
      this.builder = new V1beta3PriorityLevelConfigurationStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1beta3PriorityLevelConfigurationStatusBuilder(this);
    }
    V1beta3PriorityLevelConfigurationStatusBuilder builder;
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}