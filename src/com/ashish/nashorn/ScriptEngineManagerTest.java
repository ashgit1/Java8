package com.ashish.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineManagerTest {
	
	public static void main(String args[]){
		
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine nashorn = sem.getEngineByName("nashorn");
		
		String name = "Ashishlumar Gupta";
		Integer result = null;
		
		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("3 + 6");
		} catch (ScriptException e) {
			System.out.println("Error executing script: " 
								+ e.getMessage());
		}
		System.out.println(result.toString());
	}
}
