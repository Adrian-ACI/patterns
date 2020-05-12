package singleton;

public class DBConnection {

	private static DBConnection connection;

	private DBConnection() {
	}

	public static DBConnection getInstace() {
		if (connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}

}
