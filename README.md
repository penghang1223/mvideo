# mvideo

#### 介绍
在线视频平台  小组开发项目

#### 软件架构
软件架构说明


#### 安装教程

1.  克隆仓库到本地，通过Idea打开

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

**更新日志**

- 2020年10月12日 搭建项目结构 添加maven依赖 by Schean
- 2020年10月13日 完善实体类，链接数据库
  - user的Dao层 user的Service层 user（加了一个用户名和密码构造参数）测试
  - 修改目录结构，添加Role、Permission、RolePermission的Dao和实现与测试
  - 添加Video、VideoType、History、Collection DAO层、添加HistoryDo、CollectionDO(用于页面展示)、优化UserServiceImpl（优化if）
- 2020年10月14日 完善Dao层、Service层，使用阿里云服务器搭建数据库
  - zjl：LogDao(增加） LogDaoImpl(增加） jdbc(修改）
  - wk：修改部分方法名，保持一致性
        添加 Advert、Order 等Dao层，Service层与测试类
        添加前端资源，添加首页
  - SCH：增加Video、VideoType、History、Collection  Service接口、实现类 添加本地Tomcat  Artifact war包统一命名mvideowar
  - 
- Processing.........

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
