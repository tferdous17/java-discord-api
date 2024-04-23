package com.javadiscord.jdi.internal.api.impl.channel;

import java.util.Optional;

import com.javadiscord.jdi.internal.api.DiscordRequest;
import com.javadiscord.jdi.internal.api.DiscordRequestBuilder;

public record GetThreadMemberRequest(long channelId, long userId, Optional<Boolean> withMember)
    implements DiscordRequest {

    @Override
    public DiscordRequestBuilder create() {
        DiscordRequestBuilder discordRequestBuilder = new DiscordRequestBuilder()
            .get()
            .path("/channels/%s/thread-members/%s".formatted(channelId, userId));

        withMember.ifPresent(val -> discordRequestBuilder.queryParam("with_member", val));

        return discordRequestBuilder;
    }
}
