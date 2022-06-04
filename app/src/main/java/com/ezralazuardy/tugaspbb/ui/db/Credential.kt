package com.ezralazuardy.tugaspbb.ui.db

import com.ezralazuardy.tugaspbb.ui.model.Account

object Credential {

    fun getRegisteredCredentials(): ArrayList<Account> {
        return arrayListOf(
            Account("Ezra Lazuardy", "ezra@students.undip.ac.id", "ezra123"),
            Account("Kakung Bangkit", "bangkit@students.undip.ac.id", "bangkit123"),
            Account("Salahudin Al Ayubi", "ayubi@students.undip.ac.id", "ayubi123")
        )
    }
}