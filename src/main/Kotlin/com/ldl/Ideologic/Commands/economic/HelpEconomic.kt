package com.ldl.Ideologic.Commands.economic

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class HelpEconomic: AbstractCommands ("=EconomicHelp") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Work- trabalhe e ganhe um dinheirinho \n\n Money- saiba quanto tu tem de patrimonio ").queue()
    }
}