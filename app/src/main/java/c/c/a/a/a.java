package c.c.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5085a;

    /* JADX INFO: renamed from: c.c.a.a.a$a, reason: collision with other inner class name */
    public static final class C0097a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5086a;

        public /* synthetic */ C0097a(l lVar) {
        }

        public a a() {
            if (this.f5086a == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f5085a = this.f5086a;
            return aVar;
        }

        public C0097a b(String str) {
            this.f5086a = str;
            return this;
        }
    }

    public /* synthetic */ a(l lVar) {
    }

    public static C0097a b() {
        return new C0097a(null);
    }

    public String a() {
        return this.f5085a;
    }
}
