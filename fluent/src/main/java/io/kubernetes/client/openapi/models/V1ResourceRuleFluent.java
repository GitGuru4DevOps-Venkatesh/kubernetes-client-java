package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1ResourceRuleFluent<A extends V1ResourceRuleFluent<A>> extends Fluent<A>{
  public A addToApiGroups(int index,String item);
  public A setToApiGroups(int index,String item);
  public A addToApiGroups(java.lang.String... items);
  public A addAllToApiGroups(Collection<String> items);
  public A removeFromApiGroups(java.lang.String... items);
  public A removeAllFromApiGroups(Collection<String> items);
  public List<String> getApiGroups();
  public String getApiGroup(int index);
  public String getFirstApiGroup();
  public String getLastApiGroup();
  public String getMatchingApiGroup(Predicate<String> predicate);
  public Boolean hasMatchingApiGroup(Predicate<String> predicate);
  public A withApiGroups(List<String> apiGroups);
  public A withApiGroups(java.lang.String... apiGroups);
  public Boolean hasApiGroups();
  public A addToResourceNames(int index,String item);
  public A setToResourceNames(int index,String item);
  public A addToResourceNames(java.lang.String... items);
  public A addAllToResourceNames(Collection<String> items);
  public A removeFromResourceNames(java.lang.String... items);
  public A removeAllFromResourceNames(Collection<String> items);
  public List<String> getResourceNames();
  public String getResourceName(int index);
  public String getFirstResourceName();
  public String getLastResourceName();
  public String getMatchingResourceName(Predicate<String> predicate);
  public Boolean hasMatchingResourceName(Predicate<String> predicate);
  public A withResourceNames(List<String> resourceNames);
  public A withResourceNames(java.lang.String... resourceNames);
  public Boolean hasResourceNames();
  public A addToResources(int index,String item);
  public A setToResources(int index,String item);
  public A addToResources(java.lang.String... items);
  public A addAllToResources(Collection<String> items);
  public A removeFromResources(java.lang.String... items);
  public A removeAllFromResources(Collection<String> items);
  public List<String> getResources();
  public String getResource(int index);
  public String getFirstResource();
  public String getLastResource();
  public String getMatchingResource(Predicate<String> predicate);
  public Boolean hasMatchingResource(Predicate<String> predicate);
  public A withResources(List<String> resources);
  public A withResources(java.lang.String... resources);
  public Boolean hasResources();
  public A addToVerbs(int index,String item);
  public A setToVerbs(int index,String item);
  public A addToVerbs(java.lang.String... items);
  public A addAllToVerbs(Collection<String> items);
  public A removeFromVerbs(java.lang.String... items);
  public A removeAllFromVerbs(Collection<String> items);
  public List<String> getVerbs();
  public String getVerb(int index);
  public String getFirstVerb();
  public String getLastVerb();
  public String getMatchingVerb(Predicate<String> predicate);
  public Boolean hasMatchingVerb(Predicate<String> predicate);
  public A withVerbs(List<String> verbs);
  public A withVerbs(java.lang.String... verbs);
  public Boolean hasVerbs();
  
}