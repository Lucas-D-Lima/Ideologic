package com.ldl.Ideologic.Commands.economic

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class MoneyCommand : AbstractCommands ("=money") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Você tem não depositado **${VariaveisEconomicas.dinheiro} IDECoin** \n No banco voce tem  **${VariaveisEconomicas.banco} IDEcoin** \n e junto um total de **${VariaveisEconomicas.total} IDECoin**").queue()
    }
}