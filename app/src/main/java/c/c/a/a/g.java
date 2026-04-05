package c.c.a.a;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5131b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5133b = BuildConfig.FLAVOR;

        public /* synthetic */ a(s sVar) {
        }

        public g a() {
            g gVar = new g();
            gVar.f5130a = this.f5132a;
            gVar.f5131b = this.f5133b;
            return gVar;
        }

        public a b(String str) {
            this.f5133b = str;
            return this;
        }

        public a c(int i2) {
            this.f5132a = i2;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f5131b;
    }

    public int b() {
        return this.f5130a;
    }
}
