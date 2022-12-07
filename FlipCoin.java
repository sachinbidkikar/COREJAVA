class FlipCoin{
    public static void main(String[] args) {
        int FLIPPING = 5;
        int headcount = 0;
        int tailcount = 0;
        for (int i = 0; i < FLIPPING; i++) {
            double Value = Math.random() % 2;
            System.out.println(Value);
            if (Value < 0.5) {
                tailcount++;
            } else {
                headcount++;
            }

        }
        int PercentageHead = headcount*100/FLIPPING;
        int PercentageTail = tailcount*100/FLIPPING;
        System.out.println("head "+PercentageHead);
        System.out.println("tail "+PercentageTail);
    }

}
