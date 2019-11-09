package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import kotlinx.coroutines.experimental.newCoroutineContext
import kotlinx.coroutines.experimental.withContext
import net.dv8tion.jda.core.EmbedBuilder
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent
import java.awt.Color
import java.lang.management.ManagementFactory

class EmendsTestCommand: AbstractCommands ("=emends") {
    override fun run(event: GuildMessageReceivedEvent) {
        val emend = EmbedBuilder()

        emend.setDescription("Um comando de teste, mas me add ai, valeus fuis")
        emend.setColor(Color(0, 193, 223))
            .build()

        event.channel.sendMessage("${emend}")
    }
}