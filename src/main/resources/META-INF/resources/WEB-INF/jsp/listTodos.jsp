<%@ include file="common/header.jspf" %>
<body>
<%@ include file="common/navigation.jspf" %>

<div class="container">
<div>Welcome for Spring project ${name}</div>
<hr>
<h1>Your Todos<h1>
<table class="table">
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>is Done?</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
			<td>${todo.description}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.done}</td>
			<td><a href="delete-todos?id=${todo.id}" class="btn btn-warning">Delete</a></td>
			<td> <a href="update-todos?id=${todo.id}" class="btn btn-success">Update</a> </td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
</body>
</html>