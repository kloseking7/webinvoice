package com.glassbox.webinvoice.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class LoginService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.glassbox.webinvoice.shared.AccessDeniedException/3226946965", "com.glassbox.webinvoice.shared.AccessDeniedException_FieldSerializer");
    result.put("com.glassbox.webinvoice.shared.model.AuthenticationResult/678642425", "com.glassbox.webinvoice.shared.model.AuthenticationResult_FieldSerializer");
    result.put("com.google.gwt.event.shared.UmbrellaException/3104463596", "com.google.gwt.event.shared.UmbrellaException_FieldSerializer");
    result.put("com.google.gwt.http.client.RequestException/190587325", "com.google.gwt.http.client.RequestException_FieldSerializer");
    result.put("com.google.gwt.jsonp.client.TimeoutException/1112787596", "com.google.gwt.jsonp.client.TimeoutException_FieldSerializer");
    result.put("com.google.gwt.junit.client.TimeoutException/1599913304", "com.google.gwt.junit.client.TimeoutException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.SerializableException/3047383460", "com.google.gwt.user.client.rpc.SerializableException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.SerializationException/2836333220", "com.google.gwt.user.client.rpc.SerializationException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580", "com.google.gwt.user.client.rpc.SerializedTypeViolationException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447", "com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("com.google.web.bindery.event.shared.UmbrellaException/1025846929", "com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer");
    result.put("java.io.IOException/1159940531", "com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer");
    result.put("java.io.UnsupportedEncodingException/1526756933", "com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer");
    result.put("java.lang.ArithmeticException/1539622151", "com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer");
    result.put("java.lang.ArrayIndexOutOfBoundsException/600550433", "com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.ArrayStoreException/3540507190", "com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer");
    result.put("java.lang.AssertionError/3490171458", "com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("java.lang.ClassCastException/702295179", "com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer");
    result.put("java.lang.Error/1331973429", "com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer");
    result.put("java.lang.Exception/1920171873", "com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer");
    result.put("java.lang.IllegalArgumentException/1755012560", "com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer");
    result.put("java.lang.IllegalStateException/1972187323", "com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer");
    result.put("java.lang.IndexOutOfBoundsException/2489527753", "com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.NegativeArraySizeException/3846860241", "com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer");
    result.put("java.lang.NoSuchMethodException/260969707", "com.google.gwt.user.client.rpc.core.java.lang.NoSuchMethodException_FieldSerializer");
    result.put("java.lang.NullPointerException/1463492344", "com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer");
    result.put("java.lang.NumberFormatException/3305228476", "com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer");
    result.put("java.lang.RuntimeException/515124647", "com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.lang.StringIndexOutOfBoundsException/500777603", "com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer");
    result.put("java.lang.Throwable/2953622131", "com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer");
    result.put("java.lang.UnsupportedOperationException/3744010015", "com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer");
    result.put("java.lang.annotation.AnnotationFormatError/2257184627", "com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer");
    result.put("java.lang.annotation.AnnotationTypeMismatchException/976205828", "com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer");
    result.put("java.security.DigestException/629316798", "com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer");
    result.put("java.security.GeneralSecurityException/2669239907", "com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer");
    result.put("java.security.NoSuchAlgorithmException/2892037213", "com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer");
    result.put("java.util.Collections$EmptySet/3523698179", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer");
    result.put("java.util.ConcurrentModificationException/2717383897", "com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer");
    result.put("java.util.EmptyStackException/89438517", "com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer");
    result.put("java.util.HashSet/3273092938", "com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer");
    result.put("java.util.LinkedHashSet/1826081506", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer");
    result.put("java.util.NoSuchElementException/1559248883", "com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer");
    result.put("java.util.TooManyListenersException/2023078032", "com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer");
    result.put("java.util.TreeMap/1493889780", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.TreeSet/4043497002", "com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer");
    result.put("javax.validation.ConstraintDeclarationException/3610544007", "com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDeclarationException_FieldSerializer");
    result.put("javax.validation.ConstraintDefinitionException/3732439488", "com.google.gwt.user.client.rpc.core.javax.validation.ConstraintDefinitionException_FieldSerializer");
    result.put("javax.validation.ConstraintViolationException/1185386591", "com.google.gwt.user.client.rpc.core.javax.validation.ConstraintViolationException_FieldSerializer");
    result.put("javax.validation.GroupDefinitionException/4024780846", "com.google.gwt.user.client.rpc.core.javax.validation.GroupDefinitionException_FieldSerializer");
    result.put("javax.validation.UnexpectedTypeException/593026390", "com.google.gwt.user.client.rpc.core.javax.validation.UnexpectedTypeException_FieldSerializer");
    result.put("javax.validation.ValidationException/1570221831", "com.google.gwt.user.client.rpc.core.javax.validation.ValidationException_FieldSerializer");
    result.put("junit.framework.AssertionFailedError/3756236039", "junit.framework.AssertionFailedError_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.glassbox.webinvoice.shared.AccessDeniedException", "com.glassbox.webinvoice.shared.AccessDeniedException/3226946965");
    result.put("com.glassbox.webinvoice.shared.model.AuthenticationResult", "com.glassbox.webinvoice.shared.model.AuthenticationResult/678642425");
    result.put("com.google.gwt.event.shared.UmbrellaException", "com.google.gwt.event.shared.UmbrellaException/3104463596");
    result.put("com.google.gwt.http.client.RequestException", "com.google.gwt.http.client.RequestException/190587325");
    result.put("com.google.gwt.jsonp.client.TimeoutException", "com.google.gwt.jsonp.client.TimeoutException/1112787596");
    result.put("com.google.gwt.junit.client.TimeoutException", "com.google.gwt.junit.client.TimeoutException/1599913304");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.SerializableException", "com.google.gwt.user.client.rpc.SerializableException/3047383460");
    result.put("com.google.gwt.user.client.rpc.SerializationException", "com.google.gwt.user.client.rpc.SerializationException/2836333220");
    result.put("com.google.gwt.user.client.rpc.SerializedTypeViolationException", "com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580");
    result.put("com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException", "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("com.google.web.bindery.event.shared.UmbrellaException", "com.google.web.bindery.event.shared.UmbrellaException/1025846929");
    result.put("java.io.IOException", "java.io.IOException/1159940531");
    result.put("java.io.UnsupportedEncodingException", "java.io.UnsupportedEncodingException/1526756933");
    result.put("java.lang.ArithmeticException", "java.lang.ArithmeticException/1539622151");
    result.put("java.lang.ArrayIndexOutOfBoundsException", "java.lang.ArrayIndexOutOfBoundsException/600550433");
    result.put("java.lang.ArrayStoreException", "java.lang.ArrayStoreException/3540507190");
    result.put("java.lang.AssertionError", "java.lang.AssertionError/3490171458");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("java.lang.ClassCastException", "java.lang.ClassCastException/702295179");
    result.put("java.lang.Error", "java.lang.Error/1331973429");
    result.put("java.lang.Exception", "java.lang.Exception/1920171873");
    result.put("java.lang.IllegalArgumentException", "java.lang.IllegalArgumentException/1755012560");
    result.put("java.lang.IllegalStateException", "java.lang.IllegalStateException/1972187323");
    result.put("java.lang.IndexOutOfBoundsException", "java.lang.IndexOutOfBoundsException/2489527753");
    result.put("java.lang.NegativeArraySizeException", "java.lang.NegativeArraySizeException/3846860241");
    result.put("java.lang.NoSuchMethodException", "java.lang.NoSuchMethodException/260969707");
    result.put("java.lang.NullPointerException", "java.lang.NullPointerException/1463492344");
    result.put("java.lang.NumberFormatException", "java.lang.NumberFormatException/3305228476");
    result.put("java.lang.RuntimeException", "java.lang.RuntimeException/515124647");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.lang.StringIndexOutOfBoundsException", "java.lang.StringIndexOutOfBoundsException/500777603");
    result.put("java.lang.Throwable", "java.lang.Throwable/2953622131");
    result.put("java.lang.UnsupportedOperationException", "java.lang.UnsupportedOperationException/3744010015");
    result.put("java.lang.annotation.AnnotationFormatError", "java.lang.annotation.AnnotationFormatError/2257184627");
    result.put("java.lang.annotation.AnnotationTypeMismatchException", "java.lang.annotation.AnnotationTypeMismatchException/976205828");
    result.put("java.security.DigestException", "java.security.DigestException/629316798");
    result.put("java.security.GeneralSecurityException", "java.security.GeneralSecurityException/2669239907");
    result.put("java.security.NoSuchAlgorithmException", "java.security.NoSuchAlgorithmException/2892037213");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3523698179");
    result.put("java.util.ConcurrentModificationException", "java.util.ConcurrentModificationException/2717383897");
    result.put("java.util.EmptyStackException", "java.util.EmptyStackException/89438517");
    result.put("java.util.HashSet", "java.util.HashSet/3273092938");
    result.put("java.util.LinkedHashSet", "java.util.LinkedHashSet/1826081506");
    result.put("java.util.NoSuchElementException", "java.util.NoSuchElementException/1559248883");
    result.put("java.util.TooManyListenersException", "java.util.TooManyListenersException/2023078032");
    result.put("java.util.TreeMap", "java.util.TreeMap/1493889780");
    result.put("java.util.TreeSet", "java.util.TreeSet/4043497002");
    result.put("javax.validation.ConstraintDeclarationException", "javax.validation.ConstraintDeclarationException/3610544007");
    result.put("javax.validation.ConstraintDefinitionException", "javax.validation.ConstraintDefinitionException/3732439488");
    result.put("javax.validation.ConstraintViolationException", "javax.validation.ConstraintViolationException/1185386591");
    result.put("javax.validation.GroupDefinitionException", "javax.validation.GroupDefinitionException/4024780846");
    result.put("javax.validation.UnexpectedTypeException", "javax.validation.UnexpectedTypeException/593026390");
    result.put("javax.validation.ValidationException", "javax.validation.ValidationException/1570221831");
    result.put("junit.framework.AssertionFailedError", "junit.framework.AssertionFailedError/3756236039");
    return result;
  }
  
  public LoginService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
