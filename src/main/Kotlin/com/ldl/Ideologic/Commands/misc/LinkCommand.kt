package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class LinkCommand : AbstractCommands ("=addbot") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("${event.author.asMention}, eae, quer me adicionar no seu server? aqui o link do meu site, só cuidado para não se perder o.O  ``https://sites.google.com/view/ideologico`` \n\n E caso queira entrar no meu servidor de suport ``https://discord.gg/z7S2rk4``").queue()
    }
}