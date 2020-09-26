package placeHolder;

public class Funcionario {
    private String nome;
    private String telefone;
    private String dataNasc;
    private String cpf;
    private String salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSalario() {
        return salario;
    }
    public int idade(){
        String hoje = "31122020", diaH = "", mesH = "", anoH = "", diaF = "", mesF = "", anoF = "";
        int idade;
        for (int i = 0; i < 2; i++){
            diaH += hoje.charAt(i);
            diaF += getDataNasc().charAt(i);
        }
        for (int i = 2; i < 4; i++){
            mesH += hoje.charAt(i);
            mesF += getDataNasc().charAt(i);
        }
        for (int i = 4; i < 8; i++){
            anoH += hoje.charAt(i);
            anoF += getDataNasc().charAt(i);
        }
        idade = (Integer.parseInt(anoH.trim())) - (Integer.parseInt(anoF.trim()));

        if(Integer.parseInt(mesH.trim()) < Integer.parseInt(mesF.trim())){
            idade--;
        }else if (Integer.parseInt(mesH.trim()) == Integer.parseInt(mesF.trim())){
            if(Integer.parseInt(diaH.trim()) < Integer.parseInt(diaF.trim())){
                idade--;
            }
        }
        return idade;
    }
    
}
