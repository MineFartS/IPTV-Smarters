package c.h.a.k.a;

import android.content.Intent;
import minefarts.iptvsmarters.view.activity.SearchActivity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends a.l.d.e {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startActivity(new Intent(this, (Class<?>) SearchActivity.class));
        return true;
    }
}
