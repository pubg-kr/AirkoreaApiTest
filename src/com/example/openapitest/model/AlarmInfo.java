package com.example.openapitest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AlarmInfo {
	private List<Alarmitem> list;
	private AlarmItem2 parm;
	private int totalCount;
	
	public List<Alarmitem> getList() {
		return list;
	}
	public void setList(List<Alarmitem> list) {
		this.list = list;
	}
	public AlarmItem2 getParm() {
		return parm;
	}
	public void setParm(AlarmItem2 parm) {
		this.parm = parm;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
