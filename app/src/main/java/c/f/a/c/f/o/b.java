package c.f.a.c.f.o;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    @Deprecated
    public final Status f12355b;

    public b(@RecentlyNonNull Status status) {
        int iJ = status.J();
        String strK = status.K() != null ? status.K() : BuildConfig.FLAVOR;
        StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 13);
        sb.append(iJ);
        sb.append(": ");
        sb.append(strK);
        super(sb.toString());
        this.f12355b = status;
    }

    public Status a() {
        return this.f12355b;
    }

    public int b() {
        return this.f12355b.J();
    }
}
