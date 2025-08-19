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

class VarArgMethod {
    public static void main(String[] args) {
        A r = new A();
        r.add(); // No argument
        r.add(10); // Single argument
        r.add(10, 20); // Two arguments
        r.add(10, 20, 30); // Three arguments
        r.add(10, 20, 30, 40); // Four arguments
    }
}
