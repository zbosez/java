

# 一.认识java

## 1.名称

J D K(java development kit):java开发者工具。

J R E（java run environment）:java运行环境

J V M((java virtual machine):java虚拟机

![image-20210605165811732](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605165811732.png) 

 当我们安装了JDK，我们就同时拥有了JRE和JVM。

# 二.hello world

## 1.运行

**首先我们要知道控制台的调用：**

win+r掉出来，然后在框框里输入cmd

![image-20210605193403125](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605193403125.png) 

**第一步：编写文件**

![image-20210605175645113](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605175645113.png) 

**第二步：找到文件地址。**

![image-20210605174201825](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605174201825.png) 

 **第三步：编译**

![image-20210605175731359](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605175731359.png) 

**编译之后会生成 字节码文件：**![image-20210605174317613](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605174317613.png)

我们可以看到字节码文件里面都是二进制数字，计算机的一些底层指令就是以二进制方式存在的。是计算机能理解的“语言”。

**第四步：运行**

![image-20210605175301618](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605175301618.png) 

运行的时候我们一定要注意文件名不能打错。

**java跑在哪里的？**

跑在j v m上，也就是在java的虚拟机上跑的。

![image-20210605180323957](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605180323957.png) 

------

## 2.代码剖析

在java当中有且只能有一个public类。但可以有很多类。

![image-20210605172207876](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605172207876.png) 

![image-20210607083747415](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607083747415.png) 

类名必须和文件名相同。类名要采用首字母大写的形式（也叫大驼峰形式）。

### （1）打印：

打印是有许多种形式的。

这是**打印的三种形式**

![image-20210605180451080](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605180451080.png) 

这是运行的结果：

![image-20210605180408379](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605180408379.png) 

**英文没问题，那中文呢？**

我们把代码改成这个

![image-20210605181043759](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605181043759.png) 

**企图编译：**

![image-20210605181116143](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605192402083.png) 

**换种方式编译and运行:**

![image-20210605192419454](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605192419454.png) 

**这是为啥呢？**

我们先看一下报错：

![image-20210605181342593](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605181342593.png) 

其实我们写代码的时候，建立的是文本文档，Windows有时候默认是以utf-8进行编码的，但我们的java其实是以GBK的方式进行编码的。因为前后编码方式不统一，所以会出现错误。

所以我们刚刚另一种方式其实是**指定了编码的格式**。

![image-20210605181613216](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605181613216.png) 

如果用idea编码就不会有这种情况。

### （2）main函数的参数

这个我们目前知道是一个字符串数组

![image-20210605191528153](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605191528153.png) 

那我们来尝试打印一下吧。

```java
 public class HelloWorld {
    public static void main(String[] args) {
       for(int i = 0;i<args.length;i++){
       		System.out.println(args[i]);
       }
    }
}
```

![image-20210605191739725](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605191739725.png) 

然后我们会发现啥也没有，但`string[] args`真的没有用吗？

当我们以这种方式运行java文件的时候，我们就知道参数的意义了，是储存我们加的后缀。

![image-20210605192018971](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605192018971.png) 

所以我们**叫`string[] args`为java运行时参数**。

# 三.数据类型和运算符



## 1.变量和类型

### （1）变量

变量就和c语言的概念是一样的。变量在程序运行时，数值是可以改变的。

什么类型的变量就可以储存对应类型的数据，比如`int a = 10;`a是一个变量，a储存了整型数据。

#### ①作用域

要找作用域，就找`{}`找它在哪个{}里面，它的作用域就是那个{}包含的内容。

#### ②命名规则

a.以数字、字母、下划线、$组成。

b.变量名采用小驼峰形式命名（第二个单词开始首字母大写 ，比如<u>maxNumSize</u>）。

c.不能与关键字同名。

d.数字不能开头。

e.变量名是区分大小写的（num和Num不是同一个变量）

**注意：**

变量定义的时候，如果不赋值，是没办法打印的，不像c语言，c语言如果不给值，默认是0，但java不一样，会报错。

### （2）内置类型

java所有类型的大小都和平台没有关系。**所有类型的赋值都不能超过它所对应的范围。**

#### ①int【integer】

在java当中，不管我们是多少位的操作系统，**int都是4个字节**。java具有跨平台和可移植性，java的代码是跑在jvm上的。所以我们在Windows写的代码，也可以在mac跑。也就是我们的.class文件，放到任何电脑，都可以直接跑起来。

##### **Ⅰ.表示范围：**

在java当中，所有的数都是有符号数。

```java
public class test {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int b = Integer.MIN_VALUE;
        System.out.println(b);
    }
}
```

MAX_VALUE和MIN_VALUE是什么值呢，我们只需要用**ctrl+鼠标左键**点击MAX_VALUE就可以看到了。

![image-20210607073044227](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607073044227.png) 

这是我们打印输出的结果：

![image-20210607073200455](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607073200455.png) 

如果超过这个最大限度会发生什么呢？

```java
        int a = Integer.MAX_VALUE+1;
        System.out.println(a);
        int b = Integer.MIN_VALUE-1;
        System.out.println(b);
```

结果是这样的：

![image-20210607073826816](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607073826816.png) 正数最大值加成了负数最小值。负数减成了最小值。

可见我们的int是这样形式的：

![image-20210607073725657](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607073725657.png) 

##### Ⅱ.**int类型的转换：**

###### a.int如何转换成string呢？

```java
public class test {
    public static void main(String[] args) {
        int b = 10;
        String a = b+"";
        System.out.println("a="+a);
        String c = String.valueOf(b);
        System.out.println("c="+c);
    }
}
```

输出的结果是这样的：

![image-20210607190023524](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607190023524.png) 

#### ②long【Long】

相当于int的加强版。

大小：8byte。（1位符号位，63位数据位）。

```java
        long a = Long.MAX_VALUE;
        System.out.println(a);
        long b = Long.MIN_VALUE;
        System.out.println(b);
```

结果为：

![image-20210607075057757](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607075057757.png) 

用long定义的时候，我们一般在后面加一个L。

![image-20210607075318702](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607075318702.png) 

#### ③byte【Byte】

字节类型是我们c语言当中没有的。byte是1个字节，8位，它可以表示正负数，第一位是符号位，接下来就是数据位。byte的取值范围是-128~127。所以我们赋值的时候一定要**注意不能超过这个范围。**

```java
public class test {
    public static void main(String[] args) {
        byte b = 10;
        byte a = 11;
        byte c = a+b;
    }
}
```

![image-20210607143048691](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607143048691.png) 这里居然报错了！

那我们这样呢？

![image-20210607143138073](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607143138073.png) 这样又没有问题。

这是为什么呢？

b和a都是变量，编译器不知道变量相加会不会超过byte的范围，所以就报错了。还有一点原因就是，计算机在存储数据，存在整型提升（小于4byte都会被整型提升），就是都以整型的方式进行运算，我们的a和b存储到计算机里面的时候，都变成整型了，都变成4个字节的了，而我们的byte只有1个字节，所以分析`byte c = a+b;`我们想把大人塞到小孩子衣服里面，这是不可能的。而我们`byte = 10+11;`这样写的时候，10和11是常量，在编译的时候直接会被替换成21了。

![image-20210607144434818](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607144434818.png) 这样也是不行的。

整型提升的意义就是提高运算速率。



#### ④short【Short】

大小：2byte。表达范围是-32768~32767。



#### ⑤float【Float】

```java
public class test {
    public static void main(String[] args) {
        float a = 12.5;
    }
}
```

在c语言中我们这样做是可以编译的，但java是比较安全的语言。所以我们这样定义会出现报错。

![image-20210607134352639](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607134352639.png) 

在java里，12.5这种小数都会 被归为double类。double是8个字节，而float是4个字节。

所以我们定义的时候，要这样定义：

`float a = 12.5f;`

或者是进行强制类型转化：

`float a = (float)12.5;`

这两种方式都可以解决上述问题

#### ⑥double【Double】

在计算机里，小数的精度是存在问题的。

所以当我们写如下程序时，会出现问题。

```java
public class test {
    public static void main(String[] args) {
        double a= 1.1;
        double b = 1.1;
        double c = a*b;
        System.out.println(c);
    }
}
```

会出现如下结果：

![image-20210607134117719](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607134117719.png) 

#### ⑦char【Character】

大小2byte。java当中char一定表示正数。

我们来写一段代码：

```java
public class test {
    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch);
        char ch1 = '高';
        System.out.println(ch1);
        char ch2 = 98;
        System.out.println(ch2);
    }
}
```

输出的结果是这样的：

![image-20210607141424389](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607141424389.png) 

我们知道，汉字是占2个字节的。所以char在java里面是2个字节，这一点和c语言不太一样。

当我们输入数字的时候 ，输出的仍是字符。

那我们再试试**输入负数呢**？

`char ch =-8;`这样会出现报错的。

![image-20210607141656355](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607141656355.png) 

#### ⑧boolean【Boolean】

布尔类型在java中要么取true，要么取false。**<u>不是</u>1或者0！**对于boolean的大小，没有明确规定。有的说是1bit，有的说是1byte。

c语言可没有布尔类型，c++、java有。

![image-20210607152249404](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607152249404.png) 

<u>**int 类型是不可以赋值给boolean类型的。**</u>

### （3）引用类型

#### ①String

`String str  = "zzy-zbossz";`

##### Ⅰ.**拼接字符串**

```java
public class test {
    public static void main(String[] args) {
        String str  = "zzy";
        String str2 = "like";
        String str3 = "phy";
        String str4 = str+str2+str3;
        System.out.println(str4);
        System.out.println("zzy"+" "+"like"+" "+"phy");
    }
}
```

输出的结果是这样的：

![image-20210607165325318](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607165325318.png) 

还有一个就是字符串+数字，是把数字当做字符来凭借的，所以不会进行运算。

数字+字符串，是可以将前面的数字进行运算的。

##### Ⅱ.类型转换

###### a.String转换成int

**方法一：**

```java
public class test {
    public static void main(String[] args) {
        String a = "11";
        int b = Integer.valueOf(a);
        System.out.println(b);
    }
}
```

输出结果是这样的：

![image-20210607190536432](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607190536432.png) 

注意：

这里的a必须要是全数字的字符串。

 **方法二：**

```java
public class test {
    public static void main(String[] args) {
        String a  = "11";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
```

结果是这样的：

![image-20210607191148986](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607191148986.png) 



## 2.逻辑运算符

###  （1）&&逻辑与/短路与

**样例：**布尔表达式1&&布尔表达式2

当表达式1为真，才会继续执行表达式2

当表达式1为假，不会执行表达式2，直接返回false；

### （2）||逻辑或短路或

**样例：**布尔表达式1||布尔表达式2

当表达式1为假，仍会继续执行表达式2

当表达式1为真，就不执行表达式2；

### （3）！逻辑非

**样例：**！布尔表达式

```java
System.out.println(!(10<20));//false
System.out.println(!true);//false
```

### （4）&和|

&和|在操作数为boolean的时候，也表示逻辑运算。

但这两个会完整的执行所有操作数，不支持上述的短路功能。

```java
jaSystem.out.println(10<20|10/0==0);//ArithmeticException
System.out.println(10<20&10/0==0);//ArithmeticException 
```

## 3.位运算符

### （1）&按位与

只要对应位上有0就是0。

### （2）|按位或

只要对应位上有1就是1。

### （3）^按位异或

不一样的就是1，一样的就是0

### （4）~按位取反

把1变成0 ，0变成1.

## 4.移位运算符

### （1）<<左移运算符

**相当于乘法**，为什么呢？我来举个例子

![image-20210704135218482](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704135218482.png) 

### （2）>>右移运算符

相当于除法

右移的时候要特别注意，**右移补的是符号位**。

符号位补什么？正数补0，负数补1。

这个时候，我们举个特殊的例子：-1

<u>对于负数来说，在内存中存储的是补码</u>，那原码补码反码有什么关系呢？

![image-20210704144912983](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704144912983.png) 

那我们右移1会出现什么？

![image-20210704145028132](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704145028132.png) 

没有发生改变，所以还是-1.

### （3）>>>无符号右移运算符

就是右移的时候，不管是正数还是负数，都补0.

再拿-1来研究：

![image-20210704150534388](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704150534388.png) 这是一个最大的正数。

## 5. 三目运算符

**样式：**布尔表达式1？布尔表达式2：布尔表达式3

如果？前面判断为true，那就是执行表达式2 ；如果？前面表达式判断为false，那就是执行表达式3.

这个可以嵌套使用。

## 6.算术运算符

### （1）%取余

![image-20210704153834144](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704153834144.png) 结果：![image-20210704153852277](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704153852277.png) 

这是怎么算的？

![image-20210704153926968](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704153926968.png) 

### （2）/除法

```java
System.out.println(3/-2);
System.out.println(-3/-2);
System.out.println(3/-2.5);
System.out.println(3/2.5);
```

![image-20210704173621357](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704173621357.png) 

### （3）*乘法

### （4）+加法

### （5）-减法

## 7.常量

### （1）final关键字修饰的常量

`final int b = 20;`这里的final相当于c语言中的const。final修饰的常量只能初始化一次，后续不能改。

## 8.关键字

定义变量的时候，变量名不能是关键字。

# 四、功能函数



# 五、逻辑控制

## 1.顺序结构

代码是自上而下执行的

## 2.分支结构

和c语言基本一样， if和else if里面**必须跟布尔表达式**。

### （1）单分支

![image-20210704202728650](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704202728650.png) 

### （2）双分支

![image-20210704202846181](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704202846181.png) 这里要注意，else是和if就近匹配的。

就比如：

```java
int a=10;
if (a == 9)
	if(a==8)
		System.out.println(2);
else
{
	System.out.println(1);
}
```

这样的代码，会执行什么呢？

很多人觉得应该打印出来1 。可是这恰恰就是对if……else不理解的地方，也就是上文我们说过的，else和if是就近匹配的，所以，else和这个if匹配。![image-20210708100048751](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708100048751.png) 

### （3）多分支

![image-20210704203039959](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704203039959.png) 

总：双分支和多分支一样，只能进去一个分支。

## 3.循环结构

循环就是为了重复执行某一部分指令。

循环结构和c语言的没有什么区别。（如果会，可以不看）需要注意的是，循环的变量需要保持变化，否则会陷入死循环。在使用任何循环的时候，我们都要注意，如果不加花括号，循环只会执行后面的一条语句，就像这样：![image-20210708212636549](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708212636549.png) 

break会立马结束当前循环体。

continue是结束一趟循环，且本趟不执行循环体中continue后面的内容。

### （1）for循环

```java
        for (int i = 0; i < 100; i++) {
            if (i == 90) {
                break;
            }
        }
```

这是for循环的基本格式。

![image-20210708141248248](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708141248248.png) 这是一个小知识点。

**for循环的执行顺序：**

这是for循环的第一次执行：

![image-20210708225044666](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708225044666.png) 

这是for循环的第二次及以后的执行顺序：

![image-20210708225134195](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708225134195.png) 

我们再插入一个知识点：

**for循环的死循环**

```java
for(;;){
//这里写语句
}
//或者
for(int i = 1; ;i++)
//或者
for(int i = 1;;)
//或者
for(int i = 0;i<100;)
```

### （2）while循环

条件必须是布尔表达式。

**样例：**

```java
while(i<=9){
    //这里写语句
}
```

我们再插入一个知识点：

**while的死循环**

```java
while(true)
    //这里写语句
}
```

### （3）do ……while循环

do……while一定会进去一次循环体。

## 4.switch开关语句

**样例：**

```java
switch(i){
    case 1:
        System.out.println(1);
        break;
    case 2:
        System.out.println(2);
        break;
    default:
        System.out.println("none");
        break;
}
```

![image-20210708151427986](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708151427986.png) 对于这里的i，我们只能写简单的表达式（不能写复杂的条件)，而且**不能写long、float、double、Boolean类型的变量**。

