<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
 <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>
<style>
	.img1
	{
		height : 350px;
		width : 700px;
		background-image: url(<c:url value="/resources/images/pic1.jpg" />);
   		background-position: center;
    	background-size: 50% 50%;
    	background-repeat: no-repeat;
	}
</style>
</head>
<body>
<br><br><br><br>
	<div class="img1">
	<div class="container">
		<center><font style="color: green;"><h1>${msg}</h1></font></center>
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">Login</strong>

                </div>
                <div class="panel-body">
                    <form class="form-horizontal" action="<c:url value="/logincheck" />" method="post" role="form">
                     <c:if test="${not empty error}">
                   <div class="error" style="color: #ff0000 ;">${error}</div>
               </c:if>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-3 control-label">Name</label>
                            <div class="col-sm-9">
                                <input type="text" name="username" class="form-control" id="inputEmail3" placeholder="UserName" required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
                            <div class="col-sm-9">
                                <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password" required="true">
                            </div>
                        </div>
                        
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                             <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                                <button type="submit"  class="btn btn-success btn-sm">Login</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer">New User <a href="SignUp" class="">Register here</a>
                </div>
            </div>
        </div>
    </div>
  </div>
</div>
</body>
</html>