package lesson10.classWork.abstractfirstexample;

public class PostgreSQLDbProvider extends DbProvider {

    public PostgreSQLDbProvider(String dbHost) {
        super(dbHost);
    }

    @Override
    void connectToDB() {
        //logic for Postgres
    }

    @Override
    void disconnectFromDb() {
        //logic for Postgres
    }
}
