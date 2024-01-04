Projeto PrsolarOrdemServicos - Aprimoramento de Conceitos JPA
Java Explorer: Paulo Santos

O objetivo principal deste projeto é aprofundar os conceitos de JPA (Java Persistence API) em Java, substituindo o uso direto do JDBC (Java Database Connectivity). A persistência de dados no PostgreSQL continua a ser o foco, simulando a emissão de ordens de serviços para sistemas de energia solar fotovoltaica. O projeto utiliza operações CRUD (Create, Read, Update, Delete) em diferentes entidades, como Cliente, Equipamento, Estabelecimento e Serviço.

### Estrutura do Projeto
O projeto mantém a estrutura organizada em classes Java, organizadas em pacotes. Cada entidade possui uma classe de modelo (por exemplo, Servico) e uma classe de repositório correspondente (por exemplo, ServicoRepository) que lida com as operações de persistência utilizando JPA.
### Diagrama de Classes
O diagrama de classes abaixo representa a estrutura aprimorada do projeto, agora incorporando os conceitos do JPA:
[![](https://mermaid.ink/img/pako:eNqNVF1r2zAU_StGTxm1Q7zaTiJKYSwbdKxQVtjD5j7c2KonUCQjySFZyH-fZDvF8kc6v9jce-65x-de6YQykROEUcZAqQ2FQsIu5Z556oj3FbaSZvBZcHIA4Z2anH1uMhPLNMjZh06wIPoL11QfH4FDQUwSe06gwZ5T3u3yTOSeZg59QHPsPXBN3mrq6B6YkNjbiGrLSCeeE5VZoQJ7z1pSXriaHnIrZEB3o-pUp5VB7QXN3eqftqkl6Le19U3S0TVKsrkotEQDjaoLGPzMkFCLJtMnGzf2BymFolrIo2Mx6Q5mdE51rwGJM3EFbG-WQDUgfGk5lAxME_lfSHLIWEXl9blsK5WBfBJyMMCWt4NlVNWLir3v5uuuBdyPWvathCepBAPZwtSnsmRmGpoK7hyAHVA-A1moywh-vwxlNva0VLNJV6YBjfaLltmkW9MMjVNtvjGs79KbB84OeHdB0LsBGtTlvNr8YDscSGfzguD-GlkP6ci7PpMp4verRrQjH-2INKPNza1YTztF-g_ZkRRh85mTV6iYTlHKzwYKlTmIR54hrGVFfFSVOWjS3qMIvwJTJloCR_iEDgjH4XwRJ8ntIrpdLddJmPjoiHAQL-bJOoriOE6iJFkmq_jso79CGIpwHoXrMFrEcbhcxck6_Ogjkluxj-3NbV91j191gRVy_gdp3NoK?type=png)](https://mermaid.live/edit#pako:eNqNVF1r2zAU_StGTxm1Q7zaTiJKYSwbdKxQVtjD5j7c2KonUCQjySFZyH-fZDvF8kc6v9jce-65x-de6YQykROEUcZAqQ2FQsIu5Z556oj3FbaSZvBZcHIA4Z2anH1uMhPLNMjZh06wIPoL11QfH4FDQUwSe06gwZ5T3u3yTOSeZg59QHPsPXBN3mrq6B6YkNjbiGrLSCeeE5VZoQJ7z1pSXriaHnIrZEB3o-pUp5VB7QXN3eqftqkl6Le19U3S0TVKsrkotEQDjaoLGPzMkFCLJtMnGzf2BymFolrIo2Mx6Q5mdE51rwGJM3EFbG-WQDUgfGk5lAxME_lfSHLIWEXl9blsK5WBfBJyMMCWt4NlVNWLir3v5uuuBdyPWvathCepBAPZwtSnsmRmGpoK7hyAHVA-A1moywh-vwxlNva0VLNJV6YBjfaLltmkW9MMjVNtvjGs79KbB84OeHdB0LsBGtTlvNr8YDscSGfzguD-GlkP6ci7PpMp4verRrQjH-2INKPNza1YTztF-g_ZkRRh85mTV6iYTlHKzwYKlTmIR54hrGVFfFSVOWjS3qMIvwJTJloCR_iEDgjH4XwRJ8ntIrpdLddJmPjoiHAQL-bJOoriOE6iJFkmq_jso79CGIpwHoXrMFrEcbhcxck6_Ogjkluxj-3NbV91j191gRVy_gdp3NoK)

### Configuração do Banco de Dados
As configurações de conexão agora são gerenciadas pela JPA. Certifique-se de ter um banco de dados PostgreSQL configurado, e as propriedades de conexão estão localizadas no arquivo `persistence.xml` ou em um arquivo de configuração específico para JPA.

### Executando o Projeto
1. Clone o repositório: `git clone https://github.com/thePaulCode/java-jpa-prsolar-ordem-servico.git`
2. Abra o projeto em sua IDE favorita.
3. Configure as credenciais do banco de dados no arquivo de configuração da JPA.
4. Execute a classe `PrsolarOrdemServicosApplication` para iniciar o aplicativo.

### Contribuição
Contribua para a melhoria dos conceitos JPA, correção de bugs ou adição de novas funcionalidades. Abra uma issue ou envie um pull request para discutir e incorporar as alterações.

### Licença
Este projeto é licenciado sob a MIT License - consulte o arquivo `LICENSE.md` para obter detalhes.