case是依次顺序执行的，如果不加break，就会继续执行下面的case或者是default，所以我们需要看我们的用意来添加break。

switch是支持嵌套的。

------

# 六、输入输出

对于c语言的输入输出方式其实还是相对比较简单的，但对于java来说，很多人可能会觉得比较复杂，那么下面我为大家来剖析一下java的输入输出是怎样实现的。

## 1.输出

java有print 、printf 、println这三个输出方式。

print是不换行输出。

printf是格式化输出，和c语言的printf一样。

println是自带换行的输出

```java
System.out.printf("%x\n",~0xff);
System.out.println("ln是换行的意思");
System.out.print("这个不换行");
System.out.print("这个不换行");
```

这是输出结果：

![image-20210704115017649](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210704115017649.png) 

## 2.输入

### （1）**方法一：**

我们先来看一下这样一条语句

```java
int i = System.in.read();
```

对于这条语句。在idea上面会出现异常，就像这样：

<img src="C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210709131131029.png" alt="image-20210709131131029" style="zoom:50%;" /> 

我们把鼠标悬放在read上，会出现下面这个界面

<img src="C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210709131310366.png" alt="image-20210709131310366" style="zoom:50%;" /> 

然后我们会发现，代码变成如下的模样，很大一坨。

<img src="C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210709131440142.png" alt="image-20210709131440142" style="zoom:50%;" /> 

