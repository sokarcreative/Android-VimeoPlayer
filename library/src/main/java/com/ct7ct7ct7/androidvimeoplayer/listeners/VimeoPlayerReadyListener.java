package com.ct7ct7ct7.androidvimeoplayer.listeners;

public interface VimeoPlayerReadyListener {
    void onReady(String title, float duration);

    void onInitFailed();
}
