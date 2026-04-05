package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class ServerInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("url")
    public String f25049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)
    public String f25050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("rtmp_port")
    public String f25051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("timezone")
    public String f25052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("https_port")
    public String f25053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("server_protocol")
    public String f25054f;

    public String a() {
        return this.f25053e;
    }

    public String b() {
        return this.f25050b;
    }

    public String c() {
        return this.f25051c;
    }

    public String d() {
        return this.f25054f;
    }

    public String e() {
        return this.f25052d;
    }

    public String f() {
        return this.f25049a;
    }
}
