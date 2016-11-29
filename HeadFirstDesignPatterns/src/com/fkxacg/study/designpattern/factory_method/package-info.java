/**
 * 工厂方法模式。
 * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 
 * 工厂接口和产品接口为顶层接口。
 * 具体工厂与产品类对应，生产相同的产品，类型不同，本质是同一东西。
 * 
 * 这里以公司生产手机为例。
 * 苹果和谷歌公司都生产手机，但手机类型不一样。
 * 可以在生产时加入不同的参数，生产不同型号的手机。
 * 
 * 
 * 工厂方法与抽象工厂很像。
 * 
 * 工厂方法只创建一个产品，抽象工厂创建整个产品家族。
 * 扩展抽象工厂需改变接口。
 * 
 * 抽象工厂关键在于产品间的抽象关系，工厂方法在于生产产品。
 * 抽象工厂将产品抽象关系理清，使用时产品间关系是被封装固定的，工厂方法使用时使用产品本身。
 * 
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.factory_method;