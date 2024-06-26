package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2019 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.core.client.JavaScriptObject;

public class MarkerClustererOptions extends JavaScriptObject {

  protected MarkerClustererOptions() {
  }

  public final static MarkerClustererOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  public final native void setMinimumClusterSize(int minimumClusterSize) /*-{
    this.minimumClusterSize = minimumClusterSize;
  }-*/;

  public final native void setIgnoreHiddenMarkers(boolean ignoreHiddenMarkers) /*-{
    this.ignoreHiddenMarkers = ignoreHiddenMarkers;
  }-*/;

}
