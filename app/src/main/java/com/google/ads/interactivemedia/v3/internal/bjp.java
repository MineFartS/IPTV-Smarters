package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bjo;
import com.google.ads.interactivemedia.v3.internal.bjp;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bjp<MessageType extends bjp<MessageType, BuilderType>, BuilderType extends bjo<MessageType, BuilderType>> implements blz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21245b = 0;

    public int af() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final bkd ag() {
        try {
            int iAj = aj();
            bkd bkdVar = bkd.f21262b;
            byte[] bArr = new byte[iAj];
            bki bkiVarK = bki.K(bArr);
            aV(blt.l(bkiVarK));
            return blt.k(bkiVarK, bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public void ah(int i2) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blz
    public final byte[] ai() {
        try {
            byte[] bArr = new byte[aj()];
            bki bkiVarK = bki.K(bArr);
            aV(bkiVarK);
            bkiVarK.L();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
