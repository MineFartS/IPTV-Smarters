package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class av extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f20592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bd f20594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ly f20595e;

    public av(Handler handler, Context context, ly lyVar, bd bdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(handler);
        this.f20591a = context;
        this.f20592b = (AudioManager) context.getSystemService("audio");
        this.f20595e = lyVar;
        this.f20594d = bdVar;
    }

    private final float c() {
        int streamVolume = this.f20592b.getStreamVolume(3);
        int streamMaxVolume = this.f20592b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f2 = streamVolume / streamMaxVolume;
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    private final void d() {
        this.f20594d.d(this.f20593c);
    }

    public final void a() {
        this.f20593c = c();
        d();
        this.f20591a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f20591a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fC = c();
        if (fC != this.f20593c) {
            this.f20593c = fC;
            d();
        }
    }
}
