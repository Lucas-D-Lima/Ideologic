package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class UserInfoCommand : AbstractCommands ("=user") {


    override fun run(event: GuildMessageReceivedEvent) {



        event.channel.sendMessage("${event.author.asMention} :pencil: O nick do usuario é **${event.member.nickname}** " +
                "\n\n :calendar: Ele entrou **${event.member.joinDate}**" +
                " \n\n :satellite: Seu status atual é **${event.member.onlineStatus}** " +
                "\n\n :page_facing_up: Ele tem **${event.member.roles.size} cargos** \n\n " +
                ":1234: Seu descriminador é **${event.author.discriminator}**\n\n :video_game:Esta jogando **${event.member.game}** \n\n " +
                "${Emotes.LOGO_EMOTE} Seu avatar é ${event.author.effectiveAvatarUrl}").queue()

    }
}