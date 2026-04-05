package com.amplifyframework.devmenu;

import a.l.d.e;
import a.v.r;
import a.v.y.b;
import a.v.y.c;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import com.amplifyframework.core.R;
import com.amplifyframework.devmenu.DeveloperMenu;

/* JADX INFO: loaded from: classes.dex */
public final class DeveloperMenuActivity extends e {
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_dev_menu);
        findViewById(R.id.dev_layout).setFocusable(true);
        NavController navControllerA = r.a(this, R.id.nav_host_fragment);
        c.d((Toolbar) findViewById(R.id.toolbar), navControllerA, new b.C0085b(navControllerA.j()).a());
        DeveloperMenu.singletonInstance(getApplicationContext()).setOnHideAction(new DeveloperMenu.HideAction() { // from class: c.b.c.a
            @Override // com.amplifyframework.devmenu.DeveloperMenu.HideAction
            public final void hideDeveloperMenu() {
                this.f5058a.finish();
            }
        });
    }

    @Override // a.l.d.e, android.app.Activity
    public void onStart() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(true);
        super.onStart();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onStop() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(false);
        super.onStop();
    }
}
