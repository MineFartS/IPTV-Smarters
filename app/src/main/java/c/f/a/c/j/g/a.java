package c.f.a.c.j.g;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f13186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13187c;

    public a(IBinder iBinder, String str) {
        this.f13186b = iBinder;
        this.f13187c = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f13186b;
    }
}
