package listaencadeada;

public class Lista {

    No primeiro;
    No ultimo;
    int numero_nos;

    Lista() {
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    void insereNo_fim(No novoNo) {
        if (primeiro == null) {
            primeiro = novoNo;
        }
        if (ultimo != null) {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
        numero_nos++;
    }

    void insereNo_inicio(No novoNo) {
        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        }
        if (primeiro != null) {
            novoNo.prox = primeiro;
        }
        primeiro = novoNo;
        numero_nos++;
    }

    void inserir_No(int a, No novoNo) {
        No corrente = primeiro;
        No antecedente = primeiro;
        int posicao = 1, posicao2;

        while (a != posicao) {
            corrente = corrente.prox;
            posicao++;
        }
        
        for(posicao2 = 1; posicao2 != a-1; posicao2++){
            antecedente = antecedente.prox;
        }
        
        antecedente.prox = novoNo;
        novoNo.prox = corrente;
        numero_nos++;
    }

    void excluirNo_inicio() {
        if (primeiro == null) {
            System.out.println("O primeiro nó ainda não existe.");
        }
        if (primeiro != null) {
            primeiro = primeiro.prox;
            numero_nos--;
        }
    }

    public void mostrarNos() {
        No corrente = primeiro;
        while (corrente != null) {
            System.out.print(corrente.dado + " -> ");
            corrente = corrente.prox;
        }
        System.out.println("null");
    }

    public void acharNo(String a) {
        int posicao = 1;
        No corrente = primeiro;

        while (corrente.dado != a) {
            corrente = corrente.prox;
            posicao++;
            if(posicao> numero_nos){ break;}
        }
        System.out.println("O valor " + a + " esta na posicao " + posicao);
    }

    public void quantidadeNos() {
        System.out.println("A quantidade de nos é:" + numero_nos);
    }

}
