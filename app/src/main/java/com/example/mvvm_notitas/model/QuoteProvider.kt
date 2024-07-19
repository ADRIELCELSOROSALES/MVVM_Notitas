package com.example.examplemvvm.model

import com.example.mvvm_notitas.model.QuoteModel

class QuoteProvider {
    companion object {

        fun ramdom() : QuoteModel {
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Si tu día es Amargo, sacudelo un poco <3 El azucar puede estar en el fondo :)",
                author = "Gisel"
            ),
            QuoteModel(
                quote = "Siempre habra una persona que dude de ti. Trata de que esa persona nunca seas tu :3",
                author = "tu Amorcito"
            ),
            QuoteModel(
                quote = "Es lindo <3, es Alto, Tiene ojos hermosos, una sonrisa Perfecta y está leyendo esto ahora",
                author = "tu Reinita <3"
            ),
            QuoteModel(
                quote = "Que no te de Miedo pasar la página... Recuerda que hay Libros que no LEEMOS AÚN",
                author = "Mi Cielo"
            ),
            QuoteModel(
                quote = "Cuando Dios termina algo es porque viene un nuevo y poderoso Comienzo! <3<3",
                author = "gii n.n"
            ),
            QuoteModel(
                quote = "La vida es la GENTE que conoces Y las cosas que puedes CREAR con Ellas...´Así que sal fuera y empieza a ¡CREAR! <3´",
                author = "Mi Solcito"
            ),
            QuoteModel(
                quote = "¡¡Lo único imposible es Aquello que no INTENTAS!!",
                author = "giselcita"
            ),
            QuoteModel(
                quote = "La VIDA te pondrá Obstáculos, pero los límites los pones TÚ!! <3 te amo <3",
                author = "vida"
            ),
            QuoteModel(
                quote = "Lo mejor de la vida no se planea! Simplemente SUCEDE! <3",
                author = "TE AMO AMOR"
            ),
            QuoteModel(
                quote = "Los GRANDES trabajos no son hechos por la fuerza! Sino por la PERSEVERANCIA! TE AMO! :D",
                author = "Tu  cielo ;3"
            ),
            QuoteModel(
                quote = "Hay 7 días en la semana... ´ALGÚN DÍA´ NO ES NINGUNO DE ELLOS!... quierete mucho <3",
                author = "siempre contaras conmigo <3"
            )
        )
    }
}