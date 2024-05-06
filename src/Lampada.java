public class Lampada implements Eletrodomesticos {
    public String local;
    public boolean desligado;
    protected double potencia;
    private int horas;

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Lampada(boolean desligado, double potencia, int horas) {
        this.desligado = desligado;
        this.potencia = potencia;
        this.horas = horas;
    }

    @Override
    public void ligarEletrodomestico() {
        setDesligado(false);
        System.out.println("Acendendo lampada");
    }

    @Override
    public void desligarEletrodomestico() {
        setDesligado(true);
        System.out.println("Apagando lampada");
    }

    @Override
    public void status() {
        System.out.println("LAMPADA ESTA" + (isDesligado() ? "LIGADO" : "DESLIGADA"));
    }

    @Override
    public double potencia() {
        return potencia;
    }

    @Override
    public double calcularConsumo() {
        double consumo = 0;
        consumo = getHoras() * potencia() / 1000;
        return consumo;
    }
}