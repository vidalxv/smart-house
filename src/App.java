public class App {
    public static void main(String[] args) {
      Casa.lista();
      Casa.contadorEletro();

      Contador contador = new Contador(true);
      Contador.contar();
      contador.exibirConsumo();
    }
}
            
        
