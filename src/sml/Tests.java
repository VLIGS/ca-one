package sml;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testLinInstruction(){
        Machine myTestMachine = new Machine();
        Translator t = new Translator("program0.txt");
        t.readAndTranslate(myTestMachine.getLabels(), myTestMachine.getProg());
        myTestMachine.execute();
        Registers myTestMachineRegisters = myTestMachine.getRegisters();
        assertEquals(6,myTestMachineRegisters.getRegister(20));
        assertEquals(1,myTestMachineRegisters.getRegister(21));
    }
    @Test
    public void testAddInstruction(){
        Machine myTestMachine = new Machine();
        Translator t = new Translator("program1.txt");
        t.readAndTranslate(myTestMachine.getLabels(), myTestMachine.getProg());
        myTestMachine.execute();
        Registers myTestMachineRegisters = myTestMachine.getRegisters();
        assertEquals(7,myTestMachineRegisters.getRegister(21));
    }
    @Test
    public void testSubInstruction(){
        Machine myTestMachine = new Machine();
        Translator t = new Translator("program2.txt");
        t.readAndTranslate(myTestMachine.getLabels(), myTestMachine.getProg());
        myTestMachine.execute();
        Registers myTestMachineRegisters = myTestMachine.getRegisters();
        assertEquals(5,myTestMachineRegisters.getRegister(21));
    }
    @Test
    public void testMulInstruction(){
        Machine myTestMachine = new Machine();
        Translator t = new Translator("program3.txt");
        t.readAndTranslate(myTestMachine.getLabels(), myTestMachine.getProg());
        myTestMachine.execute();
        Registers myTestMachineRegisters = myTestMachine.getRegisters();
        assertEquals(12,myTestMachineRegisters.getRegister(21));
    }
    @Test
    public void testDivInstruction(){
        Machine myTestMachine = new Machine();
        Translator t = new Translator("program4.txt");
        t.readAndTranslate(myTestMachine.getLabels(), myTestMachine.getProg());
        myTestMachine.execute();
        Registers myTestMachineRegisters = myTestMachine.getRegisters();
        assertEquals(3,myTestMachineRegisters.getRegister(21));
    }
}
