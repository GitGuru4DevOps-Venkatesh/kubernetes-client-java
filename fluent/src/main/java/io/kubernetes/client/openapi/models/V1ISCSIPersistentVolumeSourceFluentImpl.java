package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
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
  public class V1ISCSIPersistentVolumeSourceFluentImpl<A extends V1ISCSIPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1ISCSIPersistentVolumeSourceFluent<A>{
  public V1ISCSIPersistentVolumeSourceFluentImpl() {
  }
  public V1ISCSIPersistentVolumeSourceFluentImpl(V1ISCSIPersistentVolumeSource instance) {
    if (instance != null) {
      this.withChapAuthDiscovery(instance.getChapAuthDiscovery());
      this.withChapAuthSession(instance.getChapAuthSession());
      this.withFsType(instance.getFsType());
      this.withInitiatorName(instance.getInitiatorName());
      this.withIqn(instance.getIqn());
      this.withIscsiInterface(instance.getIscsiInterface());
      this.withLun(instance.getLun());
      this.withPortals(instance.getPortals());
      this.withReadOnly(instance.getReadOnly());
      this.withSecretRef(instance.getSecretRef());
      this.withTargetPortal(instance.getTargetPortal());
    }
  }
  private Boolean chapAuthDiscovery;
  private Boolean chapAuthSession;
  private String fsType;
  private String initiatorName;
  private String iqn;
  private String iscsiInterface;
  private Integer lun;
  private List<String> portals;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  private String targetPortal;
  public Boolean getChapAuthDiscovery() {
    return this.chapAuthDiscovery;
  }
  public A withChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery=chapAuthDiscovery; return (A) this;
  }
  public Boolean hasChapAuthDiscovery() {
    return this.chapAuthDiscovery != null;
  }
  public Boolean getChapAuthSession() {
    return this.chapAuthSession;
  }
  public A withChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession=chapAuthSession; return (A) this;
  }
  public Boolean hasChapAuthSession() {
    return this.chapAuthSession != null;
  }
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getInitiatorName() {
    return this.initiatorName;
  }
  public A withInitiatorName(String initiatorName) {
    this.initiatorName=initiatorName; return (A) this;
  }
  public Boolean hasInitiatorName() {
    return this.initiatorName != null;
  }
  public String getIqn() {
    return this.iqn;
  }
  public A withIqn(String iqn) {
    this.iqn=iqn; return (A) this;
  }
  public Boolean hasIqn() {
    return this.iqn != null;
  }
  public String getIscsiInterface() {
    return this.iscsiInterface;
  }
  public A withIscsiInterface(String iscsiInterface) {
    this.iscsiInterface=iscsiInterface; return (A) this;
  }
  public Boolean hasIscsiInterface() {
    return this.iscsiInterface != null;
  }
  public Integer getLun() {
    return this.lun;
  }
  public A withLun(Integer lun) {
    this.lun=lun; return (A) this;
  }
  public Boolean hasLun() {
    return this.lun != null;
  }
  public A addToPortals(int index,String item) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    this.portals.add(index, item);
    return (A)this;
  }
  public A setToPortals(int index,String item) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    this.portals.set(index, item); return (A)this;
  }
  public A addToPortals(java.lang.String... items) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    for (String item : items) {this.portals.add(item);} return (A)this;
  }
  public A addAllToPortals(Collection<String> items) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    for (String item : items) {this.portals.add(item);} return (A)this;
  }
  public A removeFromPortals(java.lang.String... items) {
    for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
  }
  public A removeAllFromPortals(Collection<String> items) {
    for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
  }
  public List<String> getPortals() {
    return this.portals;
  }
  public String getPortal(int index) {
    return this.portals.get(index);
  }
  public String getFirstPortal() {
    return this.portals.get(0);
  }
  public String getLastPortal() {
    return this.portals.get(portals.size() - 1);
  }
  public String getMatchingPortal(Predicate<String> predicate) {
    for (String item: portals) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingPortal(Predicate<String> predicate) {
    for (String item: portals) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPortals(List<String> portals) {
    if (portals != null) {this.portals = new ArrayList(); for (String item : portals){this.addToPortals(item);}} else { this.portals = null;} return (A) this;
  }
  public A withPortals(java.lang.String... portals) {
    if (this.portals != null) {this.portals.clear(); _visitables.remove("portals"); }
    if (portals != null) {for (String item :portals){ this.addToPortals(item);}} return (A) this;
  }
  public Boolean hasPortals() {
    return portals != null && !portals.isEmpty();
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
  public V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRef() {
    return new V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getTargetPortal() {
    return this.targetPortal;
  }
  public A withTargetPortal(String targetPortal) {
    this.targetPortal=targetPortal; return (A) this;
  }
  public Boolean hasTargetPortal() {
    return this.targetPortal != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ISCSIPersistentVolumeSourceFluentImpl that = (V1ISCSIPersistentVolumeSourceFluentImpl) o;
    if (!java.util.Objects.equals(chapAuthDiscovery, that.chapAuthDiscovery)) return false;

    if (!java.util.Objects.equals(chapAuthSession, that.chapAuthSession)) return false;

    if (!java.util.Objects.equals(fsType, that.fsType)) return false;

    if (!java.util.Objects.equals(initiatorName, that.initiatorName)) return false;

    if (!java.util.Objects.equals(iqn, that.iqn)) return false;

    if (!java.util.Objects.equals(iscsiInterface, that.iscsiInterface)) return false;

    if (!java.util.Objects.equals(lun, that.lun)) return false;

    if (!java.util.Objects.equals(portals, that.portals)) return false;

    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;

    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;

    if (!java.util.Objects.equals(targetPortal, that.targetPortal)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(chapAuthDiscovery,  chapAuthSession,  fsType,  initiatorName,  iqn,  iscsiInterface,  lun,  portals,  readOnly,  secretRef,  targetPortal,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (chapAuthDiscovery != null) { sb.append("chapAuthDiscovery:"); sb.append(chapAuthDiscovery + ","); }
    if (chapAuthSession != null) { sb.append("chapAuthSession:"); sb.append(chapAuthSession + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (initiatorName != null) { sb.append("initiatorName:"); sb.append(initiatorName + ","); }
    if (iqn != null) { sb.append("iqn:"); sb.append(iqn + ","); }
    if (iscsiInterface != null) { sb.append("iscsiInterface:"); sb.append(iscsiInterface + ","); }
    if (lun != null) { sb.append("lun:"); sb.append(lun + ","); }
    if (portals != null && !portals.isEmpty()) { sb.append("portals:"); sb.append(portals + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (targetPortal != null) { sb.append("targetPortal:"); sb.append(targetPortal); }
    sb.append("}");
    return sb.toString();
  }
  public A withChapAuthDiscovery() {
    return withChapAuthDiscovery(true);
  }
  public A withChapAuthSession() {
    return withChapAuthSession(true);
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class SecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<N>> implements V1ISCSIPersistentVolumeSourceFluentImpl.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1ISCSIPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}