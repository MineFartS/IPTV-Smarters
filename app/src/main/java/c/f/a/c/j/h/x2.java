package c.f.a.c.j.h;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends ContentObserver {
    public x2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        y2.f13644e.set(true);
    }
}
