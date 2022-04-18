
package Structural;

import java.util.ArrayList;

public class ObserverPattern {
    public static void main(String[] args) {
        Motor m1 = new Motor("M1");
        Motor m2 = new Motor("M2");
        Sensor s1 = new Sensor();
        s1.addObserver(m1);
        s1.addObserver(m2);
        // int reading = s1.getReading();
        // if(reading < 10){
        //     m1.stop();
        //     m2.stop();
        // }
        s1.getReading();
    }
}

interface Observer {
    void getNotified();
}

interface Observed {
    void notifyObservers();
}


class Motor implements Observer {
    private String name;

    public Motor(String name) {
        this.name = name;
    }

    
    public void stop() {
        System.out.println(name + " is stopped");
    }


    @Override
    public void getNotified() {
        stop();
    }
}

class Sensor implements Observed {
    ArrayList<Observer> observers ;
    public Sensor(){
        this.observers = new ArrayList<Observer>();
    }
    public void getReading() {
        System.out.println("Sensor reading");
        notifyObservers();
    }
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(Observer o: observers){
            o.getNotified();
        }
    }

}

