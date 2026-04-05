package com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature;

import android.view.Menu;
import c.f.a.c.d.u.u.m.a;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ExpandedControlsActivity extends a {
    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.expanded_controller, menu);
        c.f.a.c.d.u.a.a(this, menu, R.id.media_route_menu_item);
        return true;
    }
}
