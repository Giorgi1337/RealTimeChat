package com.chat.config;

import jakarta.websocket.Session;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {

    public void HandleWebSocketDisconnectListener(Session event) {
        // TODO
    }
}
