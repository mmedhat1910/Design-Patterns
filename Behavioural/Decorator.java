package Behavioural;

class RegularMilk extends BeverageDecorator {
    public RegularMilk(Beverage toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    public String getDescription() {
        return toBeDecorated.getDescription() + " with Regular Milk";
    }

    public int getCost() {
        return toBeDecorated.getCost() + 5;
    }
}

class SkimmedMilk extends BeverageDecorator {
    public SkimmedMilk(Beverage toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    public String getDescription() {
        return toBeDecorated.getDescription() + " with Skimmed Milk";
    }

    public int getCost() {
        return toBeDecorated.getCost() + 5;
    }
}

class WhiteMocha extends BeverageDecorator {
    public WhiteMocha(Beverage toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return toBeDecorated.getCost() + 10;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return toBeDecorated.getDescription() + " with White Mocha";
    }

}

class Caramel extends BeverageDecorator {
    public Caramel(Beverage toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return toBeDecorated.getDescription() + " with Caramel";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return toBeDecorated.getCost() + 10;
    }

}

abstract class BeverageDecorator extends Beverage {
    Beverage toBeDecorated;

    public abstract String getDescription();

    public abstract int getCost();
}

abstract class Beverage {
    String description;
    int cost;

    public abstract String getDescription();

    public abstract int getCost();
}

class Frappe extends Beverage {
    public Frappe() {
        this.description = "Frappe";
        this.cost = 30;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}

class HotCoffee extends Beverage {
    public HotCoffee() {
        this.description = "Hot Coffee";
        this.cost = 20;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}

class IcedCoffee extends Beverage {
    public IcedCoffee() {
        this.description = "Iced Coffee";
        this.cost = 25;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}

public class Decorator {
    public static void main(String[] args) {
        Beverage b0 = new HotCoffee();
        Beverage b1 = new WhiteMocha(new RegularMilk(new Frappe()));
        Beverage b2 = new IcedCoffee();
        b2 = new Caramel(b2);

        System.out.println(b0.getDescription());
        System.out.println(
            b1.getDescription()
        );
        System.out.println(b2.getDescription());

    }
}
