package com.javadiscord.jdi.internal.gateway.handlers.events.codec.handlers.guild.event;

import com.javadiscord.jdi.core.models.scheduled_event.EventUser;
import com.javadiscord.jdi.internal.cache.Cache;
import com.javadiscord.jdi.internal.gateway.ConnectionMediator;
import com.javadiscord.jdi.internal.gateway.handlers.events.codec.EventHandler;

public class ScheduledEventUserRemoveHandler implements EventHandler<EventUser> {
    @Override
    public void handle(EventUser event, ConnectionMediator connectionMediator, Cache cache) {}
}
