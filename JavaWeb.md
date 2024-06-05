# 数据库

## 数据库的基本概念

1. 数据库：`DataBase`    简称：DB

2. 什么是数据库？

​	用于存储和管理数据的仓库。

3. 数据库的特点：
   1. 持久化存储数据的。其实数据库就是一个文件系统。
   2. 方便存储和管理数据。
   3. 使用了统一的方式操作数据库。  --`SQL`
4. 常见的数据库软件

​	参见《`MYSQL`基础.pdf》



## `MySQL`数据模型

关系型数据库：建立在关系模型基础上，由多张相互连接的二维表组成的数据库

特点：

1. 使用表存储数据，格式统一，便于维护
2. `使用SQL`语言操作，标准统一，使用方便，可用于复杂查询

客户端--`SQL`-->`DBMS`(数据库管理系统)----->数据库---->表



## `SQL`

1. 什么是`SQL`?

   Structured Query Language：结构化查询语言

   其实就是定义了操作所有关系![image-20240602203646023](/home/noregret/.config/Typora/typora-user-images/image-20240602203646023.png)型数据库的规则。每一种数据库操作的方式存在不一样的地方，成为“方言”

2. `SQL`通用语法

   1. `SQL`语句可以单行或多行书写，以分号结尾

   2. 可使用空格和缩进来增加语句的可读性

   3. `MySQL`数据库的`SQL`语句不区分大小写

   4. 3种注释

      单行注释：-- 注释内容(--后加空格) 或 #注释内容(加不加空格都可以)   (`MySQL`特有)

      多行注释：/* 注释 */

3. 分类：`DDL` `DML` `DQL` `DCL`



### `DDL`

Data Definition Language，数据定义语言，用来定义数据库对象（数据库、表）

#### 数据库操作

`show databases;`：查询所有数据库

`create database [if not exists] 数据库名;`：创建数据库

`use 数据库名;`：使用数据库

`select database();`：查询当前数据库

`drop database [if exists] 数据库名;`：删除数据库

> 上述语法中的database，也可以替换成schema



#### 表结构操作

创建

```sql
create table 表名(
	字段1 字段类型 [约束] [comment 字段1注释],
    ...
    字段n 字段类型 [约束] [c是一款优秀的omment 字段n注释]
)[comment 表注释]
```

约束：

- 概念：约束是作用于表中字段上的规则，用于限制存储在表中的数据
- 目的：保证数据库中数据的正确性、有效性和完整性

![image-20240531220153701](/home/noregret/.config/Typora/typora-user-images/image-20240531220153701.png)



# `MyBatis`

`MyBatis`是一款优秀的**持久化**框架，用于简化`JDBC`的开发。

快速入门程序步骤：

1. 准备工作（创建`springboot`工程、数据库表、实体类）
2. 引入`Mybatis`的相关依赖，配置`Mybatis`（数据库连接信息）
3. 编写`SQL`语句（注解/XML）
4. 单元测试



## `JDBC`介绍

`JDBC`，就是使用Java数据操作关系型数据库的一套API。

 缺点：

- 硬编码
- 繁琐
- 资源浪费，性能降低



## 数据库连接池

- 数据库连接池是个容器，负责分配、管理数据库连接
- 它允许应用程序重复使用一个现有的数据库连接，而不是再建立一个
- 释放空闲时间超过最大空闲时间的连接，来避免因为没有释放连接而引起的数据库连接遗漏

优势：

- 资源重用
- 提升系统响应速度
- 避免数据库连接遗漏



## `lombok`工具包

`Lombok`是一个实用的Java类库，能通过注解的形式自动生成构造器，getter/setter、equals、hashcode、toString等方法，并可以自动化生成日志变量，简化java开发，提高效率。

![image-20240603220531078](/home/noregret/.config/Typora/typora-user-images/image-20240603220531078.png)



## 基础操作

### 删除

- `SQL`语句：

  ```sql
  delete from emp where id = 17;
  ```

- 接口方法：

  ```java
  @Delete("delete from emp where id = #{id}") //#{}占位符
  public void delete(Integer id);
  ```

