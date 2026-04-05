package c.d.a.n.k.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c.d.a.l.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class i implements c.d.a.n.e<InputStream, c.d.a.n.k.h.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5816a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5817b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.d.a.n.k.h.a f5822g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<c.d.a.l.a> f5823a = c.d.a.t.h.c(0);

        public synchronized c.d.a.l.a a(a.InterfaceC0100a interfaceC0100a) {
            c.d.a.l.a aVarPoll;
            aVarPoll = this.f5823a.poll();
            if (aVarPoll == null) {
                aVarPoll = new c.d.a.l.a(interfaceC0100a);
            }
            return aVarPoll;
        }

        public synchronized void b(c.d.a.l.a aVar) {
            aVar.b();
            this.f5823a.offer(aVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<c.d.a.l.d> f5824a = c.d.a.t.h.c(0);

        public synchronized c.d.a.l.d a(byte[] bArr) {
            c.d.a.l.d dVarPoll;
            dVarPoll = this.f5824a.poll();
            if (dVarPoll == null) {
                dVarPoll = new c.d.a.l.d();
            }
            return dVarPoll.o(bArr);
        }

        public synchronized void b(c.d.a.l.d dVar) {
            dVar.a();
            this.f5824a.offer(dVar);
        }
    }

    public i(Context context, c.d.a.n.i.n.c cVar) {
        this(context, cVar, f5816a, f5817b);
    }

    public i(Context context, c.d.a.n.i.n.c cVar, b bVar, a aVar) {
        this.f5818c = context.getApplicationContext();
        this.f5820e = cVar;
        this.f5821f = aVar;
        this.f5822g = new c.d.a.n.k.h.a(cVar);
        this.f5819d = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException e2) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e2);
        }
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            return byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(InputStream inputStream, int i2, int i3) {
        byte[] bArrE = e(inputStream);
        c.d.a.l.d dVarA = this.f5819d.a(bArrE);
        c.d.a.l.a aVarA = this.f5821f.a(this.f5822g);
        try {
            return c(bArrE, i2, i3, dVarA, aVarA);
        } finally {
            this.f5819d.b(dVarA);
            this.f5821f.b(aVarA);
        }
    }

    public final d c(byte[] bArr, int i2, int i3, c.d.a.l.d dVar, c.d.a.l.a aVar) {
        Bitmap bitmapD;
        c.d.a.l.c cVarC = dVar.c();
        if (cVarC.a() <= 0 || cVarC.b() != 0 || (bitmapD = d(aVar, cVarC, bArr)) == null) {
            return null;
        }
        return new d(new c.d.a.n.k.h.b(this.f5818c, this.f5822g, this.f5820e, c.d.a.n.k.d.b(), i2, i3, cVarC, bArr, bitmapD));
    }

    public final Bitmap d(c.d.a.l.a aVar, c.d.a.l.c cVar, byte[] bArr) {
        aVar.n(cVar, bArr);
        aVar.a();
        return aVar.i();
    }

    @Override // c.d.a.n.e
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
