#mvn -v 查看版本
    compile 编译
    test 测试
    package 打包

    clean 删除target
    install 安装jar包到本地仓库

    archetype:generate maven创建目录
    archetype:generate -DgroupId=com.ray.demo -DartifactId=demo-maven -Dversion=1.0.0-SNAPSHOT -Dpackage=com.ray.demo.maven

#坐标
    构件
#仓库
    本地仓库
    远程仓库
#镜像仓库

#maven生命周期
    clean   清理项目
    default 构建项目
    site    生成项目站点

    clean 清理项目
        pre-clean 执行清理前的工作
        clean 清理上一次构建生成的所有文件
        post-clean 执行清理后的文件
    default 构建项目（最核心）
        compile test package install
    site 生成项目站点
        pre-site 在生成项目站点前要完成的工作
        site 生成项目的站点文档
        post-site 在生成项目站点后要完成的工作
        site-deploy 发布生成的站点到服务器上

#pom.xml常用元素
    dependency依赖
        scope依赖范围
        optional设置依赖是否可选（默认false）
        exclusions排除依赖列表
    build构建
        plugin插件
    parent继承
    modules模块

#依赖冲突
    短路优先
    先声明先优先


