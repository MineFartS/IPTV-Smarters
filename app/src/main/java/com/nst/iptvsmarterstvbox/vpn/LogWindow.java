package minefarts.iptvsmarters.vpn;

import android.os.Bundle;
import android.view.MenuItem;
import c.h.a.l.b.a;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class LogWindow extends a {
    @Override // c.h.a.l.b.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.log_window);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new c.h.a.l.d.a()).commit();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
