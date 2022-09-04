package br.net.silva.daniel.cadastro.enuns;

public enum Sexo {
    M("MASCULINO"), F("FEMININO");

    private String get;
    Sexo(String s) {
        this.get = s;
    }

    public String get() {
        return get;
    }
}
