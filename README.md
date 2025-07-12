Escolha da ferramenta: Selenium com Java

Para este projeto, optei por utilizar *Selenium WebDriver com linguagem Java*, pelas seguintes razões:

*✔ Vantagens do Selenium com Java:*

* É *gratuito* e amplamente utilizado no mercado.
* Suporta diversos navegadores (Chrome, Firefox, Edge, etc.).
* Fácil integração com ferramentas como JUnit, TestNG, Maven, Cucumber e relatórios (ExtentReports, Allure).
* Permite *acesso direto ao DOM*, possibilitando testes detalhados.
* Tem *grande comunidade e documentação*.

*✘ Desvantagens das ferramentas não escolhidas:*

✅ *Cypress:*

* Excelente para apps JavaScript modernos, mas só funciona em Chrome-family browsers.
* Não suporta múltiplos browsers tão bem quanto Selenium.
* Rodando fora do browser (Node) não consegue interagir com tudo do navegador como Selenium faz.

✅ *Robot Framework:*

* É excelente para sintaxe simples e readability, mas é menos flexível que Java para cenários mais complexos.
* Mais lento para grandes suítes de testes em comparação a Java puro.

✅ *Ghost Inspector:*

* Ferramenta SaaS paga, não é open source.
* Bom para gravação rápida, mas menos flexível para lógica complexa.

---

## 🎯 Cenários obrigatórios:

✅ Carregar home page
✅ Buscar por “shirt” no menu superior
✅ Adicionar produto no carrinho
✅ Realizar checkout

---


