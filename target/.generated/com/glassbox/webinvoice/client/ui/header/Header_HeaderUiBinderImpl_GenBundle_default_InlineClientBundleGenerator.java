package com.glassbox.webinvoice.client.ui.header;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Header_HeaderUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenBundle {
  private static Header_HeaderUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Header_HeaderUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GESL3MSDA{width:" + ("1200px")  + ";margin:" + ("0"+ " " +"auto")  + ";}#logo{overflow:" + ("hidden")  + ";height:" + ("200px")  + ";}#logo h1{text-align:" + ("center")  + ";padding:" + ("50px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";letter-spacing:" + ("-6px")  + ";text-transform:" + ("lowercase")  + ";font-size:" + ("100px")  + ";}#logo p{text-align:" + ("center")  + ";margin-top:") + (("-20px")  + ";padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"0")  + ";font-size:" + ("20px")  + ";font-weight:" + ("300")  + ";color:" + ("#696969")  + ";}#logo p a{color:" + ("#696969")  + ";}#logo a{border:" + ("none")  + ";background:" + ("none")  + ";text-decoration:" + ("none")  + ";color:" + ("#3c342e")  + ";}")) : ((".GESL3MSDA{width:" + ("1200px")  + ";margin:" + ("0"+ " " +"auto")  + ";}#logo{overflow:" + ("hidden")  + ";height:" + ("200px")  + ";}#logo h1{text-align:" + ("center")  + ";padding:" + ("50px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";letter-spacing:" + ("-6px")  + ";text-transform:" + ("lowercase")  + ";font-size:" + ("100px")  + ";}#logo p{text-align:" + ("center")  + ";margin-top:") + (("-20px")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"5px")  + ";font-size:" + ("20px")  + ";font-weight:" + ("300")  + ";color:" + ("#696969")  + ";}#logo p a{color:" + ("#696969")  + ";}#logo a{border:" + ("none")  + ";background:" + ("none")  + ";text-decoration:" + ("none")  + ";color:" + ("#3c342e")  + ";}"));
      }
      public java.lang.String container(){
        return "GESL3MSDA";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.glassbox.webinvoice.client.ui.header.Header_HeaderUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
