package c.f.a.c.j.h;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class va extends sd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Bundle> f13598b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13599c;

    public static final <T> T K2(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e2);
            throw e2;
        }
    }

    public final Bundle I2(long j2) {
        Bundle bundle;
        synchronized (this.f13598b) {
            if (!this.f13599c) {
                try {
                    this.f13598b.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f13598b.get();
        }
        return bundle;
    }

    public final String c1(long j2) {
        return (String) K2(I2(j2), String.class);
    }

    @Override // c.f.a.c.j.h.td
    public final void w1(Bundle bundle) {
        synchronized (this.f13598b) {
            try {
                this.f13598b.set(bundle);
                this.f13599c = true;
            } finally {
                this.f13598b.notify();
            }
        }
    }
}
