package com.google.gwt.maps.client.controls;

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

/**
 * Options for the rendering of the fullscreen control on the map. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FullscreenControlOptions">
 * FullscreenControlOptions API Doc</a>
 */
public class FullscreenControlOptions extends JavaScriptObject {

  /**
   * creates Options for the rendering of the fullscreen control on the map.
   */
  public static FullscreenControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Options for the rendering of the fullscreen control on the map. use newInstance()
   */
  protected FullscreenControlOptions() {
  }

  /**
   * Position id. Used to specify the position of the control on the map. The default position is RIGHT_TOP.
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is RIGHT_TOP.
   * 
   * @param position {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;

}
