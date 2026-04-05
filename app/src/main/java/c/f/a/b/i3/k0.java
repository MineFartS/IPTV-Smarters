package c.f.a.b.i3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Resources f8918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f8920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AssetFileDescriptor f8921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputStream f8922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8924l;

    public static class a extends q {
        public a(String str, Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public k0(Context context) {
        super(false);
        this.f8918f = context.getResources();
        this.f8919g = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8920h;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f8923k;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new a(null, e2, AdError.SERVER_ERROR_CODE);
            }
        }
        int i4 = ((InputStream) x0.i(this.f8922j)).read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.f8923k == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j3 = this.f8923k;
        if (j3 != -1) {
            this.f8923k = j3 - ((long) i4);
        }
        v(i4);
        return i4;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8920h = null;
        try {
            try {
                InputStream inputStream = this.f8922j;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8922j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8921i;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new a(null, e2, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f8921i = null;
                    if (this.f8924l) {
                        this.f8924l = false;
                        w();
                    }
                }
            } catch (Throwable th) {
                this.f8922j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f8921i;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f8921i = null;
                        if (this.f8924l) {
                            this.f8924l = false;
                            w();
                        }
                        throw th;
                    } finally {
                        this.f8921i = null;
                        if (this.f8924l) {
                            this.f8924l = false;
                            w();
                        }
                    }
                } catch (IOException e3) {
                    throw new a(null, e3, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e4) {
            throw new a(null, e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws a {
        int identifier;
        String str;
        Uri uri = sVar.f9061a;
        this.f8920h = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) c.f.a.b.j3.g.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) c.f.a.b.j3.g.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) c.f.a.b.j3.g.e(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(strSubstring);
            identifier = this.f8918f.getIdentifier(sb.toString(), "raw", this.f8919g);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        x(sVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f8918f.openRawResourceFd(identifier);
            this.f8921i = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, AdError.SERVER_ERROR_CODE);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f8922j = fileInputStream;
            if (length != -1) {
                try {
                    if (sVar.f9067g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new a(null, e3, AdError.SERVER_ERROR_CODE);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(sVar.f9067g + startOffset) - startOffset;
            if (jSkip != sVar.f9067g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f8923k = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f8923k = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f8923k = j2;
                if (j2 < 0) {
                    throw new q(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long jMin = sVar.f9068h;
            if (jMin != -1) {
                long j3 = this.f8923k;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.f8923k = jMin;
            }
            this.f8924l = true;
            y(sVar);
            long j4 = sVar.f9068h;
            return j4 != -1 ? j4 : this.f8923k;
        } catch (Resources.NotFoundException e4) {
            throw new a(null, e4, 2005);
        }
    }
}
