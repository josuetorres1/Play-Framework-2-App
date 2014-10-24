package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.avaje.ebean.ExpressionList;
import models.Image;
import models.Product;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Scala;
import play.mvc.*;
import play.api.mvc.Call;
import play.api.templates.*;
import static play.libs.Json.toJson;
import views.html.*;
import static scala.collection.JavaConversions.asScalaBuffer;
import views.html.*;
import play.data.validation.Constraints.*;
import static play.mvc.Results.*;
import com.avaje.ebean.*;
import com.avaje.ebean.config.EncryptKeyManager;
import play.api.libs.*;

public class Application extends Controller {

	private static final Logger log = Logger.getLogger( Application.class.getName() );
	static Form<Product> pro = Form.form(Product.class);
	
		
	public static Result index(){
		return ok(index.render("test", null, Product.all(), pro));
		//return ok(index.render("test", null));
	}
	
	@SuppressWarnings("unchecked")
	public static Result getProducts(){
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List products = (List) new Model.Finder(String.class, Product.class).all();
   
    	return ok(toJson(products));
    }

	public static Result AllProducts(){
    	List<Product> p = Ebean.find(Product.class).fetch("image").findList();
    	return redirect(routes.Application.index());
    }
	
    @play.db.ebean.Transactional
	public static Result addProduct(){
		
    	Form<Product> boundForm = Form.form(Product.class).bindFromRequest();
    	if (boundForm.hasErrors()){
    		return badRequest();
    	}
    	else{
    		Product product = boundForm.get();
    		Image existOne = new Image(); //Image.find.where().eq("", "").findUnique();
    		
    		if (existOne != null){
    			product.image = existOne;
    		}
    		    		
    		product.save();
    	}
    	    	
    	return redirect(routes.Application.index());
    }
    
    public static Result deleteProduct(Long id){
    	
    	Product p = Ebean.find(Product.class, id);
    	p.delete();
    	return redirect(routes.Application.index());
    }
}
