<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign Up</title>
</head>
<body>
    <div class="form-container">
     
    <h1>Registration Form</h1>
     
    <form:form method="POST" modelAttribute="user" class="form-horizontal">
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userId">User Id</label>
                <div class="col-md-7">
                    <form:input type="text" path="userId" id="userId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="userId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="Name">User Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="Name" id="Name" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="Name" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">Password</label>
                <div class="col-md-7">
                    <form:input type="text" path="password" id="password" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="cpassword">Confirm Password</label>
                <div class="col-md-7">
                    <form:input type="text" path="cpassword" id="cpassword" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="cpassword" class="help-inline"/>
                    </div>
                </div>
            </div>
            
        
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="gender">Gender</label>
                <div class="col-md-7" class="form-control input-sm">
                    <form:radiobutton path="gender" value="M" />Male 
                    <form:radiobutton path="gender" value="F" />Female
                    <div class="has-error">
                        <form:errors path="gender" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="dob">Date of birth</label>
                <div class="col-md-7">
                    <form:input type="text" path="dob" id="dob" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="dob" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="email">Email</label>
                <div class="col-md-7">
                    <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="email" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
	<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="ph">Phone Number</label>
                <div class="col-md-7">
                    <form:input type="text" path="ph" id="ph" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="ph" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
	  
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="country">Country</label>
                <div class="col-md-7">
                    <form:select path="country" id="country" class="form-control input-sm">
                        <form:option value="">Select Country</form:option>
                        <form:options items="${countries}" />
                    </form:select>
                    <div class="has-error">
                        <form:errors path="country" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
    </div>
    <%@ include file="footer.jsp" %>
  </body>
</body>
</html>
