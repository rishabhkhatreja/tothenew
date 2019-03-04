
//Question11:Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.

package Question11;

public class Main {
    public static void main(String[] args) {
        SyncronizedBlock myThread=new SyncronizedBlock();
        SyncronizedBlockDemo d=new SyncronizedBlockDemo(myThread,"rishabh");
        SyncronizedBlockDemo d1=new SyncronizedBlockDemo(myThread,"ram");
        d.start();
        d1.start();
    }
}
