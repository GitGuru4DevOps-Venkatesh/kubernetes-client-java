package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NamespaceListFluentImpl<A extends V1NamespaceListFluent<A>> extends BaseFluent<A> implements V1NamespaceListFluent<A>{
  public V1NamespaceListFluentImpl() {
  }
  public V1NamespaceListFluentImpl(V1NamespaceList instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
  }
  private String apiVersion;
  private ArrayList<V1NamespaceBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToItems(int index,V1Namespace item) {
    if (this.items == null) {this.items = new ArrayList<V1NamespaceBuilder>();}
    V1NamespaceBuilder builder = new V1NamespaceBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  public A setToItems(int index,V1Namespace item) {
    if (this.items == null) {this.items = new ArrayList<V1NamespaceBuilder>();}
    V1NamespaceBuilder builder = new V1NamespaceBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V1Namespace... items) {
    if (this.items == null) {this.items = new ArrayList<V1NamespaceBuilder>();}
    for (V1Namespace item : items) {V1NamespaceBuilder builder = new V1NamespaceBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(Collection<V1Namespace> items) {
    if (this.items == null) {this.items = new ArrayList<V1NamespaceBuilder>();}
    for (V1Namespace item : items) {V1NamespaceBuilder builder = new V1NamespaceBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Namespace... items) {
    for (V1Namespace item : items) {V1NamespaceBuilder builder = new V1NamespaceBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(Collection<V1Namespace> items) {
    for (V1Namespace item : items) {V1NamespaceBuilder builder = new V1NamespaceBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(Predicate<V1NamespaceBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1NamespaceBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1NamespaceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Namespace> getItems() {
    return items != null ? build(items) : null;
  }
  public List<V1Namespace> buildItems() {
    return items != null ? build(items) : null;
  }
  public V1Namespace buildItem(int index) {
    return this.items.get(index).build();
  }
  public V1Namespace buildFirstItem() {
    return this.items.get(0).build();
  }
  public V1Namespace buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public V1Namespace buildMatchingItem(Predicate<V1NamespaceBuilder> predicate) {
    for (V1NamespaceBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingItem(Predicate<V1NamespaceBuilder> predicate) {
    for (V1NamespaceBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(List<V1Namespace> items) {
    if (this.items != null) { _visitables.get("items").clear();}
    if (items != null) {this.items = new ArrayList(); for (V1Namespace item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V1Namespace... items) {
    if (this.items != null) {this.items.clear(); _visitables.remove("items"); }
    if (items != null) {for (V1Namespace item :items){ this.addToItems(item);}} return (A) this;
  }
  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> addNewItem() {
    return new V1NamespaceListFluentImpl.ItemsNestedImpl();
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> addNewItemLike(V1Namespace item) {
    return new V1NamespaceListFluentImpl.ItemsNestedImpl(-1, item);
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> setNewItemLike(int index,V1Namespace item) {
    return new V1NamespaceListFluentImpl.ItemsNestedImpl(index, item);
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1NamespaceListFluentImpl.ItemsNested<A> editMatchingItem(Predicate<V1NamespaceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
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
  public V1ListMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ListMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ListMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1NamespaceListFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1NamespaceListFluentImpl.MetadataNestedImpl();
  }
  public V1NamespaceListFluentImpl.MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new V1NamespaceListFluentImpl.MetadataNestedImpl(item);
  }
  public V1NamespaceListFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1NamespaceListFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ListMetaBuilder().build());
  }
  public V1NamespaceListFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamespaceListFluentImpl that = (V1NamespaceListFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(items, that.items)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  items,  kind,  metadata,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (items != null) { sb.append("items:"); sb.append(items + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  class ItemsNestedImpl<N> extends V1NamespaceFluentImpl<V1NamespaceListFluentImpl.ItemsNested<N>> implements V1NamespaceListFluentImpl.ItemsNested<N>,Nested<N>{
    ItemsNestedImpl(int index,V1Namespace item) {
      this.index = index;
      this.builder = new V1NamespaceBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V1NamespaceBuilder(this);
    }
    V1NamespaceBuilder builder;
    int index;
    public N and() {
      return (N) V1NamespaceListFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ListMetaFluentImpl<V1NamespaceListFluentImpl.MetadataNested<N>> implements V1NamespaceListFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ListMetaBuilder(this);
    }
    V1ListMetaBuilder builder;
    public N and() {
      return (N) V1NamespaceListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}