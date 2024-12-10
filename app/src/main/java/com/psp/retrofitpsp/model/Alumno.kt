package com.psp.retrofitpsp.model


enum class Curso {
    DAM1, DAM2, DAW1, DAW2
}

enum class Asignatura {
    ADD, PMDM, PSP, DDI, SGE, EIE
}

data class Alumno(
    val id: Int,
    val nombre: String,
    val fechaNacimiento: String,
    val curso: Curso,
    val email: String,
    val asignaturas: List<Asignatura>
)
