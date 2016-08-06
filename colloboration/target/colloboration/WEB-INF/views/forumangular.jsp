<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Information - Converting GSON to JSON</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<script>
var app = angular.module('myApp', []);
 
function MyController($scope, $http) {

	 $scope.sortType = 'name'; // set the default sort type
	  $scope.sortReverse = false;  // set the default sort order
	  $scope.searchBTitle = '';
	  
        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'GsonCon1'
                }).success(function(data, status, headers, config) {
                        $scope.forum = data;  
                }).error(function(data, status, headers, config) {
                        // called asynchronously if an error occurs
                        // or server returns response with an error status.
                });
        };
};



</script>
</head>
<body>

<div class="container" ng-app="myApp" ng-controller="MyController" ng-init="getDataFromServer()">
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search Forum Name" ng-model="searchFTitle">      
       </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
      <td>
          <a href="#" ng-click="sortType = 'post_id'; sortReverse = !sortReverse">
            Post Id 
            <span ng-show="sortType == 'post_id' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'post_id' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'post_title'; sortReverse = !sortReverse">
           Forum Title 
            <span ng-show="sortType == 'post_title' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'post_title' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'post_content'; sortReverse = !sortReverse">
          Content 
            <span ng-show="sortType == 'post_content' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'post_content' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'user_name'; sortReverse = !sortReverse">
          User Name
            <span ng-show="sortType == 'user_name' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'user_name' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
         <td>
          <a href="#" ng-click="sortType = 'category'; sortReverse = !sortReverse">
          Category
            <span ng-show="sortType == 'category' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'category' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'creationDate'; sortReverse = !sortReverse">
          Creation Date
            <span ng-show="sortType == 'creationDate' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'creationDate' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="f1 in forum | orderBy:sortType:sortReverse | filter:searchFTitle">
           		<td>{{f1.post_id}}</td>
           		<td>{{f1.post_title}}</td>
           		<td>{{f1.post_content}}</td>
           		<td>{{f1.user_name}}</td>
           		<td>{{f1.category}}</td>
           		<td>{{f1.creationDate}}</td>
           	
      </tr>
    </tbody>
    
  </table>
  
</div>

</body>
</html>