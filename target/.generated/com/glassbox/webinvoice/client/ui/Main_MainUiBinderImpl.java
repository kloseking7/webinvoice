package com.glassbox.webinvoice.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class Main_MainUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.glassbox.webinvoice.client.ui.Main>, com.glassbox.webinvoice.client.ui.Main.MainUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.glassbox.webinvoice.client.ui.Main owner) {


    return new Widgets(owner).get_MainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.glassbox.webinvoice.client.ui.Main owner;


    public Widgets(final com.glassbox.webinvoice.client.ui.Main owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenBundle) GWT.create(com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.glassbox.webinvoice.client.ui.Main_MainUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for MainPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_MainPanel() {
      return build_MainPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_MainPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel MainPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.


      owner.MainPanel = MainPanel;

      return MainPanel;
    }
  }
}
