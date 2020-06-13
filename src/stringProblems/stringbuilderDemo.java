package stringProblems;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class stringbuilderDemo {

	public static void main(String[] args) throws Exception {


		StringBuilder obj_IdentifyBy = new StringBuilder("sakjd");
		System.out.println(obj_IdentifyBy.reverse());
		obj_IdentifyBy.delete(0, obj_IdentifyBy.length());
		StringBuilder obj_Property = new StringBuilder(""); //STRINGBUILDER IS FASTER AND NOT THREAD SAFE

		System.out.println(obj_IdentifyBy);

		getObjectDetails("ISCUST_LOGIN", "iscust_username", obj_IdentifyBy, obj_Property);
		
		//EVEN WITHOUT RETURN TYPE STRINGBUILDER VARIABLE RETAINS ITS VALUE (IMMUTABLE PROPERTY)
		
		
		editBox(obj_IdentifyBy.toString(), obj_Property.toString(), "server");

	}

	public static void getObjectDetails(String page_Id,String obj_Name,StringBuilder obj_IdentifyBy,StringBuilder obj_Property) throws Exception{


		int ObjLen = obj_IdentifyBy.length();
		int ObjpropLen = obj_Property.length();

		obj_IdentifyBy.delete(0, ObjLen).append("xpath"); //UNLIKE STRING VARIABLE VALUE IS NOT REQUIRED TO BE STORED IN ANOTHER VARIABLE. EX. STR.CONCAT("HELLO") WILL NOT CHANGE VALUE OF STR UNTIL WE WRITE STR= STR.CONCAT("HELLO")
		obj_Property.delete(0, ObjpropLen).append("askgaurgvb");

	}


	public static void editBox(String identifyBy, String locator,String valuetoType) throws InterruptedException {

		{
			if (identifyBy.equalsIgnoreCase("xpath")) {

			}


		}}}


