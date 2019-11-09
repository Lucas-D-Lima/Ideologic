package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class PingCommand : AbstractCommands("=ping") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Pong :ping_pong: ").queue()
    }
}