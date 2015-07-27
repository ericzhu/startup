<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/admin/main.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/core/jquery.cms.core.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/admin/main.js"></script>
</head>
<body>
	<div id="content">
		<h3 class="admin_link_bar">
			<jsp:include page="inc.jsp"></jsp:include>
		</h3>

		<table width="1000" cellspacing="0" cellpadding="0" id="listTable" style="margin: auto; width: calc(100% - 20px);">
			<thead>
				<tr>
					<td>用户标识</td>
					<td>用户名称</td>
					<td>用户昵称</td>
					<td>用户状态</td>
					<td>用户邮箱</td>
					<td>用户操作</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>001&nbsp;</td>
					<td><a href="" class="list_link">wang er</a></td>
					<td>John Harper&nbsp;</td>
					<td><span>启用</span> &nbsp;</td>
					<td><a href="mailto:jon@hotmail.com" class="list_link">wanger@hotmail.com</a> &nbsp;</td>
					<td>
						<a href="" class="list_op delete">删除</a> 
						<a href="" class="list_op">更新</a>
						<a href="" class="list_op">管理栏目</a> &nbsp;
					</td>
				</tr>
				<tr>
					<td>001&nbsp;</td>
					<td><a href="" class="list_link">wang er</a></td>
					<td>John Harper&nbsp;</td>
					<td><span>启用</span> &nbsp;</td>
					<td><a href="mailto:jon@hotmail.com" class="list_link">wanger@hotmail.com</a> &nbsp;</td>
					<td>
						<a href="" class="list_op delete">删除</a> 
						<a href="" class="list_op">更新</a>
						<a href="" class="list_op">管理栏目</a> &nbsp;
					</td>
				</tr>
			</tbody>
			<tfoot>
			</tfoot>
		</table>

	</div>

</body>