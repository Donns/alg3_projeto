package restaurante;
import placeHolder.Restaurante;
import placeHolder.Funcionario;
import placeHolder.Fornecedora;
import placeHolder.Cliente;
import placeHolder.Financeiro;

public class Main {

    public static void main(String[] args) {
        Restaurante r = new Restaurante();
        r.setNome("Panqueca do Draal");
        r.setTelefone("(00)0000-0000");
        r.setRua("Rua da Coruja");
        r.setBairro("Luz");
        r.setNumero("123");
        
        Funcionario f = new Funcionario();
        f.setNome("Rogerio");
        f.setTelefone("(00)00000-0000");
        f.setCpf("000.000.000-00");
        f.setDataNasc("00/00/0000");
        f.setSalario("2000.00");
        
        Fornecedora d = new Fornecedora();
        d.setNome("Fornecedora Acre");
        d.setTelefone("(00)0000-0000");
        d.setProdutos("Frutos do mar");
        d.setPagamento("5000.00");
        
        Cliente c = new Cliente();
        c.setNome("Clara");
        c.setTelefone("(00)00000-0000");
        c.setCpf("000.000.000-00");
        c.setDataNasc("00/00/0000");
        c.setGasto("80.00");
    }   
}
