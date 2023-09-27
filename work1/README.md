# Java & Andoird第一轮考核

## 参考资料
test
### 参考视频（建议刚接触编程语言的跟着视频走）

* [狂神说Java]( https://www.bilibili.com/video/BV12J41137hu?share_source=copy_web&vd_source=7d2fd3963c594f890889ebd454ef8d1c)	(通俗易懂，学习方法也讲的不错，后面也有一些内容是推荐狂神老师的视频教程)
* [动力节点](https://www.bilibili.com/video/BV1Rx411876f?share_source=copy_web&vd_source=7d2fd3963c594f890889ebd454ef8d1c)
* Android Kotlin：
  * [Kotlin 基础视频+文章 by 扔物线](https://rengwuxian.com/kotlin-basic-1/)
  * [Kotlin 从入门到实战](https://www.bilibili.com/video/BV1bZ4y1N7my)

### 基础参考教程

* [廖雪峰Java入门教程 (liaoxuefeng.com)](https://www.liaoxuefeng.com/wiki/1252599548343744) **不建议跟着用Eclipse，关于IDE的推荐具体看下面的提示**
* [编程狮](https://www.w3cschool.cn/java/)

### 推荐书籍

* 《Head First Java》(图解多、讲的比较简单、内容不够全面，可以来读读提高兴趣)
* 《Java核心技术卷Ⅰ》
* 《Java核心技术卷Ⅱ》
* 《Thinking In Java》 (人称Java圣经(可能会有些难懂))
* 对 Android 方向，可以提前通过以下资料熟悉下 Kotlin：
  * [Java to Kotlin](https://github.com/MindorksOpenSource/from-java-to-kotlin)
  * [Kotlin 官方指南](https://www.kotlincn.net/docs/reference/basic-syntax.html)



## 知识点

* 配置编译环境
* 输入输出
* 选择结构、循环结构
* 方法
* 数组
* 面向对象

## 任务

* 进行Java开发环境配置
* 完成下面两项在线刷题网站的任务，当然写的越多越好，尽可能的熟悉java语言
  * 进行[基础编程题目集 (pintia.cn)](https://pintia.cn/problem-sets/14/exam/problems/type/7)练习，并达到至少一百分
  * 完成[27. 移除元素 - 力扣（LeetCode）](https://leetcode.cn/problems/remove-element/)
* 设计一个西瓜摊类
  * 私有变量： 
    * 摊号 long id
    * 摊主姓名 String name
    * 在售西瓜数 int total
    * 是否休摊整改 boolean isClosed
  * 方法：
    * 上述变量对应的 get 和 set 方法
    * 一个重写的 toString()方法来输出 该西瓜摊的所有信息（要有一定的格式
    * 一个接受摊号(long)、摊主姓名(name) 、在售西瓜数(int)、是否休摊整改 (boolean)作为参数的构造方法
    * 一个静态(static)方法 purchase（Booth 商家, int 购买数量）, 向目标摊位卖家 购买指定数量的西瓜。 购买的西瓜数必须为正数；商家不能处于休摊整改状态；购买西瓜数不能大于在售西 瓜数。出现以上情况视为购买失败，摊主在售西瓜数不能有所变化。 无论交易成功与否，都要输出一定的提示信息
    * 一个实例方法 restock(int 进货西瓜数),为对应摊位进货，单次进货量不能超过 200，进货失败则输出相应的提示信息。 
    * 一个静态(static)方法 closeBooths（Booth[] booths）让 booths 中所有未被休 业整改的摊位歇业(将 false 变为 true)，输出已在休业整改的摊位信息（调用实例的 toString()方法）。

## 提示

* 学习资料择需学习即可，不需要全部学习

* [ Java环境简单配置+IDEA](https://blog.csdn.net/qq_33215972/article/details/73693140)

* 强烈建议使用[IntelliJ IDEA](https://www.jetbrains.com/zh-cn/idea/)进行编程

  * IntelliJ Idea(之后简称Idea)可以通过[福州大学邮件系统 (fzu.edu.cn)](https://fzu.edu.cn/coremail/index.jsp)进行[Idea学生认证](https://www.jetbrains.com/shop/eform/students/)后可免费使用一年(到期再次申请即可)
  * [2022 JetBrains 开发工具——学生授权免费申请指南 | Company Blog](https://blog.jetbrains.com/zh-hans/blog/2022/08/24/2022-jetbrains-student-program/)

* 参数名请使用有意义的单词或短语，要求**见名知意**

* 大家刚开始写都会有些懵懵的，不知道在写啥，不过这次只要能写出来能跑就行了，不懂的以后会慢慢再接触了解的。

  **Done is better than perfect!**
