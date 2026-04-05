package c.f.b.d;

import c.f.b.a.k;
import c.f.b.b.v0;
import java.io.File;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0<File> f15995a = new C0190a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.b.c.a<File> f15996b = new b();

    /* JADX INFO: renamed from: c.f.b.d.a$a, reason: collision with other inner class name */
    public static class C0190a extends v0<File> {
        public String toString() {
            return "Files.fileTreeTraverser()";
        }
    }

    public static class b implements c.f.b.c.a<File> {
    }

    public static String a(String str) {
        k.j(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? BuildConfig.FLAVOR : name.substring(iLastIndexOf + 1);
    }
}
