package Funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.awt.Button;

public class Cap2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulin Gogo", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));

//       new Thread(() -> {
//           for (int i = 0; i<=10; i++){
//               System.out.println(i);
//           }
//       }).start();

       Button button = new Button();

       button.addActionListener( event -> System.out.println("Ao cliicar"));

      Validador<String> validadorCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");


        validadorCEP.valida("04101-300");

        System.out.println(validadorCEP.valida("04101-300"));



    }
}
@FunctionalInterface
interface Validador<T> {
     boolean valida(T t);
}