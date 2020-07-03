app.service("brandService", function ($http) {

    this.findAll = function(page, size) {
        return $http.get("/brand/brandList?page=" + page + "&size=" + size);
    }

    this.search = function(name, firstChar, page, size) {
        var url = "/brand/brandList?page=" + page + "&size=" + size;

        if (!isEmpty(name)) {
            url = url + "&name=" + name;
        }

        if (!isEmpty(firstChar)) {
            url = url + "&firstChar=" + firstChar;
        }
        
        return $http.get(url);
    }

    this.add = function(brand) {
        return $http.post("/brand/add", brand);
    }

    this.update = function(brand) {
        return $http.post("/brand/update", brand);
    }

    this.del = function(ids) {
        return $http.get("/brand/delete?ids=" + $scope.selectIds);
    }
});