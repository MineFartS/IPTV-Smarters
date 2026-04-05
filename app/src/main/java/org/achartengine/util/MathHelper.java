package org.achartengine.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MathHelper {
    private static final NumberFormat FORMAT = NumberFormat.getNumberInstance();
    public static final double NULL_VALUE = Double.MAX_VALUE;

    private MathHelper() {
    }

    private static double[] computeLabels(double d2, double d3, int i2) {
        boolean z;
        double d4;
        double d5;
        if (Math.abs(d2 - d3) < 1.0000000116860974E-7d) {
            return new double[]{d2, d2, 0.0d};
        }
        if (d2 > d3) {
            d5 = d2;
            d4 = d3;
            z = true;
        } else {
            z = false;
            d4 = d2;
            d5 = d3;
        }
        double dAbs = Math.abs(d4 - d5);
        double d6 = i2;
        Double.isNaN(d6);
        double dRoundUp = roundUp(dAbs / d6);
        double dCeil = Math.ceil(d4 / dRoundUp) * dRoundUp;
        double dFloor = Math.floor(d5 / dRoundUp) * dRoundUp;
        double[] dArr = new double[3];
        if (z) {
            dArr[0] = dFloor;
            dArr[1] = dCeil;
            dArr[2] = dRoundUp * (-1.0d);
            return dArr;
        }
        dArr[0] = dCeil;
        dArr[1] = dFloor;
        dArr[2] = dRoundUp;
        return dArr;
    }

    public static List<Double> getLabels(double d2, double d3, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        FORMAT.setMaximumFractionDigits(5);
        double[] dArrComputeLabels = computeLabels(d2, d3, i2);
        int i3 = ((int) ((dArrComputeLabels[1] - dArrComputeLabels[0]) / dArrComputeLabels[2])) + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            double d4 = dArrComputeLabels[0];
            double d5 = i4;
            double d6 = dArrComputeLabels[2];
            Double.isNaN(d5);
            double dDoubleValue = d4 + (d5 * d6);
            try {
                NumberFormat numberFormat = FORMAT;
                dDoubleValue = numberFormat.parse(numberFormat.format(dDoubleValue)).doubleValue();
            } catch (ParseException unused) {
            }
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static double[] minmax(List<Double> list) {
        if (list.size() == 0) {
            return new double[2];
        }
        double dDoubleValue = list.get(0).doubleValue();
        int size = list.size();
        double dMax = dDoubleValue;
        for (int i2 = 1; i2 < size; i2++) {
            double dDoubleValue2 = list.get(i2).doubleValue();
            dDoubleValue = Math.min(dDoubleValue, dDoubleValue2);
            dMax = Math.max(dMax, dDoubleValue2);
        }
        return new double[]{dDoubleValue, dMax};
    }

    private static double roundUp(double d2) {
        int iFloor = (int) Math.floor(Math.log10(d2));
        double dPow = d2 * Math.pow(10.0d, -iFloor);
        if (dPow > 5.0d) {
            dPow = 10.0d;
        } else if (dPow > 2.0d) {
            dPow = 5.0d;
        } else if (dPow > 1.0d) {
            dPow = 2.0d;
        }
        return dPow * Math.pow(10.0d, iFloor);
    }
}
