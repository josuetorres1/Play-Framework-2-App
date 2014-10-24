/**
 * 
 */
package controllers;

import play.*;
import play.mvc.*;
import static play.mvc.Results.*;
import play.libs.*;
import java.util.List;

import db.jdbc.DBase;

/**
 * @author jtorres
 *
 */
public class JDBC extends Controller{
	public static Result page(){
		return ok();
	}
	
	public static Result table(){
		try{
			DBase.createTable();
			return ok("table created");
		}
		catch( Exception e){
			return internalServerError(e.getMessage());
		}
	}
	
	public static Result test(String value){
		try{
			DBase.insertData(value);
			List<String> vs = DBase.getData();
			return ok(Json.toJson(vs));
		}
		catch(Exception e){
			return internalServerError(e.getMessage());
		}
	}
}
