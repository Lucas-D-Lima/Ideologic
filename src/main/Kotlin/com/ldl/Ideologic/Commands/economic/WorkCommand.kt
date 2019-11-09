package com.ldl.Ideologic.Commands.economic

import com.ldl.Ideologic.Commands.AbstractCommands
import com.ldl.Ideologic.Commands.Utilitario.Emotes
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class WorkCommand : AbstractCommands ("=work") {
    override fun run(event: GuildMessageReceivedEvent) {
        VariaveisEconomicas.total++


        event.channel.sendMessage("Voce trabalhou e conseguiu mais um **IDEcoin** ${Emotes.LOGO_EMOTE} \n\n ||Logo mais tera como mudar o nome||").queue()
    }
}