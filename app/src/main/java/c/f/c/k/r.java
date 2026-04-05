package c.f.c.k;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d<?>> f16116b;

    public r(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f16116b = list;
    }
}
