package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1RBDPersistentVolumeSourceFluentImpl<A extends V1RBDPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1RBDPersistentVolumeSourceFluent<A>{
  public V1RBDPersistentVolumeSourceFluentImpl() {
  }
  public V1RBDPersistentVolumeSourceFluentImpl(V1RBDPersistentVolumeSource instance) {
    if (instance != null) {
      this.withFsType(instance.getFsType());
      this.withImage(instance.getImage());
      this.withKeyring(instance.getKeyring());
      this.withMonitors(instance.getMonitors());
      this.withPool(instance.getPool());
      this.withReadOnly(instance.getReadOnly());
      this.withSecretRef(instance.getSecretRef());
      this.withUser(instance.getUser());
    }
  }
  private String fsType;
  private String image;
  private String keyring;
  private List<String> monitors;
  private String pool;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  private String user;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getImage() {
    return this.image;
  }
  public A withImage(String image) {
    this.image=image; return (A) this;
  }
  public Boolean hasImage() {
    return this.image != null;
  }
  public String getKeyring() {
    return this.keyring;
  }
  public A withKeyring(String keyring) {
    this.keyring=keyring; return (A) this;
  }
  public Boolean hasKeyring() {
    return this.keyring != null;
  }
  public A addToMonitors(int index,String item) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    this.monitors.add(index, item);
    return (A)this;
  }
  public A setToMonitors(int index,String item) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    this.monitors.set(index, item); return (A)this;
  }
  public A addToMonitors(java.lang.String... items) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    for (String item : items) {this.monitors.add(item);} return (A)this;
  }
  public A addAllToMonitors(Collection<String> items) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    for (String item : items) {this.monitors.add(item);} return (A)this;
  }
  public A removeFromMonitors(java.lang.String... items) {
    for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
  }
  public A removeAllFromMonitors(Collection<String> items) {
    for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
  }
  public List<String> getMonitors() {
    return this.monitors;
  }
  public String getMonitor(int index) {
    return this.monitors.get(index);
  }
  public String getFirstMonitor() {
    return this.monitors.get(0);
  }
  public String getLastMonitor() {
    return this.monitors.get(monitors.size() - 1);
  }
  public String getMatchingMonitor(Predicate<String> predicate) {
    for (String item: monitors) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingMonitor(Predicate<String> predicate) {
    for (String item: monitors) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMonitors(List<String> monitors) {
    if (monitors != null) {this.monitors = new ArrayList(); for (String item : monitors){this.addToMonitors(item);}} else { this.monitors = null;} return (A) this;
  }
  public A withMonitors(java.lang.String... monitors) {
    if (this.monitors != null) {this.monitors.clear(); _visitables.remove("monitors"); }
    if (monitors != null) {for (String item :monitors){ this.addToMonitors(item);}} return (A) this;
  }
  public Boolean hasMonitors() {
    return monitors != null && !monitors.isEmpty();
  }
  public String getPool() {
    return this.pool;
  }
  public A withPool(String pool) {
    this.pool=pool; return (A) this;
  }
  public Boolean hasPool() {
    return this.pool != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1SecretReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1SecretReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRef() {
    return new V1RBDPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new V1RBDPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getUser() {
    return this.user;
  }
  public A withUser(String user) {
    this.user=user; return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RBDPersistentVolumeSourceFluentImpl that = (V1RBDPersistentVolumeSourceFluentImpl) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;

    if (!java.util.Objects.equals(image, that.image)) return false;

    if (!java.util.Objects.equals(keyring, that.keyring)) return false;

    if (!java.util.Objects.equals(monitors, that.monitors)) return false;

    if (!java.util.Objects.equals(pool, that.pool)) return false;

    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;

    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;

    if (!java.util.Objects.equals(user, that.user)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  image,  keyring,  monitors,  pool,  readOnly,  secretRef,  user,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (keyring != null) { sb.append("keyring:"); sb.append(keyring + ","); }
    if (monitors != null && !monitors.isEmpty()) { sb.append("monitors:"); sb.append(monitors + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class SecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<N>> implements V1RBDPersistentVolumeSourceFluentImpl.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1RBDPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}