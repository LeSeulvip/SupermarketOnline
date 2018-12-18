(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('TypeManageAddCtrl', ['$scope', '$log', 'DialogService', 'DataService', TypeManageAddCtrl]);

  function TypeManageAddCtrl($scope, $log, DialogService, DataService) {
    $log.debug('TypeManageAddCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('TypeManageAddCtrl destroy...');
    });

    // 关闭
    $scope.close = function () {
      DialogService.hideCustom();
    };

    //添加
    $scope.add = function () {
      DialogService.showWait("添加数据中，请稍后......");
      DataService.send('/type/add', {
        tbType: $scope.formdata
      }, function (data) {
        DialogService.hideWait();
        // if (data.success) {
        //   $scope.formdata = {};
        // }
        DialogService.showAlert(data.message, function () {
          if (data.success) {
            DialogService.hideCustom();
          }
        });
      });
    };
  }

})();