package k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f30943a = v.c(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f30944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f30945c;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f30946a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f30947b = new ArrayList();

        public a a(String str, String str2) {
            this.f30946a.add(t.b(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.f30947b.add(t.b(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public a b(String str, String str2) {
            this.f30946a.add(t.b(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.f30947b.add(t.b(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }

        public q c() {
            return new q(this.f30946a, this.f30947b);
        }
    }

    public q(List<String> list, List<String> list2) {
        this.f30944b = k.g0.c.n(list);
        this.f30945c = k.g0.c.n(list2);
    }

    @Override // k.b0
    public long a() {
        return i(null, true);
    }

    @Override // k.b0
    public v b() {
        return f30943a;
    }

    @Override // k.b0
    public void h(l.d dVar) {
        i(dVar, false);
    }

    public final long i(@Nullable l.d dVar, boolean z) {
        l.c cVar = z ? new l.c() : dVar.z();
        int size = this.f30944b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                cVar.I(38);
            }
            cVar.P(this.f30944b.get(i2));
            cVar.I(61);
            cVar.P(this.f30945c.get(i2));
        }
        if (!z) {
            return 0L;
        }
        long jH0 = cVar.H0();
        cVar.l();
        return jH0;
    }
}
