'use strict';

angular.module('sysvotingApp.receipt', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/receipt', {
    templateUrl: 'receipt/receipt.html',
    controller: 'ReceiptController'
  });
}])

.controller('ReceiptController', ReceiptController);

ReceiptController.$inject = ['ReceiptService'];

function ReceiptController(ReceiptService) {
	var vm = this;
	vm.votings = [];
	listPartialPercentage();
	
	function listPartialPercentage(){
		ReceiptService.listPartialPercentage().
		then(function successCallback(response){
			vm.votings = response.data;
		}, function errorCallback(response){
			console.log(response);
		});
	}
}