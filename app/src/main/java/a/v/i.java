package a.v;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.NavController;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f3567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f3570e;

    public i(Context context) {
        this.f3566a = context;
        if (context instanceof Activity) {
            this.f3567b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f3567b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f3567b.addFlags(268468224);
    }

    public i(NavController navController) {
        this(navController.f());
        this.f3568c = navController.j();
    }

    public a.i.h.p a() {
        if (this.f3567b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.f3568c == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        a.i.h.p pVarB = a.i.h.p.f(this.f3566a).b(new Intent(this.f3567b));
        for (int i2 = 0; i2 < pVarB.i(); i2++) {
            pVarB.g(i2).putExtra("android-support-nav:controller:deepLinkIntent", this.f3567b);
        }
        return pVarB;
    }

    public final void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f3568c);
        k kVar = null;
        while (!arrayDeque.isEmpty() && kVar == null) {
            k kVar2 = (k) arrayDeque.poll();
            if (kVar2.v() == this.f3569d) {
                kVar = kVar2;
            } else if (kVar2 instanceof l) {
                Iterator<k> it = ((l) kVar2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (kVar != null) {
            this.f3567b.putExtra("android-support-nav:controller:deepLinkIds", kVar.f());
            return;
        }
        throw new IllegalArgumentException("Navigation destination " + k.t(this.f3566a, this.f3569d) + " cannot be found in the navigation graph " + this.f3568c);
    }

    public i c(Bundle bundle) {
        this.f3570e = bundle;
        this.f3567b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public i d(int i2) {
        this.f3569d = i2;
        if (this.f3568c != null) {
            b();
        }
        return this;
    }
}
