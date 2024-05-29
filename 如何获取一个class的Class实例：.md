如何获取一个class的Class实例：

方法一：直接通过一个`class`的静态变量`class`获取：

```java
Class cls = String.class;
```

方法二：通过实例变量提供的getClass( )方法获取：

```java
String s = "Hello";
Class cls = s.getClass();
```

方法三：如果知道一个`class`的完整类名，可以通过静态方法Class.forName( )获取：

```java
Class cls = Class.forName("java.lang.String");
```

