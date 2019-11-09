package com.ldl.Ideologic.Commands.misc

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class MenesCommands : AbstractCommands ("=mene") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("https://cdn.discordapp.com/attachments/343909006936506368/553457792917176321/Screenshot_20190306-082901__01.jpg") .queue()
        event.channel.sendMessage("https://cdn.discordapp.com/attachments/343909006936506368/553360187193294848/28103142229109.png") .queue()

    }
}

