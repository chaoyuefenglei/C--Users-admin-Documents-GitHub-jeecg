package com.allwinn;

import java.lang.reflect.Method;
import java.util.Map;

public class HanderMapping {
private OperationalObject oo;	
public HanderMapping(OperationalObject oo){
	      this.oo=oo;
	
}
	
	public Class gethandeler(String methodpath ){
		
		
		Map<String, Class> handerlermapping = oo.getHanderlermapping();
		for(Map.Entry<String, Class> entry:handerlermapping.entrySet()){
			if(methodpath!=null&&methodpath!=""){
			 if(methodpath.equals(entry.getKey())){
				 
				 return entry.getValue();
				 
			 }	
				
				
			}
			
			
		}
		
		return null;
	}
	
	public Method getmethod(String methodpath){
		
		Map<String, Method> methodMapping = oo.getMethodMapping();
		for(Map.Entry<String, Method> entry:methodMapping.entrySet()){
			if(methodpath!=null&&methodpath!=""){
				
				if(methodpath.equals(entry.getKey())){
					return entry.getValue();
					
				}
				
				
			}
			
			
			
		}
		
		return null;
	}
	
	
	
	
}
