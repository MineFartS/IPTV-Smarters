package a.n.q;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Boolean f2737d = Boolean.FALSE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f2739f;

    public a(h0 h0Var) {
        super(h0Var);
        this.f2738e = new ArrayList();
        this.f2739f = new ArrayList();
    }

    @Override // a.n.q.y
    public Object a(int i2) {
        return this.f2738e.get(i2);
    }

    @Override // a.n.q.y
    public int i() {
        return this.f2738e.size();
    }
}
