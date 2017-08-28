<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/bootstrap/3/css/bootstrap.css" />
<script type="text/javascript"
	src="//cdn.jsdelivr.net/jquery/1/jquery.min.js"></script>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.css" />
<link href="/css/bootstrap.css" rel="stylesheet">


<script type="text/javascript">


</script>
<style>
.ui-datepicker-calendar {
	display: none;
}

@media print {
	@page {
		size: auto; /* auto is the initial value */
		margin: 0; /* this affects the margin in the printer settings */
	}
	#printPageButton {
		display: none;
	}
	.btn.button_person {
		margin-left: 51px;
	}
}

.td {
	font: blue;
}

.gtext {
	font-weight: bold
}

.right {
	float: right;
	font-size: 18px;
	font-weight: bold;
	width: 224px;
}
</style>
</head>


<body>
	<%-- <%@ include file="login.jsp"%> --%>
	<script>w3.includeHTML();</script>
	<div id="wrapper">
		<div class="col-lg-8">
			<c:forEach var="item" items="${autoesporte.feed}">
				<a href="${item.link}">${item.title}</a>
				<p></p>
				<c:forEach var="c" items="${item.content}">
					<c:if test="${c.type == 'text'}">						
						 <p>${c.content}</p>
					 </c:if>
					 <c:if test="${c.type == 'image'}">						
						 <img src="${c.content}">
					 </c:if>
					 <c:if test="${c.type == 'links'}">						
						 <a href="${c.content}"></a>
					 </c:if>
				</c:forEach>
				
			</c:forEach>
		</div>
	</div>
</body>
</html>
