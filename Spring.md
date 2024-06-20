# `Spring`

代码书写现状

- 耦合度偏高

解决方案

- 使用对象时，在程序中不要主动使用`new`产生对象，转换为由**外部**提供对象

`IoC`(Inversion of  Control)控制反转

- 对象的创建控制权由程序转移到**外部**，这种思想成为控制反转

`Spring`技术对`Ioc`思想进行了实现

- `Spring`提供了一个容器，称为`IoC`容器，用来充当`IoC`思想中的“外部”。
- `IoC`容器负责对象的创建、初始化等一系列工作，被创建或被管理的对象在`IoC`容器中统称为`Bean`

`DI`(Dependency Injection)依赖注入

- 在容器中建立bean与bean之间的依赖关系的整个过程，称为依赖注入

目标：充分解耦

###   `bean`配置

`id`：`bean`的id，使用容器可以通过id值获取对应的`bean`，在一个容器中id值唯一

`class`：`bean`的类型，即配置的`bean`的全路径类名

`name`：`bean`的别名，可定义多个，使用逗号（,）分号（;）空格（ ）分隔

> 获取`bean`无论是通过id还是name获取，如果无法获取到，将抛出异常`NoSuchBeanDefinitionException`

`scope`：`bean`的属性，`bean`标签，定义`bean`的作用范围，可选范围有：

- `singleton`：单例（默认）
- `prototype`：非单例

### `bean`实例化

1. 构造方法（常用）

   - 提供可访问的构造方法

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617202352791.png" alt="image-20240617202352791" style="zoom: 50%;" />

   - 配置

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617202417409.png" alt="image-20240617202417409" style="zoom:50%;" />

   - 无参构造方法如果不存在，将抛出异常`BeanCreationException`

2. 静态工厂

   - 静态工厂

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617202810507.png" alt="image-20240617202810507" style="zoom:50%;" />

   - 配置

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617202835115.png" alt="image-20240617202835115" style="zoom:50%;" />

3. 实例工厂

   - 实例工厂

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617203138561.png" alt="image-20240617203138561" style="zoom:50%;" />

   - 配置

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240617203302145.png" alt="image-20240617203302145" style="zoom:50%;" />

4. `FactoryBean`（实用）

   - `FactoryBean`

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617204325781.png" alt="image-20240617204325781" style="zoom:50%;" />

   - 配置

     <img src="/home/noregret/.config/Typora/typora-user-images/image-20240617204358404.png" alt="image-20240617204358404" style="zoom:50%;" />

### `bean`的生命周期

生命周期：从创建到消亡的完整过程

`bean`生命周期：`bean`从创建到销毁的整体过程

 `bean`生命周期控制：在`bean`创建后到销毁前做一些事情

- 提供生命周期控制方法

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618151742495.png" alt="image-20240618151742495" style="zoom: 50%;" />

- 配置生命周期控制方法

  ![image-20240618151815244](/home/noregret/.config/Typora/typora-user-images/image-20240618151815244.png)

`bean`销毁时机

- 容器关闭前触发`bean`的销毁

- 关闭容器方式

  - 手工关闭容器

    `ConfigurableApplicationContext`接口`close()`操作

  - 注册关闭钩子，在虚拟机退出前先关闭容器再退出虚拟机

    `ConfigurableApplicationContext`接口`registerShutdownHook`操作



### `setter`注入

#### 引用类型

- 在`bean`中定义引用类型属性并提供可访问的`set`方法

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618153608694.png" alt="image-20240618153608694" style="zoom:50%;" />

- 配置中使用`property`标签`ref`属性注入引用类型对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618153656117.png" alt="image-20240618153656117" style="zoom:50%;" />

#### 简单类型

- 在`bean`中定义引用类型属性并提供可访问的`set`方法

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618154346050.png" alt="image-20240618154346050" style="zoom:50%;" />

- 配置中使用`property`标签`value`属性注入简单类型数据‘

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618154431496.png" alt="image-20240618154431496" style="zoom:50%;" />

### 构造器注入——引用类型

- 在`bean`中定义引用类型属性并提供可访问的构造方法

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618161311856.png" alt="image-20240618161311856" style="zoom:50%;" />

