var loginApp = angular.module('loginApp', [ 'ngAnimate', 'toastr' ]);
loginApp.config(function(toastrConfig) {
	angular.extend(toastrConfig, {
		autoDismiss : true,
		containerId : 'toast-container',
		maxOpened : 0,
		newestOnTop : true,
		positionClass : 'toast-top-right',
		preventDuplicates : false,
		preventOpenDuplicates : false,
		target : 'body'
	});
});

loginApp.controller('loginCtrl',function($scope, $http, $window, toastr) {
	// The messages displayed in toastr
	$scope.NUM_EMPTY_MSG = window.mss.constants.LOGIN_MSG.NUM_EMPTY;
	$scope.NUM_INVALID_MSG = window.mss.constants.LOGIN_MSG.NUM_INVALID;
	$scope.PASSWORD_EMPTY_MSG = window.mss.constants.LOGIN_MSG.PASSWORD_EMPTY;
	
	$scope.login = function() {
		$http({
				method : 'post',
				url : '/login',
				data : $scope.user
			})
			.success(function(response) {
				if(response.message != null)
					toastr.error("Error",response.message);
				else
				{
					toastr.success("Success",window.mss.constants.LOGIN_MSG.LOGIN_SUCCESS);
					$window.location.href = "/otpinternal/dashboard.html";
				}
					
			})
			.error(function(response) {
				toastr.error("Error",window.mss.constants.LOGIN_MSG.SERVER_ERROR);
			}); 
	};
});
