class runSync {
    public static void main(String[] args) {
        Shared st = new Shared();
        CustomThread t1 = new CustomThread(st, "one ");
        CustomThread t2 = new CustomThread(st, "two");
        // CustomThread t3=new CustomThread (st,"Three");
    }
}
