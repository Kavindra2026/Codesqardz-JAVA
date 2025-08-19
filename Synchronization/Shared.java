class Shared {
    static int x, y;

    synchronized static void show(String s, int a) {
        x = a;
        System.out.println("staring in method " + s + " " + x);
        try {
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized int add(int a, int b) {

        System.out.println("inside add method " + Thread.currentThread().getName());
        x = a;
        y = b;

        try {
            Thread.sleep(2000);

        } catch (Exception e) {
        }
        return x + y;

    }

    synchronized void show1(String s, int a) {
        System.out.println("String show1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("ending show1" + s);
        }
    }

    void show2(String s, int a) {
        System.out.println("String in method " + s);
        synchronized (this) {
            x = a;
            System.out.println("string in block" + s + " " + x);
            try {
                Thread.sleep(200);

            } catch (Exception e) {
            }
            System.out.println("exit from block" + s + " " + x);

        }
    }

    Temp t = new Temp();

    void show3(String s, int a) {
        System.out.println("starting in method " + s);
        synchronized (t) {
            t.dilTohPageHai(s);
        }
    }

    synchronized void show4(String s, int a) {
        x = a;
        System.out.println("string in method " + s + " " + x);
        Thread.currentThread().suspend();
        Thread.currentThread().resume();
        System.out.println("exit from method " + s + " " + x);
    }
}

class Temp {

    void dilTohPageHai(String s) {
        System.out.println("starting haa mai hoooooo");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("ending dilTohPageHai" + " " + s);
    }
}
