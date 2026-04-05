package a.g.b.k;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i extends e implements h {
    public e[] w0 = new e[4];
    public int x0 = 0;

    @Override // a.g.b.k.h
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i2 = this.x0 + 1;
        e[] eVarArr = this.w0;
        if (i2 > eVarArr.length) {
            this.w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.w0;
        int i3 = this.x0;
        eVarArr2[i3] = eVar;
        this.x0 = i3 + 1;
    }

    @Override // a.g.b.k.h
    public void b() {
        this.x0 = 0;
        Arrays.fill(this.w0, (Object) null);
    }

    @Override // a.g.b.k.h
    public void c(f fVar) {
    }
}
