<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>


	</head>

	<body>
        <div class="clear"></div>
		<div>
			<table>
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
							<a href="${ctx}/s3/users/${user.id}">show</a>
							<a href="${ctx}/s3/users/${user.id}/edit">edit</a>
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
				<a href="${ctx}/s3/users/new">Create New User</a>
			</p>
		</div>

	</body>
</html>
