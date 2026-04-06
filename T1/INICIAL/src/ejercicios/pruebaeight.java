package ejercicios;


import java.util.ArrayList;
import java.util.Arrays;

public class pruebaeight{
    public static void main(String[]args){
      //Funciones

        for (int i =0; i<5; i++) {
            sendEmail();

        }


        //si quiero enviar otra vez el hola java puedo hacer esto

        sendEmail();
        sendEmailToUser("angel@gmail.com");
        sendEmailToUser("benja@gmail.com","Benjamin");
        var users = new ArrayList<>(Arrays.asList("barandom@gmail.com","randn@gmail.com"));
        sendEmailToUser(users);
        var state = sendEmailwithState("angel@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailwithState(""));
    }
    //FUNCIONES SIN PARAMETRO NI RETORNO
//Las funciones se llaman solo si ambas son staticas

    //La logica de envio de emails esta en esta funcion
    // es la funcion para enviar emails
    //es una funcion sin parametros ni retorno
    public static void sendEmail() {
        System.out.println("Hola java");

    }

    //FUNCIONES CON PARAMETROS

    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email a "+ email);

    }
    //Reutilizar la misma funcion con el mismo nombre y agregarle cosas se llama sobrecarga
    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el email a "+ name + " con email "+ email);

    }
    public static void sendEmailToUser(ArrayList<String> emails){
        for (String email:emails){
            sendEmailToUser(email);
        }
    }

    //FUNCIONES CON RETORNO
    public static boolean sendEmailwithState(String email) {
        if (email.isEmpty()){
            return false;
        }
        System.out.println("Se envia el email a "+email);
        return true;
    }


}