# Algoritmos de Ordenação - Benchmarking e Análise

## Sobre o Projeto
Este projeto realiza **testes de desempenho** de diferentes algoritmos de ordenação, avaliando sua eficiência em diferentes cenários de entrada. Os dados são analisados para determinar quais algoritmos são mais indicados para cada situação.

## 📊 Algoritmos Implementados
- **Selection Sort** 🟡 (Complexidade: O(n²))
- **Insertion Sort** 🟢 (Complexidade: O(n) no melhor caso, O(n²) no pior caso)
- **Bubble Sort** 🔴 (Complexidade: O(n²))
- **Merge Sort** 🟢 (Complexidade: O(n log n))
- **Quick Sort** 🔵 (Complexidade: O(n log n), mas pode ser O(n²) no pior caso)

## Estrutura do Projeto
O código está organizado da seguinte maneira:

```
📂 sorting_project
│-- 📂 src/           # Código-fonte dos algoritmos
│   │-- 📄 Main.java    # Arquivo principal que executa os testes
│   │-- 📄 BubbleSort.java
│   │-- 📄 SelectionSort.java
│   │-- 📄 InsertionSort.java
│   │-- 📄 MergeSort.java
│   │-- 📄 QuickSort.java
│-- 📂 results/       # Resultados das execuções
│   │-- 📄 selection_sort.tsv
│   │-- 📄 insertion_sort.tsv
│   │-- 📄 bubble_sort.tsv
│   │-- 📄 merge_sort.tsv
│   │-- 📄 quick_sort.tsv
│-- 📄 README.md      # Documentação do projeto
```

## 📈 Análise de Resultados
Os algoritmos foram testados em três cenários:
1. **Ordenação Crescente** → Melhor para **Insertion Sort**
2. **Ordenação Decrescente** → Melhor para **Merge Sort**
3. **Ordenação Aleatória** → Melhor para **Merge Sort e Quick Sort**

### **🔬 Conclusões Finais**
- **Algoritmo mais eficiente em geral:** **Merge Sort** 🏆
- **Melhor escolha para grandes volumes de dados:** **Merge Sort** ✅
- **Melhor escolha para pequenas entradas ordenadas:** **Insertion Sort** ✅
- **Quick Sort teve variações inesperadas**, se tornando menos confiável em alguns casos.

## 🛠 Como Executar
### **Pré-requisitos:**
- Java instalado (versão 8 ou superior)

### **Passo a passo:**
1. **Clonar o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/algoritmos-ordenacao.git](https://github.com/antonio-carlosjr/sortTest
   cd sortTest/src
   ```

2. **Compilar os arquivos:**
   ```sh
   javac sorttest/*.java
   ```

3. **Executar os testes:**
   ```sh
   java -Xss512m -Xmx2g -cp . sorttest.Main
   ```

4. **Ver os resultados:**
   - Os arquivos de saída estarão em `results/` e podem ser abertos em um editor de texto ou planilha.

## 📜 Licença
Este projeto é de código aberto e pode ser utilizado livremente para fins educacionais e acadêmicos.

---
💡 **Contribuições são bem-vindas!** Caso tenha sugestões ou melhorias, fique à vontade para abrir um Pull Request. 🚀

