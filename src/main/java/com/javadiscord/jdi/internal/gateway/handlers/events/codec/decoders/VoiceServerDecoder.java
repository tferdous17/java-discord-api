package com.javadiscord.jdi.internal.gateway.handlers.events.codec.decoders;

import com.javadiscord.jdi.internal.gateway.GatewayEvent;
import com.javadiscord.jdi.internal.gateway.handlers.events.codec.EventDecoder;
import com.javadiscord.jdi.internal.models.voice.VoiceServer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VoiceServerDecoder implements EventDecoder<VoiceServer> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public VoiceServer decode(GatewayEvent gatewayEvent) {
        try {
            return OBJECT_MAPPER.readValue(gatewayEvent.data().toString(), VoiceServer.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
