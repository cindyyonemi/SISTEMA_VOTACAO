
(function (angular, undefined) {
    'use strict';
    angular
    	.module('sysvotingApp')
        .factory('VotingService', VotingService);

    VotingService.$inject = ['$http', '_const'];

    function VotingService($http, _const) {
        var service = {
        	listOptions: listOptions,
        	insert: insert
        	
        };
        return service;
        
        
        function listOptions() {
			return $http.get(_const.LIST_OPTIONS);
		}
        
        function insert(voting){
			return $http({
				url: _const.INSERT_VOTING,
				method: 'post',
				data: voting
			});
        }
        
    }
})(angular);
