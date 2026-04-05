package k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f30941a = new a();

    public class a extends p {
    }

    public class b implements c {
        public b() {
        }

        @Override // k.p.c
        public p a(e eVar) {
            return p.this;
        }
    }

    public interface c {
        p a(e eVar);
    }

    public static c a(p pVar) {
        return pVar.new b();
    }
}
