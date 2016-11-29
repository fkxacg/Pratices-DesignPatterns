/**
 * 策略模式。
 * 
 * 将算法封装，使他们可以互相替换。
 * 
 * 这里有很多类型的鸭子，每种鸭子叫和飞的形式不一样。
 * 将飞和叫的行为提为接口FlyBehavior和QuackBehavior，具体的行为实现行为接口。
 * 
 * 顶层抽象鸭子类包含了此两个接口的变量，具体的叫和飞的调用会委托给这两个变量。
 * 具体鸭子类继承抽象鸭子，确定行为变量的具体引用对象。
 * 
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.strategy;