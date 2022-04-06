package com.example.openapitest.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;

//import openapitest.AlarmInfo;

public class AirKoreaOpenApiAgent {
	
	public AlarmInfo getDustAlarmInfo(AlarmInfoParams params) throws IOException {
		AlarmInfo alarmInfo = null;
		 StringBuilder urlBuilder = new StringBuilder("http://openapi.airkorea.or.kr/openapi/services/rest/UlfptcaAlarmInqireSvc/getUlfptcaAlarmInfo"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=HI1KTIxEO9vb5UwWMfBeFzsXPsU76N1Jgc9K3cy74QgF1H06V5eRLmzn%2BCZu%2Fcgb1tvU5kygnSE6sS4Sk64gww%3D%3D"); /*Service Key*/
	       // urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("-", "UTF-8")); /*占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占싻울옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙키*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(String.valueOf(params.getPageNo()), "UTF-8")); /*占쏙옙占쏙옙占쏙옙占쏙옙호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode(String.valueOf(params.getNumOfRows()), "UTF-8")); /*占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占� 占쏙옙*/
	        urlBuilder.append("&" + URLEncoder.encode("year","UTF-8") + "=" + URLEncoder.encode(String.valueOf(params.getYear()), "UTF-8")); /*占쏙옙占쏙옙 占쏙옙占쏙옙*/
	        urlBuilder.append("&" + URLEncoder.encode("itemCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*占싱쇽옙占쏙옙占쏙옙 占쌓몌옙 占쏙옙占쏙옙(PM10, PM25) PM10, PM25 占쏙옙占� 占쏙옙회占쏙옙 占쏙옙占� 占식띰옙占쏙옙占� 占쏙옙占쏙옙*/
	        urlBuilder.append("&" + URLEncoder.encode("_returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*占싱쇽옙占쏙옙占쏙옙 占쌓몌옙 占쏙옙占쏙옙(PM10, PM25) PM10, PM25 占쏙옙占� 占쏙옙회占쏙옙 占쏙옙占� 占식띰옙占쏙옙占� 占쏙옙占쏙옙*/

	        URL url = new URL(urlBuilder.toString());
	        
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        
	        //System.out.println("Response code: " + conn.getResponseCode());
	        
	        BufferedReader rd;
	        
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        String line;
	        
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	            //sb.append("\n");
	        }
	        
	        rd.close();
	        conn.disconnect();
	        
	     // Deserialize json string
	        ObjectMapper mapper = new ObjectMapper();
	        alarmInfo = mapper.readValue(sb.toString(), AlarmInfo.class);
		
		
		return alarmInfo;
	}
}
