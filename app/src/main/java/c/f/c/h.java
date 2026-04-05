package c.f.c;

import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;

/* JADX INFO: loaded from: classes2.dex */
public class h extends Exception {
    @Deprecated
    public h() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@RecentlyNonNull String str) {
        super(str);
        o.f(str, "Detail message must not be empty");
    }
}
