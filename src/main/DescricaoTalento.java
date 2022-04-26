package main;

public class DescricaoTalento implements IDescricao{

    public String descreve() {
        return ("Descrição de um Talento");
    }

    public String cancela() {
        return ("Descrição do Talento cancelado");
    }
}
