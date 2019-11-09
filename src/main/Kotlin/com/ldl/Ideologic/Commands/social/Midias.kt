package com.ldl.Ideologic.Commands.social

import com.ldl.Ideologic.Commands.AbstractCommands
import com.ldl.Ideologic.Commands.Utilitario.Emotes
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class Midias : AbstractCommands ("=midias") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("${event.author.asMention}, ola, quer saber as minhas midias? pra que? mas ok. \n\n ${Emotes.TWITER} ``https://twitter.com/LDL_BR`` do meu criador o.O \n\n ${Emotes.DISCORD} ``https://discord.gg/z7S2rk4`` conta como midia, né? \n\n ${Emotes.TWITCH} ``https://www.twitch.tv/lucas_gabriel_li`` Twitch do criador \n\n E só, tem mais nada não, valeus") .queue()
    }
}