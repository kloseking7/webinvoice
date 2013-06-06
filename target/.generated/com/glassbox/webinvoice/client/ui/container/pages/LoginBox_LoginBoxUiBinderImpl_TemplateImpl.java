package com.glassbox.webinvoice.client.ui.container.pages;

public class LoginBox_LoginBoxUiBinderImpl_TemplateImpl implements com.glassbox.webinvoice.client.ui.container.pages.LoginBox_LoginBoxUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Cancel");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("Login");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div id='maindiv'> <p id='cancelsubmit'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> </p> <form id='loginform'> <p> <label for='login'>Login:</label> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span> </p> <p> <label for='password'>Password:</label> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
sb.append("'></span> </p> <p id='loginsubmit'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
sb.append("'></span> </p> <p id='forgotpassword'> <a href='#'>Forgot your password?</a> </p> <p id='messagearea'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
sb.append("'></span> </p> </form> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
