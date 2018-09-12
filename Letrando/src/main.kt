import Letrando

import kotlin.collections.ArrayList

fun main(args: Array<String>) {

        val palavra1 = Letrando("maezdia")
        palavra1.conjPalavras.add("dez")
        palavra1.conjPalavras.add("ama")
        palavra1.conjPalavras.add("dia")
        palavra1.conjPalavras.add("mia")
        palavra1.conjPalavras.add("ima")
        palavra1.conjPalavras.add("azia")
        palavra1.conjPalavras.add("dama")
        palavra1.conjPalavras.add("meia")
        palavra1.conjPalavras.add("maia")
        palavra1.conjPalavras.add("azeda")
        palavra1.conjPalavras.add("media")
        palavra1.conjPalavras.add("meada")

//        println(palavra1.conjLetras)
//        println(palavra1.conjPalavras[0])

        val palavra2 = Letrando("ovihnlo")
        palavra2.conjPalavras.add("ion")
        palavra2.conjPalavras.add("ovo")
        palavra2.conjPalavras.add("voo")
        palavra2.conjPalavras.add("novo")
        palavra2.conjPalavras.add("olho")
        palavra2.conjPalavras.add("hino")
        palavra2.conjPalavras.add("ovni")
        palavra2.conjPalavras.add("noivo")
        palavra2.conjPalavras.add("ovinho")
        palavra2.conjPalavras.add("vinho")

        val palavra3 = Letrando("brraoa")
        palavra3.conjPalavras.add("bar")
        palavra3.conjPalavras.add("oba")
        palavra3.conjPalavras.add("ora")
        palavra3.conjPalavras.add("boa")
        palavra3.conjPalavras.add("abra")
        palavra3.conjPalavras.add("obra")
        palavra3.conjPalavras.add("rabo")
        palavra3.conjPalavras.add("raro")
        palavra3.conjPalavras.add("rara")
        palavra3.conjPalavras.add("barao")
        palavra3.conjPalavras.add("barra")
        palavra3.conjPalavras.add("barro")

        val palavra4 = Letrando("fncaiea")
        palavra4.conjPalavras.add("cai")
        palavra4.conjPalavras.add("eca")
        palavra4.conjPalavras.add("ana")
        palavra4.conjPalavras.add("acne")
        palavra4.conjPalavras.add("cafe")
        palavra4.conjPalavras.add("ceia")
        palavra4.conjPalavras.add("cena")
        palavra4.conjPalavras.add("faca")
        palavra4.conjPalavras.add("fina")
        palavra4.conjPalavras.add("ceifa")
        palavra4.conjPalavras.add("faina")
        palavra4.conjPalavras.add("finca")
        palavra4.conjPalavras.add("cafeina")


        val palavra5 = Letrando("liovreo")
        palavra5.conjPalavras.add("lei")
        palavra5.conjPalavras.add("ler")
        palavra5.conjPalavras.add("ole")
        palavra5.conjPalavras.add("rei")
        palavra5.conjPalavras.add("rio")
        palavra5.conjPalavras.add("loro")
        palavra5.conjPalavras.add("role")
        palavra5.conjPalavras.add("rolo")
        palavra5.conjPalavras.add("oleo")
        palavra5.conjPalavras.add("livre")
        palavra5.conjPalavras.add("livro")
        palavra5.conjPalavras.add("loiro")
        palavra5.conjPalavras.add("volei")
        palavra5.conjPalavras.add("velorio")


        val palavra6 = Letrando("tslraa")
        palavra6.conjPalavras.add("sal")
        palavra6.conjPalavras.add("tal")
        palavra6.conjPalavras.add("ata")
        palavra6.conjPalavras.add("rasa")
        palavra6.conjPalavras.add("rata")
        palavra6.conjPalavras.add("sala")
        palavra6.conjPalavras.add("taras")
        palavra6.conjPalavras.add("atlas")
        palavra6.conjPalavras.add("altas")
        palavra6.conjPalavras.add("astral")
        palavra6.conjPalavras.add("saltar")


        val palavra7 = Letrando("irosc")
        palavra7.conjPalavras.add("cio")
        palavra7.conjPalavras.add("cor")
        palavra7.conjPalavras.add("rio")
        palavra7.conjPalavras.add("rico")
        palavra7.conjPalavras.add("rios")
        palavra7.conjPalavras.add("riso")
        palavra7.conjPalavras.add("ricos")
        palavra7.conjPalavras.add("risco")

        var tamanhoDoConjuntoLetras = palavra7.conjLetras.length
        var tamanhoDoArray = palavra7.conjPalavras.size

        var palavrasContidas : ArrayList<String> = palavra7.conjPalavras

        println(palavra7.conjLetras)
        for(i in 0 until tamanhoDoArray){

            var tamanho = palavra7.conjPalavras[i].length

            println("_ ".repeat(tamanho))
        }

//        print("Escreva as palavras: ")
//        val stringpalavra = readLine()!!

        var palavrasEscritas = arrayListOf<String>("Java")
        for (j in 0 until tamanhoDoArray) {
                //if(palavrasContidas.size == 0){
                        print("Escreva as palavras: ")
                        var stringpalavra = readLine()!!

                        if (palavra7.conjPalavras.contains(stringpalavra)) { //verifica se existe a palavra escrita no array de palavras contidas
                                //print("ENTREI PRIMEIRO IF")
                                palavrasEscritas.remove("Java")
                                palavrasEscritas.add(stringpalavra)
                                println(palavrasEscritas)


                                palavrasContidas.remove(stringpalavra) // Remove a palavra da lista das palavras contidas

                                //println(stringpalavra) // imprime a palavra escrita

                                val tamanhoAttdoArray = palavrasContidas.size //calcula o novo tamanho do array, o tamanho att dps de remover a palavra escrita


                                for (x in 0 until tamanhoAttdoArray) { //percorre cada palavra do novo array sem a palavra digitada
                                        //print("ENTREI SEGUNDO FOR")

                                        val nmrTraco = palavrasContidas[x].length //pega o tamanho de cada palavra

                                        println("_ ".repeat(nmrTraco)) //escreve os tracos de acordo com o tamanho de cada palavra


                                }
                        }

                        else{
                                println("Esta palavra não é válida :( ")
                                //tamanhoDoArray = tamanhoDoArray + 1
                                continue
                                //(palavrasContidas.size == 0) {

                                // break;
                        }
                //}



        }





        }






