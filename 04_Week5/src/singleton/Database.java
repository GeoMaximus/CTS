package singleton;

public class Database {

	private String connectionString="wwww.mydb.ro";
	
	private Database() {
		connect();
	}
	
	private void connect() {
		//connect to db
	}
	
	
	public static Database INSTANCE = null;
	public static Database getInstance() {
		if(INSTANCE == null ) {
			INSTANCE = new Database();
	}
		return INSTANCE;
	
	}
}
