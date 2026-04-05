package k;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f30932a = new a();

    public class a implements m {
        @Override // k.m
        public void a(t tVar, List<l> list) {
        }

        @Override // k.m
        public List<l> b(t tVar) {
            return Collections.emptyList();
        }
    }

    void a(t tVar, List<l> list);

    List<l> b(t tVar);
}
