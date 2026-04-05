package c.f.a.a.j;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
