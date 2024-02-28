package scalaTraining

import scala.annotation.tailrec

object MoreFunctions {

  def main(args: Array[String]): Unit = {


  }

  def double(x: Int): Int = x * 2

  def doubleIt(x: Int): Int = x * 2

  // (Int)=>Int

  def add(x: Int, y: Int): Int = x + y // (Int,Int)=>Int

  def multiply(x: Int, y: Int): Int = x * y // (Int,Int)=>Int

  // (Int,Int)=>Int
  //   val mult: (Int,Int)=>Int = multiply
  // val mult: (Int,Int)=>Int = add
  // val mult: (Int,Int)=>Int = (x:Int,y:Int)=> x+y
// (x: Int, y: Int) => x + y

  //function literal is a function without a specific name when it is defined :
  //
  // val mul= (x:Int,y:Int)=> x*y
  // val adds = (x:Int,y:Int)=> x+y
  // val add: (Int,Int)=>Int = (x:Int,y:Int)=> x+y


  // Higher Order Function
  //Higher-Order Functions: A higher-order function is a function that has a value with a function type as an input parameter or return value.
// A function is called Higher Order Function if it contains other functions as a parameter or returns a function as an output i.e,
  // the functions that operate with another functions are known as Higher order Functions



  def compute(a: Int, b: Int, f: (Int, Int) => Int): Int = {
    f(a, b)
  } /// Higher Order Function


  compute(10,15,add)
  compute(10,15,multiply)

  /// passing a function literal to the function
  compute(10,15,(x:Int,y:Int)=> x*y*2)


  val max: (Int, Int) => Int = (x: Int, y: Int) =>{
    if (x>y) x
    else y }

  compute(10,15,max)

  compute(1000,105,(x: Int, y: Int) =>{
    if (x>y) x
    else y }
  )

// recursive function is a function which calls itself




  def factorial(x:Int):Long= {
    if(x==0) 1
    else
    x* factorial(x-1)
  } /// its not tail recursive


/// for longer values , it will give you
  // factorial(100000)
  //java.lang.StackOverflowError

  /*
   Stack is First In Last Out


  factorial(5)

  1
  1*factorial(0)  ==> 1*1
  2*factorial(1)  ==> 2* 1*1
  3*factorial(2) ==> 3* 2*1*1
  4*factorial(3)  ==> 4* 3*2*1*1
  5*factorial(4) => 5* 4*3* 2*1*1


  factorial(100000)
  java.lang.StackOverflowError

  */

  // Tail Recursion - The last expression of the code should be a recursive call
  def anotherFactorial(x: Long): BigInt = {

    def factHelper(n: Long, accumulator: BigInt): BigInt = {
      if (n <= 1) accumulator
      else factHelper(n - 1, n * accumulator)
    }

    factHelper(x, 1)
  }

  // anotherFactorial(4)
  // factHelper(4,1)

  //factHelper(3, 4*1)
  //factHelper(3, 3*4*1)
  //factHelper(3, 2*3*4*1)
  // factHelper(3, 2*3*4*1)
  // factHelper(3, 1*2*3*4*1)
  // when n<=1 it will return accumulator  = 1*2*3*4*1

  /*
  *
  *
  *
  *
  * factHelper(3, 4*1)
  * */


}
