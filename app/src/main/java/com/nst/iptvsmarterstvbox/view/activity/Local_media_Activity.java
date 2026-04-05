package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import c.h.a.g.c.f;
import c.h.a.h.e;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class Local_media_Activity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f25776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f25777e = this;

    public class a implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f25778a;

        public a(String[] strArr) {
            this.f25778a = strArr;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 512) {
            if (i3 == -1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("ResultPickVideo");
                StringBuilder sb = new StringBuilder();
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    sb.append(((f) it.next()).q() + "\n");
                }
                return;
            }
            return;
        }
        if (i2 == 768) {
            if (i3 == -1) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("ResultPickAudio");
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = parcelableArrayListExtra2.iterator();
                while (it2.hasNext()) {
                    sb2.append(((c.h.a.g.c.a) it2.next()).q() + "\n");
                }
                return;
            }
            return;
        }
        if (i2 == 1024 && i3 == -1) {
            ArrayList parcelableArrayListExtra3 = intent.getParcelableArrayListExtra("ResultPickFILE");
            StringBuilder sb3 = new StringBuilder();
            Iterator it3 = parcelableArrayListExtra3.iterator();
            while (it3.hasNext()) {
                sb3.append(((c.h.a.g.c.e) it3.next()).q() + "\n");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this.f25777e, (Class<?>) RoutingActivity.class));
        finishAffinity();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pick_audio /* 2131427656 */:
                Intent intent = new Intent(this, (Class<?>) AudioPickActivity.class);
                intent.putExtra("IsNeedRecorder", false);
                intent.putExtra("MaxNumber", 9);
                intent.putExtra("isNeedFolderList", true);
                startActivityForResult(intent, 768);
                break;
            case R.id.btn_pick_file /* 2131427657 */:
                e eVar = new e(this.f25777e, new a(new String[]{BuildConfig.FLAVOR}));
                if (Build.VERSION.SDK_INT < 30) {
                    eVar.v(BuildConfig.FLAVOR);
                } else {
                    eVar.w(BuildConfig.FLAVOR);
                }
                break;
            case R.id.btn_pick_video /* 2131427658 */:
                Intent intent2 = new Intent(this, (Class<?>) VideoPickActivity.class);
                intent2.putExtra("IsNeedCamera", false);
                intent2.putExtra("MaxNumber", 9);
                intent2.putExtra("isNeedFolderList", true);
                startActivity(intent2);
                break;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25777e = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25777e);
        f25776d = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_local_media_tv : R.layout.activity_local_media_);
    }
}
