package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bio extends bfv<bfl> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bfl read(bjj bjjVar) {
        int iP = bjjVar.p() - 1;
        if (iP == 0) {
            bfj bfjVar = new bfj();
            bjjVar.g();
            while (bjjVar.n()) {
                bfjVar.a(read(bjjVar));
            }
            bjjVar.i();
            return bfjVar;
        }
        if (iP == 2) {
            bfo bfoVar = new bfo();
            bjjVar.h();
            while (bjjVar.n()) {
                bfoVar.b(bjjVar.e(), read(bjjVar));
            }
            bjjVar.j();
            return bfoVar;
        }
        if (iP == 5) {
            return new bfq(bjjVar.f());
        }
        if (iP == 6) {
            return new bfq(new bgn(bjjVar.f()));
        }
        if (iP == 7) {
            return new bfq(Boolean.valueOf(bjjVar.o()));
        }
        if (iP != 8) {
            throw new IllegalArgumentException();
        }
        bjjVar.k();
        return bfn.f21046a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void write(bjl bjlVar, bfl bflVar) throws IOException {
        if (bflVar == null || (bflVar instanceof bfn)) {
            bjlVar.g();
            return;
        }
        if (bflVar instanceof bfq) {
            bfq bfqVar = (bfq) bflVar;
            if (bfqVar.e()) {
                bjlVar.j(bfqVar.a());
                return;
            } else if (bfqVar.d()) {
                bjlVar.l(bfqVar.c());
                return;
            } else {
                bjlVar.k(bfqVar.b());
                return;
            }
        }
        if (bflVar instanceof bfj) {
            bjlVar.b();
            Iterator<bfl> it = ((bfj) bflVar).iterator();
            while (it.hasNext()) {
                write(bjlVar, it.next());
            }
            bjlVar.d();
            return;
        }
        if (!(bflVar instanceof bfo)) {
            String strValueOf = String.valueOf(bflVar.getClass());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Couldn't write ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        bjlVar.c();
        for (Map.Entry<String, bfl> entry : ((bfo) bflVar).a()) {
            bjlVar.f(entry.getKey());
            write(bjlVar, entry.getValue());
        }
        bjlVar.e();
    }
}
