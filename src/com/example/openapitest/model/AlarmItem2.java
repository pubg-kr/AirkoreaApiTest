package com.example.openapitest.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class AlarmItem2 {
	private Map<String, String> properties = new HashMap<>();
	
	@JsonAnySetter
	public void add(String key, String value) {
		this.properties.put(key,  value);
	}
	
	public Map<String, String> getProperties() {
		return this.properties;
	}
	
	public String getProperty(String name) {
		return this.properties.get(name);
	}
	
}
