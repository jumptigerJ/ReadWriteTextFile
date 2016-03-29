package com.study.rwfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadFile {

	public static void main(String[] args){
		
		File file = new File("text.txt");
		if(file.exists()){
			System.err.println("exist");
			try {
				FileInputStream fis = new FileInputStream(file);    //�ֽ���
				InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); //�ַ���
				BufferedReader br = new BufferedReader(isr);
				String line;
				while((line = br.readLine()) != null){
					System.out.println(line);
				}
				br.close();
				isr.close();
				fis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			File newFile = new File("newFile.txt");
			FileOutputStream fos = new FileOutputStream(newFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("这是什么");
			bw.write("这是什么1");
			bw.write("这是什么2");
			bw.write("这是什么3");
			
			bw.close();
			osw.close();
			fos.close();
			
			System.out.println("写入完成");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
