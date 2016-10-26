
	Scala List(列表)
	Scala Set(集合)
	Scala Map(映射)
	Scala 元组
	Scala Option
	Scala Iterator（迭代器）


List[String] = List("Runoob", "Google", "Baidu")    List is immutable , it has <head> <tail> x
Map("one" -> 1, "two" -> 2, "three" -> 3)
val x:Option[Int] = Some(5)
val x = (10, "Runoob")


List
=====
  head - 第一个元素
  tail - 除了第一个之外所有元素

  定义列表:
   val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

  使用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
  var a = List(1,2,3)
  3 +: a  前置 3 到List
  3 :: a  前置 3 到List


