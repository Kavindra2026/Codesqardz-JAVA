// Var-args method example

class A {
    void add(int... a) { // var-args method
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        System.out.println("Sum of Numbers: " + sum);
    }
}

<<<<<<< HEAD
class VarArgMethod {
    public static void main(String[] args) {
        A r = new A();
        r.add(); // No argument
        r.add(10); // Single argument
        r.add(10, 20); // Two arguments
        r.add(10, 20, 30); // Three arguments
        r.add(10, 20, 30, 40); // Four arguments
=======
class VarArgMethod  {
    public static void main(String[] args) {
        A r = new A();
        r.add();                    // No argument
        r.add(10);                 // Single argument
        r.add(10, 20);             // Two arguments
        r.add(10, 20, 30);         // Three arguments
        r.add(10, 20, 30, 40);     // Four arguments
>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
    }
}
