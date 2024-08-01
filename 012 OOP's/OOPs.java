// Our main class
// Here our code will start to execute
public class OOPs {

    public static void main(String[] args) {
        // here we created an object of Pen
        Pen p1 = new Pen();

        // here we are using fuction to set the entities of an object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        // now we directly set the entities of an object
        p1.color = "Green";
        p1.tip = 6;
        
        System.out.println(p1.color);
        System.out.println(p1.tip);

        // Here we are Created a Bank Account Object
        BankAccount myAcc = new BankAccount();
        myAcc.username = "MohammadUmair";
        // The field BankAccount.password is not visible
        // myAcc.password = "1234qwer1234";
        myAcc.setPassword("QWER!@#$QWER");

        // Here we are Created a Pencil Object
        Pencil x1 = new Pencil();
        // Here we are setting a values of pencil attributes
        x1.setColor("Black");
        x1.setShade("500");
        // Here we are getting a value of pencil attribute
        System.out.println(x1.getColor());
        System.out.println(x1.getShade());
    }
}

// Access specifier
// Access Modifier       within class       within package      outside package by subclass only        outside package
// Private                Y                 N                   N                                       N
// Default                Y                 Y                   N                                       N
// Protected              Y                 Y                   Y                                       N
// Public                 Y                 Y                   Y                                       Y



// Here we Created BankAccount object
class BankAccount {
    // we gonna learn about AccessSpecifier
    public String username;
    @SuppressWarnings("unused")
    private String password;
    
    public void setPassword(String pwd) {
        password = pwd;
    }
}

// Here we Created Pen object
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// Here we Created Student Object
class Student {
    String name;
    int clas;

    void setName(String newName) {
        name = newName;
    }

    void setClass(int newClass) {
        clas = newClass;
    }
}

// Here we Created Pencil Object along with 
class Pencil {
    private String Color;
    private String shade;

    // Getters
    String getColor() {
        return this.Color ; 
    }

    String getShade() {
        return this.shade;
    }

    // Setters
    void setColor(String newColor) {
        this.Color = newColor;
    }

    void setShade(String newShade) {
        this.shade = newShade;
    }
}