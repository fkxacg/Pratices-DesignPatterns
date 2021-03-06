/**
 * 状态模式。
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 * 
 * 用行为改变状态。
 * 将状态提出来做成状态类，每种状态类中的行为函数只针对自己的状态，无需判断。
 * 
 * 这里实现一个糖果机。
 * 机器有未投入钱、已投入、售出、售罄状态，投币、退款、摇柄、分配四个行为。
 * 
 * 状态的改变可以在上下文中也可以在状态类中，对修改封闭的部分不能做状态改变。
 * 放在上下文中，则在上下文中对自己的状态赋值，状态类只关心具体操作。
 * 放在状态类中，状态类需要关心自己操作后下一个状态的变化，上下文则只分配操作。
 * 放在状态类部分中，可以更动态的改变状态，但会让状态间产生依赖。
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.state;