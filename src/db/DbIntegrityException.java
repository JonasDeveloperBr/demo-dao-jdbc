package db;

/**
 * For referential integrity exceptions between database tables
 * @author jonas.cba@gmail.com
 *
 */
public class DbIntegrityException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
