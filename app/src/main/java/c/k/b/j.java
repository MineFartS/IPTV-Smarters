package c.k.b;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f18721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f18722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18724d;

        public a(InputStream inputStream, boolean z, long j2) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f18721a = inputStream;
            this.f18722b = null;
            this.f18723c = z;
            this.f18724d = j2;
        }

        @Deprecated
        public Bitmap a() {
            return this.f18722b;
        }

        public long b() {
            return this.f18724d;
        }

        public InputStream c() {
            return this.f18721a;
        }
    }

    public static class b extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18726c;

        public b(String str, int i2, int i3) {
            super(str);
            this.f18725b = q.isOfflineOnly(i2);
            this.f18726c = i3;
        }
    }

    a a(Uri uri, int i2);
}
