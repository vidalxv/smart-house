
public class MaquinaLavar implements Eletrodomesticos {
    private int nivel;
    private String tipo;
    private boolean desligado;
    private int horas;
    
    public int getHoras() {
        return horas;
    }


    public void setHoras(int h) {
        this.horas = h;
    }


    public boolean isDesligado() {
        return desligado;
    }


    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }


    public MaquinaLavar(int nivel, String tipo, boolean desligado, int horas) {
        this.nivel = 1;
        this.tipo = "Lavagem Curta";
        this.desligado = true;
        this.horas = horas;
    }

    
    public MaquinaLavar(boolean b, int i, int j) {
    }


    public int getNivel() {
        return nivel;
    }


    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mudarNivel(int nivel) {
        if (nivel >= 1 && nivel  <= 4) {
            this.nivel = nivel;
        } else {
             System.out.println("Nivel de agua nao permitido");
        }
    }

    public void escolherTipo(String tipo) {
        String[] tiposValidos = {"Roupas Leves", "Roupas pesadas", "Lavagem Curta","Limpeza","Edredom"};
        boolean tipoValido = false;
        for (String t : tiposValidos) {
            if (t.equals(tipo)) {
                tipoValido = true;
                break;
            }
        }
        if (tipoValido) {
            this.tipo = tipo;
        } else {   
            System.out.println("Tipo de lavagem invalido. Tipos válidos: Roupas Leves, Roupas Pesadas, Lavagem Curta, Edredom, Limpeza");
        }
    }

    @Override
    public double calcularConsumo() {
        double consumo;
        double potencia = potencia();
        int horas = getHoras();
        consumo = potencia * horas / 1000;
        return consumo;
    }

    @Override
    public void desligarEletrodomestico() {
        if (this.isDesligado() == false) {
            setDesligado(true);
            System.out.println("Desligando...");
        } else {
            System.out.println("Dispositivo ja está desligado");
        }
        System.out.println("O eletrodoméstico está desligado.");
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
    public double potencia() {
        double potencia = 800;
        if (tipo.equals("Limpeza")) {
            potencia *= 0.3;
        } else if (tipo.equals("Roupas leves")) {
            potencia *= 0.5;
        } else if (tipo.equals("Lavagem curta")) {
            potencia *= 0.6;
        } else if (tipo.equals("Roupas Pesadas")) {
            potencia *= 0.7;
        } else if (tipo.equals("Edredom")) {
            potencia *= 1.0;
        }
        System.out.println("Lavagem á: " + potencia + "W");
        return potencia;
    }

    @Override
    public void status() {
        System.out.println("MAQUINA DE LAVAR ESTA: " + (isDesligado() ? "DESLIGADA" : "LIGADA"));
    }

}