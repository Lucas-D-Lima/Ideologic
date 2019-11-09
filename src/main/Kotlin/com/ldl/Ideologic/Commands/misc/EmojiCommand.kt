package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class EmojiCommand : AbstractCommands ("=somar") {
    override fun run(event: GuildMessageReceivedEvent) {
        var n1 : Int
        var n2 : Int
        var result : Int

        event.channel.sendMessage("${event.author.asMention}Digite um valor")
        n1 = readLine()!!.toInt();

        event.channel.sendMessage("${event.author.asMention} Digite outro valor")

        n2 = readLine()!!.toInt()

        result = n1+n2

        event.channel.sendMessage("${event.author.asMention}, a soma entre ${n1} e ${n2} é ${result}").queue()

    }
}





