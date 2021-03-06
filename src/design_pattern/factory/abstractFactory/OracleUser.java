package design_pattern.factory.abstractFactory;

public class OracleUser implements IUser {
    @Override
    public void insertUser() {
        System.out.println("在 Oracle 中插入一条 User 记录");
    }

    @Override
    public void getUser() {
        System.out.println("在 Oracle 中查询 User 记录");
    }
}
