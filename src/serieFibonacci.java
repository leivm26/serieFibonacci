public class serieFibonacci {
    public static void main (String [] args){
        int serie = 10, num1 = 0, num2 = 1, suma = 1;
        //mostrar el valor inicial
        System.out.println(num1);
        for (int i = 1; i < serie; i++) {
            //mostrar suma
            System.out.println(suma);
            // primero sumar
            suma = num1 + num2;
                    //cambiar primera variable por la segunda
            num1 = num2;
            //cambiar la suma por la segunda variable
            num2 = suma;


        }




    }
}