![image-20240603222152874](/home/noregret/.config/Typora/typora-user-images/image-20240603222152874.png)

占位符预编译`SQL`优势：

- 性能更高

  ![image-20240603222951777](/home/noregret/.config/Typora/typora-user-images/image-20240603222951777.png)

- 更安全（防止`SQL`注入）

```sql
-- 密码为' or '1'='1
select count(*) from emp where username = '***' and password = '' or '1'='1'; 
-- or后的表达式永远成立
```



### 新增（主键返回）

- 在数据添加成功后，需要获取插入数据库数据的主键。

- 实现：

  ![image-20240603223305364](/home/noregret/.config/Typora/typora-user-images/image-20240603223305364.png)



### 更新

- `SQL`语句：

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240603223448754.png" alt="image-20240603223448754" style="zoom:50%;" />

- 接口方法：

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240603223516237.png" alt="image-20240603223516237" style="zoom:50%;" />



### 查询（根据ID查询）

- `SQL`语句：

  ```sql
  select * from emp where id = 19;
  ```

- 接口方法：

  ```java
  @Select("select * from emp where id = #{id}")
  public Emp getById(Integer id);
  ```

结果：实体类属性名和数据库表查询返回的字段名不一致的数据结果为NULL

#### 数据封装

- 实体类属性名和数据库表查询返回的字段名一致，`mybatis`会自动封装
- 如果实体类属性名和数据库表查询返回的字段名不一致，不能自动封装

解决方案：

- 起别名：在`SQL`语句中，对不一样的列名起别名，别名和实体类属性名一样

- 手动结果映射：通过@Results及@Result进行手动结果映射

- 开启驼峰命名（建议）：如果字段名与属性名符合驼峰命名规则，`mybatis`会自动通过驼峰命名规则映射。

  ```properties
  #开启驼峰命名自动映射，即从数据库字段名a_column映射到Java属性名aColumn
  mybatis.configuration.map-underscore-to-camel-case=true
  ```

  

### 查询（条件查询）

- `SQL`语句：

  ```sql
  select * from emp where name like '%张%';
  ```

- 接口方法：

  ```java
  @Select("select * from emp where name like '%${name}%'")
  public List<Emp> list(String name);
  ```

  `${}`生成的不是预编译的`SQL`，因此有性能低，不安全，存在`SQL`注入问题的缺点

  推荐使用`concat`（拼接字符串函数）：

  ```java
  @Select("select * from emp where name like concat('%',#{name},'%')")
  public List<Emp> list(String name);
  ```

  

## `XML`映射文件

### 规范

- `XML`映射文件的名称与`Mapper`接口名称一致，并将`XML`映射文件和`Mapper`接口放置在相同包名下。（同包同名）
- `XML`映射文件的`namespace`属性为`Mapper`接口全限定名一致。 
- `XML`映射文件中`sql`语句中的id与`Mapper`接口中的方法名一致，并保持返回类型一致

举例：

![image-20240604171856377](/home/noregret/.config/Typora/typora-user-images/image-20240604171856377.png)



## 动态`SQL`

随着用户的输入或外部条件的变化而变化的`SQL`语句，我们称为*动态`SQL`*。

#### `<if>`

- 用于判断条件是否成立。使用`test`属性进行条件判断，如果条件为true，则拼接`SQL`。
- 形式：`<if test = "name != null">...</if>`

#### `<where>`

`where`元素只会在子元素有内容的情况下才插入where子句。而且会自动去除子句的开头的`and`或`or`。

#### `<set>`

动态地在行首插入`set`关键字，并会删除额外的逗号。（用在`update`语句中）

#### `<foreach>`

- `SQL`语句

  ```sql
  delete from emp where id in (1,2,3);
  ```

- 接口方法

  ```java
  //批量删除
  public void deleteByIds(List<Integer> ids);
  ```

