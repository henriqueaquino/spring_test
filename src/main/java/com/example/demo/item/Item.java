package com.example.demo.item;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
    public enum TipoItem{
        CONSUMO,
        USO
    }
    public enum Unidade{
        KG,
        L,
        G,
        ML
    }
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String nome;
    private String descricao;
    private Boolean pertenceLote;
    private String lote;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private Integer quantidade;
    private TipoItem tipoItem;
    private Unidade unidade;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataSolicitacao;
    private LocalDate dataReposicao;
    private LocalDate dataValidade;
    private LocalDate dataFabricacao;

    public Item(){

    }

    public Item(
        String nome,
        String descricao,
        Boolean pertenceLote,
        String lote,
        Integer estoqueMinimo,
        Integer estoqueMaximo,
        Integer quantidade,
        TipoItem tipoItem,
        Unidade unidade,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        LocalDate dataSolicitacao,
        LocalDate dataReposicao,
        LocalDate dataValidade,
        LocalDate dataFabricacao){
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.pertenceLote = pertenceLote;
            this.lote = lote;
            this.estoqueMinimo = estoqueMinimo;
            this.estoqueMaximo = estoqueMaximo;
            this.quantidade = quantidade;
            this.tipoItem = tipoItem;
            this.unidade = unidade;
            this.dataEmprestimo = dataEmprestimo;
            this.dataDevolucao = dataDevolucao;
            this.dataSolicitacao = dataSolicitacao;
            this.dataValidade = dataValidade;
            this.dataFabricacao = dataFabricacao;
            
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getPertenceLote() {
        return pertenceLote;
    }

    public void setPertenceLote(Boolean pertenceLote) {
        this.pertenceLote = pertenceLote;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public LocalDate getDataReposicao() {
        return dataReposicao;
    }

    public void setDataReposicao(LocalDate dataReposicao) {
        this.dataReposicao = dataReposicao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

        
}
