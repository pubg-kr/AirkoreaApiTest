<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>미세먼지 경보 정보 조회</title>
<style>
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
			
	}
	
	th, td {
		padding: 3px;
		text-align: center;
	}
</style>
</head>
<body>
	<h1>미세먼지 경보 정보 조회</h1>
	<h3>조회 연도: ${alarmparams.year}</h3>
	<h3>경보 건수: ${alarminfo.totalCount}</h3>
	<h3>미세먼지 경보 정보:</h3>
	
	
	<!--${alarminfo.parm.properties.pageNo}<br>
	${alarminfo.parm.properties.numOfRows}<br> -->
	
	<table>
  		<thead><tr>
  		    <th>번호</th>
    		<th>지역명</th>
    		<th>권역명</th>
    		<th>경보 이름</th>
    		<th>경보 단계</th>
    		<th>발령 날짜</th>
    		<th>발령 시간</th>
    		<th>발령 농도</th>
    		<th>해제 날짜</th>
    		<th>해제 시간</th>
		    <th>해제 농도</th>
		    <th>최고 농도</th> 
  		</tr></thead>
  		<tbody>
  			<c:set var="startIndex" value="${(alarminfo.parm.properties.pageNo - 1) * alarminfo.parm.properties.numOfRows + 1}" />
  			<c:forEach var="alarm" items="${alarminfo.list}" varStatus="status">
  				<tr>
  					<td><c:out value="${startIndex + status.index}"></c:out></td>
  					<td><c:out value="${alarm.districtName}"></c:out></td>
  					<td><c:out value="${alarm.moveName}"></c:out></td>
  					<td><c:out value="${alarm.itemCode}"></c:out></td>
  					<td><c:out value="${alarm.issueGbn}"></c:out></td>
  					<td><c:out value="${alarm.issueDate}"></c:out></td>
  					<td><c:out value="${alarm.issueTime}"></c:out></td>
  					<td><c:out value="${alarm.issueVal}"></c:out></td>
  					<td><c:out value="${alarm.clearDate}"></c:out></td>
  					<td><c:out value="${alarm.clearTime}"></c:out></td>
  					<td><c:out value="${alarm.clearVal}"></c:out></td>
   					<td><c:out value="${alarm.maxVal}"></c:out></td>
  				</tr>
  			</c:forEach>
  		</tbody>
  <tr>
    <td>Bill Gates</td>
    <td>55577854</td>
    <td>55577855</td>
  </tr>
</table><br>
  		<div>
	  		<c:if test="${startIndex > 1 }">
	  			<a href="openapitest?op=1&pageNo=${alarminfo.parm.properties.pageNo-1}">이전 페이지</a>
	  		</c:if>
	  		<c:if test="${startIndex + alarminfo.parm.properties.numOfRows < alarminfo.totalCount }">
	  			<a href="openapitest?op=1&pageNo=${alarminfo.parm.properties.pageNo+1}">다음 페이지</a>
	  		</c:if>
  			
  			
  		</div>

</body>
</html>