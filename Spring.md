# `Spring`

代码书写现状

- 耦合度偏高

解决方案

- 使用对象时，在程序中不要主动使用`new`产生对象，转换为由**外部**提供对象

`IoC`(Inversion of  Control)控制反转

- 对象的创建控制权由程序转移到**外部**，这种思想成为控制反转

`Spring`技术对`Ioc`思想进行了实现

- `Spring`提供了一个容器，成为`IoC`容器，用来充当`IoC`思想中的“外部”。
- `IoC`容器负责对象的创建、初始化等一系列工作，被创建或被管理的对象在`IoC`容器中统称为`Bean`

`DI`(Dependency Injection)依赖注入

- 在容器中建立bean与bean之间的依赖关系的整个过程，称为依赖注入

目标：充分解耦

  