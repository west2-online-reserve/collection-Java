# Java 第四轮考核

## 部分参考资料

* 文档资料
  * [mybatis – MyBatis 3 | 简介](https://mybatis.org/mybatis-3/zh/index.html)
  * [Spring 中文文档](https://www.springcloud.cc/spring-reference.html)
  * [SpringBoot 官方文档 (spring.io)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* 视频资料
  * [狂神说mybatis](https://www.bilibili.com/video/BV1NE411Q7Nx/?spm_id_from=333.999.0.0)
  * [狂神说spring](https://www.bilibili.com/video/BV1NE411Q7Nx/?spm_id_from=333.999.0.0)
  * [狂神说Springboot](https://www.bilibili.com/video/BV1PE411i7CV)
  * [黑马程序员spring](https://www.bilibili.com/video/BV1Fi4y1S7ix?vd_source=e7a1a430689d9d09f914db65fcdea382)（一条龙）



## 知识点

* 数据库 (**Mysql**)
* **Redis**
* **Mybatis**、**MybatisPlus**数据持久层框架
  * 数据持久层: 将数据持久化保存在数据库或其他文件中的框架或中间件
* **Spring** 框架
* **SpringBoot / SpringMVC** 框架
  * 可以按顺序学习，也可以适当跳过一些有关Spring全家桶的内容。最好能了解一些原理，从Spring到MVC再到Boot学下来会有质的提升(最后会发现SpringBoot真的好用)。
* **安全框架，如SpringSecurity、Shiro等**
* **Docker的使用**



### 任务

> 你的任务是编写一个弹幕视频网站的API接口，具体要求如下：

项目要求

- 提供一份**接口文档**和**项目结构图（目录树**）。
- 注意编程规范：
  * [编程规范](../etc/blog/编程规范.md)
  * [阿里巴巴开发规范](../etc/blog/阿里巴巴Java开发手册.pdf)
- 完成Docker部署，编写Dockerfile并成功部署你的项目。
- 接口日志打印全面，入参出参，接口耗时等

#### 用户模块

1. 用户的登录注册（需要你返回token、结合安全框架）
2. 使用安全框架实现用户身份认证
3. 用户头像功能（上传头像、修改头像）
4. 获取用户信息

#### 社交模块

1. 用户的关注、互关、取关
2. 获取单个用户的粉丝列表
3. 获取单个用户的关注列表
4. 获取单个用户的朋友列表（当两个人互相关注，我们认为这两个人属于朋友）

#### 视频模块

1. 上传视频
2. 评论视频 （请注意，评论是可以有回复的）
3. 点击量排行榜（Redis）

#### 搜索

- 搜索视频，用户（搜索条件包括但不限于：年份，类别，发布时间等等）
- 保留所有的历史搜索记录（Redis）
- 排序视频（点击量，发布时间）



##### 注意：

* ID的生成请使用雪花算法等（MybatisPlus有对应的ID生成策略）



### Bonus 

**如果你想挑战更多，可以考虑以下Bonus任务：**

1. 使用对象存储服务（如阿里云、腾讯云、七牛云）来存储大文件。
2. 实现大视频的分片处理。
3. 添加管理员功能，以管理网站内容。（安全框架实现鉴权）
4. 使用Elasticsearch实现高效的搜索功能。
