public class Contador {
    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Contador(boolean ligado) {
        this.ligado = true;
    }

    public static double contar(){
        double consumo = Casa.contadorEletro();
        return consumo;
    }
    
    

    public void ligarContador() {
        if (ligado) {
            System.out.println("Contador ja está ligado");
        } else {
            setLigado(true);
            System.out.println("Contador ligado");
        }
    }
    
    public void exibirConsumo() {
        System.out.println("Consumo do mes: " + contar());
    }
}
