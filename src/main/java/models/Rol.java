package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="rol",schema = "documentos_digitalizados")
@Getter
@Setter
@NoArgsConstructor
public class Rol {
    @Id
    @GeneratedValue
    @Column(name = "id_rol")
    private int id_rol;
    @Column(name = "tipo_rol",nullable = false)
    private String tipo_rol;

}
