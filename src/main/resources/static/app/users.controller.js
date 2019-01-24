var app = angular.module("app", []);

app.controller("UsersController", ['$location','$scope', '$http', function($location, $scope, $http) {


    $scope.getUser = function getUser() {
        $http.get("/users/" + $scope.usernameIn).success(function (data) {
            if (data.userName != $scope.usernameIn) {
                window.alert("Login erfolglos. \n\nEingegebener Benutzername nicht vorhanden.")
            } else {
                $scope.userName = data.userName;
                $scope.password = data.password;
                $scope.activated = data.activated;
                angular.element(document.querySelector("#passwordform")).css("display", "block");
                angular.element(document.querySelector("#usernameform")).css("display", "none");
            }
        });
    };

    $scope.back = function back(){
        location.reload();
    };

    $scope.validatePassword = function validatePassword() {
        if($scope.passwordIn != $scope.password){
            window.alert("Login erfolglos. \n\nFalsches Passwort!")
        }else if ($scope.activated != "Y"){
            window.alert("Login erfolglos. \n\nIhr Konto wurde deaktiviert")
        }else {
            angular.element(document.querySelector("#passwordform")).css("display", "none");
            angular.element(document.querySelector("#confirmation")).css("display", "block");
        }
    };
    $scope.logoff = function logoff(){
        location.reload();
    };




}]);