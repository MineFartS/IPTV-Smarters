package c.h.a.k.d.c.a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IMediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f17829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17830b;

    public a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f17829a = randomAccessFile;
        this.f17830b = randomAccessFile.length();
    }

    public static String a() {
        return "SVBUViBTbWFydGVycyBQcm8=";
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        this.f17830b = 0L;
        this.f17829a.close();
        this.f17829a = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        return this.f17830b;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
        if (this.f17829a.getFilePointer() != j2) {
            this.f17829a.seek(j2);
        }
        if (i3 == 0) {
            return 0;
        }
        return this.f17829a.read(bArr, 0, i3);
    }
}
