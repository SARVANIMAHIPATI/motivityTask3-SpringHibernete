package com.motivity3;

import com.motivity3.configs.CollegeConfig;
import com.motivity3.services.CollegeService;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainLogic {
	public static void main(String[] args) throws InterruptedException, SQLException
	
	{
        System.out.println("This is the start...");
        Scanner sc = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        CollegeService collegeService = context.getBean(CollegeService.class);
        System.out.println("Press '1' for Insertion, '2' for Upadting, '3' for Deleting, '4' for Retirving, '5' to exit");
        
        do {
        	System.out.println("Enter your choice:");
        	int choice = sc.nextInt();
        	switch(choice) {
        	
        	case 1: //insert
        		System.out.println("Enter details for insertion");
        		System.out.println("Enter Id: ");
        		int id = sc.nextInt();
        		System.out.println("Enter ContactNumber: ");
        		String con = sc.next();
        		System.out.println("Enter location: ");
        		String l = sc.next();
        		System.out.println("Enter mail: ");
        		String m = sc.next();
        		System.out.println("Enter Name: ");
        		String n = sc.next();
                collegeService.insert(new College(id, con, l, m, n));
                break;

        	case 2:  
                //update
        		System.out.println("Updation...");
                collegeService.update(new College(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
                break;
            
        	case 3: 
        		//delete
        		System.out.println("Deletion...");
        		System.out.println("Enter id to delete");
        		int id_num = sc.nextInt();
        		College clg = new College(id_num);
        		clg.setCollege_id(id_num);
        		collegeService.delete(clg);
        		break;
        		
        	case 4:
        		//Select
        		System.out.println("CollegeId   CollegeName   CollegeLocation   CollegeNumber   CollegeMail");
        		System.out.println("Table Data is...");
        		List<College> clg_data = collegeService.select();
        		for (College c: clg_data) {
        			System.out.println(c.getCollege_id()+"   "+c.getName()+"   "+c.getLocation()+"   "+c.getContact_num()+"   "+c.getMail());
        		}
        		break;
            
        	case 5: 
        		//exit
        		System.err.println("Exiting...");
        		System.exit(0);
        		break;
            
        	}
        }while(true);
    }
}