但是这样就没有异常了，而且还可以根据需求，添加一些提示语句。

```java
public static void main(String[] args) {
    int i =0;
    try {
        System.out.print("请输入一个字符:");
        i = System.in.read();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println(i);
}
```



![image-20210709131833974](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210709131833974.png) ![image-20210709131849918](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210709131849918.png) 根据我们的输入和输出结果，可见这个功能是输入相应字符，输出对应的十进制码值。

### （2）方法二：

#### 示例int：

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    System.out.println(a);
}
```

![image-20210711224108000](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210711224108000.png)当我们输入1的时候，会输出1 。

我们来分析一下这个代码：

<img src="C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210711225742543.png" alt="image-20210711225742543" style="zoom:50%;" /> 

#### 示例string：

```java
Scanner sc = new Scanner(System.in);
String a=sc.nextLine();
System.out.println(a);
```

![image-20210711233814547](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210711233814547.png) 这是输入输出的结果。

## 3.猜数字游戏

我们来结合输入输出来完成一个小游戏：

这个游戏开始之前，我们先来插入一个小知识点——**循环输入**

记得在c语言中，我们的循环输入典型示例是这样：

![image-20210712143010994](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210712143010994.png) 

那么。我们在java中的循环主体也是差不多的

![image-20210712145238577](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210712145238577.png) 

以下是代码：

```java
import java.util.Random;
import java.util.Scanner;

