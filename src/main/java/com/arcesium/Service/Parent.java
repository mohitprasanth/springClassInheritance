package com.arcesium.Service;

import com.arcesium.Manager.FamilyManager;

public class Parent {
    private FamilyManager familyManager;

    public void setFamilyManager(FamilyManager familyManager) {
        this.familyManager = familyManager;
    }

    public void printMyFamily(){
        familyManager.printMyFamily();
    }
}
