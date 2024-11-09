# lkproject

 # Customer Model

Este projeto contém a definição da entidade `Customer` para um sistema de gerenciamento de clientes. A entidade é mapeada para uma tabela de banco de dados usando JPA (Java Persistence API) e inclui anotações do OpenXava para validação e requisitos de campo.

## Estrutura do Código

## Descrição dos Campos

### name: Nome do cliente. Este campo é obrigatório e tem um comprimento máximo de 80 caracteres.
### idade: Idade do cliente. Este campo é obrigatório e tem um comprimento máximo de 80 caracteres.
### email: Email do cliente. Este campo é obrigatório e tem um comprimento máximo de 80 caracteres.
### senha: Senha do cliente. Este campo é obrigatório e tem um comprimento máximo de 80 caracteres.
### birthday: Data de nascimento do cliente. Este campo é obrigatório.

# Dependências

### JPA: Utilizado para mapeamento objeto-relacional.
### OpenXava: Utilizado para anotações de validação e requisitos de campo.
### Lombok: Utilizado para gerar automaticamente os métodos getter e setter.

# Como Usar

### Clone o repositório.
### Configure seu ambiente de desenvolvimento para suportar JPA, OpenXava e Lombok.
### Compile e execute o projeto.

# Código

```java
package com.lkproject.lkproject.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Customer extends Identifiable {

    @Column(length=80) @Required
    String name;

    @Column(length=80) @Required
    String idade;

    @Column(length=80) @Required
    String email;

    @Column(length=80) @Required
    String senha;

    @Required
    LocalDate birthday;
}

