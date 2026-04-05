package c.f.a.b.x2;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.x2.i0;
import c.f.a.b.x2.w;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.c f10357a = new i0.c() { // from class: c.f.a.b.x2.n
        @Override // c.f.a.b.x2.i0.c
        public final i0 a(UUID uuid) {
            return k0.x(uuid);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f10358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaDrm f10359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10360d;

    public k0(UUID uuid) {
        c.f.a.b.j3.g.e(uuid);
        c.f.a.b.j3.g.b(!w0.f10305b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10358b = uuid;
        MediaDrm mediaDrm = new MediaDrm(p(uuid));
        this.f10359c = mediaDrm;
        this.f10360d = 1;
        if (w0.f10307d.equals(uuid) && y()) {
            r(mediaDrm);
        }
    }

    public static byte[] l(byte[] bArr) {
        c.f.a.b.j3.i0 i0Var = new c.f.a.b.j3.i0(bArr);
        int iQ = i0Var.q();
        short s = i0Var.s();
        short s2 = i0Var.s();
        if (s != 1 || s2 != 1) {
            c.f.a.b.j3.z.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short s3 = i0Var.s();
        Charset charset = c.f.b.a.d.f15786e;
        String strB = i0Var.B(s3, charset);
        if (strB.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strB.indexOf("</DATA>");
        if (iIndexOf == -1) {
            c.f.a.b.j3.z.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strB.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strB.substring(iIndexOf);
        int i2 = iQ + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(s2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static byte[] m(UUID uuid, byte[] bArr) {
        return w0.f10306c.equals(uuid) ? r.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] n(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = c.f.a.b.w0.f10308e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = c.f.a.b.z2.j0.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = l(r4)
            byte[] r4 = c.f.a.b.z2.j0.l.a(r0, r4)
        L18:
            int r1 = c.f.a.b.j3.x0.f9296a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = c.f.a.b.w0.f10307d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = c.f.a.b.j3.x0.f9298c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = c.f.a.b.j3.x0.f9299d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = c.f.a.b.z2.j0.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.x2.k0.n(java.util.UUID, byte[]):byte[]");
    }

    public static String o(UUID uuid, String str) {
        return (x0.f9296a < 26 && w0.f10306c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID p(UUID uuid) {
        return (x0.f9296a >= 27 || !w0.f10306c.equals(uuid)) ? uuid : w0.f10305b;
    }

    @SuppressLint({"WrongConstant"})
    public static void r(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static w.b t(UUID uuid, List<w.b> list) {
        boolean z;
        if (w0.f10307d.equals(uuid)) {
            if (x0.f9296a >= 28 && list.size() > 1) {
                w.b bVar = list.get(0);
                int length = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    w.b bVar2 = list.get(i2);
                    byte[] bArr = (byte[]) c.f.a.b.j3.g.e(bVar2.f10453f);
                    if (!x0.b(bVar2.f10452e, bVar.f10452e) || !x0.b(bVar2.f10451d, bVar.f10451d) || !c.f.a.b.z2.j0.l.c(bArr)) {
                        z = false;
                        break;
                    }
                    length += bArr.length;
                }
                z = true;
                if (z) {
                    byte[] bArr2 = new byte[length];
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        byte[] bArr3 = (byte[]) c.f.a.b.j3.g.e(list.get(i4).f10453f);
                        int length2 = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i3, length2);
                        i3 += length2;
                    }
                    return bVar.c(bArr2);
                }
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                w.b bVar3 = list.get(i5);
                int iG = c.f.a.b.z2.j0.l.g((byte[]) c.f.a.b.j3.g.e(bVar3.f10453f));
                int i6 = x0.f9296a;
                if (i6 < 23 && iG == 0) {
                    return bVar3;
                }
                if (i6 >= 23 && iG == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    public static boolean u(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(p(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(i0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
        bVar.a(this, bArr, i2, i3, bArr2);
    }

    public static /* synthetic */ i0 x(UUID uuid) {
        try {
            return z(uuid);
        } catch (q0 unused) {
            c.f.a.b.j3.z.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + InstructionFileId.DOT);
            return new g0();
        }
    }

    public static boolean y() {
        return "ASUS_Z00AD".equals(x0.f9299d);
    }

    public static k0 z(UUID uuid) throws q0 {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new q0(1, e2);
        } catch (Exception e3) {
            throw new q0(2, e3);
        }
    }

    @Override // c.f.a.b.x2.i0
    public Class<j0> a() {
        return j0.class;
    }

    @Override // c.f.a.b.x2.i0
    public Map<String, String> b(byte[] bArr) {
        return this.f10359c.queryKeyStatus(bArr);
    }

    @Override // c.f.a.b.x2.i0
    public i0.d d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f10359c.getProvisionRequest();
        return new i0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // c.f.a.b.x2.i0
    public byte[] e() {
        return this.f10359c.openSession();
    }

    @Override // c.f.a.b.x2.i0
    public void f(byte[] bArr, byte[] bArr2) {
        this.f10359c.restoreKeys(bArr, bArr2);
    }

    @Override // c.f.a.b.x2.i0
    public void g(byte[] bArr) {
        this.f10359c.closeSession(bArr);
    }

    @Override // c.f.a.b.x2.i0
    public void h(final i0.b bVar) {
        this.f10359c.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: c.f.a.b.x2.o
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                this.f10370a.w(bVar, mediaDrm, bArr, i2, i3, bArr2);
            }
        });
    }

    @Override // c.f.a.b.x2.i0
    public byte[] i(byte[] bArr, byte[] bArr2) {
        if (w0.f10306c.equals(this.f10358b)) {
            bArr2 = r.b(bArr2);
        }
        return this.f10359c.provideKeyResponse(bArr, bArr2);
    }

    @Override // c.f.a.b.x2.i0
    public void j(byte[] bArr) throws DeniedByServerException {
        this.f10359c.provideProvisionResponse(bArr);
    }

    @Override // c.f.a.b.x2.i0
    public i0.a k(byte[] bArr, List<w.b> list, int i2, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArrN;
        String strO;
        w.b bVarT = null;
        if (list != null) {
            bVarT = t(this.f10358b, list);
            bArrN = n(this.f10358b, (byte[]) c.f.a.b.j3.g.e(bVarT.f10453f));
            strO = o(this.f10358b, bVarT.f10452e);
        } else {
            bArrN = null;
            strO = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f10359c.getKeyRequest(bArr, bArrN, strO, i2, map);
        byte[] bArrM = m(this.f10358b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(defaultUrl) && bVarT != null && !TextUtils.isEmpty(bVarT.f10451d)) {
            defaultUrl = bVarT.f10451d;
        }
        return new i0.a(bArrM, defaultUrl, x0.f9296a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // c.f.a.b.x2.i0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j0 c(byte[] bArr) {
        return new j0(p(this.f10358b), bArr, x0.f9296a < 21 && w0.f10307d.equals(this.f10358b) && "L3".equals(s("securityLevel")));
    }

    @Override // c.f.a.b.x2.i0
    public synchronized void release() {
        int i2 = this.f10360d - 1;
        this.f10360d = i2;
        if (i2 == 0) {
            this.f10359c.release();
        }
    }

    public String s(String str) {
        return this.f10359c.getPropertyString(str);
    }
}
