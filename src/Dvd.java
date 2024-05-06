public class Dvd extends Eletronicos {
    private boolean desligado, disco;

    public Dvd(boolean desligado) {
        this.desligado = true;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean d) {
        this.desligado = d;
    }

    public boolean isDisco() {
        return disco;
    }

    public void setDisco(boolean dd) {
        this.disco = dd;
    }

    public void desligarEletrodomestico() {
        if (this.desligado == true) {
            System.out.println("DVD desligao");
        } else {
            setDesligado(false);
            System.out.println("Desligou DVD");
        }
    }

    public void ligarEletrodomestico() {
        if (this.desligado == false) {
            System.out.println("DVD ja ligado");
        } else {
            setDesligado(true);
            System.out.println("Ligou DVD");
        }
    }

    public void inserirDisco() {
        setDisco(true);
    }

    public void removerDisco() {
        setDisco(false);
    }

    public void proximo() {
        if (this.isDisco() == true) {
            System.out.println("Musica avançada");
        } else {
            System.out.println("Insira um disco");          
        }
    }
    
    public void anterior() {
        if (this.isDisco() == true) {
            System.out.println("Musica anterior");
        } else {
            System.out.print("Insira um disco");;            
        }
    }
}