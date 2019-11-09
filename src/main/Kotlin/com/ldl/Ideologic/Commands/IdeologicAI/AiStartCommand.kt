package com.ldl.Ideologic.Commands.IdeologicAI

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class AiStartCommand : AbstractCommands ("ideAI"){
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("${event.author.asMention} espertinho, minha AI ainda esta em desenvolvimento, mas, como descobriu ela?").queue()
    }
}
