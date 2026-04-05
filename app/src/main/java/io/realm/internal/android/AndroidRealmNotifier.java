package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import e.a.g.a;
import io.realm.internal.Keep;
import io.realm.internal.RealmNotifier;
import io.realm.internal.SharedRealm;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(SharedRealm sharedRealm, a aVar) {
        super(sharedRealm);
        this.handler = aVar.a() ? new Handler(Looper.myLooper()) : null;
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        return handler != null && handler.post(runnable);
    }
}
