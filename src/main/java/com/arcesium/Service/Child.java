package com.arcesium.Service;

import com.arcesium.Manager.FamilyManager;

public class Child extends Parent{
    private FamilyManager familyManager;

    public void setFamilyManager(FamilyManager familyManager) {
        this.familyManager = familyManager;
    }
}
