package com.allwinn;


import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

public class InitObject {

private Set<Class> setclass;  	
private OperationalObject operationalObject= new OperationalObject();

public Map<String,Class> resolClass(){
Map<String, Class> handerlermapping = operationalObject.getHanderlermapping();
	for(Class classobj:setclass){
		RequestMapping annotation = (RequestMapping)classobj.getAnnotation(RequestMapping.class);
		String[] value = annotation.value();
		for(String string:value){
		handerlermapping.put(string, classobj);
		return handerlermapping;
		}
		
		
		
		
	}
	
	return null;
}
	
public Map<String,Method>resolMethod(){
	Map<String, Method> methodMapping = operationalObject.getMethodMapping();
	for(Class classobj:setclass){
	Method[] methods = classobj.getMethods();
	for(Method method:methods){
  RequestMapping annotation = method.getAnnotation(RequestMapping.class);
  String[] value = annotation.value();
  for(String string:value){
	 methodMapping.put(string,  method);
	  
	  return methodMapping;
  }
  
	}
	
	
		
		
	}
	
	return null;
}
	
	
	
	
	
}
