angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response) {
                $scope.productList = response.data;
            });
    };
    $scope.loadProducts();

    $scope.changeCost = function (productId, delta){
        $http({
            url: contextPath + '/product/change_cost',
            method: 'GET',
            params: {
                productId: productId,
                delta: delta
            }
        }).then(function (response){
            $scope.loadProducts();
        });
    };

    $scope.loadProducts();

});