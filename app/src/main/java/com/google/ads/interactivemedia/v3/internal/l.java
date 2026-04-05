package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum l implements bkz {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22275i;

    l(int i2) {
        this.f22275i = i2;
    }

    public static l a(int i2) {
        switch (i2) {
            case 0:
                return DEBUGGER_STATE_UNSPECIFIED;
            case 1:
                return DEBUGGER_STATE_NOT_INSTALLED;
            case 2:
                return DEBUGGER_STATE_INSTALLED;
            case 3:
                return DEBUGGER_STATE_ACTIVE;
            case 4:
                return DEBUGGER_STATE_ENVVAR;
            case 5:
                return DEBUGGER_STATE_MACHPORT;
            case 6:
                return DEBUGGER_STATE_ENVVAR_MACHPORT;
            default:
                return null;
        }
    }

    public static bla b() {
        return m.f22379b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + l.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22275i + " name=" + name() + '>';
    }
}
