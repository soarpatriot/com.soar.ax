package  com.soar.ax.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * uniform base identity
 * 
 * 
 * child can override getId()  
 * 
 * @author soar
 */
@MappedSuperclass
public abstract class IdEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id   
	@GeneratedValue(strategy = GenerationType.AUTO) 
	protected long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
