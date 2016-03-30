
(function (angular, undefined) {
    'use strict';
    angular
    	.module('sysvotingApp')
        .factory('VotingService', VotingService);

    VotingService.$inject = ['$http'];

    function VotingService($http) {
        var service = {
        	listOptions: listOptions,
        	insert: insert
        	
        };
        return service;
        
        
        function listOptions() {
			return $http.get("http://localhost:8080/sysvoting-rest/rest/option/options");
		}
        
        function insert(voting){
			return $http({
				url: 'http://localhost:8080/sysvoting-rest/rest/voting/insert',
				method: 'post',
				data: voting
			});
        }
        
    }
})(angular);
