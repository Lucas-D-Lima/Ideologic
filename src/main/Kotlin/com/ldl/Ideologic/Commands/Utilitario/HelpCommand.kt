package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class HelpCommand : AbstractCommands ("=help") {


    override fun run(event: GuildMessageReceivedEvent) {



        event.channel.sendMessage( "**Ola ${event.author.asMention}, meus comandos são, atualmente \n\n Avatar- Que mostra o seu avatar \n\n Diga- Que repete o que você fala \n\n ping-... \n\n Help-Claro né, a ajuda \n\n Bot-Sobre mim o.o \n\n Userinfo- Informaçoes de usuario \n\n Serverinfo- informaçoes do server \n\n Addbot- Me adicione no seu servidor \n\n Midias- Me ache na internet \n\n EconomicHelp- meus comandos economicos**").queue()
    }
}
