# Calculo-do-IMC
Calcula o imc do seu peso e altura

# Calculadora de IMC

Um aplicativo Android simples e intuitivo para calcular o Índice de Massa Corporal (IMC), desenvolvido em Kotlin. O aplicativo recebe os dados do usuário, realiza o cálculo e exibe os resultados em uma tela detalhada.

---

## Funcionalidades

* **Coleta de Dados:** O usuário pode inserir seu Nome, Gênero (Homem/Mulher), Peso (kg) e Altura (cm).
* **Cálculo Preciso:** Calcula automaticamente o IMC usando a fórmula oficial ($IMC = peso / altura^2$).
* **Classificação de Saúde:** Informa em qual categoria o usuário se encontra de acordo com as diretrizes do índice de massa corporal(IMC):
  * Abaixo do peso (IMC < 18.5)
  * Peso Normal (IMC entre 18.5 e 24.9)
  * Sobrepeso (IMC entre 25.0 e 29.9)
  * Obesidade (IMC ≥ 30.0)
* **Navegação Simples:** Separação limpa entre a tela de inserção de dados (`MainActivity`) e a tela de exibição dos resultados ResultActivity.

---

## Tecnologias Utilizadas

* **Linguagem:** [Kotlin](https://kotlinlang.org/)
* **IDE:** [Android Studio](https://developer.android.com/studio)
* **Layouts:** XML (LinearLayout, CardView)
* **Sistema de Build:** Gradle

---

## Como executar o projeto

Se você deseja testar ou modificar o projeto na sua máquina, siga os passos abaixo:

### Pré-requisitos
* Ter o **Android Studio** instalado.
* Ter o **Git** instalado na sua máquina.

### Passo a Passo

1. Faça o clone deste repositório:
   ```bash
   git clone [https://github.com/claucianoweber-max/Calculo-do-IMC.git](https://github.com/claucianoweber-max/Calculo-do-IMC.git)

#  Estrutura Principal
MainActivity.kt: Gerencia a tela inicial, coleta os dados dos campos de texto (EditText) e botões (RadioGroup), valida se estão preenchidos e envia para a próxima tela.

ResultActivity.kt: Recebe os dados, faz o cálculo matemático convertendo centímetros para metros, aplica a lógica de classificação da OMS e exibe os resultados na tela de forma formatada.

activity_main.xml e activity_result.xml: Arquivos de design contendo a identidade visual do app (cores e posicionamento dos elementos).
