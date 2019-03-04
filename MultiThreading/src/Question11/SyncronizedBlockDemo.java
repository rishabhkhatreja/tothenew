package Question11;


public class SyncronizedBlockDemo extends Thread {
    SyncronizedBlock object;
    String name;
    SyncronizedBlockDemo(SyncronizedBlock object,String name)
    {
        this.object=object;
        this.name=name;
    }
    public void run()
    {
        object.name(name);
    }
}
