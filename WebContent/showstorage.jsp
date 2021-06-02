<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.ArrayList,com.entity.Storage"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1 align="center">所有库存的信息页</h1>
		<table width="800" border="1" align="center">
			<tr>			
				<td>商品名称</td>
				<td>存货数量</td>
				<td>价格</td>
				<td>商品类型</td>
				<td>操作</td>
			</tr>
			<%
			ArrayList<Storage> storageList = (ArrayList<Storage>)request.getAttribute("storageList");
			for(int i = 0;i<storageList.size();i++){
				Storage storage = storageList.get(i);
			
			%>
			<tr>
				<td><%=storage.getName()%></td>
				<td><%=storage.getPrice()%></td>
				<td><%=storage.getNumber()%></td>
				<td><%=storage.getType()%></td>
				<td><a href="#">删除</a></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>