package App;

import java.util.ArrayList;

public class HistoricoTransacao {
    private ArrayList<Transacao> transacoes;

    public HistoricoTransacao(){

        this.transacoes = new ArrayList<>();
    }
    // Adiciona uma transação
    public void addTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    // Retorna todas as transações
    public ArrayList<Transacao> getTransacoes() {
        return this.transacoes;
    }

    // Calcula o saldo total
    public float getSaldoTotal() {
        float saldoTotal = 0;
        for (Transacao transacao : this.transacoes) {
            if (transacao instanceof Receita) {
                saldoTotal += transacao.getValor();
            } else if (transacao instanceof Despesa) {
                saldoTotal -= transacao.getValor();
            }
        }
        return saldoTotal;
    }
}


