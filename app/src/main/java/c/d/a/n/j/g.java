package c.d.a.n.j;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelFileDescriptor f5678b;

    public g(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f5677a = inputStream;
        this.f5678b = parcelFileDescriptor;
    }

    public ParcelFileDescriptor a() {
        return this.f5678b;
    }

    public InputStream b() {
        return this.f5677a;
    }
}
