package Structural;

class Person {
    HomeFacade home;
    public Person(HomeFacade home) {
        this.home = home;
    }
    
    public void wakeup() {
        System.out.println("Waking up");
    }
    
    public void brushTeeth() {
        System.out.println("Brushing teeth");
    }

    public void putOnClothes() {
        System.out.println("Putting on clothes");
    }

    public void takeOffClothes() {
        System.out.println("Taking off clothes");
    }


    public void goToWork() {
        this.wakeup();
        home.takeShower();
        this.brushTeeth();
        home.haveBreakfast();
        home.goToWork();
    }

    public void goHomeAndSleep() {
        System.out.println("Getting ready to go back home");
        // home.goToHome();
        home.haveDinner();
        home.takeShower();
        this.brushTeeth();
        // home.readyToSleep();
        System.out.println("Currently sleeping");
        System.out.println("--------------");
    }
}
class HomeFacade {
    Bedroom bedroom;
    Microwave microwave;
    Car car;
    Bathroom bathroom;
    CoffeeMachine coffeeMachine;

    public HomeFacade(Bathroom bathroom, Bedroom bedroom, Microwave microwave, CoffeeMachine coffeeMachine, Car car) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.microwave = microwave;
        this.car = car;
        this.coffeeMachine = coffeeMachine;
    }

    public void takeShower() {
        bathroom.showerOn();
        bathroom.adjustShowerTemperature();
        bathroom.showerOff();
    }

    public void haveBreakfast() {
        coffeeMachine.putCoffeeBeans();
        coffeeMachine.turnOn();
        microwave.open();
        microwave.putFood();
        microwave.cookFood();
        microwave.takeFood();
    }

    public void haveDinner() {
        microwave.open();
        microwave.putFood();
        microwave.cookFood();
        microwave.takeFood();
    }

    public void goToWork() {
        car.openDoor();
        car.startEngine();
        car.driveToWork();
    }

}

 class CoffeeMachine {
    public void putCoffeeBeans() {
        System.out.println("Beans in the coffee machine");
    }

    public void turnOn() {
        System.out.println("Coffee brewing");
    }
}
class Bedroom {
    public void turnLightsOn() {
        System.out.println("Bedroom lights are on");
    }

    public void turnLightsOff() {
        System.out.println("Bedroom lights are off");
    }

    public void closeCurtains() {
        System.out.println("Curatins closed");
    }

    public void openCurtains() {
        System.out.println("Curtains opened");
    }

    public void turnOnAC() {
        System.out.println("AC turned on");
    }

    public void turnOffAC() {

        System.out.println("AC turned off");
    }
}
class Bathroom {
    public void showerOn() {
        System.out.println("Shower is on");
    }

    public void showerOff() {
        System.out.println("Shower is off");
    }

    public void adjustShowerTemperature() {
        System.out.println("Temperature Adjusted");
    }
}
class Car {
    public void openDoor() {
        System.out.println("Car door open");
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void driveToWork() {
        System.out.println("You reached work");
    }

    public void driveToHome() {
        System.out.println("You reached home");
    }
}
class Microwave {
    public void open() {
        System.out.println("Microwave open!");
    }

    public void putFood() {
        System.out.println("Food in microwave");
    }

    public void cookFood() {
        System.out.println("Food cooked");
    }

    public void takeFood() {
        System.out.println("Food out of the microwave");
    }
}



public class Facade {

}
