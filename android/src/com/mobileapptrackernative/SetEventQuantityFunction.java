package com.mobileapptrackernative;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class SetEventQuantityFunction implements FREFunction {
    public static final String NAME = "setEventQuantity";

    @Override
    public FREObject call(FREContext context, FREObject[] passedArgs) {
        try {
            Log.i(MATExtensionContext.TAG, "Call " + NAME);
            
            if (passedArgs[0] != null) {
                int quantity = passedArgs[0].getAsInt();
                MATExtensionContext mec = (MATExtensionContext)context;
                mec.mat.setEventQuantity(quantity);
            }

            return FREObject.newObject(true);
        } catch (Exception e) {
            Log.d(MATExtensionContext.TAG, "ERROR: " + e);
            e.printStackTrace();
        }
        return null;
    }
}
