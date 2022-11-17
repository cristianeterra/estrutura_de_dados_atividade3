// Atividade 1 - Estrutura de Dados
// 
// Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
//  
// Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
// Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
// Passo 5: Repita os passos 2 e 3. 
// Passo 6: Exiba todos os números que foram inseridos na fila. 
//  
// Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ListaPilha {

// Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
public static void main(String[] args) {
  ArrayList<Integer> lista = new ArrayList<>(5);
  System.out.println("Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células");
  lista.add(1);
  lista.add(2);
  lista.add(3);
  lista.add(4);
  lista.add(5);
  System.out.println(lista);
// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
  System.out.println("Passo 2.1: Remova todos os dados da lista começando pela célula inicial");
  while(!lista.isEmpty()) {
      int elemento = lista.remove(0);
      System.out.println(lista);
  }
      System.out.println("A lista está vazia!");

  System.out.println("Passo2.2: Inserir os dados da lista na pilha");
  ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
  pilha.push(1);
  pilha.push(2);
  pilha.push(3);
  pilha.push(4);
  pilha.push(5);   
  System.out.println(pilha);
// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células; 
  System.out.println("Passo 3.1: Remova os dados da pilha");
  pilha.clear();
  System.out.println(pilha);
  while(!pilha.isEmpty()) {
      int elemento = pilha.pop();
      System.out.println(pilha);
  }
  System.out.println("Os dados foram removidos da pilha!");
  System.out.println("Passo 3.2: insira os dados da pilha em uma Fila com 10 células");
  ArrayDeque<Integer> fila = new ArrayDeque<>(10);
  fila.add(1);
  fila.add(2);
  fila.add(3);
  fila.add(4);
  fila.add(5);
  System.out.println(fila);
// Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
    System.out.println("Passo 4: inserir os numeros 6,7,8,9,10 na lista");
    fila.add(6);
    fila.add(7);
    fila.add(8);
    fila.add(9);
    fila.add(10);
    System.out.println(fila);
  
// Passo 5: Repita os passos 2 e 3. 
    // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
    // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
  System.out.println("Passo 5.1: remover todos os dados da lista");
  while(!fila.isEmpty()) {
      int elemento = fila.remove();
      System.out.println(fila);
  }
  System.out.println("Os dados foram removidos da lista!");
  System.out.println("Passo 5.2: inserir os dados da lista na pilha com 5 células");
  pilha.push(1);
  pilha.push(2);
  pilha.push(3);
  pilha.push(4);
  pilha.push(5); 
  System.out.println(pilha);
  System.out.println("Passo 5.3: remover os dados da pilha");
  pilha.clear();
  System.out.println(pilha);
  System.out.println("Os dados foram removidos da pilha!");
  System.out.println("Passo 5.4: inserir os dados da pilha na fila");
  fila.add(1);
  fila.add(2);
  fila.add(3);
  fila.add(4);
  fila.add(5);
// Passo 6: Exiba todos os números que foram inseridos na fila. 
  System.out.println(fila);   
  System.out.println("Todos os passos foram concluídos");    
}
}
