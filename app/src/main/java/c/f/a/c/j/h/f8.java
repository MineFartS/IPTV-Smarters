package c.f.a.c.j.h;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f8 extends m8 {
    public f8(int i2) {
        super(i2, null);
    }

    @Override // c.f.a.c.j.h.m8
    public final void b() {
        if (!c()) {
            for (int i2 = 0; i2 < d(); i2++) {
                Map.Entry entryE = e(i2);
                if (((c6) entryE.getKey()).l()) {
                    entryE.setValue(Collections.unmodifiableList((List) entryE.getValue()));
                }
            }
            for (Map.Entry entry : f()) {
                if (((c6) entry.getKey()).l()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
