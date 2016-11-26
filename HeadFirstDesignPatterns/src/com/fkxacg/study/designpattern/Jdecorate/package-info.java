/**
 * 装饰模式的一个java库实现。
 * 
 * java的io包是一个装饰模式实现。
 * 
 * InputStream是抽象组件。
 * FileInputStream、StringBufferInputStream、ByteArrayInputStream等是具体组件。
 * 
 * FilterInputStream是一个抽象装饰者。
 * PushbackInputStream、BufferedInputStream、DataInputStream、LineNumberInputStream等为具体装饰者。
 * 
 * 输出流设计方式一样。
 * Reader/Writer流设计相似。
 */
/**
 * @author fkxacg
 *
 */
package com.fkxacg.study.designpattern.Jdecorate;