package a.l.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<E> extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f2390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f2392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f2394f;

    public k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    public k(Activity activity, Context context, Handler handler, int i2) {
        this.f2394f = new o();
        this.f2390b = activity;
        this.f2391c = (Context) a.i.q.i.f(context, "context == null");
        this.f2392d = (Handler) a.i.q.i.f(handler, "handler == null");
        this.f2393e = i2;
    }

    @Override // a.l.d.g
    public View c(int i2) {
        return null;
    }

    @Override // a.l.d.g
    public boolean d() {
        return true;
    }

    public Activity e() {
        return this.f2390b;
    }

    public Context f() {
        return this.f2391c;
    }

    public Handler g() {
        return this.f2392d;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f2391c);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean l(Fragment fragment) {
        return true;
    }

    public boolean m(String str) {
        return false;
    }

    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        a.i.i.b.k(this.f2391c, intent, bundle);
    }

    @Deprecated
    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        a.i.h.a.w(this.f2390b, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void p() {
    }
}
