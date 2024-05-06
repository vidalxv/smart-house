public class Radio extends Eletronicos {
    private String frequencia;
    private float canal;
    private int volume;
    private boolean desligado;

    public Radio(String frequencia, float canal, int volume, boolean desligado) {
        this.frequencia = "FM";
        this.canal = 0.0f;
        this.volume = 0;
        this.desligado = true;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String f) {
        this.frequencia = f;
    }

    public float getCanal() {
        return canal;
    }

    public void setCanal(float c) {
        this.canal = c;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean d) {
        this.desligado = d;
    }
    
    @Override
    public void proximo() {
        if (getCanal() < 0.0 || getCanal() > 100.0) {
            System.out.println("FM");
            setFrequencia("FM");
        } else if (getCanal() < 100.0 || getCanal() > 200.0) {
            System.out.println("AM");
            setFrequencia("AM");
        } else if (getCanal() < 0) {
            setCanal(0.0f);
            System.out.println("A frequência deve ser maior que 0");
        } else if (getCanal() > 200) {
            setCanal(200.0f);
            System.out.println("A frequência deve ser menor que 200");
        }
        setCanal(+1);
    }
    
    @Override
    public void anterior() {
        if (getCanal() < 0.0 || getCanal() > 100.0) {
            System.out.println("FM");
            setFrequencia("FM");
        } else if (getCanal() < 100.0 || getCanal() > 200.0) {
            System.out.println("AM");
            setFrequencia("AM");
        } else if (getCanal() < 0) {
            setCanal(0.0f);
            System.out.println("A frequência deve ser maior que 0");
        } else if (getCanal() > 200) {
            setCanal(200.0f);
            System.out.println("A frequência deve ser menor que 200");
        }
        setCanal(-1);
    }    
}
