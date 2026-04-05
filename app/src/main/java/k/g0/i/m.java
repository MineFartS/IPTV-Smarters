package k.g0.i;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f30834a = new a();

    public class a implements m {
        @Override // k.g0.i.m
        public boolean a(int i2, List<c> list) {
            return true;
        }

        @Override // k.g0.i.m
        public boolean b(int i2, List<c> list, boolean z) {
            return true;
        }

        @Override // k.g0.i.m
        public boolean c(int i2, l.e eVar, int i3, boolean z) {
            eVar.Z(i3);
            return true;
        }

        @Override // k.g0.i.m
        public void d(int i2, b bVar) {
        }
    }

    boolean a(int i2, List<c> list);

    boolean b(int i2, List<c> list, boolean z);

    boolean c(int i2, l.e eVar, int i3, boolean z);

    void d(int i2, b bVar);
}
