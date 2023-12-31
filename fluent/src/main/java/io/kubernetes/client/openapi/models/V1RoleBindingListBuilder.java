package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RoleBindingListBuilder extends V1RoleBindingListFluentImpl<V1RoleBindingListBuilder> implements VisitableBuilder<V1RoleBindingList,V1RoleBindingListBuilder>{
  public V1RoleBindingListBuilder() {
    this(false);
  }
  public V1RoleBindingListBuilder(Boolean validationEnabled) {
    this(new V1RoleBindingList(), validationEnabled);
  }
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RoleBindingList(), validationEnabled);
  }
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent,V1RoleBindingList instance) {
    this(fluent, instance, false);
  }
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent,V1RoleBindingList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1RoleBindingListBuilder(V1RoleBindingList instance) {
    this(instance,false);
  }
  public V1RoleBindingListBuilder(V1RoleBindingList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1RoleBindingListFluent<?> fluent;
  Boolean validationEnabled;
  public V1RoleBindingList build() {
    V1RoleBindingList buildable = new V1RoleBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}