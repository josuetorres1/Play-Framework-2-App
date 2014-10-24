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
public class Review extends Model{
	@Id
	public int Id;
	
	private static final long serialVersionUID = 1L;
}
