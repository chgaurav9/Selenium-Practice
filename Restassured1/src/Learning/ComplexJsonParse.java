package Learning;

import java.util.List;

import files.Payload;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {

//		/**
//		 * 1. Print No of courses returned by API
//		 * 
//		 * 2.Print Purchase Amount
//		 * 
//		 * 3. Print Title of the first course
//		 * 
//		 * 4. Print All course titles and their respective Prices
//		 * 
//		 * 5. Print no of copies sold by RPA Course
//		 * 
//		 * 6. Verify if Sum of all Course prices matches with Purchase Amount
//		 */
//
//		JsonPath js = ReusableMethods.rawToJason(Payload.coursePrice());
//		int count = js.get("courses.size()");
//		System.out.println(count);
//
//		int totalAmount = js.getInt("dashboard.purchaseAmount");
//		System.out.println(totalAmount);
//
//		String titleFirstCourse = js.get("courses[0].title");
//		System.out.println(titleFirstCourse);
//
//		for (int i = 0; i < count; i++) {
//
//			System.out.println(js.getString("courses[" + i + "].title") + " " + js.getInt("courses[" + i + "].price"));
//
//		}
//
//		for (int i = 0; i < count; i++) {
//			if (js.get("courses[" + i + "].title").toString().equals("RPA"))
//				System.out.println(js.getString("courses[" + i + "].copies"));
//		}
//		
//		int sum=0;
//		
//		for (int i = 0; i < count; i++) {
//			
//				sum=sum+(js.getInt("courses[" + i + "].price")*js.getInt("courses[" + i + "].copies"));
//		}
//		
//		if(sum==totalAmount) {
//			System.out.println("matched");
//		}else {
//			System.out.println("not matched");
//		}
		
		String s="1.1.1.1";
		
		String q=s.replaceAll(".", "[.]");
		
		System.out.println(q);
		

}
	
}
