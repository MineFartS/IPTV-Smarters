package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ET implements Runnable {
    public final /* synthetic */ EU A00;
    public final /* synthetic */ DownloadAction[] A01;

    public ET(EU eu, DownloadAction[] downloadActionArr) {
        this.A00 = eu;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00.A03) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.A00.A00.A0C);
            this.A00.A00.A0C.clear();
            for (DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            Iterator it = this.A00.A00.A0D.iterator();
            while (it.hasNext()) {
                ((EW) it.next()).A9n(this.A00.A00);
            }
            if (!arrayList.isEmpty()) {
                this.A00.A00.A0C.addAll(arrayList);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i2 = 0; i2 < this.A00.A00.A0C.size(); i2++) {
                RunnableC0659Ea runnableC0659Ea = (RunnableC0659Ea) this.A00.A00.A0C.get(i2);
                if (runnableC0659Ea.A06 == 0) {
                    this.A00.A00.A0E(runnableC0659Ea);
                }
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
