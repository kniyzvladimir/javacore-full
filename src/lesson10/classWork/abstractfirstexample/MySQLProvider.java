package lesson10.classWork.abstractfirstexample;

public class MySQLProvider extends DbProvider {

    public MySQLProvider(String dbHost) {
        super(dbHost);
    }

    @Override
    void connectToDB() {
        //logic for MySql
    }

    @Override
    void disconnectFromDb() {

    }
}
