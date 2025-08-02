package com.github.felipenathananjos.teamup.model.entities

import java.time.LocalTime

class Game(
    var name: String,
    var descricao: String,
    var dia: String,
    var horario: LocalTime,
    var organizador: User,
    var status: String,
    var statusPagamento: String,
    var convidados: MutableList<User>
)