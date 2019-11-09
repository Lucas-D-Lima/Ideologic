package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class MentionCommand : AbstractCommands ("Ideologic") {

    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Ola ${event.author.asMention}, sou um bot e atualmente tenho 8 comandos, meu prefixo é =, caso queira saber os comandos use =help").queue()
    }

}