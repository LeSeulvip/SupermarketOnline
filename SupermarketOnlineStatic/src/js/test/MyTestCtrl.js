(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('TestMyTsetCtrl', ['$scope', '$log', 'DialogService', 'DataService', 'MyUtilService', TestMyTsetCtrl]);

  function TestMyTsetCtrl($scope, $log, DialogService, DataService, MyUtilService) {
    $log.debug('TestMyTsetCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('TestMyTsetCtrl destroy...');
    });

    DialogService.showWait('获取后台数据中');
    DataService.send('/', {
      echo: new Date().getTime()
    }, function (data) {
      DialogService.hideWait();
      $scope.info = MyUtilService.trustAsHtml(
        MyUtilService.jsonSyntaxHighlight(
          MyUtilService.formatJson(
            JSON.stringify(data))));
    });
  }
})();