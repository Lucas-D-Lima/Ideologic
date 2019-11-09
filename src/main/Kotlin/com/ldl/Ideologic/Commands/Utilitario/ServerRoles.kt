package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class ServerRoles : AbstractCommands ("=roles") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Esse server tem ${event.guild.roles.size}, são eles ${event.guild.roles}").queue()
    }
}