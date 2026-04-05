package d.a.a.d;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static t f30190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f30191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30193d;

    public t(UUID uuid) {
        this.f30191b = uuid;
    }

    public static String a(UUID uuid, boolean z) {
        String str = b(uuid).f30193d;
        if (z) {
            b(uuid).f30193d = null;
        }
        return str;
    }

    public static t b(UUID uuid) {
        t tVar = f30190a;
        if (tVar == null || !tVar.f30191b.equals(uuid)) {
            f30190a = new t(uuid);
        }
        return f30190a;
    }

    public static String c(UUID uuid, boolean z) {
        String str = b(uuid).f30192c;
        if (z) {
            b(uuid).f30192c = null;
        }
        return str;
    }

    public static void d(String str, int i2, String str2) {
        t tVarB = b(UUID.fromString(str));
        if (i2 == 2) {
            tVarB.f30192c = str2;
        } else {
            if (i2 != 3) {
                return;
            }
            tVarB.f30193d = str2;
        }
    }
}
