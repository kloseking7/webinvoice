package com.glassbox.webinvoice.client.ui.container.pages;

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

public class HomePage_HomePageUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.glassbox.webinvoice.client.ui.container.pages.HomePage>, com.glassbox.webinvoice.client.ui.container.pages.HomePage.HomePageUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='container' id='three-column'> <div id='tbox1' style='margin:0 auto;'> <div class='box-style box-style01'> <div class='content'> <div class='image'> <img alt='' height='200' src='images/img01.jpg' width='324'> </div> <h2>Column 1</h2> <p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. </p> </div> </div> </div> <div id='tbox2' style='margin:0 auto;'> <div class='box-style box-style02'> <div class='content'> <div class='image'> <img alt='' height='200' src='images/img02.jpg' width='324'> </div> <h2>Column 2</h2> <p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. </p> </div> </div> </div> <div id='tbox3' style='margin:0 auto;'> <div class='box-style box-style03'> <div class='content'> <div class='image'> <img alt='' height='200' src='images/img03.jpg' width='324'> </div> <h2>Column 3</h2> <p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh.</p> </div> </div> </div> </div> <div class='container' id='page'> <div id='content'> <div class='post'> <h2 class='title'> <a href='#'>Fusce ultrices fringilla metus</a> </h2> <div class='entry'> <p> This is <strong>Glissade </strong> , a free, fully standards-compliant CSS template designed by <a href='http://www.freecsstemplates.org'>FCT</a> . The photos in this template are from <a href='http://fotogrph.com/'> Fotogrph</a> . This free template is released under a  <a href='http://creativecommons.org/licenses/by/3.0/'>Creative Commons Attributions 3.0</a> license, so you are pretty much free to do whatever you want with it (even use it commercially) provided you keep the links in the footer intact. Aside from that, have fun with it :) </p> <p> Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum vel, tempor at, varius non, purus. Mauris vitae nisl nec metus placerat consectetuer. Donec ipsum. Proin imperdiet est. Phasellus <a href='#'>dapibus semper urna</a> . Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer nisl felis ac diam. Etiam non felis. Donec ut ante. In id eros. Suspendisse lacus turpis, egestas at sem. Mauris quam enim, in, rhoncus ut, lobortis a, est. Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. Suspendisse dictum porta lectus. </p> </div> </div> <div style='clear: both;'> </div> </div>  <div id='sidebar'> <div> <h2>Nulla luctus eleifend</h2> <ul class='list-style2'> <li class='first'> <a href='#'>Pellentesque quis elit non lectus gravida blandit.</a> </li> <li> <a href='#'>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a> </li> <li> <a href='#'>Phasellus nec erat sit amet nibh pellentesque congue.</a> </li> <li> <a href='#'>Cras vitae metus aliquam risus pellentesque pharetra.</a> </li> <li> <a href='#'>Phasellus nec erat sit amet nibh pellentesque congue.</a> </li> <li> <a href='#'>Maecenas vitae orci vitae tellus feugiat eleifend.</a> </li> </ul> </div> </div>  <div style='clear: both;'> </div> </div>  <div id='footer-bg'> <div class='container' id='footer-content'> <div id='column1'> <h2>Tellus feugiat eleifend</h2> <ul class='list-style2'> <li class='first'> <a href='#'>Pellentesque quis elit non lectus gravida blandit.</a> </li> <li> <a href='#'>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a> </li> <li> <a href='#'>Phasellus nec erat sit amet nibh pellentesque congue.</a> </li> <li> <a href='#'>Cras vitae metus aliquam risus pellentesque pharetra.</a> </li> <li> <a href='#'>Maecenas vitae orci vitae tellus feugiat eleifend.</a> </li> </ul> </div> <div id='column2'> <h2>Etiam rhoncus volutpat</h2> <ul class='list-style2'> <li class='first'> <a href='#'>Pellentesque quis elit non lectus gravida blandit.</a> </li> <li> <a href='#'>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a> </li> <li> <a href='#'>Phasellus nec erat sit amet nibh pellentesque congue.</a> </li> <li> <a href='#'>Cras vitae metus aliquam risus pellentesque pharetra.</a> </li> <li> <a href='#'>Maecenas vitae orci vitae tellus feugiat eleifend.</a> </li> </ul> </div> <div id='column3'> <h2>Recommended Links</h2> <ul class='list-style2'> <li class='first'> <a href='#'>Pellentesque quis elit non lectus gravida blandit.</a> </li> <li> <a href='#'>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a> </li> <li> <a href='#'>Phasellus nec erat sit amet nibh pellentesque congue.</a> </li> <li> <a href='#'>Cras vitae metus aliquam risus pellentesque pharetra.</a> </li> <li> <a href='#'>Maecenas vitae orci vitae tellus feugiat eleifend.</a> </li> </ul> </div> </div> </div>")
    SafeHtml html1();
     
    @Template("<div id='main' style='width:1152px; margin:0 auto;'> <span id='{0}'></span> </div>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.glassbox.webinvoice.client.ui.container.pages.HomePage owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.glassbox.webinvoice.client.ui.container.pages.HomePage owner;


    public Widgets(final com.glassbox.webinvoice.client.ui.container.pages.HomePage owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenBundle) GWT.create(com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.glassbox.webinvoice.client.ui.container.pages.HomePage_HomePageUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord9 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord9.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel2(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.


      return f_HTMLPanel2;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
