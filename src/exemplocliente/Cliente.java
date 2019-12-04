package exemplocliente;
       
public class Cliente {
    private String codigoc;
    private String nomec;

    public Cliente(String codigoc){
    this.codigoc = codigoc;
    this.nomec = nomec;
 
}
    public void getcodigoc(String c3){
        codigoc = c3;
    }
    public String setcodigoc(){
        return codigoc;
    }
    public void getnomec(String n3){
        nomec = n3;
    }
    public String setnomec(){
        return nomec;
    }
    public void imprimircodigoc(String in){
        System.out.println("O codigo do cliente e: " + codigoc);
    }
    public void imprimirnomec(String in){
        System.out.println("O nome do cliente e: " + nomec);
    }
}
