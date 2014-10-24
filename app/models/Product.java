/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.*;

//import com.avaje.ebean.annotation.CacheStrategy;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.libs.F.Option;
import play.db.ebean.*;
import javax.persistence.*;

import com.avaje.ebean.Ebean;

/**
 * @author jtorres
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
@Entity
public class Product extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long Id;
	
	@Required
	public String name;
	
	public String description;
	public float shine;
	public float price;
	public int rarity;
	public String color;
	public int face;
	
	@Valid
	@Required
	@ManyToOne(cascade=CascadeType.ALL)
	public Image image = new Image();
	
	public Review review = new Review();
	public List<Product> products;	
	
	//public static Finder<Long, Product> find = new Finder<Long, Product>(Long.class, Product.class);
	
	@Valid
	public Option<Product> prodlists;
	
	public static List<Product> all() {
	    return new ArrayList<Product>();
	  }
	
	public static void create(Product product) {
		product.save();
		}

		public static void delete(Long id) {
		  Product.delete(id);
		}
}
