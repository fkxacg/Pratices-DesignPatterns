/**
 * 组合模式。
 * 以一致的方式处理个别对象以及对象的组合。
 * 组合包含组件，组件有两种：组合与叶节点元素。
 * 
 * 
 * 表现为：
 * 有一个顶级接口和两个具体类叶节点和组合
 * 组合中可保存顶级接口类型的聚合对象。
 * 在处理一个组合的时候，按顺序在其中的聚合对象中处理，遇到叶节点直接处理，遇到组合再进入其中处理，配合迭代器模式更好。
 * 
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.composite;