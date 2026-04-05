package c.f.a.c.d.v;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class y extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<t> f12215d;

    public y(String str, String str2, String str3) {
        super(str, str2, null);
        this.f12215d = Collections.synchronizedList(new ArrayList());
    }

    @Override // c.f.a.c.d.v.g0
    public void f() {
        synchronized (this.f12215d) {
            Iterator<t> it = this.f12215d.iterator();
            while (it.hasNext()) {
                it.next().e(AdError.CACHE_ERROR_CODE);
            }
        }
    }

    public final void i(t tVar) {
        this.f12215d.add(tVar);
    }

    public final List<t> j() {
        return this.f12215d;
    }
}
