package lesson10.classWork.abstractfirstexample;

public class OracleDbProvider extends DbProvider {

    public OracleDbProvider(String dbHost) {
        super(dbHost);
    }

    @Override
    void connectToDB() {
        //logic for Oracle
    }

    @Override
    void disconnectFromDb() {
        //logic for Oracle
    }
}