- 配置中使用`constructor-arg`标签`ref`属性注入引用类型对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618161423823.png" alt="image-20240618161423823" style="zoom:50%;" />

### 依赖自动装配

`IoC`容器根据`bean`所依赖的资源在容器中自动查找并注入到`bean`中的过程称为自动装配

- 配置中使用`bean`标签`autowire`属性设置自动装配的类型

  ![image-20240618165959643](/home/noregret/.config/Typora/typora-user-images/image-20240618165959643.png)

### 集合注入

- 注入数组对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618170846877.png" alt="image-20240618170846877" style="zoom:50%;" />

- 注入`List`对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618170925303.png" alt="image-20240618170925303" style="zoom:50%;" />

- 注入`Set`对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618171002564.png" alt="image-20240618171002564" style="zoom:50%;" />

- 注入`Map`对象（重点）

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618171035248.png" alt="image-20240618171035248" style="zoom:50%;" />

- 注入`Properties`对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618171114406.png" alt="image-20240618171114406" style="zoom:50%;" />

### 加载`properties`文件

- 开启context命名空间

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618192132715.png" alt="image-20240618192132715" style="zoom:50%;" />

- 使用context命名空间，加载指定`properties`文件

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618192221599.png" alt="image-20240618192221599" style="zoom:50%;" />

- 使用${}读取加载的属性值

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240618192257178.png" alt="image-20240618192257178" style="zoom:50%;" />

#### 加载`properties`文件

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240618202447079.png" alt="image-20240618202447079" style="zoom:50%;" />

### 容器

#### 创建容器

![image-20240618204003201](/home/noregret/.config/Typora/typora-user-images/image-20240618204003201.png)

#### 获取`bean`

![image-20240618204035896](/home/noregret/.config/Typora/typora-user-images/image-20240618204035896.png)

#### `BeanFactory`初始化

![image-20240618210523706](/home/noregret/.config/Typora/typora-user-images/image-20240618210523706.png)

## 注解开发

### 定义`bean`

- 使用`@Component`定义`bean`

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619165623626.png" alt="image-20240619165623626" style="zoom:50%;" />

- 核心配置文件中通过组件扫描加载`bean`

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619165708209.png" alt="image-20240619165708209" style="zoom:50%;" />



- Spring提供`@Component`注解的三个衍生注解
  - `@Controller`：用于表现层`bean`定义
  - `@Service`：用于业务层`bean`定义
  - `@Repository`：用于数据层`bean`定义

### 纯注解开发

![image-20240619180204120](/home/noregret/.config/Typora/typora-user-images/image-20240619180204120.png)

- `@Configuration`注解用于设定当前类为配置类

- `@ComponentScan`注解用于设定扫描路径，此注解只能添加一次，多个数据请用数组形式

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619180549110.png" alt="image-20240619180549110" style="zoom:50%;" /> 

- 读取Spring核心配置文件初始化容器对象切换为读取Java配置类初始化容器对象

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619180916451.png" alt="image-20240619180916451" style="zoom:50%;" />

### `bean`作用范围

使用`@Scope`定义`bean`作用范围

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619181436881.png" alt="image-20240619181436881" style="zoom:50%;" />

### `bean`生命周期

使用`@PostConstruct`、`@PreDestroy`定义`bean`生命周期

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619181606873.png" alt="image-20240619181606873" style="zoom:50%;" />

### 依赖注入

- 使用`@Autowired`注解开启自动装配模式（按类型）

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619183057570.png" alt="image-20240619183057570" style="zoom:50%;" />

注意：自动装配基于反射设计创建对象并暴力反射对应属性为私有属性初始化数据，因此无需提供`setter`方法

注意：自动装配建议使用无参构造方法创建对象（默认），如果不提供对应构造方法，请提供唯一的构造方法

- 使用`@Qualifier`注解开启指定名称装配`bean`

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619183511813.png" alt="image-20240619183511813" style="zoom:50%;" />

注意：`@Qualifier`注解无法单独使用，必须配合`@Autowired`注解使用

- 使用`@Value`实现简单类型注入

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619183850463.png" alt="image-20240619183850463" style="zoom:50%;" />

