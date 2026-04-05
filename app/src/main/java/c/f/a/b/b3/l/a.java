package c.f.a.b.b3.l;

import c.f.a.b.b3.e;
import c.f.a.b.b3.h;
import c.f.b.a.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f6538a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f6539b = d.f15784c.newDecoder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f6540c = d.f15783b.newDecoder();

    @Override // c.f.a.b.b3.h
    public c.f.a.b.b3.a b(e eVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new c.f.a.b.b3.a(new c(bArr, null, null));
        }
        Matcher matcher = f6538a.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = c.f.b.a.b.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new c.f.a.b.b3.a(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder;
        try {
            string = this.f6539b.decode(byteBuffer).toString();
            charsetDecoder = this.f6539b;
        } catch (CharacterCodingException unused) {
            this.f6539b.reset();
            byteBuffer.rewind();
            try {
                string = this.f6540c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                string = null;
            } catch (Throwable th) {
                this.f6540c.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f6540c;
        } catch (Throwable th2) {
            this.f6539b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return string;
    }
}
