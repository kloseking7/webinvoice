package com.glassbox.webinvoice.client.ui.container.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Services_ServicesUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenBundle {
  private static Services_ServicesUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Services_ServicesUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return ("");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.glassbox.webinvoice.client.ui.container.pages.Services_ServicesUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
