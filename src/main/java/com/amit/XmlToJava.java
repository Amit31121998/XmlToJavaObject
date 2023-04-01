package com.amit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlToJava {
	
	
@SuppressWarnings("restriction")
public static void main(String[] args) {
		
           try {
        	   File f=new File("src\\main\\resources\\std.xml");
        	   JAXBContext newInstance = JAXBContext.newInstance(Student.class);
        	   Unmarshaller unmarshaller = newInstance.createUnmarshaller();
        	   
        	   Student st = (Student)unmarshaller.unmarshal(f);
        	   
        	   System.out.println(st.getId());
        	   System.out.println(st.getFname());
        	   System.out.println(st.getLname());
        	   
        	   
        	   
        	   
		} catch (Exception e) {
			// TODO: handle exception
		}
}
}
