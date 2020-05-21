class NovoLugar {
    public static void main (String args[]){
        Lugar estado = new Lugar("SP");
        Lugar cidade = new Lugar("Sao jose dos campos", estado);
        Lugar bairro = new Lugar("Parque Industrial", cidade);
        bairro.mostrarNivel();
    }
}
