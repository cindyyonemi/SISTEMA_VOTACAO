'use strict';

angular.module('sysvotingApp.voting', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/voting', {
    templateUrl: 'voting/voting.html',
    controller: 'VotingController'
  });
}])

.controller('VotingController', VotingController);

VotingController.$inject = ['VotingService', '$location', '$captcha', '_msg'];

function VotingController(VotingService, $location, $captcha, _msg) {
	var vm = this;
	vm.confirm = confirm;
	vm.options = [];
	vm.voting = {};
	vm.resultado = undefined;
	listOptions();
	
	function listOptions(){
		VotingService.listOptions().
		then(function successCallback(response){
			vm.options = response.data;
		}, function errorCallback(response){
			console.log(response);
		});
	}
	
	function confirm(){
		
		if($captcha.checkResult(vm.resultado) == true)
		{
		 	VotingService.insert(vm.voting).
			then(function successCallback(response){
				$location.path('/receipt');
			}, function errorCallback(response){
				console.log(response);
			});
		}
		else
		{
			vm.resultado = undefined;
		 	alert(_msg.ERRO_VALIDATION_CAPTCHA);
		}
	}
}