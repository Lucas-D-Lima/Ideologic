package com.ldl.Ideologic.listerns

import com.ldl.Ideologic.Ideologic
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

class DiscordListerns (val bot: Ideologic) : ListenerAdapter () {
    override fun onGuildMessageReceived(event: GuildMessageReceivedEvent) {
        println("${event.author.name}: ${event.message.guild}, ${event.message.channel} ${event.message.contentRaw}")

        if (event.author.isBot)
            return

        for (commands in bot.commands ) {
            if (commands.handle(event))
                return



    }
}


}


