package com.yueyue.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.yueyue.entity.User;

public class XmlTransfer {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setSex("男");
		user.setHeight(1.78);
		user.setAddress("知春路");
		user.setBirthday(new Date());
		
		File xmlFile = new File("C:\\Users\\JCY\\Desktop\\user.xml");
		try {
			JAXBContext context = JAXBContext.newInstance(User.class);
			Marshaller shaller = context.createMarshaller();
			
			shaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			shaller.marshal(user, xmlFile);
			shaller.marshal(user, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
