package c.f.a.e.a.c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f15698a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f15699b = new AtomicBoolean(false);

    public final synchronized boolean a() {
        if (!this.f15699b.get()) {
            b();
        }
        Object obj = this.f15698a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final synchronized void b() {
        this.f15698a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
