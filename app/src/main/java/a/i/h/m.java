package a.i.h;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f1755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f1756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1760f;

    public IconCompat a() {
        return this.f1756b;
    }

    public String b() {
        return this.f1758d;
    }

    public CharSequence c() {
        return this.f1755a;
    }

    public String d() {
        return this.f1757c;
    }

    public boolean e() {
        return this.f1759e;
    }

    public boolean f() {
        return this.f1760f;
    }

    public String g() {
        String str = this.f1757c;
        if (str != null) {
            return str;
        }
        if (this.f1755a == null) {
            return BuildConfig.FLAVOR;
        }
        return "name:" + ((Object) this.f1755a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().v() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
