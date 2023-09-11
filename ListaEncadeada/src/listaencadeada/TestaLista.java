package listaencadeada;

public class TestaLista {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        lista.insereNo_fim(new No("Ana"));
        lista.insereNo_inicio(new No("Paulo"));
        lista.insereNo_fim(new No("Beto"));
        lista.insereNo_fim(new No("Maria"));
        lista.insereNo_fim(new No("Eduardo"));
        
        System.out.println("Lista inicial:");
        lista.mostrarNos();
        System.out.println("Inserir um nó em uma posição dada: 2 por exemplo");
        lista.inserir_No(2, new No("Teste"));
        lista.mostrarNos();
        System.out.println("Excluir o nó inicial");
        lista.excluirNo_inicio();
        lista.mostrarNos();
        
        lista.acharNo("Ana");
        lista.quantidadeNos();
    }

}
