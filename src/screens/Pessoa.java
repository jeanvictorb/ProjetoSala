package screens;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    private String rg;
    private Date dataDeNascimento; 
    private String nomeMae;
    private String nomePai;
    private Date dataDeEntrada;
    private String unidadePrisional;
    private String crime;
    private String statusPrisioneiro;
    private Date dataDeSaida;

    public Pessoa(String nome, String cpf, String rg, String nomeMae, String nomePai, String unidadePrisional, String crime, String statusPrisioneiro) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.unidadePrisional = unidadePrisional;
        this.crime = crime;
        this.statusPrisioneiro = statusPrisioneiro;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getRg() { return rg; }
    public Date getDataDeNascimento() { return dataDeNascimento; }
    public String getNomeMae() { return nomeMae; }
    public String getNomePai() { return nomePai; }
    public Date getDataDeEntrada() { return dataDeEntrada; }
    public String getUnidadePrisional() { return unidadePrisional; }
    public String getCrime() { return crime; }
    public String getStatusPrisioneiro() { return statusPrisioneiro; }
    public Date getDataDeSaida() { return dataDeSaida; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setRg(String rg) { this.rg = rg; }
    public void setDataDeNascimento(Date dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }
    public void setNomeMae(String nomeMae) { this.nomeMae = nomeMae; }
    public void setNomePai(String nomePai) { this.nomePai = nomePai; }
    public void setDataDeEntrada(Date dataDeEntrada) { this.dataDeEntrada = dataDeEntrada; }
    public void setUnidadePrisional(String unidadePrisional) { this.unidadePrisional = unidadePrisional; }
    public void setCrime(String crime) { this.crime = crime; }
    public void setStatusPrisioneiro(String statusPrisioneiro) { this.statusPrisioneiro = statusPrisioneiro; }
    public void setDataDeSaida(Date dataDeSaida) { this.dataDeSaida = dataDeSaida; }
}
