
public class Microondas implements Eletrodomesticos {
    private boolean isDesligado;
    private double minutos;
    private String modo;

    
    public boolean isDesligado() {
        return isDesligado;
    }
    public void setDesligado(boolean isDesligado) {
        this.isDesligado = isDesligado;
    }
    public double getMinutos() {
        return minutos;
    }
    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String m) {
        this.modo = m;
    }

    public Microondas(boolean isDesligado, int minutos, String modo) {
        this.isDesligado = isDesligado;
        this.modo = modo;
    }

    public void escolherModo(String tipo) {
        String[] tiposValido = {"Descongelar", "Pizza", "Pipoca", "Lasagna"};  
        boolean tipoValido = false;
        for (String t : tiposValido){
            if (t.equals(tipo)) {
                tipoValido = true;
            } break;
        } 
        if (tipoValido) {
            this.modo = tipo;
        } else {
            System.out.println("Selecione um modo valido: DESCONGELAR, PIZZA, PIPOCA, LASAGNA");
        }
    }   

    public void escolherMinutos(double min) {
        this.minutos = min;
        if (modo.equals("Descongelar") && min >= 23 ) {
            System.out.print("o tempo deve ser menor que 23 minutos");
            this.minutos = 15;
        } else if (modo.equals("Pizza") && min >= 4.1 ) {
            System.out.print("o tempo deve ser menor que 4 minutos");
            this.minutos = 2;
        } else if (modo.equals("Pipoca") && min >= 10.25 ) {
            System.out.print("o tempo deve ser menor que 10 minutos");
            this.minutos = 5;
        } else if (modo.equals("Lasagna") && min >= 12.30 ) {
            System.out.print("o tempo deve ser menor que 12 minutos");
            this.minutos = 12;
        }
    }
    @Override
    public void ligarEletrodomestico() {
        if (this.isDesligado() == true) {
            setDesligado(false);
            System.out.println("Ligando...");
        } else {
            System.out.println("Dispositivo ja está ligado");
        }
        System.out.println("O eletrodoméstico está ligado.");
    }

    @Override
    public void desligarEletrodomestico() {
        if (this.isDesligado() == false) {
            setDesligado(true);
            System.out.println("Desligando...");
        } else {
            System.out.println("Dispositivo ja desligado");
        }
    }

    @Override
    public void status() {
        System.out.println("MICRO-ONDAS ESTA: " + (isDesligado() ? "DESLIGADA" : "LIGADA"));
    }

    @Override
    public double potencia() {
        double potencia = 0;
        if (modo.equals("Descongelar")) {
            potencia = 55;
        } else if (modo.equals("Pizza")) {
            potencia = 300;
        } else if (modo.equals("Pipoca")) {
            potencia = 120;
        } else if (modo.equals("Lasagna")) {
            potencia = 100;
        }
        return potencia;
    }

    public double getHoras() {
        double horas = 0;
        horas = this.minutos / 60;
        return horas;
    }
    @Override
    public double calcularConsumo() {
        double consumo = 0;
        consumo = potencia() * getHoras() / 1000;
        return consumo;
    }
}