public class cjsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int answer = rd.nextInt(100);
        System.out.println("请输入你猜的数字:");
        while(sc.hasNextInt()){
            int guess = sc.nextInt();
            if(guess==answer) {
                System.out.printf("\n恭喜你猜对了，数字是%d", answer);
                break;
            }else if(guess>answer){
                System.out.println("猜大了");
            }else if(guess<answer){
                System.out.println("猜小了");
            }
            System.out.println("请输入你猜的数字:");
        }
    }
}
```

这样我们的猜数字游戏就完成啦！

## 4.判断素数

我们再来说一下素数的数学概念，一个大于1的数，除了1和它本身，不能除尽别的数。

判断素数之前，我们要讲一个功能，就是怎么用idea调用java的数学模块的开根号功能。

这就是开根号的功能函数：

![image-20210713132103805](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210713132103805.png) 

下面我们来进行运用：

```java
public class cjsi {
    public static void main(String[] args) {
        int Divisor = 1;
        for(Divisor=2;Divisor<100;Divisor++){
            int divisor=2;
            for(divisor=2;divisor<Math.sqrt(Divisor);divisor++){
                if(Divisor%divisor==0){
                    System.out.println(Divisor+"不是素数");
                    break;
                }
            }
            if(divisor>=Math.sqrt(Divisor)){
                System.out.println(Divisor+"是素数");
            }
        }
    }
}
```

这就是整个素数的判断代码。

## 5.乘法口诀表

这个没什么特殊的，就是操作符的运用还有循环的控制。

这个就是代码部分：

```java
public class cjsi {
    public static void main(String[] args) {
        int mul1 = 1;
        for(mul1=1;mul1<=9;mul1++){
            int mul2 = 1;
            for(mul2=1;mul2<=mul1;mul2++){
                System.out.printf("%d*%d=%d\t",mul1,mul2,mul1*mul2);
            }
            System.out.println();
        }
    }
}
```

这是运行结果：

![image-20210713143320453](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210713143320453.png) 

这里用到了**制表符**

## 6.求最大公约数（2种方法）

### 方法一：减法

我们先看一下这个**思路图解**：

先设这两个数，一个是32 ，一个是24

![image-20210713144906644](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210713144906644.png) 

这样我们就得出他们的最大公约数是8了。

**整体思路就是拿大的数减去小的数，直到其中一个数变成0，那么另一个数就是最大公约数**

那么，我们用代码来实现一下：

```java
public class cjsi {
    public static void main(String[] args) {
        Random rd = new Random();
        int num1= rd.nextInt(100);
        int num2= rd.nextInt(100);

        System.out.printf("%d %d的最大公约数是:",num1,num2);
        while(num1!=0&&num2!=0){
            int temp=num1;
            num1=num1>num2?num1:num2;
            num2=num2<temp?num2:temp;
            num1-=num2;
        }
        if(num1==0){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
```

### 方法二：除法

我们先看一下这个**思路图解**：(和减法的很像)

先设这两个数，一个是32 ，一个是24

![image-20210713151305158](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210713151305158.png) 

**整体思路就是拿大的数取余小的数，直到其中一个数变成0，那么另一个数就是最大公约数**

那么，我们用代码来实现一下：

```java
public class cjsi {
    public static void main(String[] args) {
        Random rd = new Random();
        int num1= rd.nextInt(100);
        int num2= rd.nextInt(100);

        System.out.printf("%d %d的最大公约数是:",num1,num2);
        while(num1!=0&&num2!=0){
            int temp=num1;
            num1=num1>num2?num1:num2;
            num2=num2<temp?num2:temp;
            num1%=num2;
        }
        if(num1==0){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
```



## 7.计算1/1-1/2+1/3-1/4+……1/n的和

下面的分母就是很简单的等差数列，我们只需要稍微再控制一下交替的符号就可以了。

我们把这个代码写一下：

```java
public class cjsi {
    public static void main(String[] args) {
        int i = 0;
        double sum=0.0;
        for(i=1;i<=100;i++){
            int symbol = 1;
            if(i%2==0){
                symbol=-1;
            }
            sum+=symbol*(1.0/i);
        }
        System.out.println(sum);
    }
}
```

结果是这个：

![image-20210713155944325](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210713155944325.png) 

## 8.求一个数字x中出现多少次数字n

这个x和n可以自定义。

那我就来假定一下，我们来求0~100内，有多少个数字6。

这个比较简单，就是考察怎么把数字位一个一个拿下来。

```java
public class cjsi {
    public static void main(String[] args) {
        int i = 1;
        int count =0;
        for(i = 1;i<100;i++){
            if(i%10==6){
                count++;
            }
            if(i/10==6){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

这个是结果![image-20210714091219905](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210714091219905.png)  

## 9.水仙花数字

就是一个三位的数等于它每个位数的三次方之和

比如153=1^3 + 5^3 + 3^3,这个就是一个水仙花数字

那么我们再来写一下代码

```java 
public class cjsi {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            if((Math.pow(i/100,3)+Math.pow(i%100/10,3)+Math.pow(i%10,3)==i)){
                System.out.println(i);
            }
        }
    }
}
```

## 10.模拟密码登录

最多可以输入3次密码。



# N.知识碎片

## **0.先学会使用idea**

### （1）简单使用

我们新建一个空项目。然后选择新建一个模块，然后就会出现src。

![image-20210605201000125](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605201000125.png) 

![image-20210605201139147](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605201139147.png) 

我们新建出来是这样的：

![image-20210605201536609](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605201536609.png) 

我们要写main函数，但是main函数很长，所以，我们介绍一个快捷键**psvm+enter**

然后就会变成这样：

![image-20210605201736374](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605201736374.png) 

再介绍一个打印的**快捷键sout** ,就会变成这样

![image-20210605201901165](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605201901165.png)    

我们来写一个hello程序

```java
public class test {
    public static void main(String[] args) {
        System.out.println("zzy - zbossz");
    }
}
```

**怎么运行呢？**

鼠标右键，会出现这个：

![image-20210605202403811](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605202403811.png) 

**然后我们就会看到这个窗口：**

![image-20210605202431451](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605202431451.png) 

是不是和Python很像？

### （2）idea的注释

①**行注释**

**//+注释内容**

②**块注释**

/*     */

![image-20210605203243599](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605203243599.png) 



③**文档注释**

/**+enter

![image-20210605203335608](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605203335608.png) 

### （3）打印

这是几个样例

```java
public class test {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c,d;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a:"+a+"b="+b);
        System.out.println("c="+a+b);
        System.out.println(a+b+"=  d");
        System.out.println("zzy - zbossz");
    }
}
```

这是输出结果：

![image-20210605204435356](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210605204435356.png) 

这让我们得出**打印函数的特性：**

①**首先“+”是起到拼接的作用。**

②当字符串打头的时候，字符串拼接任何类型变量，都会把那个类型的变量变成字符串类型，强硬的拼接在一起。

③如果不是字符串打头，那么就会先运算。

## 1.强制类型转换

大类型给小类型的时候。比如：

```java
public class test {
    public static void main(String[] args) {
        int a = 10;
        short b = (short)a;
    }
}
```

## 2.隐式类型转换

小类型给大类型。比如：

```java
public class test {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
    }
}
```

## 3.单位换算

![image-20210607074652586](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607074652586.png) 

## 4.转义字符

`\n`换行；`\t`水平制表符；`\'`单引号；`\"`双引号；`\\`反斜杠 。

## 5.编码方式

java是采用Unicode的编码方式，与c语言的ASCII的编码方式不同。

ASCII编码只能表示常见字符，能表示128个字符。

![image-20210607081123924](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210607081123924.png) 

但Unicode的表示范围更大，中文，阿拉丁等等。也叫统一码。每一个Unicode码占2个byte,也就是16bit。

## 6.优先级

## 7.注释

### （1）//行注释

### （2）块（多行）注释

/*

*文本

*文本 

*/

### （3）文档注释

/* 代码 */

## 8.调试

**步骤：**

①打断点（鼠标点击![image-20210708103346293](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708103346293.png) 如图所示位置)

②shift+f9可以开始调试，或者点击![image-20210708103704210](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708103704210.png) 这里，开始调试。

![image-20210708103726741](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708103726741.png) 代码的这块蓝条表示这条语句还未执行。

![image-20210708104151465](C:\Users\zzy\AppData\Roaming\Typora\typora-user-images\image-20210708104151465.png)

