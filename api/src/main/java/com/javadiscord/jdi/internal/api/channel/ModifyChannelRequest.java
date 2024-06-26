package com.javadiscord.jdi.internal.api.channel;

import com.javadiscord.jdi.internal.api.DiscordRequest;
import com.javadiscord.jdi.internal.api.DiscordRequestBuilder;

import java.util.Map;

public record ModifyChannelRequest(long channelId, String name, String base64EncodedIcon)
        implements DiscordRequest {

    @Override
    public DiscordRequestBuilder create() {
        return new DiscordRequestBuilder()
                .patch()
                .path("/channels/%s".formatted(channelId))
                .body(
                        Map.of(
                                "name", name,
                                "icon", base64EncodedIcon));
    }
}
