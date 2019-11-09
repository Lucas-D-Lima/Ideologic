package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent


class CalcCommand:
    AbstractCommands ("loli") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("```CHEGOU O FBI!Cadê as lolis vagabundo?```https://tenor.com/view/fbi-raid-swat-gif-11500735").queue()
    }
}