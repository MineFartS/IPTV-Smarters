package com.google.ads.interactivemedia.v3.internal;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f23816b;

    public yx() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        this.f23815a = byteArrayOutputStream;
        this.f23816b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void c(DataOutputStream dataOutputStream, long j2) throws IOException {
        dataOutputStream.writeByte(((int) (j2 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j2) & 255);
    }

    public final byte[] a(yv yvVar) {
        this.f23815a.reset();
        try {
            b(this.f23816b, yvVar.f23809a);
            String str = yvVar.f23810b;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            b(this.f23816b, str);
            c(this.f23816b, yvVar.f23811c);
            c(this.f23816b, yvVar.f23812d);
            this.f23816b.write(yvVar.f23813e);
            this.f23816b.flush();
            return this.f23815a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
