package com.glassbox.webinvoice.client.ui.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Menu_MenuUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenBundle {
  private static Menu_MenuUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Menu_MenuUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenCss_style() {
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
        return ("#menu-wrapper{overflow:" + ("hidden")  + ";height:" + ("52px")  + ";margin-bottom:" + ("2em")  + ";background:" + ("#3c342e")  + ";}#menu{overflow:" + ("hidden")  + ";height:" + ("52px")  + ";}#menu ul{margin:" + ("0")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";list-style:" + ("none")  + ";line-height:" + ("normal")  + ";text-align:") + (("center")  + ";}#menu li{display:" + ("inline-block")  + ";}#menu a{display:" + ("block")  + ";padding:" + ("0"+ " " +"30px")  + ";line-height:" + ("52px")  + ";border:" + ("none")  + ";text-decoration:" + ("none")  + ";text-transform:" + ("lowercase")  + ";text-align:" + ("center")  + ";text-transform:" + ("uppercase")  + ";font-family:" + ("\"Oswald\""+ ","+ " " +"sans-serif") ) + (";font-size:" + ("14px")  + ";font-weight:" + ("300")  + ";color:" + ("#fff")  + ";}#menu a:hover,#menu .GESL3MSDFI a{background:" + ("#de5635")  + ";text-decoration:" + ("none")  + ";color:" + ("#fff")  + ";}");
      }
      public java.lang.String current_page_item(){
        return "GESL3MSDFI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.glassbox.webinvoice.client.ui.menu.Menu_MenuUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
