package dev.gustavodahora.convidados.service.constants

import java.net.IDN

class DataBaseConstants {
    object GUEST {
        const val TABLE_NAME = "Guest"

        object COLUMNS {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }
    }
}