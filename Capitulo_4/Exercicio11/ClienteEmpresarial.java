package Capitulo_4.Exercicio11;

public class ClienteEmpresarial extends Cliente {
    protected int CNPJ;
    protected String razaoSocial; // Nome da empresa

    public ClienteEmpresarial(String nome, int CPF, int CNPJ, String razaoSocial) {
        super(nome, CPF);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDados() {
        System.out.println("O cliente empresarial " + nome + " tem CPF " + CPF + " e CNPJ " + CNPJ + " com a razão social " + razaoSocial);
    }

    // Getters
    public int getCNPJ() {
        return CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getCPF() {
        return super.getCPF();
    }

    // Setters
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void setCPF(int CPF) {
        super.setCPF(CPF);
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
