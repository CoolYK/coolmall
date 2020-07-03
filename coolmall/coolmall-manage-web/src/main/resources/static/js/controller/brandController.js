app.controller("brandController", function($scope, $controller, brandService) {
    
    $controller("baseController", {$scope:$scope});

    $scope.brandList = function(){
        if (isEmpty($scope.searchBrand.name) && isEmpty($scope.searchBrand.firstChar)) {
            brandService.findAll($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage)
                .success(function(response) {
                    $scope.brandList = response.rows;
                    $scope.paginationConf.totalItems=response.total;
                });
        } else {
            brandService.search($scope.searchBrand.name, $scope.searchBrand.firstChar, $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage)
            .success(function(response) {
                $scope.brandList = response.rows;
                $scope.paginationConf.totalItems=response.total;
            });
        }
    }

    $scope.save = function(brand) {

        if (isEmpty(brand.id)) {
            brandService.add(brand).success(
                function (response) {
                    if (response.success) {
                        $scope.brandList();
                    } else {
                        alert(response.message);
                    }
                }
            )
        } else {
            brandService.update(brand).success(
                function (response) {
                    if (response.success) {
                        $scope.brandList();
                    } else {
                        alert(response.message);
                    }
                }
            )
        }
    }

    $scope.deleteBrands = function(ids) {
        brandService.del(ids).success(
            function (response) {
                if (response.success) {
                    $scope.brandList();
                } else {
                    alert(response.message);
                }
            }
        )
    }

    $scope.resetBrand= function() {
        $scope.editBrand = {
                id:null,
                name:null,
                firstChar:null
            };
    }
});