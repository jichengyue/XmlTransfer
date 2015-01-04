package com.yueyue.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.yueyue.entity.User;

public class JavaTransfer {
	public static void main(String[] args) {
		
		File xmlFile = new File("C:\\Users\\JCY\\Desktop\\user.xml");
		try {
			JAXBContext context = JAXBContext.newInstance(User.class);
			Unmarshaller unshaller = context.createUnmarshaller();
			
			Object o = unshaller.unmarshal(xmlFile);
			System.out.println("所解析xml文件生成的类"+o.getClass());
			System.out.println("所解析的对象是"+o);
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
