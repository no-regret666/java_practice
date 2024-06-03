# Java特殊文件

普通文件(.txt)

特殊文件：属性文件(.properties)、XML文件

## Properties属性文件

1. 都只能是键值对
2. 键不能重复
3. 文件后缀一般是.properties结尾的

### Properties

- 是一个Map集合（键值对集合），但是我们一般不会当集合使用
- 核心作用：Properties是用来代表属性文件的，通过Properties可以读写属性文件里的内容

#### 使用Properties读取属性文件里的键值对数据

`public Properties()` 用于构建Properties集合对象（空容器）

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240603192529945.png" alt="image-20240603192529945" style="zoom:50%;" />

#### 使用Properties写入属性文件里的键值对数据

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240603193230853.png" alt="image-20240603193230853" style="zoom:50%;" />



## `XML`文件

可扩展标记语言

- 本质上是一种数据的格式，可以用来存储复杂的数据结构，和数据关系

特点：

- `XML`中的“<标签名>”称为一个标签或一个元素，一般是成对出现的
- `XML`中的标签名可以自己定义（可扩展），但必须要正确的嵌套
- `XML`中只能有一个根标签
- `XML`中的标签可以有属性
- 如果一个文件中放置的是`XML`格式的数据，这个文件就是`XML`文件，后缀一般要写成.xml

### `XML`的语法规则

- `XML`文件的后缀名为`.xml`，文档声明必须是第一行

<img src="/home/noregret/.config/Typora/typora-user-images/image-20240603195517668.png" alt="image-20240603195517668" style="zoom:50%;" />

- `XML`中可以定义注释信息：`<!-- 注释内容 -->`

- `XML`中书写 "<" 、"&" 等，可能会出现冲突，导致报错，此时可以用如下特殊字符替代

  <img src="/home/noregret/.config/Typora/typora-user-images/image-20240603195729973.png" alt="image-20240603195729973" style="zoom:50%;" />

- `XML`中可以写一个叫`CDATA`的数据区：`<![CDATA[ ...内容 ...]]>`，里面的内容可以随便写

### 作用与应用场景

- 本质是一种数据格式，可以存储复杂的数据结构，和数据关系
- 应用场景：经常用来做为系统的配置文件；或者作为一种特殊的数据结构，在网络中进行传输