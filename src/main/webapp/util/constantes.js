/**
 * Contantes projeto
 */
(function (angular, undefined) {
    'use strict';
    angular.module('const', [])
        .constant('_const', {
        	LIST_OPTIONS: resourceOf('/option/options'),
        	INSERT_VOTING: resourceOf('/voting/insert'),
        	LIST_PARTIAL_PERCENTAGE: resourceOf('/voting/partialPercentage')
        });

    function resourceOf(name) {
        return '/sysvoting/rest' + name;
    }
})(angular);
