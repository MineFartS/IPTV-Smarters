package c.f.a.e.a.b;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z1 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FilenameFilter f15697a = new z1();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return a2.f15366a.matcher(str).matches();
    }
}
