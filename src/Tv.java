
public class Tv extends Eletronicos {

    private double canal, volume;

    private boolean desligado;

    public Tv(double canal, double volume, boolean desligado) {
        this.canal = 1;
        this.volume = 0;
        this.desligado = true;
    }

    public double getCanal() {
        return canal;
    }

    public void setCanal(double canal) {
        this.canal = canal;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isDesligado(boolean b) {
        return desligado;
    }

    public boolean setDesligado(boolean t) {
        return this.desligado = true;
    }

    public void aumentarVolume() {
        if (volume <= 0 || volume >= 100 ) {
            System.out.println("Volume nao permitido");
        }
        setVolume(+1);
    }

    public void diminuirVolume() {
        if (volume <= 0 || volume >= 100 ) {
            System.out.println("Volume nao permitido");
        }
        setVolume(-1);
    }

    public void proximo() {
        if (getCanal() <= 1 || getCanal() >= 100) {
            System.out.println("Canal nao permitido");
        } else if (getCanal() > 100){
            setCanal(100);
        } else {
            setCanal(+1);            
        }
    }
    
    public void anterior() {
        if (getCanal() <= 1 || getCanal() >= 100) {
            System.out.println("Canal nao permitido");
        } else if (getCanal() < 0){
            setCanal(0);
        } else {
            setCanal(getCanal()-1);            
        }
    }

    public void desligarEletrodomestico() {
        if (this.desligado == true) {
            System.out.println("TV ja desligada");
        } else {
            setDesligado(false);
            System.out.println("Desligou a TV");
        }
    }

    public void ligarEletrodomestico() {
        if (this.desligado == false) {
            System.out.println("TV ja ligada");
        } else {
            setDesligado(true);
            System.out.println("Ligou a TV");
        }
    }

    public void status() {
        System.out.println("Canal atual " + getCanal());
    }
}
