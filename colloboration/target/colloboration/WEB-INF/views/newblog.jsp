<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>New Blog</title>
</head>
<body>
	<div class="container">
			
		<form:form commandName="blog" action="create">			 
 			 <div class="form-group">
   				<label for="pwd">Blog Name</label>
    			<form:input path="blog_name" class="form-control" id="blgname"/>
  			</div>
  			 <div class="form-group">
   				
    			<form:hidden path="user_name" value="${name}" class="form-control" hidden="true" id="blogname"/>
  			</div>
  			 <div class="form-group">
  			<button type="submit" class="btn btn-default">Create Blog</button>
  			</div>
		</form:form>
		
		
		
	</div>	
<%@ include file="footer.jsp" %>
</body>
</html>