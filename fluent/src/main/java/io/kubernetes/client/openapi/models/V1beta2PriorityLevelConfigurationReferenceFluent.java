package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2PriorityLevelConfigurationReferenceFluent<A extends V1beta2PriorityLevelConfigurationReferenceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
}