<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�̼����� �溸 ���� ��ȸ</title>
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
	<h1>�̼����� �溸 ���� ��ȸ</h1>
	<h3>��ȸ ����: ${alarmparams.year}</h3>
	<h3>�溸 �Ǽ�: ${alarminfo.totalCount}</h3>
	<h3>�̼����� �溸 ����:</h3>
	
	
	<!--${alarminfo.parm.properties.pageNo}<br>
	${alarminfo.parm.properties.numOfRows}<br> -->
	
	<table>
  		<thead><tr>
  		    <th>��ȣ</th>
    		<th>������</th>
    		<th>�ǿ���</th>
    		<th>�溸 �̸�</th>
    		<th>�溸 �ܰ�</th>
    		<th>�߷� ��¥</th>
    		<th>�߷� �ð�</th>
    		<th>�߷� ��</th>
    		<th>���� ��¥</th>
    		<th>���� �ð�</th>
		    <th>���� ��</th>
		    <th>�ְ� ��</th> 
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
	  			<a href="openapitest?op=1&pageNo=${alarminfo.parm.properties.pageNo-1}">���� ������</a>
	  		</c:if>
	  		<c:if test="${startIndex + alarminfo.parm.properties.numOfRows < alarminfo.totalCount }">
	  			<a href="openapitest?op=1&pageNo=${alarminfo.parm.properties.pageNo+1}">���� ������</a>
	  		</c:if>
  			
  			
  		</div>

</body>
</html>