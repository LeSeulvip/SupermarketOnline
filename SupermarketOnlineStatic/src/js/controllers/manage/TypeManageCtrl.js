(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('TypeManageCtrl', ['$scope', '$log', 'DialogService', 'DataService', TypeManageCtrl]);

  function TypeManageCtrl($scope, $log, DialogService, DataService) {
    $log.debug('TypeManageCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('TypeManageCtrl destroy...');
    });

    $scope.page = {
      pageNumber: 1,
      pageSize: 5
    };

    $scope.query = function () {
      DialogService.showWait('数据处理中');
      DataService.send('/type/queryAll', {
        page: $scope.page
      }, function (data) {
        DialogService.hideWait();
        if (data.success) {
          $scope.list = data.datas.list;
          $scope.page = data.datas.page;
          return;
        }
        DialogService.showAlert(data.message);
      });
    };

    $scope.query();

    $scope.toPage = function (pn) {
      // 不能超出范围
      if (pn <= 0 || pn > $scope.page.pageCount || pn == $scope.page.pageNumber) {
        return;
      }
      //分页查询
      $scope.page.pageNumber = pn;
      $scope.query();
    };

    //添加
    $scope.toAdd = function () {

      DialogService.setTempDialogTitle('添加类型');
      DialogService.showCustom('templates/manage/typemanage-add.html', {}, function () {
        $scope.query();
      });
    };

    //删除
    $scope.toDelete = function (type) {
      DialogService.showConfirm('是否删除:' +type.typeName + '?', function () {
        DialogService.showWait('删除中，请稍后......');
        DataService.send('/type/delete', {
          tbType: type
        }, function (data) {
          DialogService.hideWait();
          DialogService.showAlert(data.message, function () {
            if (data.success) {
              $scope.query();
            }
          });
        });
      });
    };
  }
})();