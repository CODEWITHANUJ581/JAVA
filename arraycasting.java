class arraycasting {
    public static void main(String[] args) {

        // Implicit casting
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        // Explicit casting
        int p = 100;
        int fp = p + (int) 18.10;
        System.out.println(fp);
    }
}