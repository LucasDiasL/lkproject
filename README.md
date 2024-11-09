# lkproject

# Customer Model

Este projeto contém a definição da entidade `Customer` para um sistema de gerenciamento de clientes. A entidade é mapeada para uma tabela de banco de dados usando JPA (Java Persistence API) e inclui anotações do OpenXava para validação e requisitos de campo.

## Estrutura do Código

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

    @Column(length =80) @Required
    String login;

    @Required
    LocalDate birthday;
}

 
