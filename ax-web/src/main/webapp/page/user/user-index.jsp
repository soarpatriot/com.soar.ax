<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>


	</head>

	<body>
        
		<div>
			<table class="table table-bordered table-striped">
				<tr>
					<th>
						id
					</th>
					<th>
						loginName
					</th>
					<th>
						password
					</th>
					<th>
						operation
					</th>
					<th>
						delete
					</th>
				</tr>

				<c:forEach items="${users}" var="user">
					<tr>
						<td>
							${user.id}
						</td>
						<td>
							${user.loginName}
						</td>
						<td>
							${user.password}
						</td>
						<td>
							<a href="${ctx}/users/${user.id}">show</a>
							<a href="${ctx}/users/${user.id}/edit">edit</a>
						</td>
						<td>
							<form action="users/${user.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<input type="submit" value="Delete" />
							</form>
						</td>
					</tr>
				</c:forEach>


			</table>
			<p>
				<a href="${ctx}/users/new">Create New User</a>
			</p>
		</div>

	</body>
</html>
