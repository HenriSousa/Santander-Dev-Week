# Santander Dev Week

Java RESTful API criada para o Santader.

## Diagrama de Classes

``` mermaid

classDiagram
    class User {
        -String array
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -float balance
        -float limit
    }

    class Feature {
        -String icons
        -String description
    }

    class Card {
        -String number
        -float limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1-N" Card
    User "1" *-- "N" News

```
