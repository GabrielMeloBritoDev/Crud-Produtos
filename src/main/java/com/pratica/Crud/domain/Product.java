package com.pratica.Crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name= "produto")
@Entity(name="produto")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private  String  nome;

    private Number preco;
}
