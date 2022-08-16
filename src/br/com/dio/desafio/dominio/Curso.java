package br.com.dio.desafio.dominio;


public class Curso extends Conteudo {

    private int cargaHoraria;


    public Curso() {

    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso {" +
                "Titulo = '"+ getTitulo() + '\'' +
                " Carga horaria = '"+ cargaHoraria + '\'' +
                ", descricao = '" + getDescricao() +
                '}';
    }




}
