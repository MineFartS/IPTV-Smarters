package com.google.ads.interactivemedia.v3.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class ahi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f19720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<String> f19721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19722c;

    public ahi(Queue<String> queue, BufferedReader bufferedReader) {
        this.f19721b = queue;
        this.f19720a = bufferedReader;
    }

    public final String a() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        String str = this.f19722c;
        this.f19722c = null;
        return str;
    }

    public final boolean b() throws IOException {
        String strTrim;
        if (this.f19722c != null) {
            return true;
        }
        if (!this.f19721b.isEmpty()) {
            String strPoll = this.f19721b.poll();
            ajr.b(strPoll);
            this.f19722c = strPoll;
            return true;
        }
        do {
            String line = this.f19720a.readLine();
            this.f19722c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f19722c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
