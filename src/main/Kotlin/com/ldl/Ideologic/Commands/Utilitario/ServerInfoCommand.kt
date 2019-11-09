package com.ldl.Ideologic.Commands.Utilitario

import com.ldl.Ideologic.Commands.AbstractCommands
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent

class ServerInfoCommand : AbstractCommands ("=serverinfo") {


    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage(
                ":crown:O dono da guild é **${event.guild.owner.effectiveName}** " +
                        "\n\n :busts_in_silhouette:O server tem **${event.guild.members.size} membros** " +
                        "\n\n :pencil: Tem **${event.guild.textChannels.size}** canais de texto" +
                        " \n\n :notes: E **${event.guild.voiceChannels.size}** canais de voz \n\n :poop: Tem  ${event.guild.emotes.size} emojis " +
                        "\n\n :earth_americas: O server esta na região **${event.guild.region}** " +
                        "\n\n :desktop: O ID do server é **${event.guild.id}** " +
                        "\n\n :calendar_spiral: O server foi criado ${event.guild.creationTime} " +
                        "\n\n ${Emotes.LOGO_EMOTE} A imagem do server é ${event.guild.iconUrl}").queue()
    }
}