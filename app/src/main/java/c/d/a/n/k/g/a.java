package c.d.a.n.k.g;

import c.d.a.n.e;
import c.d.a.n.i.l;
import java.io.File;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<File, File> {
    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<File> a(File file, int i2, int i3) {
        return new b(file);
    }

    @Override // c.d.a.n.e
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