- `XML`映射文件

  ```xml
  <delete id = "deleteByIds">
  	delete from emp where id in
  	<foreach collection="ids" item="id" separator="," open="(" close=")">
  	 #{id}
  	</foreach>
  </delete>
  ```

  属性：

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240604175935860.png" alt="image-20240604175935860" style="zoom:50%;" />

#### `sql`片段

- `<sql>`：定义可重用的`SQL`片段
- `<include>`：通过属性refid，指定包含的`sql`片段



# `Tomcat`

web服务器软件

服务器：安装了服务器软件的机器

服务器软件：接收用户的请求，处理请求，做出相应

web服务器软件：接收用户的请求，处理请求，做出相应

- 在web服务器软件中，可以部署web项目，让用户通过浏览器来访问这些项目
- web容器

#### 配置

部署项目的方式：直接将项目放到webapps目录下即可

* /hello：项目的访问路径-->虚拟目录
* 简化部署：将项目打成一个war包，再将war包放置到webapps目录下，war包会自动解压缩

静态项目和动态项目

* 目录结构：

  java动态项目：`WEB-INF`

  web.xml：该项目的核心配置文件

  classes目录：放置字节码文件

  lib目录：放置项目依赖的jar包



# `Servlet`

运行在服务器端的小程序

- `Servlet`就是一个接口，定义了Java类被浏览器访问到（`tomcat`识别）的规则
- 将来我们自定义一个类，实现`Servlet`接口，复写方法

#### 执行原理

1. 当服务器接收到客户端浏览器的请求后，会解析请求URL路径，获取访问的`Servlet`的资源路径
2. 查找web.xml文件，是否有对应的`<url-pattern>`标签体内容
3. 如果有，则在找到对应的`<servlet-class>`全类名
4. tomcat会将字节码文件加载进内存，并且创建其对象
5. 调用其方法

#### `Servlet`中的生命周期

1. 被创建：执行`init`方法，只执行一次

   `Servlet`什么时候被创建？

   默认情况下，第一次被访问时，`Servlet`被创建

   可以配置执行`Servlet`的创建时机。

   - 在`<Servlet>`标签下配置

     1.  第一次被访问时，创建 

        `<load-on-startup>`的值为负数

     2. 在服务器启动时，创建

        `<load-on-startup>`的值为0或正整数

   `Servlet`的`init`方法，只执行一次，说明一个`Servlet`在内存中只存在一个对象，`Servlet`是单例的

   ​	多个用户同时访问时，可能存在线程安全问题

   ​	解决：尽量不要在`Servlet`中定义成员变量。即使定义了成员变量，也不要修改值

2. 提供服务：执行`service`方法，执行多次

   每次访问`Servlet`时，`service`方法都会被调用一次

3. 被销毁：执行`destroy`方法，只执行一次

   `Servlet`被销毁时执行。服务器关闭时，`Servlet`被销毁

   只有服务器正常关闭时，才会执行`destroy`方法

   `destroy`方法在`Servlet`被销毁之前执行，一般用于释放资源

#### `Servlet3.0`

好处：支持注解配置。可以不需要web.xml了

步骤：

1. 创建JavaEE项目，选择`Servlet`的版本3.0以上，可以不创建web.xml

2. 定义一个类，实现`Servlet`接口

3. 复写方法

4. 在类上使用`@WebServlet`注解，进行配置

   `@WebServlet("资源路径")`

#### `Servlet`的体系结构

`Servlet`  ----  接口

​       |

`GenericServlet`  ----  抽象类 

​       |

`HttpServlet`  ----  抽象类

`GenericServlet`：将`Servlet`接口中其他的方法做了默认空实现，只将`service()`方法作为抽象

`HttpServlet`：对http协议的一种封装，简化操作

1. 定义类继承`HttpServlet`
2. 复写`doGet`/`doPost`方法

#### `Servlet`相关配置

`urlpattern`：`Servlet`访问路径

1. 一个`Servlet`可以定义多个访问路径:`@WebServlet({"/d4","/dd4","/ddd4"})`
2. 路径定义规则
   1. `/xxx`
   2. `/xxx/xxx`
   3. `*.do`
