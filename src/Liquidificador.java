
public class Liquidificador implements Eletrodomesticos{
    private boolean isDesligado;
    private int horas;
    public int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int n) {
        this.nivel = n;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Liquidificador(boolean isDesligado, int nivel, int horas) {
        this.isDesligado = isDesligado;
        this.nivel = nivel;
        this.horas = horas;
    }

    public boolean getIsDesligado() {
        return isDesligado;
    }

    public void setIsDesligado(boolean t) {
        this.isDesligado = t;
    }

    @Override
    public void ligarEletrodomestico() {
        if (this.getIsDesligado() == true) {
            setIsDesligado(false);
            System.out.println("Ligando...");
        } else {
            System.out.println("Dispositivo ja está ligado");
        }
        System.out.println("O eletrodoméstico está ligado.");
    }

    @Override
    public void desligarEletrodomestico() {
        if (this.getIsDesligado() == false) {
            setIsDesligado(true);
            System.out.println("Desligando...");
        } else {
            System.out.println("Dispositivo ja desligado");
        }
    }

    @Override
    public void status() {
        System.out.println("LIQUIDIFICADOR ESTA: " + (getIsDesligado() ? "DESLIGADA" : "LIGADA"));
    }

    @Override
    public double potencia() {
        double potencia;
        if (getNivel() >= 1 && getNivel() <= 4) {
            potencia = 200 / 4 * getNivel();
        } else {
            setNivel(1);
            potencia = 50;
        }
        return potencia;
    }
    
    

    @Override
    public double calcularConsumo() {
        double potencia = potencia();
        int horas = getHoras();
        double consumo = 0;
        consumo = potencia * horas / 1000;
        return consumo;

    }
}
