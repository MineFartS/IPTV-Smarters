package c.f.a.c.j.h;

import c.f.a.c.j.h.i6;
import c.f.a.c.j.h.l6;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class i6<MessageType extends l6<MessageType, BuilderType>, BuilderType extends i6<MessageType, BuilderType>> extends s4<MessageType, BuilderType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageType f13366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageType f13367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13368d = false;

    public i6(MessageType messagetype) {
        this.f13366b = messagetype;
        this.f13367c = (MessageType) messagetype.v(4, null, null);
    }

    public static final void l(MessageType messagetype, MessageType messagetype2) {
        z7.a().b(messagetype.getClass()).a(messagetype, messagetype2);
    }

    @Override // c.f.a.c.j.h.r7
    public final /* bridge */ /* synthetic */ q7 g() {
        return this.f13366b;
    }

    @Override // c.f.a.c.j.h.s4
    public final /* bridge */ /* synthetic */ s4 h(byte[] bArr, int i2, int i3) throws w6 {
        o(bArr, 0, i3, y5.a());
        return this;
    }

    @Override // c.f.a.c.j.h.s4
    public final /* bridge */ /* synthetic */ s4 j(byte[] bArr, int i2, int i3, y5 y5Var) throws w6 {
        o(bArr, 0, i3, y5Var);
        return this;
    }

    @Override // c.f.a.c.j.h.s4
    public final /* bridge */ /* synthetic */ s4 k(t4 t4Var) {
        n((l6) t4Var);
        return this;
    }

    public final MessageType m() {
        MessageType messagetype = (MessageType) Q();
        boolean z = true;
        byte bByteValue = ((Byte) messagetype.v(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zB = z7.a().b(messagetype.getClass()).b(messagetype);
                messagetype.v(2, true != zB ? null : messagetype, null);
                z = zB;
            }
        }
        if (z) {
            return messagetype;
        }
        throw new p8(messagetype);
    }

    public final BuilderType n(MessageType messagetype) {
        if (this.f13368d) {
            p();
            this.f13368d = false;
        }
        l(this.f13367c, messagetype);
        return this;
    }

    public final BuilderType o(byte[] bArr, int i2, int i3, y5 y5Var) throws w6 {
        if (this.f13368d) {
            p();
            this.f13368d = false;
        }
        try {
            z7.a().b(this.f13367c.getClass()).e(this.f13367c, bArr, 0, i3, new w4(y5Var));
            return this;
        } catch (w6 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw w6.a();
        }
    }

    public void p() {
        MessageType messagetype = (MessageType) this.f13367c.v(4, null, null);
        l(messagetype, this.f13367c);
        this.f13367c = messagetype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f13366b.v(5, null, null);
        buildertype.n(Q());
        return buildertype;
    }

    @Override // c.f.a.c.j.h.p7
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public MessageType Q() {
        if (this.f13368d) {
            return this.f13367c;
        }
        MessageType messagetype = this.f13367c;
        z7.a().b(messagetype.getClass()).f(messagetype);
        this.f13368d = true;
        return this.f13367c;
    }
}
