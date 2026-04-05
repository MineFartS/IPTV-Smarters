package c.f.a.c.f.q;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f12661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12662b;

    public r(@RecentlyNonNull Context context) {
        o.i(context);
        Resources resources = context.getResources();
        this.f12661a = resources;
        this.f12662b = resources.getResourcePackageName(c.f.a.c.f.l.f12343a);
    }

    @RecentlyNullable
    public String a(@RecentlyNonNull String str) {
        int identifier = this.f12661a.getIdentifier(str, "string", this.f12662b);
        if (identifier == 0) {
            return null;
        }
        return this.f12661a.getString(identifier);
    }
}
