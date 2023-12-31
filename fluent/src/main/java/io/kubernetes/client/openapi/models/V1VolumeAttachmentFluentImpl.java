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
  public class V1VolumeAttachmentFluentImpl<A extends V1VolumeAttachmentFluent<A>> extends BaseFluent<A> implements V1VolumeAttachmentFluent<A>{
  public V1VolumeAttachmentFluentImpl() {
  }
  public V1VolumeAttachmentFluentImpl(V1VolumeAttachment instance) {
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
  private V1VolumeAttachmentSpecBuilder spec;
  private V1VolumeAttachmentStatusBuilder status;
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
  public V1VolumeAttachmentFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1VolumeAttachmentFluentImpl.MetadataNestedImpl();
  }
  public V1VolumeAttachmentFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1VolumeAttachmentFluentImpl.MetadataNestedImpl(item);
  }
  public V1VolumeAttachmentFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1VolumeAttachmentFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1VolumeAttachmentFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1VolumeAttachmentSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1VolumeAttachmentSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1VolumeAttachmentSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1VolumeAttachmentFluentImpl.SpecNested<A> withNewSpec() {
    return new V1VolumeAttachmentFluentImpl.SpecNestedImpl();
  }
  public V1VolumeAttachmentFluentImpl.SpecNested<A> withNewSpecLike(V1VolumeAttachmentSpec item) {
    return new V1VolumeAttachmentFluentImpl.SpecNestedImpl(item);
  }
  public V1VolumeAttachmentFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1VolumeAttachmentFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1VolumeAttachmentSpecBuilder().build());
  }
  public V1VolumeAttachmentFluentImpl.SpecNested<A> editOrNewSpecLike(V1VolumeAttachmentSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1VolumeAttachmentStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1VolumeAttachmentStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1VolumeAttachmentStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1VolumeAttachmentFluentImpl.StatusNested<A> withNewStatus() {
    return new V1VolumeAttachmentFluentImpl.StatusNestedImpl();
  }
  public V1VolumeAttachmentFluentImpl.StatusNested<A> withNewStatusLike(V1VolumeAttachmentStatus item) {
    return new V1VolumeAttachmentFluentImpl.StatusNestedImpl(item);
  }
  public V1VolumeAttachmentFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1VolumeAttachmentFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1VolumeAttachmentStatusBuilder().build());
  }
  public V1VolumeAttachmentFluentImpl.StatusNested<A> editOrNewStatusLike(V1VolumeAttachmentStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeAttachmentFluentImpl that = (V1VolumeAttachmentFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1VolumeAttachmentFluentImpl.MetadataNested<N>> implements V1VolumeAttachmentFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1VolumeAttachmentSpecFluentImpl<V1VolumeAttachmentFluentImpl.SpecNested<N>> implements V1VolumeAttachmentFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1VolumeAttachmentSpec item) {
      this.builder = new V1VolumeAttachmentSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1VolumeAttachmentSpecBuilder(this);
    }
    V1VolumeAttachmentSpecBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1VolumeAttachmentStatusFluentImpl<V1VolumeAttachmentFluentImpl.StatusNested<N>> implements V1VolumeAttachmentFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1VolumeAttachmentStatus item) {
      this.builder = new V1VolumeAttachmentStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1VolumeAttachmentStatusBuilder(this);
    }
    V1VolumeAttachmentStatusBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}