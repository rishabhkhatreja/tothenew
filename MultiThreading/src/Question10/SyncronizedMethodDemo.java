package Question10;

public class SyncronizedMethodDemo extends Thread {
    SyncronizedMethod object;
    String name;
    SyncronizedMethodDemo(SyncronizedMethod object,String name)
    {
        this.object=object;
        this.name=name;
    }
    public void run()
    {
        object.name(name);
    }

}
