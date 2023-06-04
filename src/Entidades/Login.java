package Entidades;

import java.util.HashMap;
import java.util.Map;

    public class Login {
        private final Map<String, String> credentials;

        public Login() {
            credentials = new HashMap<>();
            // Exemplo de credenciais de login (usuário:senha)
            credentials.put("usuario1", "senha123");
            credentials.put("usuario2", "abcd1234");
            credentials.put("usuario3", "senha456");
        }

        public boolean authenticate(String username, String password) {
            if (credentials.containsKey(username)) {
                String storedPassword = credentials.get(username);
                if (storedPassword.equals(password)) {
                    System.out.println("Login bem-sucedido!");
                    return true;
                }
            }
            System.out.println("Credenciais inválidas. Tente novamente.");
            return false;
        }
    }

