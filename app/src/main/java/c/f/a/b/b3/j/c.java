package c.f.a.b.b3.j;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f6534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f6535b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        this.f6534a = byteArrayOutputStream;
        this.f6535b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f6534a.reset();
        try {
            b(this.f6535b, aVar.f6528d);
            String str = aVar.f6529e;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            b(this.f6535b, str);
            this.f6535b.writeLong(aVar.f6530f);
            this.f6535b.writeLong(aVar.f6531g);
            this.f6535b.write(aVar.f6532h);
            this.f6535b.flush();
            return this.f6534a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
