import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {

    private static final String nomeArquivo = "dados.json";

    public static void main(String[] args) {


        //Cliente c1 = new Cliente(1, "Gustavo Duarte Falcão", "duartegusfalcao@gmail.com", 20);
        //Cliente c2 = new Cliente(2, "Roberto Jassinto Norego", "robert@gmail.com", 20);
        //Cliente c3 = new Cliente(3, "Ana Roddriguez", "aninha@gmail.com", 26);

        //mapClientes.put(String.valueOf(c1.getIdCliente()), c1);
        //mapClientes.put(String.valueOf(c2.getIdCliente()), c2);
        //mapClientes.put(String.valueOf(c3.getIdCliente()), c3);

        //inserirDadosNoJson(mapClientes);

        lerClientesNoJason();
    }

    public static void lerClientesNoJason() {
        Map<String, Cliente> mapClientes;
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            mapClientes = objectMapper.readValue(new File(nomeArquivo), objectMapper.getTypeFactory().constructMapType(LinkedHashMap.class, String.class, Cliente.class));
            System.out.println("Dados lidos do Arquivo Json");
            for(String id : mapClientes.keySet()) {
                mapClientes.get(id).mostrarInfoCliente();
                System.out.println("\n");
            }
            mapClientes.remove("2");
            inserirDadosNoJson(mapClientes);
         }catch (Exception e) {
            System.out.println("Errro ao ler o arquivo " + e.getMessage());
        }

    }

    public static void inserirDadosNoJson(Map<String,Cliente> clienteMap) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Deixar o arquivo Json formatado com quebras de linha

        try{
            objectMapper.writeValue(new File(nomeArquivo), clienteMap);
            System.out.println("Dados gravados em " + nomeArquivo);
        }catch (Exception e) {
            System.out.println("Errou ao escrever os dados no Jason");
            System.out.println(e.getMessage());
        }
    }

}
