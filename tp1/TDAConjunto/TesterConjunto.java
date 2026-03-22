public class TesterConjunto {
    public static void main(String [] args){
        ConjuntoArreglo<Integer> conjInt = new ConjuntoArreglo<Integer>(10);
        System.out.println("se espera 0: " + conjInt.size());
        System.out.println("se espera true: " + conjInt.isEmpty());
        System.out.println("se espera 10: " + conjInt.capacity());


        conjInt.put(10);
        conjInt.put(15);
        conjInt.put(5);
        System.out.println("se espera false: " + conjInt.isEmpty());
        System.out.println("se espera 3: " + conjInt.size());

        System.out.println("se espera 5: " + conjInt.get(2));

        System.out.println("se espera true: " + conjInt.pertenece(15));

        System.out.println("se espera false: " + conjInt.pertenece(20));

        conjInt.put(9);
        conjInt.put(8);
        conjInt.put(7);
        conjInt.put(6);
        conjInt.put(4);
        conjInt.put(3);
        conjInt.put(2);
        System.out.println("se espera 10: " + conjInt.size());

        ConjuntoArreglo<Integer> conjInt2 = new ConjuntoArreglo<Integer>(5);

        System.out.println("se espera todos nulos: " + conjInt.interseccion(conjInt2));
        conjInt.interseccion(conjInt2).print();

        conjInt2.put(15);
        conjInt2.put(7);

        System.out.println("se espera 15 y 7: " + conjInt.interseccion(conjInt2));
        conjInt.interseccion(conjInt2).print();
    }
}
