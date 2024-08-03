package com.curd.operation;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentController sc = new StudentController();
//		StudentPOJO std = new StudentPOJO();
		
//		std.setSid(1);
//		std.setSname("sachine");
//		std.setScourse("cricketer");
//		std.setSage(50);
//		std.setSmarks(60000.32);
//		
//		sc.saveStdData(std);
		
//		sc.update(103);
//		sc.getbyid(1);

//		sc.update(4);
//		sc.delete(4);
//		sc.getbyid(5);
//		sc.getAll();
		
//		sc.getByRequiredColumns();
		
//		sc.getByNameRequiredRowName("sachine");
		
		sc.updateDynamic(5550.5, "jocky", "ronaldo");
		
	}

}
