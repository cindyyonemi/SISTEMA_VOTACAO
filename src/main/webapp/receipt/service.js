
(function (angular, undefined) {
    'use strict';
    angular
    	.module('sysvotingApp')
        .factory('ReceiptService', ReceiptService);

    ReceiptService.$inject = ['$http', '_const'];

    function ReceiptService($http, _const) {
        var service = {
        		listPartialPercentage: listPartialPercentage
        	
        };
        return service;
        
        
        function listPartialPercentage() {
			return $http.get(_const.LIST_PARTIAL_PERCENTAGE);
		}
        
    }
})(angular);
