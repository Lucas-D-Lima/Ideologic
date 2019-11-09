package com.ldl.Ideologic.Commands

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

abstract class AbstractCommands (val label: String) {
    

    fun handle (event: GuildMessageReceivedEvent) : Boolean {
        val mensagem = event.message.contentRaw

        if (mensagem .startsWith(label)) {
            run(event)
            return true
        } else {
            return false
        }
    }
    abstract fun run(event: GuildMessageReceivedEvent)





}
