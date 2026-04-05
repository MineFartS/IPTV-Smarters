package m.a.a;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class j extends k {
    public j(b bVar) {
        super(bVar);
    }

    @Override // m.a.a.k
    public void a() {
        b bVar = this.f31128b;
        long jP = bVar.f31106h.p(bVar.f31105g);
        if (jP >= 0) {
            this.f31128b.f31102d = SystemClock.uptimeMillis() + jP;
            if (this.f31128b.isVisible() && this.f31128b.f31101c) {
                b bVar2 = this.f31128b;
                if (!bVar2.f31111m) {
                    bVar2.f31100b.remove(this);
                    b bVar3 = this.f31128b;
                    bVar3.q = bVar3.f31100b.schedule(this, jP, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f31128b.f31107i.isEmpty() && this.f31128b.b() == this.f31128b.f31106h.i() - 1) {
                b bVar4 = this.f31128b;
                bVar4.f31112n.sendEmptyMessageAtTime(bVar4.c(), this.f31128b.f31102d);
            }
        } else {
            b bVar5 = this.f31128b;
            bVar5.f31102d = Long.MIN_VALUE;
            bVar5.f31101c = false;
        }
        if (!this.f31128b.isVisible() || this.f31128b.f31112n.hasMessages(-1)) {
            return;
        }
        this.f31128b.f31112n.sendEmptyMessageAtTime(-1, 0L);
    }
}