### 加载`properties`文件

- 使用`@PropertySource`注解加载`properties`文件

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619184957835.png" alt="image-20240619184957835" style="zoom:50%;" />

- 注意：路径仅支持单一文件配置，多文件请使用数组格式配置，不允许使用通配符*

### 第三方`bean`管理

使用独立的配置类管理第三方`bean`

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619190211641.png" alt="image-20240619190211641" style="zoom:50%;" />

导入式

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619190254796.png" alt="image-20240619190254796" style="zoom:50%;" />

使用`@Import`注解手动加入配置类到核心配置，此注解只能添加一次，多个数据请用数组格式

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619190353679.png" alt="image-20240619190353679" style="zoom:50%;" />

### 第三方`bean`依赖注入

- 简单类型依赖注入

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619190833480.png" alt="image-20240619190833480" style="zoom:50%;" />

- 引用类型依赖注入

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240619190857858.png" alt="image-20240619190857858" style="zoom:50%;" />

  引用类型注入只需要为`bean`定义方法设置形参即可，容器会根据类型自动装配对象

### `Spring`整合`MyBatis`

整合`MyBatis`

![image-20240619200219108](/home/noregret/.config/Typora/typora-user-images/image-20240619200219108.png)

![image-20240619200303990](/home/noregret/.config/Typora/typora-user-images/image-20240619200303990.png)

### 整合`JUnit`

使用`Spring`整合`Junit`专用的类加载器

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240619201138093.png" alt="image-20240619201138093" style="zoom:50%;" />

### `AOP`

面向切面编程，一种编程范式，指导开发者如何组织程序结构

作用：在不惊动原始设计的基础上为其进行功能增强

#### `AOP`核心概念

![image-20240620162332248](/home/noregret/.config/Typora/typora-user-images/image-20240620162332248.png)

#### `AOP`入门案例

1. 导入`aop`相关坐标

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620170852176.png" alt="image-20240620170852176" style="zoom:50%;" />

2. 定义`dao`接口和实现类

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620170921606.png" alt="image-20240620170921606" style="zoom:50%;" />

3. 定义通知类，制作通知

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620170949363.png" alt="image-20240620170949363" style="zoom:50%;" />

4. 定义切入点

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620171030784.png" alt="image-20240620171030784" style="zoom:50%;" />

说明：切入点定义依托一个不具有实际意义的方法进行，即无参数，无返回值，方法体无实际逻辑

5. 绑定切入点与通知关系，并指定通知添加到原始连接点的具体执行位置

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620171313419.png" alt="image-20240620171313419" style="zoom:50%;" />

6. 定义通知类受`Spring`容器管理，并定义当前类为切面类

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620171459629.png" alt="image-20240620171459629" style="zoom:50%;" />

7. 开启`Spring`对`AOP`注解驱动支持

   <img src="/home/noregret/.config/Typora/typora-user-images/image-20240620171541060.png" alt="image-20240620171541060" style="zoom:50%;" />

#### `AOP`工作流程

![image-20240620171649706](/home/noregret/.config/Typora/typora-user-images/image-20240620171649706.png)

#### `AOP`核心概念

![image-20240620171817722](/home/noregret/.config/Typora/typora-user-images/image-20240620171817722.png)

#### `AOP`切入点表达式

- 切入点：要进行增强的方法

- 切入点表达式：要进行增强的方法的描述方式

  ![image-20240620172626609](/home/noregret/.config/Typora/typora-user-images/image-20240620172626609.png)

- 切入点表达式标准格式：动作关键字（访问修饰符  返回值  包名.类/接口名.方法名（参数）异常名）

  `execution(public User com.itheima.service.UserService.findByID(int))`

  - 动作关键字：描述切入点的行为动作，例如`execution`表示执行到指定切入点
  - 访问修饰符：`public`，`private`等，可以省略
  - 异常名：方法定义中抛出指定异常，可以省略

#### `AOP`切入点表达式

![image-20240620173622037](/home/noregret/.config/Typora/typora-user-images/image-20240620173622037.png)

![image-20240620181207821](/home/noregret/.config/Typora/typora-user-images/image-20240620181207821.png)
