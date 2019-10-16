/*
  Project Euler: https://www.projecteuler.net/problem=1
  HackerRank: https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
 */

object Euler001 extends App {

  def sumOfMultiple(n: Int): Int = ((3 until n by 3) ++ (5 until n by 5)).toSet.sum

}
