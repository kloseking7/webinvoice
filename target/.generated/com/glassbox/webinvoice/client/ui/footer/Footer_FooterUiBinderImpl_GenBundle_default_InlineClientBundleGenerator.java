package com.glassbox.webinvoice.client.ui.footer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Footer_FooterUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenBundle {
  private static Footer_FooterUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Footer_FooterUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenCss_style() {
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
        return ("#footer{height:" + ("100px")  + ";margin:" + ("0"+ " " +"auto")  + ";padding:" + ("50px"+ " " +"0"+ " " +"0"+ " " +"0")  + ";}#footer p{margin:" + ("0")  + ";padding-top:" + ("10px")  + ";line-height:" + ("normal")  + ";text-align:" + ("center")  + ";text-shadow:" + ("1px"+ " " +"1px"+ " " +"0"+ " " +"#fff")  + ";color:" + ("#909090")  + ";}#footer a{text-decoration:" + ("underline")  + ";color:") + (("#909090")  + ";}#footer a:hover{text-decoration:" + ("none")  + ";color:" + ("#383838")  + ";}");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.glassbox.webinvoice.client.ui.footer.Footer_FooterUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
