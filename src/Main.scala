/**
  * Created by scott on 2016/10/23.
  */
object Main {


	def addValue(x:Int)(y:Int): Int ={
		x+y;
	}

	def addValue2(x:Int) = (y:Int) => x+y



	def add(x:Int,y:Int):Int={
		return x+y;
	}

	def add3(x:Int,y:Int,z:Int): Int ={
		return x+y+z;
	}

	def returnUnit():Unit={
		println("return Unit");
	}

	def main(args:Array[String]): Unit ={
		println("well done!");
		var ar = 1 to 10 ;
		val fadd = add3(100,_:Int,_:Int);
//		println(fadd(200,8));
		println( addValue2(10)(20))
	}
}
