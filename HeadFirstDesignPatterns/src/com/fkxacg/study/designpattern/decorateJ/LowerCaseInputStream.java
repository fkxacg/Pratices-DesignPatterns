package com.fkxacg.study.designpattern.decorateJ;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 输入流装饰器。
 * 
 * 此装饰器将会把输入的字符全部转换为小写字母。
 * 
 * @author fkxacg
 *
 */
public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(InputStream arg0) {
		super(arg0);
	}
	
	//重写字节读取
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}

	//重写字节数组读取
	public int read(byte[] b, int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
