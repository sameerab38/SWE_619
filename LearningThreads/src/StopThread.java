import java.util.concurrent.TimeUnit;

public class StopThread {
private static boolean stopReq;
public static synchronized void setStop() {stopReq = true;}
public static synchronized boolean getStop() {return stopReq;}
public static void main (String[] args)
throws InterruptedException {
Thread backgroundThread = new Thread(new Runnable() {
public void run() { // Now “sees” main thread
int i=0; while (!getStop() ) i++;
}});
backgroundThread.start();
TimeUnit.SECONDS.sleep(1);
setStop();
} }
