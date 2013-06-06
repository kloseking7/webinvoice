package com.glassbox.webinvoice.shared.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AuthenticationResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAuthenticated(com.glassbox.webinvoice.shared.model.AuthenticationResult instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "authenticated");
  }
  
  private static void setAuthenticated(com.glassbox.webinvoice.shared.model.AuthenticationResult instance, boolean value) 
  {
    ReflectionHelper.setField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "authenticated", value);
  }
  
  private static java.lang.String getEmail(com.glassbox.webinvoice.shared.model.AuthenticationResult instance) {
    return (java.lang.String) ReflectionHelper.getField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "email");
  }
  
  private static void setEmail(com.glassbox.webinvoice.shared.model.AuthenticationResult instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "email", value);
  }
  
  private static java.lang.String getMessage(com.glassbox.webinvoice.shared.model.AuthenticationResult instance) {
    return (java.lang.String) ReflectionHelper.getField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "message");
  }
  
  private static void setMessage(com.glassbox.webinvoice.shared.model.AuthenticationResult instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "message", value);
  }
  
  private static java.lang.String getTagname(com.glassbox.webinvoice.shared.model.AuthenticationResult instance) {
    return (java.lang.String) ReflectionHelper.getField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "tagname");
  }
  
  private static void setTagname(com.glassbox.webinvoice.shared.model.AuthenticationResult instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "tagname", value);
  }
  
  private static java.lang.String getUsername(com.glassbox.webinvoice.shared.model.AuthenticationResult instance) {
    return (java.lang.String) ReflectionHelper.getField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "username");
  }
  
  private static void setUsername(com.glassbox.webinvoice.shared.model.AuthenticationResult instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.glassbox.webinvoice.shared.model.AuthenticationResult.class, instance, "username", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.model.AuthenticationResult instance) throws SerializationException {
    setAuthenticated(instance, streamReader.readBoolean());
    setEmail(instance, streamReader.readString());
    setMessage(instance, streamReader.readString());
    setTagname(instance, streamReader.readString());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.glassbox.webinvoice.shared.model.AuthenticationResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.model.AuthenticationResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.model.AuthenticationResult instance) throws SerializationException {
    streamWriter.writeBoolean(getAuthenticated(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeString(getTagname(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.model.AuthenticationResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.model.AuthenticationResult_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.model.AuthenticationResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.model.AuthenticationResult_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.model.AuthenticationResult)object);
  }
  
}
