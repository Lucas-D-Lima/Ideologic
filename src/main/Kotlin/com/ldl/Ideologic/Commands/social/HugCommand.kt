package com.ldl.Ideologic.Commands.social

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class HugCommand : AbstractCommands ("=hug") {

    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("O ${event.author.asMention} deu um abraço no ${event.member.nickname} https://tenor.com/view/dog-hug-bff-bestfriend-friend-gif-9512793") .queue()

    }
}