package exercicio02;

//Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir.
//Um deles, obrigatoriamente, será o CPF.
//Garanta que nenhuma pessoa física seja criada sem um CPF, e que nenhuma pessoa física possua um CPF inválido.
public class PessoaFisica {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;

    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }
    private boolean validaCpf(String cpf) {
        return cpf.length() == 11;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("Insira um cpf válido.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
