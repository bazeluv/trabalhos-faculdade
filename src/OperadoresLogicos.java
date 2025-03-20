public class OperadoresLogicos {
    public static void main(String[] args) {
       int x = 4;
       int y = 7;
       int z = 12;
       boolean res1 = (x<y && y<z)?true:false; // o && age como um "e" logico, ou seja, se x for menor que y E y for menor que z, mostre true, caso contrario, mostre false
       System.out.println(res1);
       
       boolean res2 = (x<y || y<z)?true:false; // o || age como um "ou" logico, ou seja, se x for menor que y OU y for menor que z, mostre true, caso contrario, mostre false
        System.out.println(res2);

        boolean res3 = (x<y ^ y<z)?true:false; // o ^ age como um "ou exclusivo", ou seja, se x for menor que y OU y for menor que z, mostre true, caso contrario, mostre false
        System.out.println(res3);
    }

}
