/*
  Project Euler: https://www.projecteuler.net/problem=1
  HackerRank: https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
 */

object Euler001 extends App {

  // solution 1
  def sumOfMultiple(n: Int): Long = ((3 until n by 3) ++ (5 until n by 5)).toSet.sum

  // solution 2
  val d3 = LazyList.from(3).filter(_%3==0)
  val d5 = LazyList.from(5).filter(_%5==0)
  def sumOfMultiples(n: Int): Long = (d3.takeWhile(_<n) ++ d5.takeWhile(_<n)).toSet.sum

  // solution 3
  val d35: LazyList[Int] = LazyList.from(3).filter(x => x%3==0 || x%5==0)
  def sumOfMultiples3(n: Int) = d35.takeWhile(_<n).sum

  // solution 4
  val s: LazyList[Long] = LazyList.from(3).collect[Long]{case n if n%3==0 || n%5==0 => n}
  def sumOfMultiples4(n: Int) = s.takeWhile(_<n).sum

  /*
    solution 5
    this solution calculates the result for n <= Max.Int (i.e. 2147483647)
   */
  def sumOfMultiples5(n: Long) = {
    val sum3 = (1L to ((n - 1) / 3)).sum * 3
    val sum5 = (1L to ((n - 1) / 5)).sum * 5
    val sum15 = (1L to ((n - 1) / 15)).sum * 15
    sum3 + sum5 - sum15
  }

}
