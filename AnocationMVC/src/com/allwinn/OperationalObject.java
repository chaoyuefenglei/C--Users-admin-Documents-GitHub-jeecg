package com.allwinn;

import java.util.Map;
import java.lang.reflect.Method;
import java.lang .Class;



public class OperationalObject {

private Map<String,Class> handerlermapping;
private Map<String,Method>  methodMapping;

public Map<String, Class> getHanderlermapping() {
	return handerlermapping;
}

public void setHanderlermapping(Map<String, Class> handerlermapping) {
	this.handerlermapping = handerlermapping;
}

public Map<String, Method> getMethodMapping() {
	return methodMapping;
}

public void setMethodMapping(Map<String, Method> methodMapping) {
	this.methodMapping = methodMapping;
}	
	
	
	
	
	
	
}
