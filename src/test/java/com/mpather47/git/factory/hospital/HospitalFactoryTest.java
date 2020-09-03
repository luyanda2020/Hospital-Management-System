package com.mpather47.git.factory.hospital;

import com.mpather47.git.entity.hospital.Hospital;
import junit.framework.TestCase;
import org.junit.Assert;

public class HospitalFactoryTest extends TestCase {

    public void testCreateHospital() {
        Hospital h = HospitalFactory.createHospital("23768B", "Christian Barnard", 1435);
        Assert.assertNotNull(h);
    }
}


