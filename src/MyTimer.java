import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Kieran Bingham
 */
public class MyTimer {  
    int interval;
    static Timer timer;
    int secs = 30; 
    boolean done = false;
    
    void setSecs(int input){
        secs = input; 
    }
     
    void coundtdownFrom(int input){
//        static Timer timer;
        boolean done = false; 
        int delay = input*100;
        int period = input*100;
        timer = new Timer();
        interval = input;
        System.out.println(input);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, delay, period);
    }
    
    boolean checkFinished(){
        return done; 
    }
    
    boolean countdown() {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = secs;
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, delay, period);
        return true; 
    }
    
    int setInterval() {
        if (interval == 1) {
            timer.cancel();
            done = true; 
            System.out.println("done is - "+done);
        }
        return --interval;
    }
    
//    Timer timer = new Timer(500, new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//            int index = random.nextInt(colors.size());
//            bgColor = colors.get(index);
//            repaint();
//        }
//    });
//
//    timer.start ();
}
