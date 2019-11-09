package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class BotCommand : AbstractCommands ("=bot" ) {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Ola ${event.author.asMention}, eu sou um bot desenvolvido pelo ``LUCAS#8878`` para o proposito de ter um bot de economia, e outras coisas variadas, eu ainda estou em desenvolvimento, caso queira saber meus comandos uze ``=help``, obrigado por me usar, é por nada não, mas estou ").queue()
    }
}