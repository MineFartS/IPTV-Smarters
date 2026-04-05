package com.nst.iptvsmarterstvbox.model.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes2.dex */
@Root(name = "icon", strict = false)
public class XMLTVIconPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Attribute(name = "src", required = false)
    public String f25191a;

    public String toString() {
        return "ClassPojo [src = " + this.f25191a + "]";
    }
}
