package a.i.h;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable<Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f1768b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1769c;

    public interface a {
        Intent B();
    }

    public p(Context context) {
        this.f1769c = context;
    }

    public static p f(Context context) {
        return new p(context);
    }

    public p a(Intent intent) {
        this.f1768b.add(intent);
        return this;
    }

    public p b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f1769c.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p d(Activity activity) {
        Intent intentB = activity instanceof a ? ((a) activity).B() : null;
        if (intentB == null) {
            intentB = h.a(activity);
        }
        if (intentB != null) {
            ComponentName component = intentB.getComponent();
            if (component == null) {
                component = intentB.resolveActivity(this.f1769c.getPackageManager());
            }
            e(component);
            a(intentB);
        }
        return this;
    }

    public p e(ComponentName componentName) {
        int size = this.f1768b.size();
        try {
            Context context = this.f1769c;
            while (true) {
                Intent intentB = h.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f1768b.add(size, intentB);
                context = this.f1769c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public Intent g(int i2) {
        return this.f1768b.get(i2);
    }

    public int i() {
        return this.f1768b.size();
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1768b.iterator();
    }

    public PendingIntent s(int i2, int i3) {
        return t(i2, i3, null);
    }

    public PendingIntent t(int i2, int i3, Bundle bundle) {
        if (this.f1768b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        ArrayList<Intent> arrayList = this.f1768b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return Build.VERSION.SDK_INT >= 16 ? PendingIntent.getActivities(this.f1769c, i2, intentArr, i3, bundle) : PendingIntent.getActivities(this.f1769c, i2, intentArr, i3);
    }

    public void v() {
        x(null);
    }

    public void x(Bundle bundle) {
        if (this.f1768b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f1768b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (a.i.i.b.j(this.f1769c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1769c.startActivity(intent);
    }
}
