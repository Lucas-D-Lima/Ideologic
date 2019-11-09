package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class EmotesTestCommand : AbstractCommands ("=emote101") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("LogoEmote ${Emotes.LOGO_EMOTE} \n\n happythink ${Emotes.HAPPY_THINK} \n\n MegafoneEmote ${Emotes.MEGAFONE_EMOTE} \n\n Google ${Emotes.GOOGLE}").queue()
    }
}