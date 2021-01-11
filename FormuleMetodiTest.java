 
package solar.calculator_v1;

import javax.swing.JDialog;
import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */


public class FormuleMetodiTest {
    
    public FormuleMetodiTest() {
    }

    /**
     * Test of PowerCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testPowerCalculation() {
        System.out.println("PowerCalculation");
        double dAmpere = 500.0;
        double dVolt = 220.0;
        double expResult = 110.0;
        double result = FormuleMetodi.PowerCalculation(dAmpere, dVolt);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of KilowattsToAmpsCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testKilowattsToAmpsCalculation() {
        System.out.println("KilowattsToAmpsCalculation");
        double dPower = 5.0;
        double dVolt = 100.0;
        double expResult = 50.0;
        double result = FormuleMetodi.KilowattsToAmpsCalculation(dPower, dVolt);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of KilowattsHourCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testKilowattsHourCalculation() {
        System.out.println("KilowattsHourCalculation");
        double dPower = 0.7;
        double dTime = 3.0;
        double expResult = 2.0999999999999996;
        double result = FormuleMetodi.KilowattsHourCalculation(dPower, dTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of WattsHourCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testWattsHourCalculation() {
        System.out.println("WattsHourCalculation");
        double dPower = 700.0;
        double dTime = 2.0;
        double expResult = 1400.0;
        double result = FormuleMetodi.WattsHourCalculation(dPower, dTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of HorsepowerToKiloWattCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testHorsepowerToKiloWattCalculation() {
        System.out.println("HorsepowerToKiloWattCalculation");
        double dHorsepower = 5.0;
        double expResult = 3.72849936;
        double result = FormuleMetodi.HorsepowerToKiloWattCalculation(dHorsepower);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ChargingTimeCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testChargingTimeCalculation() {
        System.out.println("ChargingTimeCalculation");
        double dCapacity = 800.0;
        double Efficiency = 1.1;
        double dCharger = 200.0;
        double dConsumption = 15.0;
        double expResult = 4.7567567567567567567567567567568;
        double result = FormuleMetodi.ChargingTimeCalculation(dCapacity, Efficiency, dCharger, dConsumption);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of MinuteConverter method, of class FormuleMetodi.
     */
    @Test
    public void testMinuteConverter() {
        System.out.println("MinuteConverter");
        double dTime = 12.636837;
        int expResult = 37;
        int result = FormuleMetodi.MinuteConverter(dTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UnChargingTimeCalculation method, of class FormuleMetodi.
     */
    @Test
    public void testUnChargingTimeCalculation() {
        System.out.println("UnChargingTimeCalculation");
        double dCapacity = 1200.0;
        double dConsumption = 65.0;
        double expResult = 18.46153846153846;
        double result = FormuleMetodi.UnChargingTimeCalculation(dCapacity, dConsumption);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of NewWindow method, of class FormuleMetodi.
     */
    @Test
    public void testNewWindow() {
        System.out.println("NewWindow");
        FormuleMetodi.NewWindow();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of DisposeJFrame method, of class FormuleMetodi.
     */
    @Test
    public void testDisposeJFrame() {
        System.out.println("DisposeJFrame");
        JFrame frame2 = new solar.calculator_v1.MainForm();
        JFrame Frame = frame2;
        FormuleMetodi.DisposeJFrame(Frame);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of HelpDialogPage method, of class FormuleMetodi.
     */
    @Test
    public void testHelpDialogPage() {
        System.out.println("HelpDialogPage");
        
        JDialog HelpDialog = new JDialog();
        FormuleMetodi.HelpDialogPage(HelpDialog);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
