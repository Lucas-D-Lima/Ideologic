package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import com.ldl.Ideologic.Commands.Utilitario.Emotes
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class DigaCommand: AbstractCommands ("=diga") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("**${event.author.asMention} disse** ${Emotes.MEGAFONE_EMOTE}:${event.message.contentRaw}").queue()
    }
}