# SupermarketOnline

- 后台项目依赖
  - 在临时下载目录中里面打开`Git Bash here`
  - 执行`git clone git@github.com:huhuiyu/springboot-mybatis-base.git SupermarketOnline`
  - 将里面的项目名称修改为`SupermarketOnline`
  - 编辑项目里面的`.project`文件，将里面的项目名称修改为`SupermarketOnline`
  - 编辑项目里面的`settings.gradle`文件，将里面的项目名称修改为`SupermarketOnline`
  - 将项目复制到当前项目中
  - 将项目`import`到`eclipse`中
  - 将package名称重构为项目自己的package名称
  - 将BaseAop类中的controller切面修改正确
  - 将sql文件中的数据库名称更改为项目的数据库名称
  - 将mybatis-config.xml中的package名称修改正确
  - 将所有的mapper的xml文件中的package名称修改正确
  - 将application.yml文件中的数据库连接修改正确
  - 将run目录中的脚本文件中的路径和项目名称修改正确
  - 将项目clean，build
  - 启动项目并测试url，第一次需要获取token，后面都要使用第一次获取的token
  - `http://127.0.0.1:14000/?token=250c7d66-536a-4043-9b87-4da639c5ec8e&echo=123`
  - `http://127.0.0.1:14000/util/validate.jpg?token=250c7d66-536a-4043-9b87-4da639c5ec8e`
  - `http://127.0.0.1:14000/test/checkImageCode?token=250c7d66-536a-4043-9b87-4da639c5ec8e&imageCode=ehx1x`

- 前台项目依赖
  - 在临时下载目录中里面打开`Git Bash here`
  - 执行`git clone git@github.com:huhuiyu/angularjs-base.git SupermarketOnlineStatic`
  - 删除`.git`和`docs`目录以及所有`.md`文件后复制到当前项目