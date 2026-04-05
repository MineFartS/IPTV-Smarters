package a.d.b;

import a.d.b.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f1167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1168b;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f1171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f1172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<Bundle> f1173e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SparseArray<Bundle> f1175g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f1169a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.C0018a f1170b = new a.C0018a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1174f = true;

        public a() {
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }

        public d a() {
            if (!this.f1169a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1171c;
            if (arrayList != null) {
                this.f1169a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1173e;
            if (arrayList2 != null) {
                this.f1169a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1169a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1174f);
            this.f1169a.putExtras(this.f1170b.a().a());
            if (this.f1175g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1175g);
                this.f1169a.putExtras(bundle);
            }
            return new d(this.f1169a, this.f1172d);
        }

        public a b(f fVar) {
            this.f1169a.setPackage(fVar.b().getPackageName());
            c(fVar.a(), fVar.c());
            return this;
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            a.i.h.f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1169a.putExtras(bundle);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f1167a = intent;
        this.f1168b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1167a.setData(uri);
        a.i.i.b.k(context, this.f1167a, this.f1168b);
    }
}
