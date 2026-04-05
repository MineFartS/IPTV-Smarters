package a.b0;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f960a;

    public l0(View view) {
        this.f960a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f960a.equals(this.f960a);
    }

    public int hashCode() {
        return this.f960a.hashCode();
    }
}
