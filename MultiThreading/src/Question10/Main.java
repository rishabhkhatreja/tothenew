
//Question10:Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

package Question10;

public class Main {
    public static void main(String[] args) {
        SyncronizedMethod myThread=new SyncronizedMethod();
        SyncronizedMethodDemo d=new SyncronizedMethodDemo(myThread,"rishabh");
        SyncronizedMethodDemo d1=new SyncronizedMethodDemo(myThread,"ram");
        d.start();
        d1.start();
    }
}
