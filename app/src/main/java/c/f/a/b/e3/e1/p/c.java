package c.f.a.b.e3.e1.p;

import android.net.Uri;
import c.f.a.b.c3.e0;
import c.f.a.b.c3.i0;
import c.f.a.b.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f7164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f7165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f7166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f7167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<g> f7168m;

    public c(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f7156a = j2;
        this.f7157b = j3;
        this.f7158c = j4;
        this.f7159d = z;
        this.f7160e = j5;
        this.f7161f = j6;
        this.f7162g = j7;
        this.f7163h = j8;
        this.f7167l = hVar;
        this.f7164i = oVar;
        this.f7166k = uri;
        this.f7165j = lVar;
        this.f7168m = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList<a> c(List<a> list, LinkedList<i0> linkedList) {
        i0 i0VarPoll = linkedList.poll();
        int i2 = i0VarPoll.f6746b;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i3 = i0VarPoll.f6747c;
            a aVar = list.get(i3);
            List<j> list2 = aVar.f7148c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(i0VarPoll.f6748d));
                i0VarPoll = linkedList.poll();
                if (i0VarPoll.f6746b != i2) {
                    break;
                }
            } while (i0VarPoll.f6747c == i3);
            arrayList.add(new a(aVar.f7146a, aVar.f7147b, arrayList2, aVar.f7149d, aVar.f7150e, aVar.f7151f));
        } while (i0VarPoll.f6746b == i2);
        linkedList.addFirst(i0VarPoll);
        return arrayList;
    }

    @Override // c.f.a.b.c3.e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<i0> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new i0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= e()) {
                break;
            }
            if (((i0) linkedList.peek()).f6746b != i2) {
                long jF = f(i2);
                if (jF != -9223372036854775807L) {
                    j2 += jF;
                }
            } else {
                g gVarD = d(i2);
                arrayList.add(new g(gVarD.f7189a, gVarD.f7190b - j2, c(gVarD.f7191c, linkedList), gVarD.f7192d));
            }
            i2++;
        }
        long j3 = this.f7157b;
        return new c(this.f7156a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, this.f7158c, this.f7159d, this.f7160e, this.f7161f, this.f7162g, this.f7163h, this.f7167l, this.f7164i, this.f7165j, this.f7166k, arrayList);
    }

    public final g d(int i2) {
        return this.f7168m.get(i2);
    }

    public final int e() {
        return this.f7168m.size();
    }

    public final long f(int i2) {
        long j2;
        if (i2 == this.f7168m.size() - 1) {
            long j3 = this.f7157b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = j3 - this.f7168m.get(i2).f7190b;
        } else {
            j2 = this.f7168m.get(i2 + 1).f7190b - this.f7168m.get(i2).f7190b;
        }
        return j2;
    }

    public final long g(int i2) {
        return w0.d(f(i2));
    }
}
