/**
 * 
 */
package models;

//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
//import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
/**
 * @author jtorres
 *
 */
@Entity
public class Image extends Model{
	@Id
	public Long Id;
	
	private static final long serialVersionUID = 1L;
	
	public static Finder<Long, Image> find = new Finder<Long, Image>(Long.class, Image.class);
}
