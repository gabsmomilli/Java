class Fatorial2 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (long i = 1; i < 41; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}