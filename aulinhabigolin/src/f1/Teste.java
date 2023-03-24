package f1;

class Teste
{
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.setPosicao(789);
       
        Piloto pilotoMarcio = new Piloto();
        pilotoMarcio.setNome("Marcio Bigolin");
        c1.setPiloto(pilotoMarcio);
        
        
        Patrocinador p1 = new Patrocinador();
        p1.setNome("Capivara");
        p1.setValor(1000);
        
        Patrocinador p2 = new Patrocinador();
        p2.setNome("RevisãoOnline");
        p2.setValor(20000000);
        
        Equipe e = new Equipe();
        
        e.addPatrocinador(p1);
        e.addPatrocinador(p2);
        
        c1.setEquipe(e);
        
        System.out.println(c1.getResumo());  //Imprima o resumo de todos os dados do veículo
                                            //Mostre todos os patrocínios e o valor dos patrocínios
                                            //Utilize os gets para pegar os dados
    }
}