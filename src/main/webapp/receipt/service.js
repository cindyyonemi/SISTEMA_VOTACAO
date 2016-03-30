
(function (angular, undefined) {
    'use strict';
    angular
    	.module('sysvotingApp')
        .factory('ReceiptService', ReceiptService);

    ReceiptService.$inject = ['$http'];

    function ReceiptService($http) {
        var service = {
        		listPartialPercentage: listPartialPercentage
        	
        };
        return service;
        
        
        function listPartialPercentage() {
			return $http.get("http://localhost:8080/sysvoting/rest/voting/partialPercentage");
		}
        
    }
})(angular);
