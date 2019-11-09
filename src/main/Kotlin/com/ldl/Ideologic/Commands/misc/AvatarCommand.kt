package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class AvatarCommand : AbstractCommands ("=avatar") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage(event.author.effectiveAvatarUrl).queue()
    }
}
