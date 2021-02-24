package lesson10.classWork.abstractfirstexample;

public abstract class DbProvider {

    private String dbHost;

    public DbProvider(String dbHost) {
        this.dbHost = dbHost;
    }

    abstract void connectToDB();

    abstract void disconnectFromDb();

    void printDbHost(){
        System.out.println("DB Host is" + dbHost);
    }
}
