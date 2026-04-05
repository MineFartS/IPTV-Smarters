package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bis extends bfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f21184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bit f21185b;

    public bis(bit bitVar, Class cls) {
        this.f21185b = bitVar;
        this.f21184a = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final Object read(bjj bjjVar) {
        Object obj = this.f21185b.f21187b.read(bjjVar);
        if (obj == null || this.f21184a.isInstance(obj)) {
            return obj;
        }
        String name = this.f21184a.getName();
        String name2 = obj.getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 20 + name2.length());
        sb.append("Expected a ");
        sb.append(name);
        sb.append(" but was ");
        sb.append(name2);
        throw new bfs(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, Object obj) {
        this.f21185b.f21187b.write(bjlVar, obj);
    }
}
