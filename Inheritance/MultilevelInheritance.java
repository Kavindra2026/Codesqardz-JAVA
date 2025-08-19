//  Multi Level Inheritance

// class Grandparent {
//     void grandMethod() {
//         System.out.println("Grandparent method.");
//     }
// }

// class Parent extends Grandparent {
//     void parentMethod() {
//         System.out.println("Parent method.");
//     }
// }

// class Child extends Parent {
//     void childMethod() {
//         System.out.println("Child method.");
//     }
// }

// public class MultilevelInheritance {
//     public static void main(String[] args) {
//         Child myChild = new Child();
//         myChild.grandMethod(); // Inherited from Grandparent
//         myChild.parentMethod(); // Inherited from Parent
//         myChild.childMethod(); // Own method
//     }
// }

import java.util.Scanner;

class A {
    int a, b, c;

    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for addition: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum of two Numbers: " + c);
    }

    void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for subtraction: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a - b;
        System.out.println("Sub of two Numbers: " + c);
    }
}

class B extends A {
    void multi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for multiplication: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * b;
        System.out.println("Multiplication of two Numbers: " + c);
    }

    void div() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for division: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (b != 0) {
            c = a / b;
            System.out.println("Division of two Numbers: " + c);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

class C extends B {
    void rem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for remainder: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (b != 0) {
            c = a % b;
            System.out.println("Remainder of two Numbers: " + c);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}
