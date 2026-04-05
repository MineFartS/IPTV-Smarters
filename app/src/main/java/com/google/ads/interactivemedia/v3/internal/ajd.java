package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ajd extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f19874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f19875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f19876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileInputStream f19877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19879f;

    public ajd(Context context) {
        super(false);
        this.f19874a = context.getContentResolver();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) throws ajc {
        long jPosition;
        try {
            Uri uri = ajlVar.f19897a;
            this.f19875b = uri;
            i(ajlVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f19874a.openAssetFileDescriptor(uri, "r");
            this.f19876c = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new FileNotFoundException(sb.toString());
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f19877d = fileInputStream;
            if (length != -1 && ajlVar.f19901e > length) {
                throw new aji();
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(ajlVar.f19901e + startOffset) - startOffset;
            if (jSkip != ajlVar.f19901e) {
                throw new aji();
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f19878e = -1L;
                    jPosition = -1;
                } else {
                    jPosition = size - channel.position();
                    this.f19878e = jPosition;
                    if (jPosition < 0) {
                        throw new aji();
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f19878e = j2;
                if (j2 < 0) {
                    throw new aji();
                }
                jPosition = j2;
            }
            long jMin = ajlVar.f19902f;
            if (jMin != -1) {
                if (jPosition != -1) {
                    jMin = Math.min(jPosition, jMin);
                }
                this.f19878e = jMin;
            }
            this.f19879f = true;
            j(ajlVar);
            long j3 = ajlVar.f19902f;
            return j3 != -1 ? j3 : this.f19878e;
        } catch (IOException e2) {
            throw new ajc(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws ajc {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19878e;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new ajc(e2);
            }
        }
        FileInputStream fileInputStream = this.f19877d;
        int i4 = amn.f20135a;
        int i5 = fileInputStream.read(bArr, i2, i3);
        if (i5 == -1) {
            return -1;
        }
        long j3 = this.f19878e;
        if (j3 != -1) {
            this.f19878e = j3 - ((long) i5);
        }
        g(i5);
        return i5;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19875b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f19875b = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19877d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19877d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19876c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new ajc(e2);
                    }
                } finally {
                    this.f19876c = null;
                    if (this.f19879f) {
                        this.f19879f = false;
                        h();
                    }
                }
            } catch (Throwable th) {
                this.f19877d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f19876c;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f19876c = null;
                        if (this.f19879f) {
                            this.f19879f = false;
                            h();
                        }
                        throw th;
                    } catch (IOException e3) {
                        throw new ajc(e3);
                    }
                } catch (Throwable th2) {
                    this.f19876c = null;
                    if (this.f19879f) {
                        this.f19879f = false;
                        h();
                    }
                    throw th2;
                }
            }
        } catch (IOException e4) {
            throw new ajc(e4);
        }
    }
}
