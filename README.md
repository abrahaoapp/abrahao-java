# Abrahão JAVA SDK

## Documentação

Link para a documentação atualizada: [https://developers.abrahao.com.br](https://developers.abrahao.com.br)

## Instalação via Maven

Adicione essa dependencia ao POM do seu projeto:

```xml
<dependency>
  <groupId>br.com.abrahao</groupId>
  <artifactId>abrahao-java</artifactId>
  <version>3.0.0</version>
</dependency>
```

## Instalação Manual

É possível baixar a última versão em [latest release](https://github.com/abrahaoapp/abrahao-java/releases). Para utilizar o Abrahão SDK, inclua o arquivo .jar ao seu projeto.


## Dependências

O Abrahão SDK necessita que as seguintes bibliotecas estejam adicionadas ao seu projeto para funcionar corretamente:

- [`gson`](https://github.com/google/gson)

## Utilizando o SDK

Um exemplo de uso do SDK é:

```java
// definir o token de acesso e URL Base ("https://developers.abrahao.com.br/api/v1" ou "http://IP:PORTA/api/v1")
AbrahaoClient abrahaoClient = new AbrahaoClient("ABRAHAO-TOKEN", "ABRAHAO-BASE-URL");

// listar pedidos pendentes
OrderResult result = abrahaoClient.getAllOrders();
if (result.getSuccess()) {
    for (int i = 0; i < result.getData().size(); i++)
	Order order = result.getData().get(i);
} else {
    System.out.println(result.getMessage());
}

// cadastrar um produto do ERP
Product product = new Product();
product.setCode("1006");
product.setName("Chopp da Casa 600ml");
product.setPrice(6.50);
product.setExtraFields("{\"any_field\":1}");

if (result.getSuccess()) {
    System.out.println("O produto foi criado com sucesso.");
} else {
    System.out.println(result.getMessage());
}
```
