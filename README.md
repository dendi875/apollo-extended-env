## 在SpringBoot中使用自定义环境的Apollo Client

[toc]

### 构建服务镜像步骤

* 把项目 clone 下来

* 进入项目所在目录

  ```she
  cd /path/to/apollo-extended-env
  ```

* 执行以下命令

```shell
# 将项目编译并打包到本地仓库
mvn clean install -Dmaven.test.skip=true
# 构建项目镜像
docker build -t dendi875/apollo-extended-env:1.0.0 .
# 登录docker hub
docker login
# 把镜像推送到远程仓库
docker push dendi875/apollo-extended-env:1.0.0 
```

