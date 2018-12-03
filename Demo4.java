package demo1;

import java.io.File;

/**
 * 列出指定文件目录下的所有文件的文件名
 * 3.是目录.判断它里面有没有文件
 * 4.不是目录.直接输出它的文件名
 * */
public class Demo4 {

	public static void main(String[] args) {
		//1.指定一个文件目录,要在末尾加File.separator
		File file = new File("F:/jar包"+File.separator);
		printFile(file);
	}
	public static void printFile(File file){
		//2.判断传过来的文件目录是否为空
		if(file != null) {
			//3.判断该目录是否为目录
			if(file.isDirectory()) {
				//4.列出该目录下的所有子文件目录
				File[] files = file.listFiles();
				//5.如果该子文件目录不为空,说明他是一个目录,递归,直到它不再是一个目录为止
				if(files != null){
					for (File f : files) {
						printFile(f);
					}
				}
			}else {
				System.out.println(file);
			}
		} 
	}
}
