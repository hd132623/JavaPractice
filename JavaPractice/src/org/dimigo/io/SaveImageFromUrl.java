package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		String imageUrl = "http://cfile28.uf.tistory.com/image/2650A34955A89A2218B872";
		try{
		URL url = new URL(imageUrl);
		
		try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/picture.png")){
			int result;
			
			byte[] buf = new byte[100];
			while((result = is.read(buf)) != -1 ) {
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 생성 완료!!");
			
			
		}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
