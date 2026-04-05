package c.f.a.b.i3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f8912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f8913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f8914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f8915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8917k;

    public static class a extends q {
        public a(IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public k(Context context) {
        super(false);
        this.f8912f = context.getContentResolver();
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8913g;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f8916j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new a(e2, AdError.SERVER_ERROR_CODE);
            }
        }
        int i4 = ((FileInputStream) x0.i(this.f8915i)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        long j3 = this.f8916j;
        if (j3 != -1) {
            this.f8916j = j3 - ((long) i4);
        }
        v(i4);
        return i4;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8913g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8915i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8915i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8914h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new a(e2, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f8914h = null;
                    if (this.f8917k) {
                        this.f8917k = false;
                        w();
                    }
                }
            } catch (Throwable th) {
                this.f8915i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f8914h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f8914h = null;
                        if (this.f8917k) {
                            this.f8917k = false;
                            w();
                        }
                        throw th;
                    } finally {
                        this.f8914h = null;
                        if (this.f8917k) {
                            this.f8917k = false;
                            w();
                        }
                    }
                } catch (IOException e3) {
                    throw new a(e3, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e4) {
            throw new a(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws a {
        int i2 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = sVar.f9061a;
            this.f8913g = uri;
            x(sVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f8912f.openAssetFileDescriptor(uri, "r");
            this.f8914h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f8915i = fileInputStream;
            if (length != -1 && sVar.f9067g > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(sVar.f9067g + startOffset) - startOffset;
            if (jSkip != sVar.f9067g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f8916j = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f8916j = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f8916j = j2;
                if (j2 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = sVar.f9068h;
            if (jMin != -1) {
                long j3 = this.f8916j;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.f8916j = jMin;
            }
            this.f8917k = true;
            y(sVar);
            long j4 = sVar.f9068h;
            return j4 != -1 ? j4 : this.f8916j;
        } catch (a e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3 instanceof FileNotFoundException) {
                i2 = 2005;
            }
            throw new a(e3, i2);
        }
    }
}
