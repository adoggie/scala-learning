http://www.runoob.com/scala/scala-functions.html

函数传名调用(Call-by-Name)	指定函数参数名
函数 -
可变参数
递归函数
默认参数值
高阶函数
内嵌函数
匿名函数
偏应用函数
函数柯里化(Function Currying)
    def add(x:Int)(y:Int) = x + y
    等于定义了 add(x) ,add(y) ,前者返回this对象,x被缓存在调用的上下文中
    等同于:  def add(x:Int) = (y:Int) => x+y
闭包
    闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量
