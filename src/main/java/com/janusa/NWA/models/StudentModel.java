package com.janusa.NWA.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="student")

public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long alumn_DNI;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private int asistencias;

    @Column
    private Date fecha_nac;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlumn_DNI() {
        return alumn_DNI;
    }

    public void setAlumn_DNI(Long alumn_DNI) {
        this.alumn_DNI = alumn_DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
