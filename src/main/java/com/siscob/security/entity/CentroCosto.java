package com.siscob.security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "centrocosto")
public class CentroCosto {

    @Id
    @Column(name = "cc_cod")
    private String codigoCC;

    @Column(name = "cc_nom")
    private String nombreCC;

    @Column(name = "cc_estado")
    private int estadoCC;
}
