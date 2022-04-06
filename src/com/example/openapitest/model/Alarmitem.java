package com.example.openapitest.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Alarmitem {
	private String dataDate;
	private String districtName;
	private String moveName;
	private String itemCode;//경보아이템
	private String issueGbn;//경보단계
	private String issueDate;
	private String issueTime;
	private double issueVal;
	private String clearDate;
	private String clearTime;
	private double clearVal;
	private double maxVal;
	
	public String getDataDate() {
		return dataDate;
	}
	
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}
	
	public String getDistrictName() {
		return districtName;
	}
	
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	public String getMoveName() {
		return moveName;
	}
	
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public String getIssueGbn() {
		return issueGbn;
	}
	
	public void setIssueGbn(String issueGbn) {
		this.issueGbn = issueGbn;
	}
	
	public String getIssueDate() {
		return issueDate;
	}
	
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	public String getIssueTime() {
		return issueTime;
	}
	
	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}
	
	public double getIssueVal() {
		return issueVal;
	}
	
	public void setIssueVal(double issueVal) {
		this.issueVal = issueVal;
	}
	
	public String getClearDate() {
		return clearDate;
	}
	
	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
	}
	
	public String getClearTime() {
		return clearTime;
	}
	
	public void setClearTime(String clearTime) {
		this.clearTime = clearTime;
	}
	public
	double getClearVal() {
		return clearVal;
	}
	
	public void setClearVal(double clearVal) {
		this.clearVal = clearVal;
	}
	
	public double getMaxVal() {
		return maxVal;
	}
	
	public void setMaxVal(double maxVal) {
		this.maxVal = maxVal;
	}
	
	
	
}
