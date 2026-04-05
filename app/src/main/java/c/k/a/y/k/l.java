package c.k.a.y.k;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f18528a = new a();

    public static class a implements l {
        @Override // c.k.a.y.k.l
        public boolean a(int i2, List<d> list) {
            return true;
        }

        @Override // c.k.a.y.k.l
        public boolean b(int i2, List<d> list, boolean z) {
            return true;
        }

        @Override // c.k.a.y.k.l
        public boolean c(int i2, l.e eVar, int i3, boolean z) {
            eVar.Z(i3);
            return true;
        }

        @Override // c.k.a.y.k.l
        public void d(int i2, c.k.a.y.k.a aVar) {
        }
    }

    boolean a(int i2, List<d> list);

    boolean b(int i2, List<d> list, boolean z);

    boolean c(int i2, l.e eVar, int i3, boolean z);

    void d(int i2, c.k.a.y.k.a aVar);
}
