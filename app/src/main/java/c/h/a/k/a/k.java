package c.h.a.k.a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.nst.iptvsmarterstvbox.R;
import java.util.List;
import n.a.a.b;
import n.a.a.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends a.b.k.c implements c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17366d = k.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.a f17367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17368f;

    @Override // n.a.a.c.a
    public void W(int i2, List<String> list) {
        Log.d(f17366d, "onPermissionsGranted:" + i2 + ":" + list.size());
        y0();
    }

    @Override // n.a.a.c.a
    public void h(int i2, List<String> list) {
        Log.d(f17366d, "onPermissionsDenied:" + i2 + ":" + list.size());
        if (n.a.a.c.i(this, list)) {
            new b.C0319b(this).a().e();
        } else {
            finish();
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 16061) {
            if (n.a.a.c.a(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                y0();
            } else {
                finish();
            }
        }
    }

    public void onBackClick(View view) {
        finish();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("isNeedFolderList", false);
        this.f17368f = booleanExtra;
        if (booleanExtra) {
            c.h.a.a aVar = new c.h.a.a();
            this.f17367e = aVar;
            aVar.b(this);
        }
    }

    @Override // a.b.k.c, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        z0();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        n.a.a.c.d(i2, strArr, iArr, this);
    }

    public abstract void y0();

    @n.a.a.a(123)
    public final void z0() {
        if (n.a.a.c.a(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            y0();
        } else {
            n.a.a.c.f(this, getString(R.string.vw_rationale_storage), 123, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }
}
