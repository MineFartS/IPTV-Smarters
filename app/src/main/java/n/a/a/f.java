package n.a.a;

import a.b.k.b;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f31230e;

    public f(int i2, int i3, String str, int i4, String[] strArr) {
        this.f31226a = i2;
        this.f31227b = i3;
        this.f31229d = str;
        this.f31228c = i4;
        this.f31230e = strArr;
    }

    public f(Bundle bundle) {
        this.f31226a = bundle.getInt("positiveButton");
        this.f31227b = bundle.getInt("negativeButton");
        this.f31229d = bundle.getString("rationaleMsg");
        this.f31228c = bundle.getInt("requestCode");
        this.f31230e = bundle.getStringArray("permissions");
    }

    public a.b.k.b a(Context context, DialogInterface.OnClickListener onClickListener) {
        return new b.a(context).b(false).setPositiveButton(this.f31226a, onClickListener).setNegativeButton(this.f31227b, onClickListener).f(this.f31229d).create();
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("positiveButton", this.f31226a);
        bundle.putInt("negativeButton", this.f31227b);
        bundle.putString("rationaleMsg", this.f31229d);
        bundle.putInt("requestCode", this.f31228c);
        bundle.putStringArray("permissions", this.f31230e);
        return bundle;
    }
}
