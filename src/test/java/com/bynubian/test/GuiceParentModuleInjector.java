package com.bynubian.test;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

import com.bynubian.test.modules.ParentModule;

import java.util.List;
 
public class GuiceParentModuleInjector implements IAlterSuiteListener {
    @Override
    public void alter(List<XmlSuite> suites) {
        XmlSuite suite = suites.get(0);
        suite.setParentModule(ParentModule.class.getName());
    }
}

