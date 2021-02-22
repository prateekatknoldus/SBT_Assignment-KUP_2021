//This class contains methods for performing various operations of a calculator.
class Calculator {

  //This method will return the addition of the given two numbers.
  def add(firstNum:Int, secondNum:Int):Int = firstNum + secondNum

  //This method will return the subtraction of the given two numbers.
  def subtract(firstNum:Int, secondNum:Int):Int = firstNum - secondNum

  //This method will return the multiplication of the given two numbers.
  def multiply(firstNum:Int, secondNum:Int):Int = firstNum*secondNum

  //This method will return the division of the given two numbers.It will print an error message if the divisor is equal to 0.
  def divide(dividend:Int , divisor:Int):Int = {
    var divisionResult = 0
    if(divisor == 0)
    {
      print("divisor can't be equal to ")
      divisor
    }
    else
    {
      divisionResult = dividend / divisor
      divisionResult
    }
  }

  //This method will return the power(or exponent) of a number.
  def power(number:Int , power:Int):Long = {
    var counter =0
    var powerResult = 1
    while(counter<power){
      powerResult = powerResult*number
      counter=counter + 1
    }
    powerResult
  }

  //This method will return the absolute value of a number.
  def absolute(number: Int):Int = Math.abs(number)

  //This method will return the the modulus of the given two numbers.
  def modulus(firstNum:Int, secondNum:Int):Int= firstNum % secondNum

  //This method will return the maximum number from the given two numbers.
  def maxOfTwo(firstNum:Int, secondNum:Int):Int ={
    if(firstNum>secondNum)
      {
        firstNum
      }
    else
      {
        secondNum
      }

  }

  //This method will return the minimum number from the given two numbers.
  def minOfTwo(firstNum:Int, secondNum:Int):Int ={
    if(firstNum<secondNum)
    {
      firstNum
    }
    else
    {
      secondNum
    }
  }

}



