package com.arcesium.Service;

import com.arcesium.Manager.FamilyManager;

public class Parent {
    FamilyManager familyManager;

    public void setFamilyManager(FamilyManager familyManager) {
        this.familyManager = familyManager;
    }

    public void printMyFamily(){
        familyManager.printMyFamily();
    }
}
