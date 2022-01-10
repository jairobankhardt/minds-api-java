# Brillian Minds API REST - Sistema de gerenciamento de pessoas
*Projeto de API proposto na plataforma da Digital Innovation One.*



Cadastro de pessoas que mudaram o mundo (Mentes Brilhantes).

Funcionalidades desenvolvidas: criação, atualização, recuperação e exclusão de cadastros.

O que foi usado neste projeto:

* Spring Boot
* Java 11
* Maven
* Bd H2
* Git
* GitHub
* Heroku
* Intellj IDEA Community Edition
* Postman
* Myself

Caminho da API:

```
http://localhost:8080/api/v1/minds
```

No Heroku:

```
https://brillian-minds-api.herokuapp.com/api/v1/minds
```

Modelo JSON para cadastro:

```json
{
    "nameMind": "Leonardo da Vinci",
    "country": "Itália",
    "birthDate": "15-04-1452",
    "deathDate": "02-05-1519",
    "inventions": [
        {
            "nameInvention": "Mona Lisa",
            "apply": "ART"
        }
    ]
}
```

