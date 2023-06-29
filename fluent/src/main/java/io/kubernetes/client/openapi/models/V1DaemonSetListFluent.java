package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetListFluent<A extends V1DaemonSetListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(int index,V1DaemonSet item);
  public A setToItems(int index,V1DaemonSet item);
  public A addToItems(io.kubernetes.client.openapi.models.V1DaemonSet... items);
  public A addAllToItems(Collection<V1DaemonSet> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1DaemonSet... items);
  public A removeAllFromItems(Collection<V1DaemonSet> items);
  public A removeMatchingFromItems(Predicate<V1DaemonSetBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DaemonSet> getItems();
  public List<V1DaemonSet> buildItems();
  public V1DaemonSet buildItem(int index);
  public V1DaemonSet buildFirstItem();
  public V1DaemonSet buildLastItem();
  public V1DaemonSet buildMatchingItem(Predicate<V1DaemonSetBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1DaemonSetBuilder> predicate);
  public A withItems(List<V1DaemonSet> items);
  public A withItems(io.kubernetes.client.openapi.models.V1DaemonSet... items);
  public Boolean hasItems();
  public V1DaemonSetListFluent.ItemsNested<A> addNewItem();
  public V1DaemonSetListFluent.ItemsNested<A> addNewItemLike(V1DaemonSet item);
  public V1DaemonSetListFluent.ItemsNested<A> setNewItemLike(int index,V1DaemonSet item);
  public V1DaemonSetListFluent.ItemsNested<A> editItem(int index);
  public V1DaemonSetListFluent.ItemsNested<A> editFirstItem();
  public V1DaemonSetListFluent.ItemsNested<A> editLastItem();
  public V1DaemonSetListFluent.ItemsNested<A> editMatchingItem(Predicate<V1DaemonSetBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();
  public V1ListMeta buildMetadata();
  public A withMetadata(V1ListMeta metadata);
  public Boolean hasMetadata();
  public V1DaemonSetListFluent.MetadataNested<A> withNewMetadata();
  public V1DaemonSetListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1DaemonSetListFluent.MetadataNested<A> editMetadata();
  public V1DaemonSetListFluent.MetadataNested<A> editOrNewMetadata();
  public V1DaemonSetListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1DaemonSetFluent<V1DaemonSetListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1DaemonSetListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}