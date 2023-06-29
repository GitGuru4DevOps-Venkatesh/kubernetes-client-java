package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GlusterfsVolumeSourceFluent<A extends V1GlusterfsVolumeSourceFluent<A>> extends Fluent<A>{
  public String getEndpoints();
  public A withEndpoints(String endpoints);
  public Boolean hasEndpoints();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A withReadOnly();
  
}