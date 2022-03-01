package model;

public class Cronometro {

    public int horas;
    public int minutos;
    public int segundos;

    public int tempoEmHoras(){
        return this.segundos/3600;
    }

    public int tempoEmMinutos(){
        return (segundos%3600)/60;

    }

    public int tempoEmSegundos(){
        return (segundos%3600)%60;
    }

    public String mostarDados(){
        return "\nHoras: "+tempoEmHoras()+
                "\nMinutos: "+tempoEmMinutos()+
                 "\nSegundos: "+tempoEmSegundos();
    }

}
