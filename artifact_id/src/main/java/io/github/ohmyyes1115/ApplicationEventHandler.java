package io.github.ohmyyes1115;

import griffon.core.event.EventHandler;
import griffon.exceptions.GriffonViewInitializationException;

public class ApplicationEventHandler implements EventHandler {
    public void onUncaughtGriffonViewInitializationException(GriffonViewInitializationException x) {
        System.exit(1);
    }
}