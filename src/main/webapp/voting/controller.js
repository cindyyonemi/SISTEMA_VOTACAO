'use strict';

angular.module('sysvotingApp.voting', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/voting', {
    templateUrl: 'voting/voting.html',
    controller: 'VotingController'
  });
}])

.controller('VotingController', VotingController);

VotingController.$inject = ['VotingService', '$location'];

function VotingController(VotingService, $location) {
	var vm = this;
	vm.confirm = confirm;
	vm.options = [];
	vm.voting = {};
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
		VotingService.insert(vm.voting).
		then(function successCallback(response){
			$location.path('/receipt');
		}, function errorCallback(response){
			console.log(response);
		});
	}
}