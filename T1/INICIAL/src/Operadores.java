import java.util.Scanner;

public class Operadores {
    public void operadoresAritmetico() {
        System.out.println("Explicacion de los operadores aritmeticos");
        // unarios solo necesitan un operando
        int operandoUno = 5;
        operandoUno++;  // operandoUno = operandoUno+1
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("despues de incrementar" + operandoUno);
        operandoUno--; // operandoUno = operandoUno -1;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("Despues de decrementar" + operandoUno);
        //Binarios
        int operandoDos = 2;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es" + suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es" + resta);
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        double division = (double) operandoUno / operandoDos;
        System.out.printf("El resultado de la division es %.4f", division);
        //si divides dos enteros el resultado es un int, se queda con la parte entera
        int modulo = operandoUno % operandoDos; //el resto de la division
        System.out.println(modulo);
    }

    public void operadotesAsignacion() {
        int operandoUno = 6;
        operandoUno += 6; //operandoUno = operandoUno + 6; //12
        operandoUno -= 3; //operandoUno = operandoUno - 3; // 9
        operandoUno *= 2; //18
        operandoUno /= 2; // 9
        operandoUno %= 3; //0

    }

    public void operadoresComparacion() {
        int numeroUno = 4;
        int numeroDos = 7;

        boolean resultado = numeroUno > numeroDos; //false
        System.out.println("El resultado > es " + resultado);
        resultado = numeroUno >= numeroDos; //false
        System.out.println("El resultado >= es " + resultado);
        resultado = numeroUno < numeroDos; //true
        System.out.println("El resultado < es " + resultado);

    }

    public void operadoresLogicos() {
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogico = numeroUno > 1 && numeroDos < 11 && numeroDos != numeroTres && numeroTres % 2 != 0;
        // true && true && true && true = true con que uno sea falso el resultado es falso
        System.out.println("El resultado logico de AND es" + resultadoLogico);

        boolean resultadoCon = numeroUno != 10 || numeroDos > 10 || numeroTres < numeroDos || numeroDos % 2 != 0;
        //true || false con que uno sea true es true
        System.out.println("El resultado logico del OR y AND es " + resultadoCon);
        numeroTres = 20;
        numeroDos = 10;
        numeroUno = 0;

        boolean resultadoTotal = numeroUno >= 0 && numeroDos < 20 && false; //false
        System.out.println("El resultado total es" + resultadoTotal);
        boolean resultadototalinv = !resultadoTotal;
        System.out.println("El resultado total inverso es " + resultadototalinv);


    }

    public void evaluarCandidato() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Que salario quieres cobrar");
        double salarioCobrar = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        // edad inferior a 40
        boolean resultadoEvaluacion = edad < 40 && salarioCobrar < 40000 && experiencia;
        System.out.println("El resultado de la evaluacion es que el candidato es: " + resultadoEvaluacion);

        lectorTeclado.close();
    }

}
