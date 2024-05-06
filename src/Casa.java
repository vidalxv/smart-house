
public class Casa {
    public static void lista(){
        Batedeira batedeira = new Batedeira(false, 5, 6);
        batedeira.status();

        Liquidificador liquidificador = new Liquidificador(false, 5, 6);
        liquidificador.status();

        Lampada lampada = new Lampada(false, 5, 6);
        lampada.status();

        Geladeira geladeira = new Geladeira(false, 5, 6);
        geladeira.status();

        Microondas microondas = new Microondas(false, 2, "Pipoca");
        microondas.status();
    }

    public static double contadorEletro() {

        Batedeira batedeira = new Batedeira(false, 5, 6);
        System.out.println("BATEDEIRA " + batedeira.calcularConsumo() + "kWh");
        
        Liquidificador liquidificador = new Liquidificador(false, 5, 6);
        System.out.println("LIQUIDIFICADOR " + liquidificador.calcularConsumo() + "kWh");
        
        Geladeira geladeira = new Geladeira(false, 5, 6);        
        System.out.println("GELADEIRA " + geladeira.calcularConsumo() + "kWh");
        
        Microondas microondas = new Microondas(false, 2, "Pipoca"); 
        System.out.println("MICROONDAS " + microondas.calcularConsumo() + "kWh");
        
        Lampada lampada = new Lampada(false, 5, 6);        
        System.out.println("LAMPADA " + lampada.calcularConsumo() + "kWh");
        double consumo = lampada.calcularConsumo() +  batedeira.calcularConsumo() + liquidificador.calcularConsumo() + geladeira.calcularConsumo() + microondas.calcularConsumo();
        return consumo;
    }
}


